/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_ARB_multisample() = "GLXARBMultisample".nativeClassGLX("GLX_ARB_multisample", ARB) {
	javaImport(
		"org.lwjgl.system.linux.*",
		"org.lwjgl.system.linux.GLX"
	)

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/multisample.txt", templateName)} extension.

		This extension provides a mechanism to antialias all GL primitives.
		"""

	IntConstant.block(
		"Accepted by the {@code attribList} parameter of ${"GLX#ChooseVisual()".link}, and by the {@code attrib} parameter of ${"GLX#GetConfig()".link}:",

		"SAMPLE_BUFFERS_ARB" _ 100000,
		"SAMPLES_ARB" _ 100001
	)

}