/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_texture_array = "EXTTextureArray".nativeClassGL("EXT_texture_array", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces the notion of one- and two-dimensional array textures. An array texture is a collection of one- and two-dimensional images of
		identical size and format, arranged in layers. A one-dimensional array texture is specified using TexImage2D; a two-dimensional array texture is
		specified using TexImage3D. The height (1D array) or depth (2D array) specify the number of layers in the image.

		An array texture is accessed as a single unit in a programmable shader, using a single coordinate vector. A single layer is selected, and that layer is
		then accessed as though it were a one- or two-dimensional texture. The layer used is specified using the "t" or "r" texture coordinate for 1D and 2D
		array textures, respectively. The layer coordinate is provided as an unnormalized floating-point value in the range [0,<n>-1], where <n> is the number
		of layers in the array texture. Texture lookups do not filter between layers, though such filtering can be achieved using programmable shaders. When
		mipmapping is used, each level of an array texture has the same number of layers as the base level; the number of layers is not reduced as the image
		size decreases.

		Array textures can be rendered to by binding them to a framebuffer object (EXT_framebuffer_object). A single layer of an array texture can be bound
		using normal framebuffer object mechanisms, or an entire array texture can be bound and rendered to using the layered rendering mechanisms provided by
		NV_geometry_program4.

		This extension does not provide for the use of array textures with fixed-function fragment processing. Such support could be added by providing an
		additional extension allowing applications to pass the new target enumerants (TEXTURE_1D_ARRAY_EXT and TEXTURE_2D_ARRAY_EXT) to Enable and Disable.

		${GL30.promoted}
		"""

	IntConstant(
		"Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmapEXT, and BindTexture.",

		"TEXTURE_1D_ARRAY_EXT" _ 0x8C18,
		"TEXTURE_2D_ARRAY_EXT" _ 0x8C1A
	)

	IntConstant(
		"Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D.",

		"PROXY_TEXTURE_2D_ARRAY_EXT" _ 0x8C1B
	)

	IntConstant(
		"""
		Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
		CompressedTexSubImage2D.
		""",

		"PROXY_TEXTURE_1D_ARRAY_EXT" _ 0x8C19
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

		"TEXTURE_BINDING_1D_ARRAY_EXT" _ 0x8C1C,
		"TEXTURE_BINDING_2D_ARRAY_EXT" _ 0x8C1D,
		"MAX_ARRAY_TEXTURE_LAYERS_EXT" _ 0x88FF
	)

	IntConstant(
		"""
		Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
		TEXTURE_COMPARE_MODE_ARB.
		""",

		"COMPARE_REF_DEPTH_TO_TEXTURE_EXT" _ 0x884E
	)

	IntConstant(
		"""
		COMPARE_REF_DEPTH_TO_TEXTURE_EXT is simply an alias for the existing COMPARE_R_TO_TEXTURE token in OpenGL 2.0; the alternate name reflects the fact that
		the R coordinate is not always used.) Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameterivEXT.
		""",

		"FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT" _ 0x8CD4
	)

	IntConstant(
		"""
		FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER is simply an alias for the FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT token provided in EXT_framebuffer_object.
		This extension generalizes the notion of "{@code zoffset}" to include layers of an array texture.) Returned by the {@code type} parameter of
		GetActiveUniform.
		""",

		"SAMPLER_1D_ARRAY_EXT" _ 0x8DC0,
		"SAMPLER_2D_ARRAY_EXT" _ 0x8DC1,
		"SAMPLER_1D_ARRAY_SHADOW_EXT" _ 0x8DC3,
		"SAMPLER_2D_ARRAY_SHADOW_EXT" _ 0x8DC4
	)

	GLvoid(
		"FramebufferTextureLayerEXT",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("attachment", ""),
		GLuint.IN("texture", ""),
		GLint.IN("level", ""),
		GLint.IN("layer", "")
	)
}