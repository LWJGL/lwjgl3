/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_point_sprite = "ARBPointSprite".nativeClassGL("ARB_point_sprite", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Applications such as particle systems have tended to use OpenGL quads rather than points to render their geometry, since they would like to use a
		custom-drawn texture for each particle, rather than the traditional OpenGL round antialiased points, and each fragment in a point has the same texture
		coordinates as every other fragment.

		Unfortunately, specifying the geometry for these quads can be expensive, since it quadruples the amount of geometry required, and may also require the
		application to do extra processing to compute the location of each vertex.

		The purpose of this extension is to allow such applications to use points rather than quads. When #POINT_SPRITE_ARB is enabled, the state of point
		antialiasing is ignored. For each texture unit, the app can then specify whether to replace the existing texture coordinates with point sprite texture
		coordinates, which are interpolated across the point.

        ${GL20.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.
		""",

		"POINT_SPRITE_ARB" _ 0x8861
	)

	IntConstant(
		"""
		When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE_ARB, then the value of
		{@code pname} may be.
		""",

		"COORD_REPLACE_ARB" _ 0x8862
	)
}