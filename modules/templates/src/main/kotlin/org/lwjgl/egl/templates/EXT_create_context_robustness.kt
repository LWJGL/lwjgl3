/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EXT_create_context_robustness = "EXTCreateContextRobustness".nativeClassEGL("EXT_create_context_robustness", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows creating an OpenGL or OpenGL ES context supporting robust buffer access behavior and a specified graphics reset notification
		behavior.

		Requires ${EGL14.core}.
		"""

	IntConstant(
		"",

		"CONTEXT_OPENGL_ROBUST_ACCESS_EXT" _ 0x30BF,
		"CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY_EXT" _ 0x3138,
		"NO_RESET_NOTIFICATION_EXT" _ 0x31BE,
		"LOSE_CONTEXT_ON_RESET_EXT" _ 0x31BF
	)
}