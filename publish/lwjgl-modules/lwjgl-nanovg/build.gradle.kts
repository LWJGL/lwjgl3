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
    title("LWJGL - NanoVG & NanoSVG bindings")
    description("A small antialiased vector graphics rendering library for OpenGL. Also includes NanoSVG, a simple SVG parser.")
}