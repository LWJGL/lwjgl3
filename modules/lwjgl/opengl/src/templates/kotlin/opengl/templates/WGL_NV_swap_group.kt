/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_NV_swap_group = "WGLNVSwapGroup".nativeClassWGL("WGL_NV_swap_group", postfix = NV) {
    BOOL(
        "JoinSwapGroupNV",

        HDC("hDC"),
        GLuint("group")
    )

    BOOL(
        "BindSwapBarrierNV",

        GLuint("group"),
        GLuint("barrier")
    )

    BOOL(
        "QuerySwapGroupNV",

        HDC("hDC"),
        Check(1)..GLuint.p("group"),
        Check(1)..GLuint.p("barrier")
    )

    BOOL(
        "QueryMaxSwapGroupsNV",

        HDC("hDC"),
        Check(1)..GLuint.p("maxGroups"),
        Check(1)..GLuint.p("maxBarriers")
    )

    BOOL(
        "QueryFrameCountNV",

        HDC("hDC"),
        Check(1)..GLuint.p("count")
    )

    BOOL(
        "ResetFrameCountNV",

        HDC("hDC")
    )
}