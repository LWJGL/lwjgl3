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
    title("LWJGL - rpmalloc bindings")
    description("A public domain cross platform lock free thread caching 16-byte aligned memory allocator implemented in C.")
}