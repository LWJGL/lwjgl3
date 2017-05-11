/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_gl_colorspace = "KHRGLColorspace".nativeClassEGL("KHR_gl_colorspace", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications may wish to use sRGB format default framebuffers to more easily achieve sRGB rendering to display devices. This extension allows creating
        EGLSurfaces which will be rendered to in sRGB by OpenGL contexts supporting that capability.

        Requires ${EGL14.core}.
        """

    IntConstant(
        "",

        "GL_COLORSPACE_KHR"..0x309D,
        "GL_COLORSPACE_SRGB_KHR"..0x3089,
        "GL_COLORSPACE_LINEAR_KHR"..0x308A
    )
}