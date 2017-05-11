/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_create_context_no_error = "KHRCreateContextNoError".nativeClassEGL("KHR_create_context_no_error", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows the creation of an OpenGL or OpenGL ES context that doesn't generate errors if the context supports a no error mode. The
        implications of this feature are discussed in the {@link org.lwjgl.opengl.KHRNoError GL_KHR_no_error} extension.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "CONTEXT_OPENGL_NO_ERROR_KHR"..0x31B3
    )
}