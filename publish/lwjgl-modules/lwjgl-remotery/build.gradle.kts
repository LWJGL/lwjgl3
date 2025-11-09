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
    title("LWJGL - Remotery bindings")
    description("A realtime CPU/GPU profiler hosted in a single C file with a viewer that runs in a web browser.")
}