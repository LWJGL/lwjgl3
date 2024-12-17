/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_blend_color = "EXTBlendColor".nativeClassGL("EXT_blend_color", postfix = EXT) {
    IntConstant(
        "CONSTANT_COLOR_EXT"..0x8001,
        "ONE_MINUS_CONSTANT_COLOR_EXT"..0x8002,
        "CONSTANT_ALPHA_EXT"..0x8003,
        "ONE_MINUS_CONSTANT_ALPHA_EXT"..0x8004
    )

    IntConstant(
        "BLEND_COLOR_EXT"..0x8005
    )

    void(
        "BlendColorEXT",

        GLfloat("red"),
        GLfloat("green"),
        GLfloat("blue"),
        GLfloat("alpha")
    )
}