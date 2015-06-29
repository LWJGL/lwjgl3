/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_cube_map_array = "ARBTextureCubeMapArray".nativeClassGL("ARB_texture_cube_map_array", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		The ${registryLinkTo("EXT", "texture_array")} extension, and subsequently OpenGL 3.0 have introduced the concept of one- and two-dimensional array
		textures. An array texture is an ordered set of images with the same size and format. Each image in an array texture has a unique level. This extension
		expands texture array support to include cube map textures.

		A cube map array texture is a 2-dimensional array texture that may contain many cube map layers. Each cube map layer is a unique cube map image set.
		Images in a cube map array have the same size and format limitations as one- and two-dimensional array textures. A cube map array texture is specified
		using GL12#TexImage3D() in a similar manner to two-dimensional arrays. Cube map array textures can be bound to a render targets of a frame buffer object
		as two-dimensional arrays are using FramebufferTextureLayer.

		When accessed by a programmable shader, a cube map array texture acts as a single unit. The "s", "t", "r" texture coordinates are treated as a regular
		cube map texture fetch. The "q" texture is treated as an unnormalized floating-point value identifying the layer of the cube map array texture. Cube map
		array texture lookups do not filter between layers.

		This extension does not provide for the use of cube map array textures with fixed-function fragment processing.

		${GL40.promoted}
		"""

	IntConstant(
		"Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, BindTexture, and GenerateMipmap.",

		"TEXTURE_CUBE_MAP_ARRAY_ARB" _ 0x9009
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

		"TEXTURE_BINDING_CUBE_MAP_ARRAY_ARB" _ 0x900A
	)

	IntConstant(
		"Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D.",

		"PROXY_TEXTURE_CUBE_MAP_ARRAY_ARB" _ 0x900B
	)

	IntConstant(
		"TEXTURE_CUBE_MAP_ARRAY_ARB Returned by the {@code type} parameter of GetActiveUniform.",

		"SAMPLER_CUBE_MAP_ARRAY_ARB" _ 0x900C,
		"SAMPLER_CUBE_MAP_ARRAY_SHADOW_ARB" _ 0x900D,
		"INT_SAMPLER_CUBE_MAP_ARRAY_ARB" _ 0x900E,
		"UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY_ARB" _ 0x900F
	)
}