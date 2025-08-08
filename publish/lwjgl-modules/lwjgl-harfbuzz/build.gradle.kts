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
    title("LWJGL - HarfBuzz bindings")
    description("A text shaping library that allows programs to convert a sequence of Unicode input into properly formatted and positioned glyph output — for any writing system and language.")
}