/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_extended_get2 = "QCOMExtendedGet2".nativeClassGLES("QCOM_extended_get2", postfix = QCOM) {
	nativeImport (
		"OpenGLES.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension enables instrumenting the driver for debugging of OpenGL ES applications.
		"""

	void(
		"ExtGetShadersQCOM",
		"",

		nullable _ GLuint_p.OUT("shaders", ""),
		AutoSize("shaders") _ GLint.IN("maxShaders", ""),
		nullable _ Check(1) _ GLint_p.OUT("numShaders", "")
	)

	void(
		"ExtGetProgramsQCOM",
		"",

		nullable _ GLuint_p.OUT("programs", ""),
		AutoSize("programs") _ GLint.IN("maxPrograms", ""),
		nullable _ Check(1) _ GLint_p.OUT("numPrograms", "")
	)

	GLboolean(
		"ExtIsProgramBinaryQCOM",
		"",

		GLuint.IN("program", "")
	)

	void(
		"ExtGetProgramBinarySourceQCOM",
		"",

		GLuint.IN("program", ""),
		GLenum.IN("shadertype", ""),
		nullable _ GLcharUTF8_p.OUT("source", ""),
		nullable _ Check(1) _ GLint_p.OUT("length", "")
	)
}