/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val ANGLE_window_fixed_size = "ANGLEWindowFixedSize".nativeClassEGL("ANGLE_window_fixed_size", postfix = ANGLE) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows creating a window surface with a fixed size that is specified when it is created.
		"""

	IntConstant(
		"",

		"FIXED_SIZE_ANGLE" _ 0x3201
	)
}