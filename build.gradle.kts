import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val jakartaPersistenceApiVersion = "3.2.0"
val junitJupiterVersion = "5.10.3"
val assertjCoreVersion = "3.26.3"


plugins {
	kotlin("jvm") version "2.0.10"
	id("maven-publish")
	id("java-library")
}

group = "no.nav.klage"
version = properties["version"] ?: "local-build"
java.sourceCompatibility = JavaVersion.VERSION_21

repositories {
	mavenCentral()
}

dependencies {
	compileOnly("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("jakarta.persistence:jakarta.persistence-api:$jakartaPersistenceApiVersion")
	testImplementation("org.junit.jupiter:junit-jupiter:$junitJupiterVersion")
	testImplementation("org.assertj:assertj-core:$assertjCoreVersion")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "21"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

java {
	withSourcesJar()
}

publishing {
	repositories {
		maven {
			url = uri("https://maven.pkg.github.com/navikt/klage-kodeverk")
			credentials {
				username = System.getenv("GITHUB_USERNAME")
				password = System.getenv("GITHUB_PASSWORD")
			}
		}
	}
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
