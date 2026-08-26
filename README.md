# klage-kodeverk
Shared code lists (kodeverk) used across the klage solutions.

Uses maven.pkg.github.com/navikt for publishing new versions.

## Code style (ktlint)

The project uses [ktlint](https://ktlint.github.io/ktlint/) via
[ktlint-gradle](https://github.com/JLLeitschuh/ktlint-gradle). The rules are
configured in `.editorconfig` (`ktlint_code_style = ktlint_official`).

`ktlintCheck` is wired into the Gradle `check` task, which means it runs
automatically as part of `./gradlew build`. The PR build in GitHub Actions runs
`ktlintCheck` as a separate step before test and build, so a PR cannot be merged
until the code style is clean. On failure the report is uploaded as the
`ktlint-report` artifact.

### Commands

```bash
./gradlew ktlintCheck    # check code style (fails on violations)
./gradlew ktlintFormat   # fix everything that can be fixed automatically
```

Reports are written to `build/reports/ktlint/`.

### Formatting from IntelliJ

Pick one of the approaches below:

1. **Gradle task with a keyboard shortcut (simplest, matches CI exactly)**
   - Open the Gradle panel: `Tasks → formatting → ktlintFormat`.
   - Right-click the task and choose *Assign Shortcut* to bind it to e.g. `Ctrl+Alt+K`.
2. **Built-in formatting via `.editorconfig`**
   - IntelliJ reads `.editorconfig` automatically. Verify that it is enabled under
     *Settings → Editor → Code Style → Enable EditorConfig support*.
   - `Ctrl+Alt+L` (*Reformat Code*) then formats according to the same rules.
   - Note: IntelliJ's formatter does not cover every ktlint rule, so run
     `ktlintFormat` before you push.
3. **Ktlint plugin (format on save)**
   - Install the *Ktlint* plugin from the JetBrains Marketplace.
   - Under *Settings → Tools → KtLint*, select mode `Distract free` for automatic
     formatting on save. The plugin picks up `.editorconfig` on its own.

### Wildcard imports

`no-wildcard-imports` is enabled, but `.editorconfig` explicitly allows enum entry
wildcards for `Enhet`, `SattPaaVentReason`, `Utfall`, `Hjemmel` and
`Registreringshjemmel` (`ij_kotlin_packages_to_use_import_on_demand`). The mapping
tables reference up to ~1100 distinct entries from a single enum, where explicit
imports would be noise rather than documentation. IntelliJ reads the same
property, so the behaviour is identical in the IDE and in CI.

### Optional: git pre-commit hook

```bash
./gradlew addKtlintFormatGitPreCommitHook   # format changed files before commit
# or
./gradlew addKtlintCheckGitPreCommitHook    # block the commit on violations
```

## Static analysis (detekt)

[detekt](https://detekt.dev/) is deliberately scoped to a **single rule**:
`NamedArguments`. Formatting is owned by ktlint, so detekt's formatting ruleset
is not on the classpath and every other ruleset is switched off explicitly in
`config/detekt/detekt.yml`.

`NamedArguments` reports calls with more than one positional argument, where
argument order is an easy thing to get wrong:

```kotlin
// reported
DisplayName("Partsinnsyn", "Part transparency", "Partsinnsyn")

// accepted
DisplayName(nb = "Partsinnsyn", en = "Part transparency", nn = "Partsinnsyn")
```

### Commands

```bash
./gradlew detektMain detektTest   # analyse main and test sources
```

Reports are written to `build/reports/detekt/`.

### Why `detektMain` and not `detekt`

`NamedArguments` implements `RequiresAnalysisApi`: detekt has to resolve the
callee to know the parameter names. Only the `detektMain` and `detektTest` tasks
run with a compile classpath. The plain `detekt` task would find nothing and pass
silently, so it is disabled in `build.gradle.kts`. Both analysis aware tasks are
wired into `check`, and therefore run as part of `./gradlew build`.

### A note on the detekt version

The project uses detekt `2.0.0-alpha.6`, which is a **prerelease**. This is a
deliberate choice: the latest stable release, 1.23.8, is compiled against Kotlin
2.0.21 and refuses to run against newer Kotlin without pinning
`kotlin-compiler-embeddable` to an older version on the detekt classpath. detekt
2.x is built against Kotlin 2.4 and needs no such workaround.

Expect breaking changes in config keys between alpha releases. `allowedArguments`
for instance was named `threshold` in 1.x.
