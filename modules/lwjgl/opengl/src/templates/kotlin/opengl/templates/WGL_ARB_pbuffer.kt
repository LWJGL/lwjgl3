/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_ARB_pbuffer = "WGLARBPbuffer".nativeClassWGL("WGL_ARB_pbuffer", ARB) {
    HPBUFFERARB(
        "CreatePbufferARB",

        HDC("hdc"),
        int("pixelFormat"),
        int("width"),
        int("height"),
        NullTerminated..nullable..int.const.p("attribList")
    )

    HDC(
        "GetPbufferDCARB",

        HPBUFFERARB("pbuffer")
    )

    int(
        "ReleasePbufferDCARB",

        HPBUFFERARB("pbuffer"),
        HDC("hdc")
    )

    BOOL(
        "DestroyPbufferARB",

        HPBUFFERARB("pbuffer")
    )

    BOOL(
        "QueryPbufferARB",

        HPBUFFERARB("pbuffer"),
        int("attribute"),
        Check(1)..int.p("value")
    )

    IntConstant(
        "DRAW_TO_PBUFFER_ARB"..0x202D
    )

    IntConstant(
        "MAX_PBUFFER_PIXELS_ARB"..0x202E,
        "MAX_PBUFFER_WIDTH_ARB"..0x202F,
        "MAX_PBUFFER_HEIGHT_ARB"..0x2030
    )

    IntConstant(
        "PBUFFER_LARGEST_ARB"..0x2033
    )

    IntConstant(
        "PBUFFER_WIDTH_ARB"..0x2034,
        "PBUFFER_HEIGHT_ARB"..0x2035,
        "PBUFFER_LOST_ARB"..0x2036
    )

}