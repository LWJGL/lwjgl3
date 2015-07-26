/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EGL13 = "EGL13".nativeClassEGL("EGL13", postfix = "") {
	documentation =
		"The core EGL 1.3 functionality."

	IntConstant(
		"",

		"CONFORMANT" _ 0x3042,
		"CONTEXT_CLIENT_VERSION" _ 0x3098,
		"MATCH_NATIVE_PIXMAP" _ 0x3041,
		"OPENGL_ES2_BIT" _ 0x0004,
		"VG_ALPHA_FORMAT" _ 0x3088,
		"VG_ALPHA_FORMAT_NONPRE" _ 0x308B,
		"VG_ALPHA_FORMAT_PRE" _ 0x308C,
		"VG_ALPHA_FORMAT_PRE_BIT" _ 0x0040,
		"VG_COLORSPACE" _ 0x3087,
		"VG_COLORSPACE_sRGB" _ 0x3089,
		"VG_COLORSPACE_LINEAR" _ 0x308A,
		"VG_COLORSPACE_LINEAR_BIT" _ 0x0020
	)
}