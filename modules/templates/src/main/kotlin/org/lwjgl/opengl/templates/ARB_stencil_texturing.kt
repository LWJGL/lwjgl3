/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_stencil_texturing = "ARBStencilTexturing".nativeClassGL("ARB_stencil_texturing") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows texturing of the stencil component of a packed depth stencil texture. Stencil values are returned as unsigned integers. It is not
		possible to sample both depth and stencil values from the same texture, and this extension allows the app to select which is sampled for the bound
		texture.

		Requires ${ARB_depth_texture.link} and ${registryLinkTo("EXT", "packed_depth_stencil")}. ${GL43.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameter and GetTexParameter*.",

		"DEPTH_STENCIL_TEXTURE_MODE" _ 0x90EA
	)

}