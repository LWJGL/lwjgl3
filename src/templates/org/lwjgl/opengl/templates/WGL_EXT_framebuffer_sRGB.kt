/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_EXT_framebuffer_sRGB = "WGLEXTFramebufferSRGB".nativeClassWGL("WGL_EXT_framebuffer_sRGB", EXT) {
	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "framebuffer_sRGB")} extension.

		This extension adds a framebuffer capability for sRGB framebuffer update and blending.

		Requires ${WGL_EXT_extensions_string.link} and ${WGL_ARB_pixel_format.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code attributes} parameter of WGLARBPixelFormat#GetPixelFormatAttribiARB() and the {@code attribIList} of
		WGLARBPixelFormat#ChoosePixelFormatARB().
		""",

		"FRAMEBUFFER_SRGB_CAPABLE_ARB" _ 0x20A9
	)

}