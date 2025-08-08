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

lwjglPublication.create {
    title("LWJGL - JAWT bindings")
    description("The AWT native interface.")
}