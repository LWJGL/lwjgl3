/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_framebuffer_mixed_samples = "NVFramebufferMixedSamples".nativeClassGLES("NV_framebuffer_mixed_samples", postfix = NV) {
    IntConstant(
        "RASTER_MULTISAMPLE_EXT"..0x9327,
        "COVERAGE_MODULATION_TABLE_NV"..0x9331
    )

    IntConstant(
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

    reuse(EXT_raster_multisample, "RasterSamplesEXT")

    void(
        "CoverageModulationTableNV",

        AutoSize("v")..GLsizei("n"),
        GLfloat.const.p("v")
    )

    void(
        "GetCoverageModulationTableNV",

        AutoSize("v")..GLsizei("bufsize"),
        GLfloat.p("v")
    )

    void(
        "CoverageModulationNV",

        GLenum("components")
    )
}