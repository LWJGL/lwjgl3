/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_texture_compression_astc_hdr = "EXTTextureCompressionAstcHdr".nativeClassVK("EXT_texture_compression_astc_hdr", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_TEXTURE_COMPRESSION_ASTC_HDR_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_TEXTURE_COMPRESSION_ASTC_HDR_EXTENSION_NAME".."VK_EXT_texture_compression_astc_hdr"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES_EXT".."1000066000"
    )

    EnumConstant(
        "FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT".."1000066000",
        "FORMAT_ASTC_5x4_SFLOAT_BLOCK_EXT".."1000066001",
        "FORMAT_ASTC_5x5_SFLOAT_BLOCK_EXT".."1000066002",
        "FORMAT_ASTC_6x5_SFLOAT_BLOCK_EXT".."1000066003",
        "FORMAT_ASTC_6x6_SFLOAT_BLOCK_EXT".."1000066004",
        "FORMAT_ASTC_8x5_SFLOAT_BLOCK_EXT".."1000066005",
        "FORMAT_ASTC_8x6_SFLOAT_BLOCK_EXT".."1000066006",
        "FORMAT_ASTC_8x8_SFLOAT_BLOCK_EXT".."1000066007",
        "FORMAT_ASTC_10x5_SFLOAT_BLOCK_EXT".."1000066008",
        "FORMAT_ASTC_10x6_SFLOAT_BLOCK_EXT".."1000066009",
        "FORMAT_ASTC_10x8_SFLOAT_BLOCK_EXT".."1000066010",
        "FORMAT_ASTC_10x10_SFLOAT_BLOCK_EXT".."1000066011",
        "FORMAT_ASTC_12x10_SFLOAT_BLOCK_EXT".."1000066012",
        "FORMAT_ASTC_12x12_SFLOAT_BLOCK_EXT".."1000066013"
    )
}