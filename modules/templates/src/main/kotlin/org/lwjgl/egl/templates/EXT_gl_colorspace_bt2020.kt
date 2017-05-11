/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_bt2020_linear = "EXTGLColorspaceBT2020Linear".nativeClassEGL("EXT_gl_colorspace_bt2020_linear", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications may wish to take advantage of a larger color gamut in the BT.2020 (ITU-R Recommendation BT.2020) color space. These extensions allow
        applications to do so by communicating to the platform the color space the framebuffer data is in, i.e. BT.2020 color space, as well as the encoding of
        the framebuffer data, which can be either linear or PQ (Dolby Perceptual Quantizer - SMPTE ST 2084) encoding. Applications are expected to prepare the
        framebuffer data properly.

        Requires ${KHR_gl_colorspace.link}.
        """

    IntConstant(
        "Accepted as attribute values for #GL_COLORSPACE by #CreateWindowSurface(), #CreatePbufferSurface() and #CreatePixmapSurface().",

        "GL_COLORSPACE_BT2020_LINEAR_EXT"..0x333F
    )
}

val EXT_gl_colorspace_bt2020_pq = "EXTGLColorspaceBT2020PQ".nativeClassEGL("EXT_gl_colorspace_bt2020_pq", postfix = EXT) {
    documentation =
        """
        See ${EXT_gl_colorspace_bt2020_linear.link}.
        """

    IntConstant(
        "Accepted as attribute values for #GL_COLORSPACE by #CreateWindowSurface(), #CreatePbufferSurface() and #CreatePixmapSurface().",

        "GL_COLORSPACE_BT2020_PQ_EXT"..0x3340
    )
}