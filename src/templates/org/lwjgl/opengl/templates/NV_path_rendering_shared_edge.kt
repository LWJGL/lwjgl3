/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_path_rendering_shared_edge = "NVPathRenderingSharedEdge".nativeClassGL("NV_path_rendering_shared_edge", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension introduces a new path command modifier to the
    NV_path_rendering extension to indicate that a path command represents an
    edge (either straight or curved) that is shared with another path.
    
        Requires ${registryLinkTo("NV", "path_rendering")}
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