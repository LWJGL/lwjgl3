/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_blend_minmax = "EXTBlendMinmax".nativeClassGL("EXT_blend_minmax", postfix = EXT) {
    IntConstant(
        "FUNC_ADD_EXT"..0x8006,
        "MIN_EXT"..0x8007,
        "MAX_EXT"..0x8008
    )

    IntConstant(
        "BLEND_EQUATION_EXT"..0x8009
    )

    void(
        "BlendEquationEXT",

        GLenum("mode")
    )
}