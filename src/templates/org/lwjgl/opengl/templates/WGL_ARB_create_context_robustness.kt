/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun WGL_ARB_create_context_robustness() = "WGLARBCreateContextRobustness".nativeClassWGL("WGL_ARB_create_context_robustness", ARB) {
	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/wgl_create_context_robustness.txt", templateName)} extension.

		This extension allows creating an OpenGL context supporting robust buffer access behavior and a specified graphics reset notification behavior.
		"""

	val wglCreateContextAttribsARB = "${"WGLARBCreateContext#CreateContextAttribsARB()".link}"
	IntConstant.block(
		"""
		Accepted as a bit in the attribute value for {@code WGLARBCreateContext#WGL_CONTEXT_FLAGS_ARB} in the {@code attrib_list} argument to
		$wglCreateContextAttribsARB.
		""",

		"CONTEXT_ROBUST_ACCESS_BIT_ARB" _ 0x00000004
	)

	IntConstant.block(
		"Accepted as an attribute name in the {@code attrib_list} argument to $wglCreateContextAttribsARB.",

		"CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB" _ 0x8256
	)

	IntConstant.block(
		"""
		Accepted as an attribute value for ${"CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB".link} in the {@code attrib_list} argument to
		$wglCreateContextAttribsARB.
		""",

		"NO_RESET_NOTIFICATION_ARB" _ 0x8261,
		"LOSE_CONTEXT_ON_RESET_ARB" _ 0x8252
	)
}