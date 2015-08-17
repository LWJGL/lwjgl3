/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EGL14 = "EGL14".nativeClassEGL("EGL14", postfix = "") {
	documentation =
		"The core EGL 1.4 functionality."

	IntConstant(
		"",

		"MULTISAMPLE_RESOLVE_BOX_BIT" _ 0x0200,
		"MULTISAMPLE_RESOLVE" _ 0x3099,
		"MULTISAMPLE_RESOLVE_DEFAULT" _ 0x309A,
		"MULTISAMPLE_RESOLVE_BOX" _ 0x309B,
		"OPENGL_API" _ 0x30A2,
		"OPENGL_BIT" _ 0x0008,
		"SWAP_BEHAVIOR_PRESERVED_BIT" _ 0x0400
	)

	LongConstant(
		"",

		"DEFAULT_DISPLAY" _ 0L
	)

	EGLContext(
		"GetCurrentContext",
		""
	)
}