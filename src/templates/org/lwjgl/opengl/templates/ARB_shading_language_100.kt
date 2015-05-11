/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_shading_language_100 = "ARBShadingLanguage100".nativeClassGL("ARB_shading_language_100", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension indicates that the OpenGL Shading Language is supported.

		Requires ${ARB_shader_objects.link}, ${ARB_fragment_shader.link} and ${ARB_vertex_shader.link}. ${GL20.promoted}
		"""

	IntConstant(
		"Accepted by the {@code name} parameter of GetString.",

		"SHADING_LANGUAGE_VERSION_ARB" _ 0x8B8C
	)
}