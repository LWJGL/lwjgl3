/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EGL13 = "EGL13".nativeClassEGL("EGL13", postfix = "") {
    extends = EGL12
    documentation =
        "The core EGL 1.3 functionality."

    IntConstant(
        "",

        "CONFORMANT"..0x3042,
        "CONTEXT_CLIENT_VERSION"..0x3098,
        "MATCH_NATIVE_PIXMAP"..0x3041,
        "OPENGL_ES2_BIT"..0x0004,
        "VG_ALPHA_FORMAT"..0x3088,
        "VG_ALPHA_FORMAT_NONPRE"..0x308B,
        "VG_ALPHA_FORMAT_PRE"..0x308C,
        "VG_ALPHA_FORMAT_PRE_BIT"..0x0040,
        "VG_COLORSPACE"..0x3087,
        "VG_COLORSPACE_sRGB"..0x3089,
        "VG_COLORSPACE_LINEAR"..0x308A,
        "VG_COLORSPACE_LINEAR_BIT"..0x0020
    )
}