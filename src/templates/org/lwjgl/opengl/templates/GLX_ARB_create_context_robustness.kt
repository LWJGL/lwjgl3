/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_ARB_create_context_robustness = "GLXARBCreateContextRobustness".nativeClassGLX("GLX_ARB_create_context_robustness", ARB) {

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "glx_create_context_robustness")} extension.

		This extension allows creating an OpenGL context supporting robust buffer access behavior and a specified graphics reset notification behavior.

		Requires ${GLX14.glx}, ${GLX_ARB_create_context.link} and ${ARB_robustness.link}.
		"""

	IntConstant(
		"""
		Accepted as a bit in the attribute value for GLXARBCreateContext#CONTEXT_FLAGS_ARB in the {@code attrib_list} argument to
		GLXARBCreateContext#CreateContextAttribsARB().
		""",

		"CONTEXT_ROBUST_ACCESS_BIT_ARB" _ 0x00000004
	)

	IntConstant(
		"Accepted as an attribute name in the {@code attrib_list} argument to GLXARBCreateContext#CreateContextAttribsARB().",

		"CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB" _ 0x8256
	)

	IntConstant(
		"""
		Accepted as an attribute value for #CONTEXT_RESET_NOTIFICATION_STRATEGY_ARB in the {@code attrib_list} argument to
		GLXARBCreateContext#CreateContextAttribsARB().
		""",

		"NO_RESET_NOTIFICATION_ARB" _ 0x8261,
		"LOSE_CONTEXT_ON_RESET_ARB" _ 0x8252
	)

}