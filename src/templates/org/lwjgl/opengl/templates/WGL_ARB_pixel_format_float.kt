/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_ARB_pixel_format_float = "WGLARBPixelFormatFloat".nativeClassWGL("WGL_ARB_pixel_format_float", ARB) {
	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "color_buffer_float")} extension.

		This extension adds pixel formats with floating-point RGBA color components.

		Requires ${WGL_ARB_pixel_format.link} and ${GL15.core}.
		"""

	IntConstant(
		"""
		Accepted as a value in the {@code attribIList} parameter array of WGLARBPixelFormat#ChoosePixelFormatARB(), and returned in the {@code values}
		parameter array of WGLARBPixelFormat#GetPixelFormatAttribiARB().
		""",

		"TYPE_RGBA_FLOAT_ARB" _ 0x21A0
	)

}