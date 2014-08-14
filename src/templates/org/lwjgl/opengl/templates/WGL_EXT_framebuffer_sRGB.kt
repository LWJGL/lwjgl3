/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun WGL_EXT_framebuffer_sRGB() = "WGLEXTFramebufferSRGB".nativeClassWGL("WGL_EXT_framebuffer_sRGB", EXT) {
	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/EXT/framebuffer_sRGB.txt", templateName)} extension.

		This extension adds a framebuffer capability for sRGB framebuffer update and blending.
		"""

	IntConstant.block(
		"""
		Accepted by the {@code attributes} parameter of WGLARBPixelFormat#GetPixelFormatAttribiARB() and the {@code attribIList} of
		WGLARBPixelFormat#ChoosePixelFormatARB().
		""",

		"FRAMEBUFFER_SRGB_CAPABLE_ARB" _ 0x20A9
	)

}