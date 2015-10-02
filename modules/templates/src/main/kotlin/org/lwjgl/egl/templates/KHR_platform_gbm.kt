/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val KHR_platform_gbm = "KHRPlatformGBM".nativeClassEGL("KHR_platform_gbm", postfix = KHR) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension defines how to create EGL resources from native GBM resources using the EGL 1.5 platform functionality (GBM is a Generic Buffer Manager
		for Linux).

		Requires ${EGL15.core}.
		"""

	IntConstant(
		"",

		"PLATFORM_GBM_KHR"..0x31D7
	)
}