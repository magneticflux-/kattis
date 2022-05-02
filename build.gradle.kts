import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    scala
    kotlin("jvm") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.1.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.0")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        apiVersion = "1.3"
        languageVersion = "1.3"
    }
}
