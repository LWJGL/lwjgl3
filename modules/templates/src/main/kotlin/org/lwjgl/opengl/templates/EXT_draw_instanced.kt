/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_draw_instanced = "EXTDrawInstanced".nativeClassGL("EXT_draw_instanced", postfix = EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides the means to render multiple instances of an object with a single draw call, and an "instance ID" variable which can be used by
		the vertex program to compute per-instance values, typically an object's transform.

		Requires ${GL20.core}.
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
		GLsizei.IN("count", ""),
		GLenum.IN("type", ""),
		const _ void_p.IN("indices", ""),
		GLsizei.IN("primcount", "")
	)
}