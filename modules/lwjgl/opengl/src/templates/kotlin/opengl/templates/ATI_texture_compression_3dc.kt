/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ATI_texture_compression_3dc = "ATITextureCompression3DC".nativeClassGL("ATI_texture_compression_3dc", postfix = ATI) {
    IntConstant(
        "COMPRESSED_LUMINANCE_ALPHA_3DC_ATI"..0x8837
    )
}