/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_compression_s3tc = "EXTTextureCompressionS3TC".nativeClassGL("EXT_texture_compression_s3tc", postfix = EXT) {
    IntConstant(
        "COMPRESSED_RGB_S3TC_DXT1_EXT"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_EXT"..0x83F1,
        "COMPRESSED_RGBA_S3TC_DXT3_EXT"..0x83F2,
        "COMPRESSED_RGBA_S3TC_DXT5_EXT"..0x83F3
    )
}