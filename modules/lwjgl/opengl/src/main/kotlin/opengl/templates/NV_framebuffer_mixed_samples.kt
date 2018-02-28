/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_framebuffer_mixed_samples = "NVFramebufferMixedSamples".nativeClassGL("NV_framebuffer_mixed_samples", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows multisample rendering with a raster and
    depth/stencil sample count that is larger than the color sample count.
    Rasterization and the results of the depth and stencil tests together
    determine the portion of a pixel that is "covered".  It can be useful to
    evaluate coverage at a higher frequency than color samples are stored.
    This coverage is then "reduced" to a collection of covered color samples,
    each having an opacity value corresponding to the fraction of the color
    sample covered.  The opacity can optionally be blended into individual
    color samples.
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

        // COLOR_SAMPLES_NV is shared with NV_multisample_coverage
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

        AutoSize("v")..GLsizei.IN("n", "The size of the coverage modulation table. Must be equal to the value of COVERAGE_MODULATION_TABLE_SIZE_NV."),
        GLfloat.const.p.IN("v", "")
    )

    void(
        "GetCoverageModulationTableNV",
        "",

        AutoSize("v")..GLsizei.IN("bufsize", ""),
        GLfloat.p.OUT("v", "")
    )

    void(
        "CoverageModulationNV",
        "",

        GLenum.IN("components", "")
    )
}
