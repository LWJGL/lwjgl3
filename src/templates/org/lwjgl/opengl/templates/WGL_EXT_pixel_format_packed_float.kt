/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_EXT_pixel_format_packed_float = "WGLEXTPixelFormatPackedFloat".nativeClassWGL("WGL_EXT_pixel_format_packed_float", EXT) {
	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "packed_float")} extension.

		This extension provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format described in
		##EXTPackedFloat could also be advertised as an unsigned floating-point format for rendering.

		Requires ${WGL_ARB_pixel_format.link}.
		"""

	IntConstant(
		"""
		Accepted as a value in the {@code attribIList} parameter array of WGLARBPixelFormat#ChoosePixelFormatARB(), and returned in the {@code values}
		parameter array of WGLARBPixelFormat#GetPixelFormatAttribiARB().
		""",

		"TYPE_RGBA_UNSIGNED_FLOAT_EXT" _ 0x20A8
	)

}