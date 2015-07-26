/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val NV_system_time = "NVSystemTime".nativeClassEGL("NV_system_time", postfix = NV) {
	includeEGLEXT()

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension exposes an alternative method of querying the system time from the driver instead of the operating system.

		Requires ${EGL12.core}.
		"""

	EGLuint64NV(
		"GetSystemTimeFrequencyNV",
		""
	)

	EGLuint64NV(
		"GetSystemTimeNV",
		""
	)
}