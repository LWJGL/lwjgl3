/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_fragment_shading_rate = "EXTFragmentShadingRate".nativeClassGLES("EXT_fragment_shading_rate", postfix = EXT) {
    IntConstant(
        "SHADING_RATE_ATTACHMENT_EXT"..0x96D1
    )

    IntConstant(
        "SHADING_RATE_1X1_PIXELS_EXT"..0x96A6,
        "SHADING_RATE_1X2_PIXELS_EXT"..0x96A7,
        "SHADING_RATE_1X4_PIXELS_EXT"..0x96AA,
        "SHADING_RATE_2X1_PIXELS_EXT"..0x96A8,
        "SHADING_RATE_2X2_PIXELS_EXT"..0x96A9,
        "SHADING_RATE_2X4_PIXELS_EXT"..0x96AD,
        "SHADING_RATE_4X1_PIXELS_EXT"..0x96AB,
        "SHADING_RATE_4X2_PIXELS_EXT"..0x96AC,
        "SHADING_RATE_4X4_PIXELS_EXT"..0x96AE
    )

    IntConstant(
        "FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_EXT"..0x96D2,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_EXT"..0x96D3,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_EXT"..0x96D4,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_EXT"..0x96D5,
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_EXT"..0x96D6
    )

    IntConstant(
        "SHADING_RATE_EXT"..0x96D0,
        "MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT"..0x96D7,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT"..0x96D8,
        "MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT"..0x96D9,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT"..0x96DA,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_ASPECT_RATIO_EXT"..0x96DB,
        "MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_LAYERS_EXT"..0x96DC,
        "FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_SUPPORTED_EXT"..0x96DD,
        "FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_SUPPORTED_EXT"..0x96DE,
        "FRAGMENT_SHADING_RATE_ATTACHMENT_WITH_DEFAULT_FRAMEBUFFER_SUPPORTED_EXT"..0x96DF,
        "FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINERS_SUPPORTED_EXT"..0x8F6F
    )

    void(
        "ShadingRateEXT",

        GLenum("rate")
    )

    void(
        "ShadingRateCombinerOpsEXT",

        GLenum("combinerOp0"),
        GLenum("combinerOp1")
    )

    void(
        "FramebufferShadingRateEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("baseLayer"),
        GLsizei("numLayers"),
        GLsizei("texelWidth"),
        GLsizei("texelHeight")
    )

    void(
        "GetFragmentShadingRatesEXT",

        GLsizei("samples"),
        AutoSize("shadingRates")..GLsizei("maxCount"),
        Check(1)..GLsizei.p("count"),
        GLenum.p("shadingRates")
    )
}