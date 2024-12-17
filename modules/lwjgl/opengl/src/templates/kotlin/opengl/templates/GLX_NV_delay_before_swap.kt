/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_NV_delay_before_swap = "GLXNVDelayBeforeSwap".nativeClassGLX("GLX_NV_delay_before_swap", NV) {
    Bool(
        "DelayBeforeSwapNV",

        DISPLAY,
        GLXDrawable("drawable"),
        GLfloat("seconds")
    )
}