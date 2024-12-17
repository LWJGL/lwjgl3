/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_SGI_swap_control = "GLXSGISwapControl".nativeClassGLX("GLX_SGI_swap_control", SGI) {
    GLint(
        "SwapIntervalSGI",

        int("interval")
    )
}