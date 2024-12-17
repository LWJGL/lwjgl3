/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_surface_compression = "EXTSurfaceCompression".nativeClassEGL("EXT_surface_compression", postfix = EXT) {
    IntConstant(
        "SURFACE_COMPRESSION_EXT"..0x34B0,
        "SURFACE_COMPRESSION_PLANE1_EXT"..0x328E,
        "SURFACE_COMPRESSION_PLANE2_EXT"..0x328F
    )

    IntConstant(
        "SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT"..0x34B1,
        "SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT"..0x34B2,
        "SURFACE_COMPRESSION_FIXED_RATE_1BPC_EXT"..0x34B4,
        "SURFACE_COMPRESSION_FIXED_RATE_2BPC_EXT"..0x34B5,
        "SURFACE_COMPRESSION_FIXED_RATE_3BPC_EXT"..0x34B6,
        "SURFACE_COMPRESSION_FIXED_RATE_4BPC_EXT"..0x34B7,
        "SURFACE_COMPRESSION_FIXED_RATE_5BPC_EXT"..0x34B8,
        "SURFACE_COMPRESSION_FIXED_RATE_6BPC_EXT"..0x34B9,
        "SURFACE_COMPRESSION_FIXED_RATE_7BPC_EXT"..0x34BA,
        "SURFACE_COMPRESSION_FIXED_RATE_8BPC_EXT"..0x34BB,
        "SURFACE_COMPRESSION_FIXED_RATE_9BPC_EXT"..0x34BC,
        "SURFACE_COMPRESSION_FIXED_RATE_10BPC_EXT"..0x34BD,
        "SURFACE_COMPRESSION_FIXED_RATE_11BPC_EXT"..0x34BE,
        "SURFACE_COMPRESSION_FIXED_RATE_12BPC_EXT"..0x34BF
    )

    EGLBoolean(
        "QuerySupportedCompressionRatesEXT",

        EGLDisplay("dpy"),
        EGLConfig("config"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list"),
        nullable..EGLint.p("rates"),
        AutoSize("rates")..EGLint("rate_size"),
        Check(1)..EGLint.p("num_rates")
    )
}