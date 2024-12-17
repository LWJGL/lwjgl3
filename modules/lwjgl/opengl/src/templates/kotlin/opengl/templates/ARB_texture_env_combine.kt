/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_env_combine = "ARBTextureEnvCombine".nativeClassGL("ARB_texture_env_combine", postfix = ARB) {
    IntConstant(
        "COMBINE_ARB"..0x8570
    )

    IntConstant(
        "COMBINE_RGB_ARB"..0x8571,
        "COMBINE_ALPHA_ARB"..0x8572,
        "SOURCE0_RGB_ARB"..0x8580,
        "SOURCE1_RGB_ARB"..0x8581,
        "SOURCE2_RGB_ARB"..0x8582,
        "SOURCE0_ALPHA_ARB"..0x8588,
        "SOURCE1_ALPHA_ARB"..0x8589,
        "SOURCE2_ALPHA_ARB"..0x858A,
        "OPERAND0_RGB_ARB"..0x8590,
        "OPERAND1_RGB_ARB"..0x8591,
        "OPERAND2_RGB_ARB"..0x8592,
        "OPERAND0_ALPHA_ARB"..0x8598,
        "OPERAND1_ALPHA_ARB"..0x8599,
        "OPERAND2_ALPHA_ARB"..0x859A,
        "RGB_SCALE_ARB"..0x8573
    )

    IntConstant(
        "ADD_SIGNED_ARB"..0x8574,
        "INTERPOLATE_ARB"..0x8575,
        "SUBTRACT_ARB"..0x84E7
    )

    IntConstant(
        "CONSTANT_ARB"..0x8576,
        "PRIMARY_COLOR_ARB"..0x8577,
        "PREVIOUS_ARB"..0x8578
    )
}