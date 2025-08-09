/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    id("lwjgl-module")
}

lwjglPlatforms {
    addSupport(ALL, NATIVE_OPTIONAL)
}

dependencies {
    api(project(":lwjgl-modules:lwjgl"))
}

lwjglPublication.create {
    title("LWJGL - OpenCL bindings")
    description("An open, royalty-free standard for cross-platform, parallel programming of diverse processors found in personal computers, servers, mobile devices and embedded platforms.")
}