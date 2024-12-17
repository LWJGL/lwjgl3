/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_blend_subtract = "EXTBlendSubtract".nativeClassGL("EXT_blend_subtract", postfix = EXT) {
    IntConstant(
        "FUNC_SUBTRACT_EXT"..0x800A,
        "FUNC_REVERSE_SUBTRACT_EXT"..0x800B
    )
}