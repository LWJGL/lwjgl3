/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_ARB_multisample() = "WGLARBMultisample".nativeClassWGL("WGL_ARB_multisample", ARB) {
	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/ARB/multisample.txt", templateName)} extension.

		This extension provides a mechanism to antialias all GL primitives: points, lines, polygons, bitmaps, and images.  The technique is to sample all
		primitives multiple times at each pixel.  The color sample values are resolved to a single, displayable color each time a pixel is updated, so the
		antialiasing appears to be automatic at the application level.  Because each sample includes depth and stencil information, the depth and stencil
		functions perform equivalently to the single-sample mode.
		"""
	)

	IntConstant.block(
		"""
		Accepted by the {@code attributes} parameter of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB},
		{@link WGLARBPixelFormat#wglGetPixelFormatAttribfARB}, and the {@code attribIList} and {@code attribFList} of
		{@link WGLARBPixelFormat#wglChoosePixelFormatARB}.
		""",

		"SAMPLE_BUFFERS_ARB" _ 0x2041,
        "SAMPLES_ARB" _ 0x2042
	)
}