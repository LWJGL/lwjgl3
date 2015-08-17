/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EGL11 = "EGL11".nativeClassEGL("EGL11", postfix = "") {
	documentation =
		"The core EGL 1.1 functionality."

	IntConstant(
		"",

		"BACK_BUFFER" _ 0x3084,
		"BIND_TO_TEXTURE_RGB" _ 0x3039,
		"BIND_TO_TEXTURE_RGBA" _ 0x303A,
		"CONTEXT_LOST" _ 0x300E,
		"MIN_SWAP_INTERVAL" _ 0x303B,
		"MAX_SWAP_INTERVAL" _ 0x303C,
		"MIPMAP_TEXTURE" _ 0x3082,
		"MIPMAP_LEVEL" _ 0x3083,
		"NO_TEXTURE" _ 0x305C,
		"TEXTURE_2D" _ 0x305F,
		"TEXTURE_FORMAT" _ 0x3080,
		"TEXTURE_RGB" _ 0x305D,
		"TEXTURE_RGBA" _ 0x305E,
		"TEXTURE_TARGET" _ 0x3081
	)

	EGLBoolean(
		"BindTexImage",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surface", ""),
		EGLint.IN("buffer", "")
	)

	EGLBoolean(
		"ReleaseTexImage",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surface", ""),
		EGLint.IN("buffer", "")
	)

	EGLBoolean(
		"SurfaceAttrib",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surface", ""),
		EGLint.IN("attribute", ""),
		EGLint.IN("value", "")
	)

	EGLBoolean(
		"SwapInterval",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLint.IN("interval", "")
	)
}