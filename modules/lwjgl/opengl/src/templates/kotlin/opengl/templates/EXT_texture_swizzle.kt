/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_swizzle = "EXTTextureSwizzle".nativeClassGL("EXT_texture_swizzle", postfix = EXT) {
    IntConstant(
        "TEXTURE_SWIZZLE_R_EXT"..0x8E42,
        "TEXTURE_SWIZZLE_G_EXT"..0x8E43,
        "TEXTURE_SWIZZLE_B_EXT"..0x8E44,
        "TEXTURE_SWIZZLE_A_EXT"..0x8E45
    )

    IntConstant(
        "TEXTURE_SWIZZLE_RGBA_EXT"..0x8E46
    )
}