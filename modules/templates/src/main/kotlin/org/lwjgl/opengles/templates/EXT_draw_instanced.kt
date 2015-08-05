/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*
import org.lwjgl.opengles.BufferType.*

val EXT_draw_instanced = "EXTDrawInstanced".nativeClassGLES("EXT_draw_instanced", postfix = EXT) {
	nativeImport (
		"OpenGLES.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
		the vertex program to compute per-instance values, typically an object's transform.
		"""

	void(
		"DrawArraysInstancedEXT",
		"",

		GLenum.IN("mode", ""),
		GLint.IN("start", ""),
		GLsizei.IN("count", ""),
		GLsizei.IN("primcount", "")
	)

	void(
		"DrawElementsInstancedEXT",
		"",

		GLenum.IN("mode", ""),
		AutoSize("indices") shr "GLESChecks.typeToByteShift(type)" _ GLsizei.IN("count", ""),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN("type", ""),
		ELEMENT_ARRAY_BUFFER _ const _ void_p.IN("indices", ""),
		GLsizei.IN("primcount", "")
	)
}