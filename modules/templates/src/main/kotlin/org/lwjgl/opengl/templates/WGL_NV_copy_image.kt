/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_NV_copy_image = "WGLNVCopyImage".nativeClassWGL("WGL_NV_copy_image", NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("NV", "copy_image")} extension.

		This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
		otherwise configure the rendering pipeline. The WGL version allows copying between images in different contexts, even if those contexts are in
		different sharelists or even on different physical devices.
		"""

	BOOL(
		"CopyImageSubDataNV",
		"""
		Behaves identically to the core function NVCopyImage##glCopyImageSubDataNV(), except that the {@code srcRC} and {@code dstRC} parameters specify
		the contexts in which to look up the source and destination objects, respectively. A value of zero indicates that the currently bound context should be
		used instead.
		""",

		HGLRC.IN("srcRC", "the source OpenGL context"),
		GLuint.IN("srcName", "the source object"),
		GLenum.IN("srcTarget", "the source object target"),
		GLint.IN("srcLevel", "the source level-of-detail number"),
		GLint.IN("srcX", "the source texel x coordinate"),
		GLint.IN("srcY", "the source texel y coordinate"),
		GLint.IN("srcZ", "the source texel z coordinate"),
		HGLRC.IN("dstRC", "the destination OpenGL context"),
		GLuint.IN("dstName", "the destination object"),
		GLenum.IN("dstTarget", "the destination object target"),
		GLint.IN("dstLevel", "the destination level-of-detail number"),
		GLint.IN("dstX", "the destination texel x coordinate"),
		GLint.IN("dstY", "the destination texel y coordinate"),
		GLint.IN("dstZ", "the destination texel z coordinate"),
		GLsizei.IN("width", "the number of texels to copy in the x-dimension"),
		GLsizei.IN("height", "the number of texels to copy in the y-dimension"),
		GLsizei.IN("depth", "the number of texels to copy in the z-dimension")
	)
}