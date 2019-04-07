/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_display_p3_passthrough = "EXTGLColorspaceDisplayP3Passthrough".nativeClassEGL("EXT_gl_colorspace_display_p3_passthrough", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications that want to use the Display-P3 color space (DCI-P3 primaries with sRGB-like transfer function) can use this extension to communicate to
        the platform that framebuffer contents represent colors in the non-linear Display-P3 color space.

        The application is responsible for producing appropriate framebuffer contents. An application would want to use this extension rather than
        ${EXT_gl_colorspace_display_p3.link} if they apply the sRGB transfer function themselves and do not need the HW to do it.

        Requires ${KHR_gl_colorspace.link}.
        """

    IntConstant(
        "Accepted as attribute values for #GL_COLORSPACE by #CreateWindowSurface(), #CreatePbufferSurface() and #CreatePixmapSurface().",

        "GL_COLORSPACE_DISPLAY_P3_PASSTHROUGH_EXT"..0x3490
    )
}