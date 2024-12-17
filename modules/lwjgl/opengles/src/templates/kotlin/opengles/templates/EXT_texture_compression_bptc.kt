/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_bptc = "EXTTextureCompressionBPTC".nativeClassGLES("EXT_texture_compression_bptc", postfix = EXT) {
    IntConstant(
        "COMPRESSED_RGBA_BPTC_UNORM_EXT"..0x8E8C,
        "COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT"..0x8E8D,
        "COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT"..0x8E8E,
        "COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT"..0x8E8F
    )
}