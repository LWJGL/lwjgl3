/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_rgtc = "EXTTextureCompressionRGTC".nativeClassGLES("EXT_texture_compression_rgtc", postfix = EXT) {
    IntConstant(
        "COMPRESSED_RED_RGTC1_EXT"..0x8DBB,
        "COMPRESSED_SIGNED_RED_RGTC1_EXT"..0x8DBC,
        "COMPRESSED_RED_GREEN_RGTC2_EXT"..0x8DBD,
        "COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT"..0x8DBE
    )
}