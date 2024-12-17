/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_NV_swap_group = "GLXNVSwapGroup".nativeClassGLX("GLX_NV_swap_group", postfix = NV) {
    Bool(
        "JoinSwapGroupNV",

        DISPLAY,
        GLXDrawable("drawable"),
        GLuint("group")
    )

    Bool(
        "BindSwapBarrierNV",

        DISPLAY,
        GLuint("group"),
        GLuint("barrier")
    )

    Bool(
        "QuerySwapGroupNV",

        DISPLAY,
        GLXDrawable("drawable"),
        Check(1)..GLuint.p("group"),
        Check(1)..GLuint.p("barrier")
    )

    Bool(
        "QueryMaxSwapGroupsNV",

        DISPLAY,
        int("screen"),
        Check(1)..GLuint.p("maxGroups"),
        Check(1)..GLuint.p("maxBarriers")
    )

    Bool(
        "QueryFrameCountNV",

        DISPLAY,
        int("screen"),
        Check(1)..GLuint.p("count")
    )

    Bool(
        "ResetFrameCountNV",

        DISPLAY,
        int("screen")
    )
}