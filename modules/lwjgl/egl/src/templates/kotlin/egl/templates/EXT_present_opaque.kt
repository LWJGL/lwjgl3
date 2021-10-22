/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_present_opaque = "EXTPresentOpaque".nativeClassEGL("EXT_present_opaque", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new EGL surface attribute #PRESENT_OPAQUE_EXT to indicate that the surface should be presented as opaque, disregarding any alpha
        channel if present. If surface attribute {@code EGL_PRESENT_OPAQUE_EXT} is #TRUE, then the surface will be presented as opaque.
        
        Requires ${EGL14.core} and ${KHR_image_base.link}.
        """

    IntConstant(
        "New {@code EGLSurface} attribute name.",

        "PRESENT_OPAQUE_EXT"..0x31DF
    )
}