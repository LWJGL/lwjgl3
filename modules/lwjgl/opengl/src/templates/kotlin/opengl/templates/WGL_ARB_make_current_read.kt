/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_make_current_read = "WGLARBMakeCurrentRead".nativeClassWGL("WGL_ARB_make_current_read", ARB) {
    IntConstant(
        "ERROR_INVALID_PIXEL_TYPE_ARB"..0x2043,
        "ERROR_INCOMPATIBLE_DEVICE_CONTEXTS_ARB"..0x2054
    ).noPrefix()

    BOOL(
        "MakeContextCurrentARB",

        HDC("drawDC"),
        HDC("readDC"),
        HGLRC("hglrc")
    )

    HDC("GetCurrentReadDCARB", void())

}