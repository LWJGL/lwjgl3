/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_ARB_multisample = "WGLARBMultisample".nativeClassWGL("WGL_ARB_multisample", ARB) {
	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "multisample")} extension.

		See ##ARBMultisample for details.

		Requires ${WGL_EXT_extensions_string.link} and ${WGL_ARB_pixel_format.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code attributes} parameter of WGLARBPixelFormat#GetPixelFormatAttribiARB(),
		WGLARBPixelFormat#GetPixelFormatAttribfARB(), and the {@code attribIList} and {@code attribFList} of
		WGLARBPixelFormat#ChoosePixelFormatARB().
		""",

		"SAMPLE_BUFFERS_ARB" _ 0x2041,
		"SAMPLES_ARB" _ 0x2042
	)
}