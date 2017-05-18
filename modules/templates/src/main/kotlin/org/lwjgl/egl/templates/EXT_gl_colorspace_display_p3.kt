/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_display_p3_linear = "EXTGLColorspaceDisplayP3Linear".nativeClassEGL("EXT_gl_colorspace_display_p3_linear", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications that want to use the Display-P3 color space (DCI-P3 primaries and linear or sRGB-like transfer function) can use this extension to
        communicate to the platform that framebuffer contents represent colors in the Display-P3 color space. The application is responsible for producing
        appropriate framebuffer contents, but will typically use built-in sRGB encoding in OpenGL and OpenGL ES to accomplish this.

        Requires ${KHR_gl_colorspace.link}.
        """

    IntConstant(
        "Accepted as attribute values for #GL_COLORSPACE by #CreateWindowSurface(), #CreatePbufferSurface() and #CreatePixmapSurface().",

        "GL_COLORSPACE_DISPLAY_P3_LINEAR_EXT"..0x3362
    )
}

val EXT_gl_colorspace_display_p3 = "EXTGLColorspaceDisplayP3".nativeClassEGL("EXT_gl_colorspace_display_p3", postfix = EXT) {
    documentation =
        """
        See ${EXT_gl_colorspace_display_p3_linear.link}.
        """

    IntConstant(
        "Accepted as attribute values for #GL_COLORSPACE by #CreateWindowSurface(), #CreatePbufferSurface() and #CreatePixmapSurface().",

        "GL_COLORSPACE_DISPLAY_P3_EXT"..0x3363
    )
}