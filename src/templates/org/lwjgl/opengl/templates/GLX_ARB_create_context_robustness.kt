/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_ARB_create_context_robustness() = "GLXARBCreateContextRobustness".nativeClassGLX("GLX_ARB_create_context_robustness", ARB) {

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/glx_create_context_robustness.txt", templateName)} extension.

		This extension allows creating an OpenGL context supporting robust buffer access behavior and a specified graphics reset notification behavior.
		"""

	IntConstant.block(
		"""
		Accepted as a bit in the attribute value for ${"GLXARBCreateContext".link("CONTEXT_FLAGS_ARB")} in the {@code attrib_list} argument to
		${"GLXARBCreateContext".link("CreateContextAttribsARB()")}:
		""",

		"CONTEXT_ROBUST_ACCESS_BIT_ARB" _ 0x00000004
	)

	IntConstant.block(
		"Accepted as an attribute name in the {@code attrib_list} argument to ${"GLXARBCreateContext".link("CreateContextAttribsARB()")}:",

		"CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB" _ 0x8256
	)

	IntConstant.block(
		"""
		Accepted as an attribute value for ${"CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB".link} in the {@code attrib_list} argument to
		${"GLXARBCreateContext".link("CreateContextAttribsARB()")}:
		""",

		"NO_RESET_NOTIFICATION_ARB" _ 0x8261,
		"LOSE_CONTEXT_ON_RESET_ARB" _ 0x8252
	)

}