/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_draw_texture = "NVDrawTexture".nativeClassGL("NV_draw_texture", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a new function, DrawTextureNV(), allowing
    applications to draw an screen-aligned rectangle displaying some or all of
    the contents of a two-dimensional or rectangle texture.  Callers specify a
    texture object, an optional sampler object, window coordinates of the
    rectangle to draw, and texture coordinates corresponding to the corners of
    the rectangle.  For each fragment produced by the rectangle, DrawTextureNV
    interpolates the texture coordinates, performs a texture lookup, and uses
    the texture result as the fragment color.
		"""

	GLvoid(
		"DrawTextureNV",
		"",

		GLuint.IN("texture", ""),
		GLuint.IN("sampler", ""),
		GLfloat.IN("x0", ""),
		GLfloat.IN("y0", ""),
		GLfloat.IN("x1", ""),
		GLfloat.IN("y1", ""),
		GLfloat.IN("z", ""),
		GLfloat.IN("s0", ""),
		GLfloat.IN("t0", ""),
		GLfloat.IN("s1", ""),
		GLfloat.IN("t1", "")
	)
}
