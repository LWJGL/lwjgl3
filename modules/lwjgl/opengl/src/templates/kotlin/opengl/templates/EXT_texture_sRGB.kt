/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_sRGB = "EXTTextureSRGB".nativeClassGL("EXT_texture_sRGB", postfix = EXT) {
    IntConstant(
        "SRGB_EXT"..0x8C40,
        "SRGB8_EXT"..0x8C41,
        "SRGB_ALPHA_EXT"..0x8C42,
        "SRGB8_ALPHA8_EXT"..0x8C43,
        "SLUMINANCE_ALPHA_EXT"..0x8C44,
        "SLUMINANCE8_ALPHA8_EXT"..0x8C45,
        "SLUMINANCE_EXT"..0x8C46,
        "SLUMINANCE8_EXT"..0x8C47,
        "COMPRESSED_SRGB_EXT"..0x8C48,
        "COMPRESSED_SRGB_ALPHA_EXT"..0x8C49,
        "COMPRESSED_SLUMINANCE_EXT"..0x8C4A,
        "COMPRESSED_SLUMINANCE_ALPHA_EXT"..0x8C4B
    )

    IntConstant(
        "COMPRESSED_SRGB_S3TC_DXT1_EXT"..0x8C4C,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT"..0x8C4D,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT"..0x8C4E,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT"..0x8C4F
    )
}