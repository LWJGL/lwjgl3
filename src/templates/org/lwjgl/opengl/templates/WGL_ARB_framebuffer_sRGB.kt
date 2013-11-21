/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun WGL_ARB_framebuffer_sRGB() = "WGLARBFramebufferSRGB".nativeClassWGL("WGL_ARB_framebuffer_sRGB", ARB) {
	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/framebuffer_sRGB.txt", templateName)} extension.

		This extension adds a framebuffer capability for sRGB framebuffer update and blending.
		"""

	IntConstant.block(
		"""
		Accepted by the {@code attributes} parameter of ${"WGLARBPixelFormat#GetPixelFormatAttribiARB()".link} and the {@code attribIList} of
		${"WGLARBPixelFormat#ChoosePixelFormatARB()".link}.
		""",

		"FRAMEBUFFER_SRGB_CAPABLE_ARB" _ 0x20A9
	)

}