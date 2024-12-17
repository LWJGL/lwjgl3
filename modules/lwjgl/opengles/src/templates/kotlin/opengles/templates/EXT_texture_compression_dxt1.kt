/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_dxt1 = "EXTTextureCompressionDXT1".nativeClassGLES("EXT_texture_compression_dxt1", postfix = EXT) {
    IntConstant(
        "COMPRESSED_RGB_S3TC_DXT1_EXT"..0x83F0,
        "COMPRESSED_RGBA_S3TC_DXT1_EXT"..0x83F1
    )
}