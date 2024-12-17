/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_rectangle = "ARBTextureRectangle".nativeClassGL("ARB_texture_rectangle", postfix = ARB) {
    IntConstant(
        "TEXTURE_RECTANGLE_ARB"..0x84F5
    )

    IntConstant(
        "TEXTURE_BINDING_RECTANGLE_ARB"..0x84F6
    )

    IntConstant(
        "PROXY_TEXTURE_RECTANGLE_ARB"..0x84F7
    )

    IntConstant(
        "MAX_RECTANGLE_TEXTURE_SIZE_ARB"..0x84F8
    )

    IntConstant(
        "SAMPLER_2D_RECT_ARB"..0x8B63
    )

    IntConstant(
        "SAMPLER_2D_RECT_SHADOW_ARB"..0x8B64
    )

}