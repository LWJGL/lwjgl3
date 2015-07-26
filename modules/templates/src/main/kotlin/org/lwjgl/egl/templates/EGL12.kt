/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EGL12 = "EGL12".nativeClassEGL("EGL12", postfix = "") {
	includeEGL()

	documentation =
		"The core EGL 1.2 functionality."

	IntConstant(
		"",

		"ALPHA_FORMAT" _ 0x3088,
		"ALPHA_FORMAT_NONPRE" _ 0x308B,
		"ALPHA_FORMAT_PRE" _ 0x308C,
		"ALPHA_MASK_SIZE" _ 0x303E,
		"BUFFER_PRESERVED" _ 0x3094,
		"BUFFER_DESTROYED" _ 0x3095,
		"CLIENT_APIS" _ 0x308D,
		"COLORSPACE" _ 0x3087,
		"COLORSPACE_sRGB" _ 0x3089,
		"COLORSPACE_LINEAR" _ 0x308A,
		"COLOR_BUFFER_TYPE" _ 0x303F,
		"CONTEXT_CLIENT_TYPE" _ 0x3097,
		"DISPLAY_SCALING" _ 10000,
		"HORIZONTAL_RESOLUTION" _ 0x3090,
		"LUMINANCE_BUFFER" _ 0x308F,
		"LUMINANCE_SIZE" _ 0x303D,
		"OPENGL_ES_BIT" _ 0x0001,
		"OPENVG_BIT" _ 0x0002,
		"OPENGL_ES_API" _ 0x30A0,
		"OPENVG_API" _ 0x30A1,
		"OPENVG_IMAGE" _ 0x3096,
		"PIXEL_ASPECT_RATIO" _ 0x3092,
		"RENDERABLE_TYPE" _ 0x3040,
		"RENDER_BUFFER" _ 0x3086,
		"RGB_BUFFER" _ 0x308E,
		"SINGLE_BUFFER" _ 0x3085,
		"SWAP_BEHAVIOR" _ 0x3093,
		"UNKNOWN" expr "-1",
		"VERTICAL_RESOLUTION" _ 0x3091
	)

	EGLBoolean(
		"BindAPI",
		"",

		EGLenum.IN("api", "")
	)

	EGLenum(
		"QueryAPI",
		""
	)

	EGLSurface(
		"CreatePbufferFromClientBuffer",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLenum.IN("buftype", ""),
		EGLClientBuffer.IN("buffer", ""),
		EGLConfig.IN("config", ""),
		nullable _ noneTerminated _ const _ EGLint_p.IN("attrib_list", "")
	)

	EGLBoolean(
		"ReleaseThread",
		""
	)

	EGLBoolean(
		"WaitClient",
		""
	)
}