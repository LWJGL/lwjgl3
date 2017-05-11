/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_surfaceless_context = "OESSurfacelessContext".nativeClassGLES("OES_surfaceless_context", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications that only want to render to framebuffer objects should not need to create a throw-away EGL surface (typically a 1x1 pbuffer) just to get a
        current context. The EGL extension KHR_surfaceless_context provides a mechanism for making a context current without a surface. This extensions
        specifies the behaviour of OpenGL ES 1.x and OpenGL ES 2.0 when such a context is made current.
        """

    IntConstant(
        "Returned by glCheckFramebufferStatusOES and glCheckFramebufferStatus.",

        "FRAMEBUFFER_UNDEFINED_OES"..0x8219
    )
}