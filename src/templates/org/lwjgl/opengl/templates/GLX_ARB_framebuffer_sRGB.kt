/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_ARB_framebuffer_sRGB = "GLXARBFramebufferSRGB".nativeClassGLX("GLX_ARB_framebuffer_sRGB", ARB) {
	javaImport("org.lwjgl.system.linux.*")

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "framebuffer_sRGB")} extension.

		Conventionally, OpenGL assumes framebuffer color components are stored in a linear color space.  In particular, framebuffer blending is a linear
		operation.

		The sRGB color space is based on typical (non-linear) monitor characteristics expected in a dimly lit office.  It has been standardized by the
		International Electrotechnical Commission (IEC) as IEC 61966-2-1. The sRGB color space roughly corresponds to 2.2 gamma correction.

		This extension adds a framebuffer capability for sRGB framebuffer update and blending.

		Requires ${ARB_framebuffer_object.link}.
		"""

	IntConstant(
		"Accepted by the {@code attribList} parameter of GLX#ChooseVisual(), and by the {@code attrib} parameter of GLX#GetConfig().",

		"FRAMEBUFFER_SRGB_CAPABLE_ARB" _ 0x20B2
	)

}