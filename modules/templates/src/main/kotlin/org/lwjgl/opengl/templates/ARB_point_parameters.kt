/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_point_parameters = "ARBPointParameters".nativeClassGL("ARB_point_parameters", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

        This extension supports additional geometric characteristics of points. It can be used to render particles or tiny light sources, commonly referred to
        as "Light points".

		The raster brightness of a point is a function of the point area, point color, point transparency, and the response of the display's electron gun and
		phosphor. The point area and the point transparency are derived from the point size, currently provided with the {@code size} parameter of
		GL11#PointSize().

		The primary motivation is to allow the size of a point to be affected by distance attenuation. When distance attenuation has an effect, the final point
		size decreases as the distance of the point from the eye increases.

		The secondary motivation is a mean to control the mapping from the point size to the raster point area and point transparency. This is done in order to
		increase the dynamic range of the raster brightness of points. In other words, the alpha component of a point may be decreased (and its transparency
		increased) as its area shrinks below a defined threshold.

		${GL14.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of PointParameterfvARB, and the {@code pname} of Get.",

		"POINT_SIZE_MIN_ARB" _ 0x8126,
		"POINT_SIZE_MAX_ARB" _ 0x8127,
		"POINT_FADE_THRESHOLD_SIZE_ARB" _ 0x8128,
		"POINT_DISTANCE_ATTENUATION_ARB" _ 0x8129
	)

	GLvoid(
		"PointParameterfARB",
		"Sets the float value of a pointer parameter.",

		GLenum.IN("pname", "the parameter to set", "#POINT_SIZE_MIN_ARB #POINT_SIZE_MAX_ARB #POINT_FADE_THRESHOLD_SIZE_ARB"),
		GLfloat.IN("param", "the parameter value")
	)

	GLvoid(
		"PointParameterfvARB",
		"Pointer version of #PointParameterfARB().",

		GLenum.IN("pname", "the parameter to set", "#POINT_DISTANCE_ATTENUATION_ARB"),
		const _ Check(3) _ GLfloat_p.IN("params", "the parameter value")
	)

}