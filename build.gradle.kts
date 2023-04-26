import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.8.0"
	id("maven-publish")
	id("java-library")
}

group = "no.nav.klage"
version = properties["version"] ?: "local-build"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	compileOnly("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("jakarta.persistence:jakarta.persistence-api:2.2.3")
	testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
	testImplementation("org.assertj:assertj-core:3.24.1")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.getByName<Jar>("jar") {
	classifier = ""
}

publishing {
	publications {
		create<MavenPublication>("mavenJava") {

			pom {
				name.set("klage-kodeverk")
				description.set("Kabal Kodeverk")
				url.set("https://github.com/navikt/klage-kodeverk")

				licenses {
					license {
						name.set("MIT License")
						url.set("https://opensource.org/licenses/MIT")
					}
				}

				scm {
					connection.set("scm:git:https://github.com/navikt/klage-kodeverk.git")
					developerConnection.set("scm:git:https://github.com/navikt/klage-kodeverk.git")
					url.set("https://github.com/navikt/klage-kodeverk")
				}
			}
			from(components["java"])
		}
	}
}
