/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_swizzle = "ARBTextureSwizzle".nativeClassGL("ARB_texture_swizzle") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Classic OpenGL texture formats conflate texture storage and interpretation, and assume that textures represent color. In modern applications, a
		significant quantity of textures don't represent color, but rather data like shadow maps, normal maps, page tables, occlusion data, etc. For the latter
		class of data, calling the data "RGBA" is just a convenient mapping of what the data is onto the current model, but isn't an accurate reflection of the
		reality of the data.

		The existing texture formats provide an almost orthogonal set of data types, sizes, and number of components, but the mappings of this storage into what
		the shader or fixed-function pipeline fetches is very much non-orthogonal. Previous extensions have added some of the most demanded missing formats, but
		the problem has not been solved once and for all.

		This extension provides a mechanism to swizzle the components of a texture before they are applied according to the texture environment in
		fixed-function or as they are returned to the shader.

		${GL33.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.",

		"TEXTURE_SWIZZLE_R" _ 0x8E42,
		"TEXTURE_SWIZZLE_G" _ 0x8E43,
		"TEXTURE_SWIZZLE_B" _ 0x8E44,
		"TEXTURE_SWIZZLE_A" _ 0x8E45
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.",

		"TEXTURE_SWIZZLE_RGBA" _ 0x8E46
	)
}