/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_blend_minmax_factor = "AMDBlendMinmaxFactor".nativeClassGL("AMD_blend_minmax_factor", postfix = AMD) {
    IntConstant(
        "FACTOR_MIN_AMD"..0x901C,
        "FACTOR_MAX_AMD"..0x901D
    )
}