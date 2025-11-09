/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention").version("1.0.0")
}

rootProject.name = "build-logic"

include("lwjgl-convention")

include("lwjgl-plugins")
include("lwjgl-plugins:lwjgl-adhoc")
include("lwjgl-plugins:lwjgl-platforms")
include("lwjgl-plugins:lwjgl-publication")

include("lwjgl-utils")