/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val KHR_blend_equation_advanced = "KHRBlendEquationAdvanced".nativeClassGLES("KHR_blend_equation_advanced", postfix = KHR) {
    IntConstant(
        "MULTIPLY_KHR"..0x9294,
        "SCREEN_KHR"..0x9295,
        "OVERLAY_KHR"..0x9296,
        "DARKEN_KHR"..0x9297,
        "LIGHTEN_KHR"..0x9298,
        "COLORDODGE_KHR"..0x9299,
        "COLORBURN_KHR"..0x929A,
        "HARDLIGHT_KHR"..0x929B,
        "SOFTLIGHT_KHR"..0x929C,
        "DIFFERENCE_KHR"..0x929E,
        "EXCLUSION_KHR"..0x92A0,
        "HSL_HUE_KHR"..0x92AD,
        "HSL_SATURATION_KHR"..0x92AE,
        "HSL_COLOR_KHR"..0x92AF,
        "HSL_LUMINOSITY_KHR"..0x92B0
    )

    void("BlendBarrierKHR")
}

val KHR_blend_equation_advanced_coherent = "KHRBlendEquationAdvancedCoherent".nativeClassGLES("KHR_blend_equation_advanced_coherent", postfix = KHR) {
    IntConstant(
        "BLEND_ADVANCED_COHERENT_KHR"..0x9285
    )
}