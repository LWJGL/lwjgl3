/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_storage = "ARBTextureStorage".nativeClassGL("ARB_texture_storage") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		The texture image specification commands in OpenGL allow each level to be separately specified with different sizes, formats, types and so on, and only
		imposes consistency checks at draw time. This adds overhead for implementations.

		This extension provides a mechanism for specifying the entire structure of a texture in a single call, allowing certain consistency checks and memory
		allocations to be done up front. Once specified, the format and dimensions of the image array become immutable, to simplify completeness checks in the
		implementation.

		When using this extension, it is no longer possible to supply texture data using TexImage*. Instead, data can be uploaded using TexSubImage*, or
		produced by other means (such as render-to-texture, mipmap generation, or rendering to a sibling EGLImage).

		This extension has complicated interactions with other extensions. The goal of most of these interactions is to ensure that a texture is always mipmap
		complete (and cube complete for cubemap textures).

		Requires ${GL12.core}. ${GL42.promoted}
		"""

	IntConstant(
		"Accepted by the {@code value} parameter of GetTexParameter{if}v.",

		"TEXTURE_IMMUTABLE_FORMAT" _ 0x912F
	)

	GL42 reuse "TexStorage1D"
	GL42 reuse "TexStorage2D"
	GL42 reuse "TexStorage3D"

	var src = GL42["TexStorage1D"]
	val texture = GLuint.IN("texture", "the texture object to update")
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"TextureStorage1DEXT",
		"DSA version of #TexStorage1D().",

		texture,
		src["target"],
		src["levels"],
		src["internalformat"],
		src["width"]
	)

	src = GL42["TexStorage2D"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"TextureStorage2DEXT",
		"DSA version of #TexStorage2D().",

		texture,
		src["target"],
		src["levels"],
		src["internalformat"],
		src["width"],
		src["height"]
	)

	src = GL42["TexStorage3D"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"TextureStorage3DEXT",
		"DSA version of #TexStorage3D().",

		texture,
		src["target"],
		src["levels"],
		src["internalformat"],
		src["width"],
		src["height"],
		src["depth"]
	)
}