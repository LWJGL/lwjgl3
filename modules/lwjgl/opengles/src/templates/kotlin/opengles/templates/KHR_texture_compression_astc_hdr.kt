/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val KHR_texture_compression_astc_ldr = "KHRTextureCompressionASTCLDR".nativeClassGLES("KHR_texture_compression_astc_ldr", postfix = KHR) {
    IntConstant(
        "COMPRESSED_RGBA_ASTC_4x4_KHR"..0x93B0,
        "COMPRESSED_RGBA_ASTC_5x4_KHR"..0x93B1,
        "COMPRESSED_RGBA_ASTC_5x5_KHR"..0x93B2,
        "COMPRESSED_RGBA_ASTC_6x5_KHR"..0x93B3,
        "COMPRESSED_RGBA_ASTC_6x6_KHR"..0x93B4,
        "COMPRESSED_RGBA_ASTC_8x5_KHR"..0x93B5,
        "COMPRESSED_RGBA_ASTC_8x6_KHR"..0x93B6,
        "COMPRESSED_RGBA_ASTC_8x8_KHR"..0x93B7,
        "COMPRESSED_RGBA_ASTC_10x5_KHR"..0x93B8,
        "COMPRESSED_RGBA_ASTC_10x6_KHR"..0x93B9,
        "COMPRESSED_RGBA_ASTC_10x8_KHR"..0x93BA,
        "COMPRESSED_RGBA_ASTC_10x10_KHR"..0x93BB,
        "COMPRESSED_RGBA_ASTC_12x10_KHR"..0x93BC,
        "COMPRESSED_RGBA_ASTC_12x12_KHR"..0x93BD,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR"..0x93D0,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR"..0x93D1,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR"..0x93D2,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR"..0x93D3,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR"..0x93D4,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR"..0x93D5,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR"..0x93D6,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR"..0x93D7,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR"..0x93D8,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR"..0x93D9,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR"..0x93DA,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR"..0x93DB,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR"..0x93DC,
        "COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR"..0x93DD
    )
}


val KHR_texture_compression_astc_hdr = EXT_FLAG.nativeClassGLES("KHR_texture_compression_astc_hdr", postfix = KHR) {
}