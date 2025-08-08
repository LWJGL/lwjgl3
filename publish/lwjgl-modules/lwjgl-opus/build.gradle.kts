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

lwjglPublication.create {
    title("LWJGL - Opus bindings")
    description("A totally open, royalty-free, highly versatile audio codec.")
}