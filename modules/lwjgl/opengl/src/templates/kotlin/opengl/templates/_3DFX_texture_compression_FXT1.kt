/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val _3DFX_texture_compression_FXT1 = "_3DFXTextureCompressionFXT1".nativeClassGL("3DFX_texture_compression_FXT1", postfix = `3DFX`) {
    IntConstant(
        "COMPRESSED_RGB_FXT1_3DFX"..0x86B0,
        "COMPRESSED_RGBA_FXT1_3DFX"..0x86B1
    )
}
