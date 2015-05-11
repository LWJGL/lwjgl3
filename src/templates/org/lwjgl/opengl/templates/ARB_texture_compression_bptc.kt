/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_compression_bptc = "ARBTextureCompressionBPTC".nativeClassGL("ARB_texture_compression_bptc", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides additional texture compression functionality specific to the BPTC and BPTC_FLOAT compressed texture formats (called BC7 and BC6H
		respectively in Microsoft's DirectX API), subject to all the requirements and limitations described by the extension ${ARB_texture_compression.link}.

		Traditional block compression methods as typified by s3tc and latc compress a block of pixels into indicies along a gradient. This works well for smooth
		images, but can have quality issues along sharp edges and strong chrominance transitions. To improve quality in these problematic cases, the BPTC
		formats can divide each block into multiple partitions, each of which are compressed using an independent gradient.

		In addition, it is desirable to directly support high dynamic range imagery in compressed formats, which is accomplished by the BPTC_FLOAT formats.

		Requires ${GL31.core} and ${ARB_texture_compression.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2DARB, and
		CompressedTexImage3DARB and the {@code format} parameter of CompressedTexSubImage2DARB and CompressedTexSubImage3DARB.
		""",

		"COMPRESSED_RGBA_BPTC_UNORM_ARB" _ 0x8E8C,
		"COMPRESSED_SRGB_ALPHA_BPTC_UNORM_ARB" _ 0x8E8D,
		"COMPRESSED_RGB_BPTC_SIGNED_FLOAT_ARB" _ 0x8E8E,
		"COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_ARB" _ 0x8E8F
	)
}