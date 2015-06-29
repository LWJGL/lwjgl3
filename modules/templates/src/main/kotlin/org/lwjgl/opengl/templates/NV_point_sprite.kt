/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_point_sprite = "NVPointSprite".nativeClassGL("NV_point_sprite", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Applications such as particle systems usually must use OpenGL quads rather than points to render their geometry, since they would like to use a
		custom-drawn texture for each particle, rather than the traditional OpenGL round antialiased points, and each fragment in a point has the same texture
		coordinates as every other fragment.

		Unfortunately, specifying the geometry for these quads can be quite expensive, since it quadruples the amount of geometry required, and it may also
		require the application to do extra processing to compute the location of each vertex.

		The goal of this extension is to allow such apps to use points rather than quads. When #POINT_SPRITE_NV is enabled, the state of point antialiasing
		is ignored. For each texture unit, the app can then specify whether to replace the existing texture coordinates with point sprite texture coordinates,
		which are interpolated across the point. Finally, the app can set a global parameter for the way to generate the R coordinate for point sprites; the R
		coordinate can either be zero, the input S coordinate, or the input R coordinate. This allows applications to use a 3D texture to represent a point
		sprite that goes through an animation, with filtering between frames, for example.
    
        Requires ${registryLinkTo("EXT", "point_parameters")}
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.
		""",

		"POINT_SPRITE_NV" _ 0x8861
	)

	IntConstant(
		"""
		When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE_NV, then the value of
		{@code pname} may be.
		""",

		"COORD_REPLACE_NV" _ 0x8862
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of PointParameteriNV, PointParameterfEXT, PointParameterivNV, PointParameterfvEXT, GetBooleanv, GetIntegerv,
		GetFloatv, and GetDoublev.
		""",

		"POINT_SPRITE_R_MODE_NV" _ 0x8863
	)

	GLvoid(
		"PointParameteriNV",
		"",

		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	GLvoid(
		"PointParameterivNV",
		"",

		GLenum.IN("pname", ""),
		const _ Check(1) _ GLint_p.IN("params", "")
	)
}