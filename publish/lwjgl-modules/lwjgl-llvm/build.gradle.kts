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
    title("LWJGL - LLVM/Clang bindings")
    description("A collection of modular and reusable compiler and toolchain technologies.")
}