/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_create_context_no_error = "GLXARBCreateContextNoError".nativeClassGLX("GLX_ARB_create_context_no_error", ARB) {
    documentation =
        """
        Native bindings to the ${registryLink("ARB_create_context_no_error")} extension.

        This extension allows the creation of an OpenGL or OpenGL ES context that doesn't generate errors if the context supports a no error mode. The
        implications of this feature are discussed in the ${KHR_no_error.link} extension.

        Requires ${WGL_ARB_create_context.link}.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code *attrib_list} argument to GLXARBCreateContext#glXCreateContextAttribsARB().",

        "CONTEXT_OPENGL_NO_ERROR_ARB"..0x31B3
    )
}