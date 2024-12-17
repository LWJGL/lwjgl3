/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_blend_equation_separate = "EXTBlendEquationSeparate".nativeClassGL("EXT_blend_equation_separate", postfix = EXT) {
    IntConstant(
        "BLEND_EQUATION_RGB_EXT"..0x8009,
        "BLEND_EQUATION_ALPHA_EXT"..0x883D
    )

    void(
        "BlendEquationSeparateEXT",

        GLenum("modeRGB"),
        GLenum("modeAlpha")
    )
}