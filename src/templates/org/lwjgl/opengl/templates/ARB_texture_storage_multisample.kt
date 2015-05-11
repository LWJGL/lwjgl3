/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_storage_multisample = "ARBTextureStorageMultisample".nativeClassGL("ARB_texture_storage_multisample") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		The ${ARB_texture_storage.link} extension and OpenGL 4.2 introduced the concept of immutable texture objects. With these objects, once their data store
		has been sized and allocated, it could not be resized for the lifetime of the objects (although its content could be updated). OpenGL implementations
		may be able to take advantage of the knowledge that the underlying data store of certain objects cannot be deleted or otherwise reallocated without
		destruction of the whole object (normally, a much heavier weight and less frequent operation). Immutable storage for all types of textures besides
		multisample and buffer textures was introduced by ARB_texture_storage. For completeness, this extension introduces immutable storage for multisampled
		textures.

		Requires ${GL42.core} or ${ARB_texture_storage.link}. ${GL43.promoted}
		"""

	GL43 reuse "TexStorage2DMultisample"
	GL43 reuse "TexStorage3DMultisample"

	var src = GL43["TexStorage2DMultisample"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"TextureStorage2DMultisampleEXT",
		"DSA version of #TexStorage2DMultisample().",

		GLuint.IN("texture", "the texture object"),
		src["target"],
		src["samples"],
		src["internalformat"],
		src["width"],
		src["height"],
		src["fixedsamplelocations"]
	)

	src = GL43["TexStorage3DMultisample"]
	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"TextureStorage3DMultisampleEXT",
		"DSA version of #TexStorage3DMultisample().",

		GLuint.IN("texture", "the texture object"),
		src["target"],
		src["samples"],
		src["internalformat"],
		src["width"],
		src["height"],
		src["depth"],
		src["fixedsamplelocations"]
	)
}