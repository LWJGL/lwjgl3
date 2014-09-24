/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val KHR_texture_compression_astc_ldr = "KHRTextureCompressionASTCLDR".nativeClassGL("KHR_texture_compression_astc_ldr", postfix = KHR) {
	documentation =
		"""
		Native bindings to the ${registryLink("KHR", "texture_compression_astc_hdr")} extension.

		Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented flexibility, while producing better or
		comparable results than existing texture compressions at all bit rates. It includes support for 2D and slice-based 3D textures, with low and high
		dynamic range, at bitrates from below 1 bit/pixel up to 8 bits/pixel in fine steps.

		The goal of this extension is to support the full 2D profile of the ASTC texture compression specification, and allow construction of 3D textures from
		multiple 2D slices.

		ASTC-compressed textures are handled in OpenGL by adding new supported formats to the existing mechanisms for handling compressed textures.
		"""

	IntConstant.block(
		"""
		Accepted by the {@code internalformat} parameter of CompressedTexImage2D, CompressedTexSubImage2D, TexStorage2D, TextureStorage2D, TexStorage3D, and
		TextureStorage3D.
		""",

		"COMPRESSED_RGBA_ASTC_4x4_KHR" _ 0x93B0,
		"COMPRESSED_RGBA_ASTC_5x4_KHR" _ 0x93B1,
		"COMPRESSED_RGBA_ASTC_5x5_KHR" _ 0x93B2,
		"COMPRESSED_RGBA_ASTC_6x5_KHR" _ 0x93B3,
		"COMPRESSED_RGBA_ASTC_6x6_KHR" _ 0x93B4,
		"COMPRESSED_RGBA_ASTC_8x5_KHR" _ 0x93B5,
		"COMPRESSED_RGBA_ASTC_8x6_KHR" _ 0x93B6,
		"COMPRESSED_RGBA_ASTC_8x8_KHR" _ 0x93B7,
		"COMPRESSED_RGBA_ASTC_10x5_KHR" _ 0x93B8,
		"COMPRESSED_RGBA_ASTC_10x6_KHR" _ 0x93B9,
		"COMPRESSED_RGBA_ASTC_10x8_KHR" _ 0x93BA,
		"COMPRESSED_RGBA_ASTC_10x10_KHR" _ 0x93BB,
		"COMPRESSED_RGBA_ASTC_12x10_KHR" _ 0x93BC,
		"COMPRESSED_RGBA_ASTC_12x12_KHR" _ 0x93BD,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR" _ 0x93D0,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR" _ 0x93D1,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR" _ 0x93D2,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR" _ 0x93D3,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR" _ 0x93D4,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR" _ 0x93D5,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR" _ 0x93D6,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR" _ 0x93D7,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR" _ 0x93D8,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR" _ 0x93D9,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR" _ 0x93DA,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR" _ 0x93DB,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR" _ 0x93DC,
		"COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR" _ 0x93DD
	)
}