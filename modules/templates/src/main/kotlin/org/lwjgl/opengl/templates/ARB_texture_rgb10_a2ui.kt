/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_rgb10_a2ui = "ARBTextureRGB10_A2UI".nativeClassGL("ARB_texture_rgb10_a2ui") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds support for a new texturing format for unsigned 10.10.10.2 integer textures.

		OpenGL has supported GL11#RGB10 and GL11#RGB10_A2 formats for a very long time. This extension provides a variant of RGB10_A2 which supports unsigned
		integer data (in contrast to the above "unsigned normalized integer" formats).

		Requires ${GL30.core} or ${registryLinkTo("EXT", "texture_integer")}. ${GL33.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
		RenderbufferStorageMultisample.
		""",

		"RGB10_A2UI" _ 0x906F
	)
}