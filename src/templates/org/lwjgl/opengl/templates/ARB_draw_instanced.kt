/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

val ARB_draw_instanced = "ARBDrawInstanced".nativeClassGL("ARB_draw_instanced", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
		count and type, multiple times. This extension provides a means of accelerating such use cases while restricting the number of API calls, and keeping
		the amount of duplicate data to a minimum.
  
		This extension introduces two draw calls which are conceptually equivalent to a series of draw calls. Each conceptual call in this series is considered
		an "instance" of the actual draw call.
  
		This extension also introduces a read-only built-in variable to GLSL which contains the "instance ID." This variable initially contains 0, but increases
		by one after each conceptual draw call.

		By using the instance ID or multiples thereof as an index into a uniform array containing transform data, vertex shaders can draw multiple instances of
		an object with a single draw call.
    
        Requires ${GL30.core} or ${registryLinkTo("EXT", "gpu_shader4")} or ${registryLinkTo("NV", "vertex_program4")}. ${GL31.promoted}
		"""

	GLvoid(
		"DrawArraysInstancedARB",
		"Draw multiple instances of a range of elements.",

		GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
		GLint.IN("first", "the starting index in the enabled arrays"),
		GLsizei.IN("count", "the number of indices to be rendered"),
		GLsizei.IN("primcount", "the number of instances of the specified range of indices to be rendered")
	)

	GLvoid(
		"DrawElementsInstancedARB",
		"Draws multiple instances of a set of elements.",

		GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
		(AutoSize("indices") * "GLChecks.typeToBytes(type)") _ GLsizei.IN("count", "the number of elements to be rendered"),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN(
			"type",
			"the type of the values in {@code indices}",
			"GL11#UNSIGNED_BYTE GL11#UNSIGNED_SHORT GL11#UNSIGNED_INT"
		),
		const _ ELEMENT_ARRAY_BUFFER _ GLvoid_p.IN("indices", "a pointer to the location where the indices are stored"),
		GLsizei.IN("primcount", "the number of instances of the specified range of indices to be rendered")
	)
}