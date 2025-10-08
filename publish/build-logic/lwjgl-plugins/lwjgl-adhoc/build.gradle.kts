/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    `kotlin-dsl`
}

val kotlinToolchainVersion: String by project

kotlin {
    jvmToolchain(kotlinToolchainVersion.toInt())
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lwjgl-utils"))
}

gradlePlugin {
    plugins {
        create("lwjglAdhoc") {
            id = "lwjgl-adhoc"
            implementationClass = "org.lwjgl.gradle.plugin.adhoc.LwjglAdhocPlugin"
        }
    }
}