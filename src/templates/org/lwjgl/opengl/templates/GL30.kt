/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*
import java.nio.*

fun GL30() = "GL30".nativeClassGL("GL30") {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("The core OpenGL 3.0 functionality.")

	IntConstant.block(
		"GetTarget",

		"MAJOR_VERSION" _ 0x821B,
		"MINOR_VERSION" _ 0x821C,
		"NUM_EXTENSIONS" _ 0x821D,

		"CONTEXT_FLAGS" _ 0x821E,
		"CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT" _ 0x0001
	)

	(const _ GLubyteCharSequence).func(
		"GetStringi",
		"Queries indexed string state.",

		GLenum.IN("name", "the indexed state to query", "GL11#GL_EXTENSIONS GL20#SHADING_LANGUAGE_VERSION"),
		GLuint.IN("index", "the index of the particular element being queried")
	)

}