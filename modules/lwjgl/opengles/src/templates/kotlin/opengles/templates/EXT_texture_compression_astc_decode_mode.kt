/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_astc_decode_mode = "EXTTextureCompressionASTCDecodeMode".nativeClassGLES("EXT_texture_compression_astc_decode_mode", postfix = EXT) {
    IntConstant(
        "TEXTURE_ASTC_DECODE_PRECISION_EXT"..0x8F69
    )
}