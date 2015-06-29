/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_map_buffer_alignment = "ARBMapBufferAlignment".nativeClassGL("ARB_map_buffer_alignment") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a requirement to the pointer returned by GL15#MapBuffer() and GL30#MapBufferRange() that they provide a minimum of 64 byte alignment
		to support processing of the data directly with special CPU instructions like SSE and AVX.

		Requires ${GL21.core}. ${GL42.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

		"MIN_MAP_BUFFER_ALIGNMENT" _ 0x90BC
	)
}