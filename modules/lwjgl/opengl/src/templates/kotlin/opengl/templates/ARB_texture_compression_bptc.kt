/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_compression_bptc = "ARBTextureCompressionBPTC".nativeClassGL("ARB_texture_compression_bptc", postfix = ARB) {
    IntConstant(
        "COMPRESSED_RGBA_BPTC_UNORM_ARB"..0x8E8C,
        "COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB"..0x8E8D,
        "COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB"..0x8E8E,
        "COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB"..0x8E8F
    )
}