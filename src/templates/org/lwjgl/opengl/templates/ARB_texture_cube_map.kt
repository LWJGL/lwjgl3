/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.deprecatedGL

val ARB_texture_cube_map = "ARBTextureCubeMap".nativeClassGL("ARB_texture_cube_map", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a new texture generation scheme for cube map textures. Instead of the current texture providing a 1D, 2D, or 3D lookup into a
		1D, 2D, or 3D texture image, the texture is a set of six 2D images representing the faces of a cube. The (s,t,r) texture coordinates are treated as a
		direction vector emanating from the center of a cube. At texture generation time, the interpolated per-fragment (s,t,r) selects one cube face 2D image
		based on the largest magnitude coordinate (the major axis). A new 2D (s,t) is calculated by dividing the two other coordinates (the minor axes values)
		by the major axis value.  Then the new (s,t) is used to lookup into the selected 2D texture image face of the cube map.

		Unlike a standard 1D, 2D, or 3D texture that have just one target, a cube map texture has six targets, one for each of its six 2D texture image cube
		faces. All these targets must be consistent, complete, and have equal width and height (ie, square dimensions).

		This extension also provides two new texture coordinate generation modes for use in conjunction with cube map texturing.  The reflection map mode
		generates texture coordinates (s,t,r) matching the vertex's eye-space reflection vector. The reflection map mode is useful for environment mapping
		without the singularity inherent in sphere mapping. The normal map mode generates texture coordinates (s,t,r) matching the vertex's transformed
		eye-space normal. The normal map mode is useful for sophisticated cube map texturing-based diffuse lighting models.

		The intent of the new texgen functionality is that an application using cube map texturing can use the new texgen modes to automatically generate the
		reflection or normal vectors used to look up into the cube map texture.

		${GL13.promoted}
		"""

	IntConstant(
		"Accepted by the {@code param} parameters of TexGend, TexGenf, and TexGeni when {@code pname} parameter is TEXTURE_GEN_MODE.",

		"NORMAL_MAP_ARB" _ 0x8511,
		"REFLECTION_MAP_ARB" _ 0x8512
	)

	IntConstant(
		"""
		When the {@code pname} parameter of TexGendv, TexGenfv, and TexGeniv is TEXTURE_GEN_MODE, then the array {@code params} may also contain NORMAL_MAP_ARB
		or REFLECTION_MAP_ARB. Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled, and by the {@code pname} parameter of GetBooleanv,
		GetIntegerv, GetFloatv, and GetDoublev, and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf,
		TexParameteri, TexParameterfv, and TexParameteriv.
		""",

		"TEXTURE_CUBE_MAP_ARB" _ 0x8513
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"TEXTURE_BINDING_CUBE_MAP_ARB" _ 0x8514
	)

	IntConstant(
		"""
		Accepted by the {@code target} parameter of GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, TexImage2D, CopyTexImage2D, TexSubImage2D, and
		CopySubTexImage2D.
		""",

		"TEXTURE_CUBE_MAP_POSITIVE_X_ARB" _ 0x8515,
		"TEXTURE_CUBE_MAP_NEGATIVE_X_ARB" _ 0x8516,
		"TEXTURE_CUBE_MAP_POSITIVE_Y_ARB" _ 0x8517,
		"TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB" _ 0x8518,
		"TEXTURE_CUBE_MAP_POSITIVE_Z_ARB" _ 0x8519,
		"TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB" _ 0x851A
	)

	IntConstant(
		"Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and TexImage2D.",

		"PROXY_TEXTURE_CUBE_MAP_ARB" _ 0x851B
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"MAX_CUBE_MAP_TEXTURE_SIZE_ARB" _ 0x851C
	)

}