plugins {
    kotlin("jvm") version "2.0.21"
}

group = "ruby"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}
