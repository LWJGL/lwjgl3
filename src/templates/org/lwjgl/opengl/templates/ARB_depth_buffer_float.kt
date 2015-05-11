/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_depth_buffer_float = "ARBDepthBufferFloat".nativeClassGL("ARB_depth_buffer_float", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides new texture internal formats whose depth components are stored as 32-bit floating-point values, rather than the normalized
		unsigned integers used in existing depth formats. Floating-point depth textures support all the functionality supported for fixed-point depth textures,
		including shadow mapping and rendering support via ${registryLinkTo("EXT", "framebuffer_object")}. Floating-point depth textures can store values
		outside the range [0,1].

		Additionally, this extension provides new packed depth/stencil pixel formats (see ${registryLinkTo("EXT", "packed_depth_stencil")}) that have 64-bit
		pixels consisting of a 32-bit floating-point depth value, 8 bits of stencil, and 24 unused bites. A packed depth/stencil texture internal format is also
		provided.

        Requires ${GL20.core}, ${ARB_color_buffer_float.link}, ${registryLinkTo("EXT", "packed_depth_stencil")} and ${ARB_framebuffer_object.link}.
        ${GL30.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT, and
		returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameterivEXT.
		""",

		"DEPTH_COMPONENT32F" _ 0x8CAC,
		"DEPTH32F_STENCIL8" _ 0x8CAD
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage.
		""",

		"FLOAT_32_UNSIGNED_INT_24_8_REV" _ 0x8DAD
	)
}