/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
rootProject.name = "Root"

includeBuild("publish/build-logic")

include("lwjgl-bom")
project(":lwjgl-bom").projectDir = file("publish/lwjgl-bom")