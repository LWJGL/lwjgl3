/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_packed_depth_stencil = "NVPackedDepthStencil".nativeClassGL("NV_packed_depth_stencil", postfix = NV) {
	documentation =
		"""
		This extension provides a new data format, #DEPTH_STENCIL_NV, that can be used with the glDrawPixels, glReadPixels, and glCopyPixels commands, as well
		as a packed data type, #UNSIGNED_INT_24_8_NV, that is meant to be used with GL_DEPTH_STENCIL_NV. No other formats are supported with
		GL_DEPTH_STENCIL_NV. If ${registryLink("SGIX", "depth_texture")} is supported, GL_DEPTH_STENCIL_NV/GL_UNSIGNED_INT_24_8_NV data can also be used for
		textures; this provides a more efficient way to supply data for a 24-bit depth texture.
		"""

	IntConstant(
		"""
		Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D,
		and GetTexImage, and by the {@code type} parameter of CopyPixels.
		""",

		"DEPTH_STENCIL_NV" _ 0x84F9
	)

	IntConstant(
		"""
		Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
		GetTexImage.
		""",

		"UNSIGNED_INT_24_8_NV" _ 0x84FA
	)
}