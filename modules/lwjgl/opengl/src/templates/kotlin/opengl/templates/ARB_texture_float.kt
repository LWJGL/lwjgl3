/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_float = "ARBTextureFloat".nativeClassGL("ARB_texture_float", postfix = ARB) {
    IntConstant(
        "TEXTURE_RED_TYPE_ARB"..0x8C10,
        "TEXTURE_GREEN_TYPE_ARB"..0x8C11,
        "TEXTURE_BLUE_TYPE_ARB"..0x8C12,
        "TEXTURE_ALPHA_TYPE_ARB"..0x8C13,
        "TEXTURE_LUMINANCE_TYPE_ARB"..0x8C14,
        "TEXTURE_INTENSITY_TYPE_ARB"..0x8C15,
        "TEXTURE_DEPTH_TYPE_ARB"..0x8C16
    )

    IntConstant(
        "UNSIGNED_NORMALIZED_ARB"..0x8C17
    )

    IntConstant(
        "RGBA32F_ARB"..0x8814,
        "RGB32F_ARB"..0x8815,
        "ALPHA32F_ARB"..0x8816,
        "INTENSITY32F_ARB"..0x8817,
        "LUMINANCE32F_ARB"..0x8818,
        "LUMINANCE_ALPHA32F_ARB"..0x8819,
        "RGBA16F_ARB"..0x881A,
        "RGB16F_ARB"..0x881B,
        "ALPHA16F_ARB"..0x881C,
        "INTENSITY16F_ARB"..0x881D,
        "LUMINANCE16F_ARB"..0x881E,
        "LUMINANCE_ALPHA16F_ARB"..0x881F
    )
}