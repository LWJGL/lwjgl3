/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_framebuffer_mixed_samples = "NVFramebufferMixedSamples".nativeClassGLES("NV_framebuffer_mixed_samples", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "framebuffer_mixed_samples")} extension.

        This extension allows multisample rendering with a raster and depth/stencil sample count that is larger than the color sample count. Rasterization and
        the results of the depth and stencil tests together determine the portion of a pixel that is "covered". It can be useful to evaluate coverage at a
        higher frequency than color samples are stored. This coverage is then "reduced" to a collection of covered color samples, each having an opacity value
        corresponding to the fraction of the color sample covered. The opacity can optionally be blended into individual color samples.

        In the current hardware incarnation both depth and stencil testing are supported with mixed samples, although the API accommodates supporting only one
        or the other.

        Rendering with fewer color samples than depth/stencil samples can greatly reduce the amount of memory and bandwidth consumed by the color buffer.
        However, converting the coverage values into opacity can introduce artifacts where triangles share edges and may not be suitable for normal triangle
        mesh rendering.

        One expected use case for this functionality is Stencil-then-Cover path rendering (NV_path_rendering). The stencil step determines the coverage (in the
        stencil buffer) for an entire path at the higher sample frequency, and then the cover step can draw the path into the lower frequency color buffer
        using the coverage information to antialias path edges. With this two-step process, internal edges are fully covered when antialiasing is applied and
        there is no corruption on these edges.

        The key features of this extension are:
        ${ul(
            "It allows a framebuffer object to be considered complete when its depth or stencil samples are a multiple of the number of color samples.",
            """
            It redefines SAMPLES to be the number of depth/stencil samples (if any); otherwise, it uses the number of color samples. SAMPLE_BUFFERS is one if
            there are multisample depth/stencil attachments. Multisample rasterization and multisample fragment ops are allowed if SAMPLE_BUFFERS is one.
            """,
            "It replaces several error checks involving SAMPLE_BUFFERS by error checks directly referencing the number of samples in the relevant attachments.",
            """
            A coverage reduction step is added to Per-Fragment Operations which converts a set of covered raster/depth/stencil samples to a set of covered
            color samples. The coverage reduction step also includes an optional coverage modulation step, multiplying color values by a fractional opacity
            corresponding to the number of associated raster/depth/stencil samples covered.
            """
        )}
        """

    IntConstant(
        "Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled.",

        "RASTER_MULTISAMPLE_EXT"..0x9327,
        "COVERAGE_MODULATION_TABLE_NV"..0x9331
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "RASTER_SAMPLES_EXT"..0x9328,
        "MAX_RASTER_SAMPLES_EXT"..0x9329,
        "RASTER_FIXED_SAMPLE_LOCATIONS_EXT"..0x932A,
        "MULTISAMPLE_RASTERIZATION_ALLOWED_EXT"..0x932B,
        "EFFECTIVE_RASTER_SAMPLES_EXT"..0x932C,
        "COLOR_SAMPLES_NV"..0x8E20,
        "DEPTH_SAMPLES_NV"..0x932D,
        "STENCIL_SAMPLES_NV"..0x932E,
        "MIXED_DEPTH_SAMPLES_SUPPORTED_NV"..0x932F,
        "MIXED_STENCIL_SAMPLES_SUPPORTED_NV"..0x9330,
        "COVERAGE_MODULATION_NV"..0x9332,
        "COVERAGE_MODULATION_TABLE_SIZE_NV"..0x9333
    )

    void(
        "RasterSamplesEXT",
        "",

        GLuint.IN("samples", ""),
        GLboolean.IN("fixedsamplelocations", "")
    )

    void(
        "CoverageModulationTableNV",
        "",

        AutoSize("v")..GLsizei.IN("n", ""),
        const..GLfloat_p.IN("v", "")
    )

    void(
        "GetCoverageModulationTableNV",
        "",

        AutoSize("v")..GLsizei.IN("bufsize", ""),
        GLfloat_p.OUT("v", "")
    )

    void(
        "CoverageModulationNV",
        "",

        GLenum.IN("components", "")
    )
}