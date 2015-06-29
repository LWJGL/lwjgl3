/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_sparse_texture = "ARBSparseTexture".nativeClassGL("ARB_sparse_texture", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Recent advances in application complexity and a desire for higher resolutions have pushed texture sizes up considerably. Often, the amount of physical
		memory available to a graphics processor is a limiting factor in the performance of texture-heavy applications. Once the available physical memory is
		exhausted, paging may occur bringing performance down considerably - or worse, the application may fail. Nevertheless, the amount of address space
		available to the graphics processor has increased to the point where many gigabytes - or even terabytes of address space may be usable even though that
		amount of physical memory is not present.

		This extension allows the separation of the graphics processor's address space (reservation) from the requirement that all textures must be physically
		backed (commitment). This exposes a limited form of virtualization for textures. Use cases include sparse (or partially resident) textures, texture
		paging, on-demand and delayed loading of texture assets and application controlled level of detail.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter to TexParameter{i f}{v}, TexParameterI{u}v, GetTexParameter{if}v and GetTexParameterIi{u}v.",

		"TEXTURE_SPARSE_ARB" _ 0x91A6,
		"VIRTUAL_PAGE_SIZE_INDEX_ARB" _ 0x91A7
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexParameter{if}v and GetTexParameterIi{u}v.",

		"NUM_SPARSE_LEVELS_ARB" _ 0x91AA
	)

	IntConstant(
		"Accepted by the {@code pname} parameter to GetInternalformativ.",

		"NUM_VIRTUAL_PAGE_SIZES_ARB" _ 0x91A8,
		"VIRTUAL_PAGE_SIZE_X_ARB" _ 0x9195,
		"VIRTUAL_PAGE_SIZE_Y_ARB" _ 0x9196,
		"VIRTUAL_PAGE_SIZE_Z_ARB" _ 0x9197
	)

	IntConstant(
		"Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetDoublev, GetInteger64v, and GetBooleanv.",

		"MAX_SPARSE_TEXTURE_SIZE_ARB" _ 0x9198,
		"MAX_SPARSE_3D_TEXTURE_SIZE_ARB" _ 0x9199,
		"MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB" _ 0x919A,
		"SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB" _ 0x91A9
	)

	val TexSubImage3D = GL12["TexSubImage3D"]
	val TexPageCommitmentARB = GLvoid(
		"TexPageCommitmentARB",
		"""
		Makes individual pages of a sparse texture resident or non resident.

		If the value of {@code commit} is GL11#TRUE, then the texture pages contained in the region defined by the values of {@code xoffset}, {@code yoffset},
		{@code zoffset}, {@code width}, {@code height} and {@code depth} are committed. If they were not committed before the call, then new physical backing
		store is allocated and associated with the sparse pages and their initial content is undefined. If the pages were already committed, then they remain
		committed, no error is generated, and the content of those pages remains unmodified. If the value of {@code committed} is GL11#FALSE, then the texture
		pages contained in the region are made de-committed. Their physical store is de-allocated, and their contents again become undefined.

		For the purposes of commitment, a cube map texture is treated as a 2D array texture with a depth of six and cube map array textures are treated as 2D
		array textures with a depth equal to six times the number of layers in the cube map array.

		For levels of a sparse texture where each dimension is a multiple of the virtual page size, the residency of individual page-size regions is controlled
		by TexPageCommitmentARB and such levels may be partially populated. When the mipmap chain reaches a level that is not an integer multiple of the virtual
		page size in any dimension, padding and memory layout considerations may make it impossible to treat that level and subsequent smaller ones as partially
		populated. The set of levels that can be partially populated is implementation-dependent. The total number of levels that may be partially populated may
		be queried by calling GL11#GetTexParameteriv() with the {@code pname} #NUM_SPARSE_LEVELS_ARB.

		The collection of texture levels that may not be partially populated, if any, consists of levels #NUM_SPARSE_LEVELS_ARB and higher, and is referred to
		as the mipmap 'tail'. The levels comprising the tail are made resident or non-resident as a unit. The tail is resident if and only if
		TexPageCommitmentARB has been called successfully with {@code level} greater than or equal to #NUM_SPARSE_LEVELS_ARB and the value of {@code commit} was
		GL11#TRUE for the last such call.

		Views of sparse textures are also considered sparse. Modifications to commitment of a texture via a view of it affect the parent texture and any other
		views containing the modified pages. If a view of a sparse texture references its tail (or is entirely contained within it), modifications to commitment
		of the tail via the view will affect the entire tail of the parent, even for parts of the tail that are not referenced by the view. Furthermore,
		modifications to tail commitment may affect views referencing other parts of the tail.

		<h3>Errors</h3>

		An GL11#INVALID_OPERATION error is generated if {@code xoffset} + {@code width} or {@code yoffset} + {@code height} is greater than the width or height,
		respectively, of level {@code level} of the texture bound to {@code target}.

		An GL11#INVALID_OPERATION error is generated if {@code zoffset} + {@code depth} is greater than
		${ul(
			"the depth of level {@code level} of the texture bound to {@code target}, if {@code target} is GL12#TEXTURE_3D;",
		    "the number of layers of level {@code level} of the texture bound to {@code target}, if {@code target} is GL30#TEXTURE_2D_ARRAY;",
		    "six times the number of layers of level {@code level} of the texture bound to {@code target}, if {@code target} is GL40#TEXTURE_CUBE_MAP_ARRAY; or",
		    "one, for all other targets."
		)}
		An GL11#INVALID_VALUE error is generated if {@code xoffset}, {@code yoffset}, or {@code zoffset} is not a multiple of #VIRTUAL_PAGE_SIZE_X_ARB,
		#VIRTUAL_PAGE_SIZE_Y_ARB, or #VIRTUAL_PAGE_SIZE_Z_ARB, respectively, of the texture bound to {@code target}.

		An GL11#INVALID_OPERATION error is generated if {@code width} is not an integer multiple of #VIRTUAL_PAGE_SIZE_X_ARB and {@code width} plus
		{@code xoffset} is not equal to the width of level {@code level} of the texture bound to {@code target}.

		An GL11#INVALID_OPERATION error is generated if {@code height} is not an integer multiple of #VIRTUAL_PAGE_SIZE_Y_ARB and {@code height} plus
		{@code yoffset} is not equal to the height of level {@code level} of the texture bound to {@code target}.

		An GL11#INVALID_OPERATION error is generated if {@code depth} is not an integer multiple of #VIRTUAL_PAGE_SIZE_Z_ARB and {@code depth} plus
		{@code zoffset} is not equal to
		${ul(
			"the depth of level {@code level} of the texture bound to {@code target}, if {@code target} is TEXTURE_3D;",
		    "the number of layers of level {@code level} of the texture bound to {@code target}, if {@code target} is TEXTURE_2D_ARRAY;",
		    "six times the number of layers of level {@code level} of the texture bound to {@code target}, if {@code target} is TEXTURE_CUBE_MAP_ARRAY; or",
		    "one, for all other targets."
		)}
		An GL11#INVALID_OPERATION error is generated if the value of GL42#TEXTURE_IMMUTABLE_FORMAT or #TEXTURE_SPARSE_ARB for the texture bound to
		{@code target} is GL11#FALSE.
		""",

		GLenum.IN("target", "the texture target", "GL11#TEXTURE_1D $TEXTURE_2D_TARGETS $TEXTURE_3D_TARGETS"),
		TexSubImage3D["level"],
		TexSubImage3D["xoffset"],
		TexSubImage3D["yoffset"],
		TexSubImage3D["zoffset"],
		TexSubImage3D["width"],
		TexSubImage3D["height"],
		TexSubImage3D["depth"],
		GLboolean.IN("commit", "the commit flag")
	)

	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"TexturePageCommitmentEXT",
		"DSA version of #TexPageCommitmentARB().",

		GLuint.IN("texture", "the texture object"),
		TexPageCommitmentARB["level"],
		TexPageCommitmentARB["xoffset"],
		TexPageCommitmentARB["yoffset"],
		TexPageCommitmentARB["zoffset"],
		TexPageCommitmentARB["width"],
		TexPageCommitmentARB["height"],
		TexPageCommitmentARB["depth"],
		TexPageCommitmentARB["commit"]
	)
}