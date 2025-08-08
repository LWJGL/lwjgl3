/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    id("lwjgl-module")
}

lwjglPlatforms {
    addSupport(FREEBSD, NATIVE_REQUIRED)
    addSupport(LINUX, NATIVE_REQUIRED)
    addSupport(MACOS, NATIVE_REQUIRED)
    addSupport(WINDOWS_X64, NATIVE_REQUIRED)
    addSupport(WINDOWS_X86, NATIVE_REQUIRED)
}

dependencies {
    api(project(":lwjgl-modules:lwjgl"))
}

lwjglPublication.create {
    title("LWJGL - bgfx bindings")
    description("A cross-platform, graphics API agnostic rendering library. It provides a high performance, low level abstraction for common platform graphics APIs like OpenGL, Direct3D and Apple Metal.")
}