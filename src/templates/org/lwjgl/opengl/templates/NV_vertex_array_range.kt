/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_vertex_array_range = "NVVertexArrayRange".nativeClassGL("NV_vertex_array_range", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		The goal of this extension is to permit extremely high vertex
    processing rates via OpenGL vertex arrays even when the CPU lacks
    the necessary data movement bandwidth to keep up with the rate
    at which the vertex engine can consume vertices.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of EnableClientState, DisableClientState, and IsEnabled.
		""",

		"VERTEX_ARRAY_RANGE_NV" _ 0x851D
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.
		""",

		"VERTEX_ARRAY_RANGE_LENGTH_NV" _ 0x851E,
		"VERTEX_ARRAY_RANGE_VALID_NV" _ 0x851F,
		"MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV" _ 0x8520
	)

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetPointerv.
		""",

		"VERTEX_ARRAY_RANGE_POINTER_NV" _ 0x8521
	)

	GLvoid(
		"VertexArrayRangeNV",
		"",

		GLsizei.IN("length", ""),
		GLvoid_p.IN("pointer", "")
	)

	GLvoid(
		"FlushVertexArrayRangeNV",
		""
	)
}