plugins {
    kotlin("jvm") version "1.9.25"
}

group = "ruby"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}
