/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
plugins {
    id("lwjgl-module")
}

lwjglPlatforms {
    addSupport(FREEBSD, NATIVE_OPTIONAL)
    addSupport(LINUX, NATIVE_OPTIONAL)
    addSupport(MACOS, NATIVE_REQUIRED)
    addSupport(WINDOWS, NATIVE_OPTIONAL)
}

dependencies {
    api(project(":lwjgl-modules:lwjgl"))
}

lwjglPublication.create {
    title("LWJGL - Vulkan bindings")
    description("A new generation graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.")
}