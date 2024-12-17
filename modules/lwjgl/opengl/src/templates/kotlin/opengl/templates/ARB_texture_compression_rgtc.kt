/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_compression_rgtc = "ARBTextureCompressionRGTC".nativeClassGL("ARB_texture_compression_rgtc") {
    IntConstant(
        "COMPRESSED_RED_RGTC1"..0x8DBB,
        "COMPRESSED_SIGNED_RED_RGTC1"..0x8DBC,
        "COMPRESSED_RG_RGTC2"..0x8DBD,
        "COMPRESSED_SIGNED_RG_RGTC2"..0x8DBE
    )
}