/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_bindless_multi_draw_indirect_count = "NVBindlessMultiDrawIndirectCount".nativeClassGL("NV_bindless_multi_draw_indirect_count", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds the possibility to define the number of drawcalls within a multi-draw-indirect call from the GPU, as provided by
		ARB_indirect_parameters, for the functions added in NV_bindless_multi_draw_indirect.
		
		Requires ${NV_bindless_multi_draw_indirect.link}, ${ARB_indirect_parameters.link}.
		"""

	GLvoid(
		"MultiDrawArraysIndirectBindlessCountNV",
		"""
		Behaves similarly to NVBindlessMultiDrawIndirect#MultiDrawArraysIndirectBindlessNV(), except that {@code drawCount} defines an offset (in bytes) into
		the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
		If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
		{@code maxDrawCount} parameter sets.
		""",

		GLenum.IN("mode", "the primitive mode", PRIMITIVE_TYPES),
		const _ GLvoid_p.IN("indirect", "an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)"),
		GLintptr.IN("drawCount", "the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4"),
		GLsizei.IN("maxDrawCount", "the maximum number of draws that are expected to be stored in the buffer"),
		GLsizei.IN("stride", "the size of one DrawArraysIndirectBindlessCommandNV structure"),
		GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure")
	)

	GLvoid(
		"MultiDrawElementsIndirectBindlessCountNV",
		"""
		Behaves similarly to NVBindlessMultiDrawIndirect#MultiDrawElementsIndirectBindlessNV(), except that {@code drawCount} defines an offset (in bytes) into
		the buffer object bound to the PARAMETER_BUFFER_ARB binding point at which a single {@code sizei} typed value is stored, which contains the draw count.
		If the value stored at {@code drawCount} into the buffer is greater than {@code maxDrawCount}, an implementation may stop processing draws after
		{@code maxDrawCount} parameter sets.
		""",

		GLenum.IN("mode", "the primitive mode", PRIMITIVE_TYPES),
		GLenum.IN("type", "the data type of the element indices", "GL11#UNSIGNED_BYTE GL11#UNSIGNED_SHORT GL11#UNSIGNED_INT"),
		const _ GLvoid_p.IN("indirect", "an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)"),
		GLintptr.IN("drawCount", "the byte offset into the buffer object containing the draw count. This offset must be a multiple of 4"),
		GLsizei.IN("maxDrawCount", "the maximum number of draws that are expected to be stored in the buffer"),
		GLsizei.IN("stride", "the size of one DrawElementsIndirectBindlessCommandNV structure"),
		GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure")
	)
}