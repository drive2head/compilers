import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0"
    application
    antlr
}
group = "me.garanya"
version = "1.0-SNAPSHOT"

sourceSets["main"].java.srcDirs("src/main/kotlin/mypackage")

repositories {
    mavenCentral()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
dependencies {
    testImplementation(kotlin("test-junit"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.beust:klaxon:5.5")
    antlr("org.antlr:antlr4:4.9.1")
    implementation("org.antlr:antlr4-runtime:4.9.1")
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
application {
    mainClassName = "MainKt"
}