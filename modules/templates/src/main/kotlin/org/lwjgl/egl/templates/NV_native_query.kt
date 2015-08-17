/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val NV_native_query = "NVNativeQuery".nativeClassEGL("NV_native_query", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows an application to query which native display, pixmap and surface corresponds to a EGL object.
		"""

	EGLBoolean(
		"QueryNativeDisplayNV",
		"",

		EGLDisplay.IN("dpy", ""),
		Check(1) _ EGLNativeDisplayType_p.OUT("display_id", "")
	)

	EGLBoolean(
		"QueryNativeWindowNV",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surf", ""),
		Check(1) _ EGLNativeWindowType_p.OUT("window", "")
	)

	EGLBoolean(
		"QueryNativePixmapNV",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surf", ""),
		Check(1) _ EGLNativePixmapType_p.OUT("pixmap", "")
	)
}