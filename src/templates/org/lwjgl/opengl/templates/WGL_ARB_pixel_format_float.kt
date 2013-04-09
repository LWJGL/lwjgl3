/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_ARB_pixel_format_float() = "WGLARBPixelFormatFloat".nativeClassWGL("WGL_ARB_pixel_format_float", ARB) {
	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/ARB/color_buffer_float.txt", templateName)} extension.

		This extension adds pixel formats with floating-point RGBA color components.
		"""
	)

	IntConstant.block(
		"""
		Accepted as a value in the {@code attribIList} parameter array of {@link WGLARBPixelFormat#wglChoosePixelFormatARB}, and returned in the {@code values}
		parameter array of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB}.
		""",

		"TYPE_RGBA_FLOAT_ARB" _ 0x21A0
	)

}