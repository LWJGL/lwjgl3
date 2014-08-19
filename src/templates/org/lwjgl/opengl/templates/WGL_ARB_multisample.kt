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

		This extension provides a mechanism to antialias all GL primitives: points, lines, polygons, bitmaps, and images.  The technique is to sample all
		primitives multiple times at each pixel.  The color sample values are resolved to a single, displayable color each time a pixel is updated, so the
		antialiasing appears to be automatic at the application level.  Because each sample includes depth and stencil information, the depth and stencil
		functions perform equivalently to the single-sample mode.

		Requires ${WGL_EXT_extensions_string.link} and ${WGL_ARB_pixel_format.link}.
		"""

	IntConstant.block(
		"""
		Accepted by the {@code attributes} parameter of WGLARBPixelFormat#GetPixelFormatAttribiARB(),
		WGLARBPixelFormat#GetPixelFormatAttribfARB(), and the {@code attribIList} and {@code attribFList} of
		WGLARBPixelFormat#ChoosePixelFormatARB().
		""",

		"SAMPLE_BUFFERS_ARB" _ 0x2041,
		"SAMPLES_ARB" _ 0x2042
	)
}