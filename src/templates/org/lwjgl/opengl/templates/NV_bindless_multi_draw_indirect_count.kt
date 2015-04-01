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

		This extension adds the possibility to define the number of drawcalls within
    a multi-draw-indirect call from the GPU, as provided by ARB_indirect_parameters,
    for the functions added in NV_bindless_multi_draw_indirect.
		"""

	GLvoid.func(
		"MultiDrawArraysIndirectBindlessCountNV",
		"",

		GLenum.IN("mode", "the primitive mode, such as LINES or TRIANGLES"),
		const _ GLvoid_p.IN("indirect", "an array of DrawArraysIndirectBindlessCommandNV structures (see the extension spec for more information)"),
		GLintptr.IN("drawCount", "the byte offset into a buffer bound to PARAMETER_BUFFER_ARB at which a single sizei value is stored which contains the draw count"),
		GLsizei.IN("maxDrawCount", "specifies the maximum number of draws that are expected to be stored in the buffer"),
		GLsizei.IN("stride", "the size of one DrawArraysIndirectBindlessCommandNV structure"),
		GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawArraysIndirectBindlessCommandNV structure")
	)

	GLvoid.func(
		"MultiDrawElementsIndirectBindlessCountNV",
		"",

		GLenum.IN("mode", "the primitive mode, such as LINES or TRIANGLES"),
		GLenum.IN("type", "the data type of the element indices, such as UNSIGNED_SHORT or UNSIGNED_INT"),
		const _ GLvoid_p.IN("indirect", "an array of DrawElementsIndirectBindlessCommandNV structures (see the extension spec for more information)"),
		GLintptr.IN("drawCount", "the byte offset into a buffer bound to PARAMETER_BUFFER_ARB at which a single sizei value is stored which contains the draw count"),
		GLsizei.IN("maxDrawCount", "specifies the maximum number of draws that are expected to be stored in the buffer"),
		GLsizei.IN("stride", "the size of one DrawElementsIndirectBindlessCommandNV structure"),
		GLint.IN("vertexBufferCount", "the number of vertex buffers in the DrawElementsIndirectBindlessCommandNV structure")
	)
}