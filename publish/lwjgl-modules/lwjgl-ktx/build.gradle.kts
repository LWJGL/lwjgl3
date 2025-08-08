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
    addSupport(WINDOWS_ARM64, NATIVE_REQUIRED)
}

dependencies {
    api(project(":lwjgl-modules:lwjgl"))
}

lwjglPublication.create {
    title("LWJGL - KTX (Khronos Texture) bindings")
    description("A lightweight container for textures for OpenGL®, Vulkan® and other GPU APIs.")
}