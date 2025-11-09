/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
rootProject.name = "lwjgl"

includeBuild("publish/build-logic")

include("lwjgl-bom")
project(":lwjgl-bom").projectDir = file("publish/lwjgl-bom")

include("lwjgl-modules")
project(":lwjgl-modules").projectDir = file("publish/lwjgl-modules")

val modulesDir = project(":lwjgl-modules").projectDir

if (modulesDir.exists() && modulesDir.isDirectory) {
    modulesDir.listFiles { file -> file.isDirectory }.forEach { dir ->
        include("lwjgl-modules:${dir.name}")
        project(":lwjgl-modules:${dir.name}").projectDir = dir
    }
}