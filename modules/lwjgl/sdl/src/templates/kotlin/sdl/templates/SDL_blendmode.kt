/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_blendmode() = SDL.apply {
    IntConstant("BLENDMODE_NONE".."0x00000000")
    IntConstant("BLENDMODE_BLEND".."0x00000001")
    IntConstant("BLENDMODE_BLEND_PREMULTIPLIED".."0x00000010")
    IntConstant("BLENDMODE_ADD".."0x00000002")
    IntConstant("BLENDMODE_ADD_PREMULTIPLIED".."0x00000020")
    IntConstant("BLENDMODE_MOD".."0x00000004")
    IntConstant("BLENDMODE_MUL".."0x00000008")
    IntConstant("BLENDMODE_INVALID".."0x7FFFFFFF")

    EnumConstant(
        "BLENDOPERATION_ADD".enum(0x1),
        "BLENDOPERATION_SUBTRACT".enum(0x2),
        "BLENDOPERATION_REV_SUBTRACT".enum(0x3),
        "BLENDOPERATION_MINIMUM".enum(0x4),
        "BLENDOPERATION_MAXIMUM".enum(0x5)
    )

    EnumConstant(
        "BLENDFACTOR_ZERO".enum(0x1),
        "BLENDFACTOR_ONE".enum(0x2),
        "BLENDFACTOR_SRC_COLOR".enum(0x3),
        "BLENDFACTOR_ONE_MINUS_SRC_COLOR".enum(0x4),
        "BLENDFACTOR_SRC_ALPHA".enum(0x5),
        "BLENDFACTOR_ONE_MINUS_SRC_ALPHA".enum(0x6),
        "BLENDFACTOR_DST_COLOR".enum(0x7),
        "BLENDFACTOR_ONE_MINUS_DST_COLOR".enum(0x8),
        "BLENDFACTOR_DST_ALPHA".enum(0x9),
        "BLENDFACTOR_ONE_MINUS_DST_ALPHA".enum(0xA)
    )

    SDL_BlendMode(
        "ComposeCustomBlendMode",

        SDL_BlendFactor("srcColorFactor"),
        SDL_BlendFactor("dstColorFactor"),
        SDL_BlendOperation("colorOperation"),
        SDL_BlendFactor("srcAlphaFactor"),
        SDL_BlendFactor("dstAlphaFactor"),
        SDL_BlendOperation("alphaOperation")
    )

}
