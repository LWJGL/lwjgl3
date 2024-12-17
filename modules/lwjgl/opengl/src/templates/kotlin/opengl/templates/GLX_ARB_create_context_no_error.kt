/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_create_context_no_error = "GLXARBCreateContextNoError".nativeClassGLX("GLX_ARB_create_context_no_error", ARB) {
    IntConstant(
        "CONTEXT_OPENGL_NO_ERROR_ARB"..0x31B3
    )
}