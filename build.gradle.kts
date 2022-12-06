import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    id("io.qameta.allure") version "2.11.2"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.platform:junit-platform-commons:1.9.1")
    implementation("io.kotest:kotest-extensions-jvm:5.5.4")

    testImplementation("io.qameta.allure:allure-junit5:2.20.1")
    testImplementation("io.qameta.allure:allure-commandline:2.20.1")
    testImplementation("io.qameta.allure:allure-assertj:2.20.1")
    testImplementation("io.qameta.allure:allure-java-commons:2.20.1")

    testImplementation("org.aspectj:aspectjweaver:1.9.9.1")



    testImplementation(kotlin("test"))
    testImplementation ("io.kotest:kotest-runner-junit5:5.5.4")
    testImplementation ("io.kotest:kotest-assertions-core:5.5.4")
    testImplementation ("io.kotest:kotest-property:5.5.4")





}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}


application {
    mainClass.set("MainKt")
}