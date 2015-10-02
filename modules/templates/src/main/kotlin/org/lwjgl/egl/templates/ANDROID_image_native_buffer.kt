/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val ANDROID_image_native_buffer = "ANDROIDImageNativeBuffer".nativeClassEGL("ANDROID_image_native_buffer", postfix = ANDROID) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension enables using an Android window buffer (struct ANativeWindowBuffer) as an EGLImage source.

		Requires ${EGL12.core} and ${KHR_image_base.link}.
		"""

	IntConstant(
		"",

		"NATIVE_BUFFER_ANDROID"..0x3140
	)
}