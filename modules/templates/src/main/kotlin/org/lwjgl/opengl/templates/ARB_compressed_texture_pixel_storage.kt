/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_compressed_texture_pixel_storage = "ARBCompressedTexturePixelStorage".nativeClassGL("ARB_compressed_texture_pixel_storage") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension expands the functionality of the #PixelStorei() modes to allow #UNPACK_ROW_LENGTH, #UNPACK_SKIP_ROWS,
        #UNPACK_SKIP_PIXELS, #UNPACK_IMAGE_HEIGHT and #UNPACK_SKIP_IMAGES to affect the operation of CompressedTexImage*D and
        CompressedTexSubImage*D. Similarly, it also allows #PACK_ROW_LENGTH, #PACK_SKIP_ROWS, #PACK_SKIP_PIXELS, #PACK_IMAGE_HEIGHT and
        #PACK_SKIP_IMAGES to affect the operation of GetCompressedTexImage*D. This allows data to be transferred to or from a specified sub-rectangle of a
        larger compressed image.

        This extension is designed primarily to support compressed image formats with fixed-size blocks. To use this new mechanism, an application should
        program new parameters UNPACK_COMPRESSED_BLOCK_{WIDTH,HEIGHT,DEPTH,SIZE} to indicate the number of texels in each dimension of the fixed-size block as
        well as the number of bytes consumed by each block. These parameters, in addition to the existing PixelStore parameters, are used to identify a
        collection of bytes in client memory or a buffer object's data store to use as compressed texture data. This operation is unlikely to have the desired
        results if the client programs a block size inconsistent with the underlying compressed image format, or if the compressed image format has
        variable-sized blocks.

        Requires ${GL21.core}. ${GL42.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

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