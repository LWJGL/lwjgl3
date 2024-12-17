/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_texture_compression_s3tc = "NVTextureCompressionS3TC".nativeClassGLES("NV_texture_compression_s3tc", postfix = NV) {
    IntConstant(
        "COMPRESSED_RGB_S3TC_DXT1_NV"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_NV"..0x83F1,
        "COMPRESSED_RGBA_S3TC_DXT3_NV"..0x83F2,
        "COMPRESSED_RGBA_S3TC_DXT5_NV"..0x83F3
    )
}