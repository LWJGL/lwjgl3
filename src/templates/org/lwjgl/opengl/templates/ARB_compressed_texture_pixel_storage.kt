/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_compressed_texture_pixel_storage = "ARBCompressedTexturePixelStorage".nativeClassGL("ARB_compressed_texture_pixel_storage") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension expands the functionality of the GL11#PixelStorei() modes to allow GL11#UNPACK_ROW_LENGTH, GL11#UNPACK_SKIP_ROWS,
		GL11#UNPACK_SKIP_PIXELS, GL12#UNPACK_IMAGE_HEIGHT and GL12#UNPACK_SKIP_IMAGES to affect the operation of CompressedTexImage*D and
		CompressedTexSubImage*D. Similarly, it also allows GL11#PACK_ROW_LENGTH, GL11#PACK_SKIP_ROWS, GL11#PACK_SKIP_PIXELS, GL12#PACK_IMAGE_HEIGHT and
		GL12#PACK_SKIP_IMAGES to affect the operation of GetCompressedTexImage*D. This allows data to be transferred to or from a specified sub-rectangle of a
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

		"UNPACK_COMPRESSED_BLOCK_WIDTH" _ 0x9127,
		"UNPACK_COMPRESSED_BLOCK_HEIGHT" _ 0x9128,
		"UNPACK_COMPRESSED_BLOCK_DEPTH" _ 0x9129,
		"UNPACK_COMPRESSED_BLOCK_SIZE" _ 0x912A,
		"PACK_COMPRESSED_BLOCK_WIDTH" _ 0x912B,
		"PACK_COMPRESSED_BLOCK_HEIGHT" _ 0x912C,
		"PACK_COMPRESSED_BLOCK_DEPTH" _ 0x912D,
		"PACK_COMPRESSED_BLOCK_SIZE" _ 0x912E
	)
}