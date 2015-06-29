/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.PIXEL_UNPACK_BUFFER
import org.lwjgl.generator.opengl.PIXEL_PACK_BUFFER

val ARB_texture_border_clamp = "ARBTextureBorderClamp".nativeClassGL("ARB_texture_border_clamp", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		The base OpenGL provides clamping such that the texture coordinates are limited to exactly the range [0,1]. When a texture coordinate is clamped using
		this algorithm, the texture sampling filter straddles the edge of the texture image, taking 1/2 its sample values from within the texture image, and the
		other 1/2 from the texture border. It is sometimes desirable for a texture to be clamped to the border color, rather than to an average of the border
		and edge colors.

		This extension defines an additional texture clamping algorithm. #CLAMP_TO_BORDER_ARB clamps texture coordinates at all mipmap levels such that
		GL11#NEAREST and GL11#LINEAR filters return only the color of the border texels.

		${GL13.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code param} parameter of GL11#TexParameteri() and GL11#TexParameterf(), and by the {@code params} parameter of GL11#TexParameteriv()
		and GL11#TexParameterfv(), when their {@code pname} parameter is GL11#TEXTURE_WRAP_S, GL11#TEXTURE_WRAP_T, or GL12#TEXTURE_WRAP_R.
		""",

		"CLAMP_TO_BORDER_ARB" _ 0x812D
	)

}