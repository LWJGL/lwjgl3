/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val TIZEN_image_native_surface = "TIZENImageNativeSurface".nativeClassEGL("TIZEN_image_native_surface", postfix = TIZEN) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Tizen Buffer Manager (TBM) is a user space, generic memory management framework to create and share memory buffers between different system components.
		This extension enables using a Tizen Buffer Manager (TBM) surface object (struct tbm_surface_h) as an EGLImage source.

		Requires ${EGL12.core} and ${KHR_image_base.link}.
		"""

	IntConstant(
		"",

		"NATIVE_SURFACE_TIZEN"..0x32A1
	)
}