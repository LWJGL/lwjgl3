/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_buffer_region = "WGLARBBufferRegion".nativeClassWGL("WGL_ARB_buffer_region", ARB) {
    HANDLE(
        "CreateBufferRegionARB",

        HDC("hdc"),
        int("layerPlane"),
        UINT("type")
    )

    VOID(
        "DeleteBufferRegionARB",

        HANDLE("region")
    )

    BOOL(
        "SaveBufferRegionARB",

        HANDLE("region"),
        int("x"),
        int("y"),
        int("width"),
        int("height")
    )

    BOOL(
        "RestoreBufferRegionARB",

        HANDLE("region"),
        int("x"),
        int("y"),
        int("width"),
        int("height"),
        int("xSrc"),
        int("ySrc")
    )

    IntConstant(
        "FRONT_COLOR_BUFFER_BIT_ARB"..0x00000001,
        "BACK_COLOR_BUFFER_BIT_ARB"..0x00000002,
        "DEPTH_BUFFER_BIT_ARB"..0x00000004,
        "STENCIL_BUFFER_BIT_ARB"..0x00000008
    )
}