/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    id("lwjgl-module")
}

lwjglPlatforms {
    addSupport(ALL, NATIVE_REQUIRED)
}

dependencies {
    api(project(":lwjgl-modules:lwjgl"))
}

lwjglPublication.create {
    title("LWJGL - xxHash bindings")
    description("An extremely fast hash algorithm, running at RAM speed limits.")
}