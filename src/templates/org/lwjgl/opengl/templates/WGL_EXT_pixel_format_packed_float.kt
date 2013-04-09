/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_EXT_pixel_format_packed_float() = "WGLEXTPixelFormatPackedFloat".nativeClassWGL("WGL_EXT_pixel_format_packed_float", EXT) {
	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/packed_float.txt", templateName)} extension.

		This extension provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format described in
		{@link EXTPackedFloat} could also be advertised as an unsigned floating-point format for rendering.
		"""
	)

	IntConstant.block(
		"""
		Accepted as a value in the {@code attribIList} parameter array of {@link WGLARBPixelFormat#wglChoosePixelFormatARB}, and returned in the {@code values}
		parameter array of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB}.
		""",

		"TYPE_RGBA_UNSIGNED_FLOAT_EXT" _ 0x20A8
	)

}