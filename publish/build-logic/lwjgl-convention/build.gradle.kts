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

val pluginProjects = project(":lwjgl-plugins").subprojects

dependencies {
    pluginProjects.forEach { pluginProject ->
        implementation(pluginProject)
    }
}