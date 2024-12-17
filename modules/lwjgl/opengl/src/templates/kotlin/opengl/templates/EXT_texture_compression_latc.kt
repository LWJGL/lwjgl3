/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_compression_latc = "EXTTextureCompressionLATC".nativeClassGL("EXT_texture_compression_latc", postfix = EXT) {
    IntConstant(
        "COMPRESSED_LUMINANCE_LATC1_EXT"..0x8C70,
        "COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT"..0x8C71,
        "COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT"..0x8C72,
        "COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT"..0x8C73
    )
}