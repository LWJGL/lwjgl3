/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_s3tc_srgb = "EXTTextureCompressionS3TCSRGB".nativeClassGLES("EXT_texture_compression_s3tc_srgb", postfix = EXT) {
    IntConstant(
        "COMPRESSED_SRGB_S3TC_DXT1_EXT"..0x8C4C,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT"..0x8C4D,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT"..0x8C4E,
        "COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT"..0x8C4F
    )
}