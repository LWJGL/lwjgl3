/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_blend_equation_advanced = "NVBlendEquationAdvanced".nativeClassGL("NV_blend_equation_advanced", postfix = NV) {
    IntConstant(
        "BLEND_PREMULTIPLIED_SRC_NV"..0x9280,
        "BLEND_OVERLAP_NV"..0x9281
    )

    IntConstant(
        "UNCORRELATED_NV"..0x8521,
        "DISJOINT_NV"..0x9283,
        "CONJOINT_NV"..0x9284
    )

    IntConstant(
        "SRC_NV"..0x9286,
        "DST_NV"..0x9287,
        "SRC_OVER_NV"..0x9288,
        "DST_OVER_NV"..0x9289,
        "SRC_IN_NV"..0x928A,
        "DST_IN_NV"..0x928B,
        "SRC_OUT_NV"..0x928C,
        "DST_OUT_NV"..0x928D,
        "SRC_ATOP_NV"..0x928E,
        "DST_ATOP_NV"..0x928F,
        "XOR_NV"..0x1506,
        "MULTIPLY_NV"..0x9294,
        "SCREEN_NV"..0x9295,
        "OVERLAY_NV"..0x9296,
        "DARKEN_NV"..0x9297,
        "LIGHTEN_NV"..0x9298,
        "COLORDODGE_NV"..0x9299,
        "COLORBURN_NV"..0x929A,
        "HARDLIGHT_NV"..0x929B,
        "SOFTLIGHT_NV"..0x929C,
        "DIFFERENCE_NV"..0x929E,
        "EXCLUSION_NV"..0x92A0,
        "INVERT_RGB_NV"..0x92A3,
        "LINEARDODGE_NV"..0x92A4,
        "LINEARBURN_NV"..0x92A5,
        "VIVIDLIGHT_NV"..0x92A6,
        "LINEARLIGHT_NV"..0x92A7,
        "PINLIGHT_NV"..0x92A8,
        "HARDMIX_NV"..0x92A9,

        "HSL_HUE_NV"..0x92AD,
        "HSL_SATURATION_NV"..0x92AE,
        "HSL_COLOR_NV"..0x92AF,
        "HSL_LUMINOSITY_NV"..0x92B0,

        "PLUS_NV"..0x9291,
        "PLUS_CLAMPED_NV"..0x92B1,
        "PLUS_CLAMPED_ALPHA_NV"..0x92B2,
        "PLUS_DARKER_NV"..0x9292,
        "MINUS_NV"..0x929F,
        "MINUS_CLAMPED_NV"..0x92B3,
        "CONTRAST_NV"..0x92A1,
        "INVERT_OVG_NV"..0x92B4,
        "RED_NV"..0x1903,
        "GREEN_NV"..0x1904,
        "BLUE_NV"..0x1905
    )

    void(
        "BlendParameteriNV",

        GLenum("pname"),
        GLint("value")
    )

    void("BlendBarrierNV")
}

val NV_blend_equation_advanced_coherent = "NVBlendEquationAdvancedCoherent".nativeClassGL("NV_blend_equation_advanced_coherent", postfix = NV) {
    IntConstant(
        "BLEND_ADVANCED_COHERENT_NV"..0x9285
    )
}