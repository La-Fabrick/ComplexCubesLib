plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "eu.lafabrick"
version = "0.1.0"

repositories {
    mavenCentral()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        url = uri("https://oss.sonatype.org/content/groups/public/")
    }
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("org.spigotmc:spigot-api:1.19.4-R0.1-SNAPSHOT")

    implementation("org.apache.commons:commons-numbers-core:1.1")
    implementation("org.apache.commons:commons-numbers-complex:1.1")
    implementation("org.apache.commons:commons-numbers-primes:1.1")
    implementation("org.apache.commons:commons-numbers-angle:1.1")
    implementation("org.apache.commons:commons-numbers-rootfinder:1.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
