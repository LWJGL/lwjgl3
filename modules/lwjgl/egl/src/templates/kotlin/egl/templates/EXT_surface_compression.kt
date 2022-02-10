/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_surface_compression = "EXTSurfaceCompression".nativeClassEGL("EXT_surface_compression", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications may wish to take advantage of framebuffer compression. Some platforms may support framebuffer compression at fixed bitrates. Such
        compression algorithms generally produce results that are visually lossless, but the results are typically not bit exact when compared to a
        non-compressed result.

        This extension enables applications to opt-in to fixed-rate compression for EGL window surfaces.

        Compression may not be supported for all framebuffer formats. It can still be requested for all formats and applications can query what level of
        compression was actually enabled.
        """

    IntConstant(
        "New attributes accepted by the {@code attrib_list} argument of #CreatePlatformWindowSurface() and #CreateWindowSurface().",

        "SURFACE_COMPRESSION_EXT"..0x34B0,
        "SURFACE_COMPRESSION_PLANE1_EXT"..0x328E,
        "SURFACE_COMPRESSION_PLANE2_EXT"..0x328F
    )

    IntConstant(
        "Accepted as attribute values for #SURFACE_COMPRESSION_EXT by #CreatePlatformWindowSurface() and #CreateWindowSurface().",

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
        """
        Gets the list of all fixed-rate compression rates that are available on a specified display and {@code EGLConfig}.

        The number of rates is returned in {@code num_rates}, and elements 0 through {@code num_rates-1} of {@code rates} are filled in with the available
        compression rates.

        No more than {@code rate_size} compression rates will be returned even if more are available on the specified display and config. However, if
        {@code eglQuerySupportedCompressionRatesEXT} is called with {@code rates = NULL}, then no rates are returned, but the total number of rates
        available will be returned in {@code num_rates}.

        The possible values returned in {@code rates} are the attribute values accepted for #SURFACE_COMPRESSION_EXT by #CreatePlatformWindowSurface() and
        #CreateWindowSurface(), except #SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT and #SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT.
        """,

        EGLDisplay("dpy", ""),
        EGLConfig("config", ""),
        nullable..noneTerminated..EGLAttrib.const.p(
            "attrib_list",
            """
            a list of attributes that will be provided when a surface is created with this combination of display and {@code EGLConfig}. The accepted
            attributes are the same as for #CreatePlatformWindowSurface().
            """
        ),
        nullable..EGLint.p("rates", "a pointer to a buffer containing {@code rate_size} elements."),
        AutoSize("rates")..EGLint("rate_size", ""),
        Check(1)..EGLint.p("num_rates", ""),

        returnDoc = "#TRUE on success."
    )
}