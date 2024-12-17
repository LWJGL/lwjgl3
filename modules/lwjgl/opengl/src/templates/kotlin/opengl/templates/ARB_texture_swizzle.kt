/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_swizzle = "ARBTextureSwizzle".nativeClassGL("ARB_texture_swizzle") {
    IntConstant(
        "TEXTURE_SWIZZLE_R"..0x8E42,
        "TEXTURE_SWIZZLE_G"..0x8E43,
        "TEXTURE_SWIZZLE_B"..0x8E44,
        "TEXTURE_SWIZZLE_A"..0x8E45
    )

    IntConstant(
        "TEXTURE_SWIZZLE_RGBA"..0x8E46
    )
}