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
        create("lwjglPlatforms") {
            id = "lwjgl-platforms"
            implementationClass = "org.lwjgl.gradle.plugin.platforms.LwjglPlatformsPlugin"
        }
    }
}