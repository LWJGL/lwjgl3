/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val HI_clientpixmap = "HIClientpixmap".nativeClassEGL("HI_clientpixmap", postfix = HI) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides a mechanism for using memory allocated by the application as a color-buffer.
		"""

	IntConstant(
		"",

		"CLIENT_PIXMAP_POINTER_HI"..0x8F74
	)

	EGLSurface(
		"CreatePixmapSurfaceHI",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		EGLClientPixmapHI_p.IN("pixmap", "")
	)
}