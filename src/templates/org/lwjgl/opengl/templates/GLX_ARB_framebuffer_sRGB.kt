/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_ARB_framebuffer_sRGB() = "GLXARBFramebufferSRGB".nativeClassGLX("GLX_ARB_framebuffer_sRGB", ARB) {
	javaImport("org.lwjgl.system.linux.*")

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/ARB/framebuffer_sRGB.txt", templateName)} extension.

		Conventionally, OpenGL assumes framebuffer color components are stored in a linear color space.  In particular, framebuffer blending is a linear
		operation.

		The sRGB color space is based on typical (non-linear) monitor characteristics expected in a dimly lit office.  It has been standardized by the
		International Electrotechnical Commission (IEC) as IEC 61966-2-1. The sRGB color space roughly corresponds to 2.2 gamma correction.

		This extension adds a framebuffer capability for sRGB framebuffer update and blending.
		"""
	)

	IntConstant.block(
		"Accepted by the {@code attribList} parameter of {@link GLX#glXChooseVisual}, and by the {@code attrib} parameter of {@link GLX#glXGetConfig}:",

		"FRAMEBUFFER_SRGB_CAPABLE_ARB" _ 0x20B2
	)

}