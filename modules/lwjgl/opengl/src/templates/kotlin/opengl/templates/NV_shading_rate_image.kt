/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_shading_rate_image = "NVShadingRateImage".nativeClassGL("NV_shading_rate_image", postfix = NV) {
    IntConstant(
        "SHADING_RATE_IMAGE_NV"..0x9563
    )

    IntConstant(
        "SHADING_RATE_NO_INVOCATIONS_NV"..0x9564,
        "SHADING_RATE_1_INVOCATION_PER_PIXEL_NV"..0x9565,
        "SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV"..0x9566,
        "SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV"..0x9567,
        "SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV"..0x9568,
        "SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV"..0x9569,
        "SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV"..0x956A,
        "SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV"..0x956B,
        "SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV"..0x956C,
        "SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV"..0x956D,
        "SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV"..0x956E,
        "SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV"..0x956F
    )

    IntConstant(
        "SHADING_RATE_IMAGE_BINDING_NV"..0x955B,
        "SHADING_RATE_IMAGE_TEXEL_WIDTH_NV"..0x955C,
        "SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV"..0x955D,
        "SHADING_RATE_IMAGE_PALETTE_SIZE_NV"..0x955E,
        "MAX_COARSE_FRAGMENT_SAMPLES_NV"..0x955F
    )

    IntConstant(
        "SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV"..0x95AE,
        "SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV"..0x95AF,
        "SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV"..0x95B0
    )

    void(
        "BindShadingRateImageNV",

        GLuint("texture")
    )

    void(
        "ShadingRateImagePaletteNV",

        GLuint("viewport"),
        GLuint("first"),
        AutoSize("rates")..GLsizei("count"),
        GLenum.const.p("rates")
    )

    void(
        "GetShadingRateImagePaletteNV",

        GLuint("viewport"),
        GLuint("entry"),
        Check(1)..GLenum.p("rate")
    )

    void(
        "ShadingRateImageBarrierNV",

        GLboolean("synchronize")
    )

    void(
        "ShadingRateSampleOrderNV",

        GLenum("order")
    )

    void(
        "ShadingRateSampleOrderCustomNV",

        GLenum("rate"),
        GLuint("samples"),
        Unsafe..GLint.const.p("locations")
    )

    void(
        "GetShadingRateSampleLocationivNV",

        GLenum("rate"),
        GLuint("samples"),
        GLuint("index"),
        Check(3)..GLint.p("location")
    )
}