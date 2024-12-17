/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_texture_compression_dxt1 = "ANGLETextureCompressionDXT1".nativeClassGLES("ANGLE_texture_compression_dxt1", postfix = ANGLE) {
    IntConstant(
        "COMPRESSED_RGB_S3TC_DXT1_ANGLE"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_ANGLE"..0x83F1
    )
}

val ANGLE_texture_compression_dxt3 = "ANGLETextureCompressionDXT3".nativeClassGLES("ANGLE_texture_compression_dxt3", postfix = ANGLE) {
    IntConstant(
        "COMPRESSED_RGBA_S3TC_DXT3_ANGLE"..0x83F2
    )
}

val ANGLE_texture_compression_dxt5 = "ANGLETextureCompressionDXT5".nativeClassGLES("ANGLE_texture_compression_dxt5", postfix = ANGLE) {
    IntConstant(
        "COMPRESSED_RGBA_S3TC_DXT5_ANGLE"..0x83F3
    )
}