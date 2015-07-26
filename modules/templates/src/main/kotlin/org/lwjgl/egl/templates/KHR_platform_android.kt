/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val KHR_platform_android = "KHRPlatformAndroid".nativeClassEGL("KHR_platform_android", postfix = KHR) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension defines how to create EGL resources from native Android resources using the EGL 1.5 platform functionality.

		Requires ${EGL15.core}.
		"""

	IntConstant(
		"",

		"PLATFORM_ANDROID_KHR" _ 0x3141
	)
}