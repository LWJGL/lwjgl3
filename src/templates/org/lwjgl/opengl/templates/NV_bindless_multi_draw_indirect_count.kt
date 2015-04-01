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

		GLenum.IN("mode", ""),
		const _ GLvoid_p.IN("indirect", ""),
		GLintptr.IN("drawCount", ""),
		GLsizei.IN("maxDrawCount", ""),
		GLsizei.IN("stride", ""),
		GLint.IN("vertexBufferCount", "")
	)

	GLvoid.func(
		"MultiDrawElementsIndirectBindlessCountNV",
		"",

		GLenum.IN("mode", ""),
		GLenum.IN("type", ""),
		const _ GLvoid_p.IN("indirect", ""),
		GLintptr.IN("drawCount", ""),
		GLsizei.IN("maxDrawCount", ""),
		GLsizei.IN("stride", ""),
		GLint.IN("vertexBufferCount", "")
	)
}