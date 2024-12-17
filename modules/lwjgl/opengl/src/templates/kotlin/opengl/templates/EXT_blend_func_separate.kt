/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_blend_func_separate = "EXTBlendFuncSeparate".nativeClassGL("EXT_blend_func_separate", postfix = EXT) {
    IntConstant(
        "BLEND_DST_RGB_EXT"..0x80C8,
        "BLEND_SRC_RGB_EXT"..0x80C9,
        "BLEND_DST_ALPHA_EXT"..0x80CA,
        "BLEND_SRC_ALPHA_EXT"..0x80CB
    )

    void(
        "BlendFuncSeparateEXT",

        GLenum("sfactorRGB"),
        GLenum("dfactorRGB"),
        GLenum("sfactorAlpha"),
        GLenum("dfactorAlpha")
    )
}