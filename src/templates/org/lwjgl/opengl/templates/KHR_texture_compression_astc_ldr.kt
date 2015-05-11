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

		<h3>What is ASTC</h3>

		ASTC stands for Adaptive Scalable Texture Compression. The ASTC formats form a family of related compressed texture image formats. They are all derived
		from a common set of definitions.

		ASTC textures may be either 2D or 3D.

		ASTC textures may be encoded using either high or low dynamic range. Low dynamic range images may optionally be specified using the sRGB color space.

		A sub-profile ("HDR Profile") is defined, which supports only 2D images (and 3D images made up of multiple 2D slices) at low or high dynamic range.

		Support for this profile is indicated by the presence of the extension string "GL_KHR_texture_compression_astc_hdr". If, in future, the full profile is
		supported, "GL_KHR_texture_compression_astc_hdr" must still be published, in order to ensure backward compatibility.

		A lower sub-profile ("LDR Profile") may be implemented, which supports only 2D images at low dynamic range. This is indicated by the presence of the
		extension string "GL_KHR_texture_compression_astc_ldr". If either the HDR or full profile are implemented, then both name strings
		"GL_KHR_texture_compression_astc_ldr" and "GL_KHR_texture_compression_astc_hdr" must be published.

		ASTC textures may be encoded as 1, 2, 3 or 4 components, but they are all decoded into RGBA.

		ASTC has a variable block size, and this is specified as part of the name of the token passed to CompressedImage2D and its related functions.
		"""

	IntConstant(
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