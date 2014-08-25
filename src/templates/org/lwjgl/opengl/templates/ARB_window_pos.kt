/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.AutoType
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.generator.opengl.deprecatedGL

val ARB_window_pos = "ARBWindowPos".nativeClassGL("ARB_window_pos", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		In order to set the current raster position to a specific window coordinate with the GL11#RasterPos2i() command, the modelview matrix, projection matrix
		and viewport must be set very carefully. Furthermore, if the desired window coordinate is outside of the window's bounds one must rely on a subtle
		side-effect of the GL11#Bitmap() command in order to avoid frustum clipping.

		This extension provides a set of functions to directly set the current raster position in window coordinates, bypassing the modelview matrix, the
		projection matrix and the viewport-to-window mapping. Furthermore, clip testing is not performed, so that the current raster position is always valid.

		This greatly simplifies the process of setting the current raster position to a specific window coordinate prior to calling GL11#DrawPixels(),
		GL11#CopyPixels() or GL11#Bitmap(). Many matrix operations can be avoided when mixing 2D and 3D rendering.

        ${GL14.promoted}
		"""

	GLvoid.func(
		"WindowPos2iARB",
		"Alternate way to set the current raster position. {@code z} is implictly set to 0.",

		GLint.IN("x", "the x value"),
		GLint.IN("y", "the y value")
	)

	GLvoid.func("WindowPos2sARB", "Short version of #WindowPos2iARB().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"))
	GLvoid.func("WindowPos2fARB", "Float version of #WindowPos2iARB().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"))
	GLvoid.func("WindowPos2dARB", "Double version of #WindowPos2iARB().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"))

	GLvoid.func("WindowPos2ivARB", "Pointer version of #WindowPos2iARB().", mods(const, Check(2)) _ GLint_p.IN("p", "the position value"))
	GLvoid.func("WindowPos2svARB", "Pointer version of #WindowPos2sARB().", mods(const, Check(2)) _ GLshort_p.IN("p", "the position value"))
	GLvoid.func("WindowPos2fvARB", "Pointer version of #WindowPos2fARB().", mods(const, Check(2)) _ GLfloat_p.IN("p", "the position value"))
	GLvoid.func("WindowPos2dvARB", "Pointer version of #WindowPos2dARB().", mods(const, Check(2)) _ GLdouble_p.IN("p", "the position value"))

	GLvoid.func(
		"WindowPos3iARB",
		"Alternate way to set the current raster position.",

		GLint.IN("x", "the x value"),
		GLint.IN("y", "the y value"),
		GLint.IN("z", "the z value")
	)

	GLvoid.func("WindowPos3sARB", "Short version of #WindowPos3iARB().", GLshort.IN("x", "the x value"), GLshort.IN("y", "the y value"), GLshort.IN("z", "the z value"))
	GLvoid.func("WindowPos3fARB", "Float version of #WindowPos3iARB().", GLfloat.IN("x", "the x value"), GLfloat.IN("y", "the y value"), GLfloat.IN("z", "the z value"))
	GLvoid.func("WindowPos3dARB", "Double version of #WindowPos3iARB().", GLdouble.IN("x", "the x value"), GLdouble.IN("y", "the y value"), GLdouble.IN("z", "the z value"))

	GLvoid.func("WindowPos3ivARB", "Pointer version of #WindowPos3iARB().", mods(const, Check(3)) _ GLint_p.IN("p", "the position value"))
	GLvoid.func("WindowPos3svARB", "Pointer version of #WindowPos3sARB().", mods(const, Check(3)) _ GLshort_p.IN("p", "the position value"))
	GLvoid.func("WindowPos3fvARB", "Pointer version of #WindowPos3fARB().", mods(const, Check(3)) _ GLfloat_p.IN("p", "the position value"))
	GLvoid.func("WindowPos3dvARB", "Pointer version of #WindowPos3dARB().", mods(const, Check(3)) _ GLdouble_p.IN("p", "the position value"))
}