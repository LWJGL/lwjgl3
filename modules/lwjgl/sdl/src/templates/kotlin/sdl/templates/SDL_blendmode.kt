/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_blendmode = "SDLBlendMode".nativeClassSDL("SDL_blendmode") {
    IntConstant(
        "BLENDMODE_NONE".."0x00000000",
        "BLENDMODE_BLEND".."0x00000001",
        "BLENDMODE_BLEND_PREMULTIPLIED".."0x00000010",
        "BLENDMODE_ADD".."0x00000002",
        "BLENDMODE_ADD_PREMULTIPLIED".."0x00000020",
        "BLENDMODE_MOD".."0x00000004",
        "BLENDMODE_MUL".."0x00000008",
        "BLENDMODE_INVALID".."0x7FFFFFFF"
    )

    EnumConstant(
        "BLENDOPERATION_ADD".enum(0x1),
        "BLENDOPERATION_SUBTRACT".enum,
        "BLENDOPERATION_REV_SUBTRACT".enum,
        "BLENDOPERATION_MINIMUM".enum,
        "BLENDOPERATION_MAXIMUM".enum
    )

    EnumConstant(
        "BLENDFACTOR_ZERO".enum(0x1),
        "BLENDFACTOR_ONE".enum,
        "BLENDFACTOR_SRC_COLOR".enum,
        "BLENDFACTOR_ONE_MINUS_SRC_COLOR".enum,
        "BLENDFACTOR_SRC_ALPHA".enum,
        "BLENDFACTOR_ONE_MINUS_SRC_ALPHA".enum,
        "BLENDFACTOR_DST_COLOR".enum,
        "BLENDFACTOR_ONE_MINUS_DST_COLOR".enum,
        "BLENDFACTOR_DST_ALPHA".enum,
        "BLENDFACTOR_ONE_MINUS_DST_ALPHA".enum
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