/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_draw_indirect = "ARBDrawIndirect".nativeClassGL("ARB_draw_indirect") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a mechanism for supplying the arguments to a
    DrawArraysInstanced or DrawElementsInstancedBaseVertex from buffer object
    memory. This is not particularly useful for applications where the CPU
    knows the values of the arguments beforehand, but is helpful when the
    values will be generated on the GPU through any mechanism that can write
    to a buffer object including image stores, atomic counters, or compute
    interop. This allows the GPU to consume these arguments without a round-
    trip to the CPU or the expensive synchronization that would involve. This
    is similar to the DrawTransformFeedbackEXT command from
    EXT_transform_feedback2, but offers much more flexibility in both
    generating the arguments and in the type of Draws that can be accomplished.

		Requires ${GL31.core}. ${GL40.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
		MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
		""",

		"DRAW_INDIRECT_BUFFER" _ 0x8F3F
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

		"DRAW_INDIRECT_BUFFER_BINDING" _ 0x8F43
	)

	GL40 reuse "DrawArraysIndirect"
	GL40 reuse "DrawElementsIndirect"
}