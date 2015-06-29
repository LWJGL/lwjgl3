/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_ARB_framebuffer_sRGB = "WGLARBFramebufferSRGB".nativeClassWGL("WGL_ARB_framebuffer_sRGB", ARB) {
	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "framebuffer_sRGB")} extension.

		This extension adds a framebuffer capability for sRGB framebuffer update and blending.

		Requires ${WGL_EXT_extensions_string.link}, ${WGL_ARB_pixel_format.link} and ${ARB_framebuffer_object.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code attributes} parameter of WGLARBPixelFormat#GetPixelFormatAttribiARB() and the {@code attribIList} of
		WGLARBPixelFormat#ChoosePixelFormatARB().
		""",

		"FRAMEBUFFER_SRGB_CAPABLE_ARB" _ 0x20A9
	)

}