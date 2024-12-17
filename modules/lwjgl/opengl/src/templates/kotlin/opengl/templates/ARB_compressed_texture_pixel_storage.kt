/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_compressed_texture_pixel_storage = "ARBCompressedTexturePixelStorage".nativeClassGL("ARB_compressed_texture_pixel_storage") {
    IntConstant(
        "UNPACK_COMPRESSED_BLOCK_WIDTH"..0x9127,
        "UNPACK_COMPRESSED_BLOCK_HEIGHT"..0x9128,
        "UNPACK_COMPRESSED_BLOCK_DEPTH"..0x9129,
        "UNPACK_COMPRESSED_BLOCK_SIZE"..0x912A,
        "PACK_COMPRESSED_BLOCK_WIDTH"..0x912B,
        "PACK_COMPRESSED_BLOCK_HEIGHT"..0x912C,
        "PACK_COMPRESSED_BLOCK_DEPTH"..0x912D,
        "PACK_COMPRESSED_BLOCK_SIZE"..0x912E
    )
}