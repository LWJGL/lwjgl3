/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.IN
import org.lwjgl.opengl.*

val NV_copy_image = "NVCopyImage".nativeClassGL("NV_copy_image", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
		otherwise configure the rendering pipeline. The WGL and GLX versions allow copying between images in different contexts, even if those contexts are in
		different sharelists or even on different physical devices.
		"""

	GLvoid(
		"CopyImageSubDataNV",
		"Copies a region of texel data between two image objects. An image object may be either a texture or a renderbuffer.",

		GLuint.IN("srcName", ""),
		GLenum.IN("srcTarget", ""),
		GLint.IN("srcLevel", ""),
		GLint.IN("srcX", ""),
		GLint.IN("srcY", ""),
		GLint.IN("srcZ", ""),
		GLuint.IN("dstName", ""),
		GLenum.IN("dstTarget", ""),
		GLint.IN("dstLevel", ""),
		GLint.IN("dstX", ""),
		GLint.IN("dstY", ""),
		GLint.IN("dstZ", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", "")
	)
}