/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val KHR_vg_parent_image = "KHRVGParentImage".nativeClassEGL("KHR_vg_parent_image", postfix = KHR) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a mechanism for creating EGLImage objects from OpenVG VGImage API resources. For an overview of EGLImage operation, please see
		the EGL_KHR_image specification.

		Requires ${EGL12.core} and ${KHR_image.link}.
		"""

	IntConstant(
		"",

		"VG_PARENT_IMAGE_KHR" _ 0x30BA
	)
}