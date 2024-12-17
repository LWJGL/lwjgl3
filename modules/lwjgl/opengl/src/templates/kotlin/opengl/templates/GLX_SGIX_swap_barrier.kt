/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGIX_swap_barrier = "GLXSGIXSwapBarrier".nativeClassGLX("GLX_SGIX_swap_barrier", SGIX) {
    void(
        "BindSwapBarrierSGIX",

        DISPLAY,
        GLXDrawable("drawable"),
        int("barrier")
    )

    Bool(
        "QueryMaxSwapBarriersSGIX",

        DISPLAY,
        int("screen"),
        Check(1)..int.p("max")
    )

}