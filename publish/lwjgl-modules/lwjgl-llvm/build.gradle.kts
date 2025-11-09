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
    title("LWJGL - LLVM/Clang bindings")
    description("A collection of modular and reusable compiler and toolchain technologies.")
}