/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EGL10 = "EGL10".nativeClassEGL("EGL10", postfix = "") {
	includeEGL()

	documentation =
		"The core EGL 1.0 functionality."

	IntConstant(
		"",

		"ALPHA_SIZE" _ 0x3021,
		"BAD_ACCESS" _ 0x3002,
		"BAD_ALLOC" _ 0x3003,
		"BAD_ATTRIBUTE" _ 0x3004,
		"BAD_CONFIG" _ 0x3005,
		"BAD_CONTEXT" _ 0x3006,
		"BAD_CURRENT_SURFACE" _ 0x3007,
		"BAD_DISPLAY" _ 0x3008,
		"BAD_MATCH" _ 0x3009,
		"BAD_NATIVE_PIXMAP" _ 0x300A,
		"BAD_NATIVE_WINDOW" _ 0x300B,
		"BAD_PARAMETER" _ 0x300C,
		"BAD_SURFACE" _ 0x300D,
		"BLUE_SIZE" _ 0x3022,
		"BUFFER_SIZE" _ 0x3020,
		"CONFIG_CAVEAT" _ 0x3027,
		"CONFIG_ID" _ 0x3028,
		"CORE_NATIVE_ENGINE" _ 0x305B,
		"DEPTH_SIZE" _ 0x3025,
		"DONT_CARE" expr "-1",
		"DRAW" _ 0x3059,
		"EXTENSIONS" _ 0x3055,
		"FALSE" _ 0,
		"GREEN_SIZE" _ 0x3023,
		"HEIGHT" _ 0x3056,
		"LARGEST_PBUFFER" _ 0x3058,
		"LEVEL" _ 0x3029,
		"MAX_PBUFFER_HEIGHT" _ 0x302A,
		"MAX_PBUFFER_PIXELS" _ 0x302B,
		"MAX_PBUFFER_WIDTH" _ 0x302C,
		"NATIVE_RENDERABLE" _ 0x302D,
		"NATIVE_VISUAL_ID" _ 0x302E,
		"NATIVE_VISUAL_TYPE" _ 0x302F,
		"NONE" _ 0x3038,
		"NON_CONFORMANT_CONFIG" _ 0x3051,
		"NOT_INITIALIZED" _ 0x3001,
		"PBUFFER_BIT" _ 0x0001,
		"PIXMAP_BIT" _ 0x0002,
		"READ" _ 0x305A,
		"RED_SIZE" _ 0x3024,
		"SAMPLES" _ 0x3031,
		"SAMPLE_BUFFERS" _ 0x3032,
		"SLOW_CONFIG" _ 0x3050,
		"STENCIL_SIZE" _ 0x3026,
		"SUCCESS" _ 0x3000,
		"SURFACE_TYPE" _ 0x3033,
		"TRANSPARENT_BLUE_VALUE" _ 0x3035,
		"TRANSPARENT_GREEN_VALUE" _ 0x3036,
		"TRANSPARENT_RED_VALUE" _ 0x3037,
		"TRANSPARENT_RGB" _ 0x3052,
		"TRANSPARENT_TYPE" _ 0x3034,
		"TRUE" _ 1,
		"VENDOR" _ 0x3053,
		"VERSION" _ 0x3054,
		"WIDTH" _ 0x3057,
		"WINDOW_BIT" _ 0x0004
	)

	LongConstant(
		"Null values.",

		"NO_CONTEXT" _ 0L,
		"NO_DISPLAY" _ 0L,
		"NO_SURFACE" _ 0L
	)

	EGLBoolean(
		"ChooseConfig",
		"",

		EGLDisplay.IN("dpy", ""),
		nullable _ noneTerminated _ const _ EGLint_p.IN("attrib_list", ""),
		nullable _ EGLConfig_p.OUT("configs", ""),
		AutoSize("configs") _ EGLint.IN("config_size", ""),
		Check(1) _ EGLint_p.OUT("num_config", "")
	)

	EGLBoolean(
		"CopyBuffers",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surface", ""),
		EGLNativePixmapType.IN("target", "")
	)

	EGLContext(
		"CreateContext",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		nullable _ EGLContext.IN("share_context", ""),
		nullable _ noneTerminated _ const _ EGLint_p.IN("attrib_list", "")
	)

	EGLSurface(
		"CreatePbufferSurface",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		nullable _ noneTerminated _ const _ EGLint_p.IN("attrib_list", "")
	)

	EGLSurface(
		"CreatePixmapSurface",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		EGLNativePixmapType.IN("pixmap", ""),
		nullable _ noneTerminated _ const _ EGLint_p.IN("attrib_list", "")
	)

	EGLSurface(
		"CreateWindowSurface",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		EGLNativeWindowType.IN("win", ""),
		nullable _ noneTerminated _ const _ EGLint_p.IN("attrib_list", "")
	)

	EGLBoolean(
		"DestroyContext",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLContext.IN("ctx", "")
	)

	EGLBoolean(
		"DestroySurface",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surface", "")
	)

	EGLBoolean(
		"GetConfigAttrib",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		EGLint.IN("attribute", ""),
		Check(1) _ EGLint_p.OUT("value", "")
	)

	EGLBoolean(
		"GetConfigs",
		"",

		EGLDisplay.IN("dpy", ""),
		nullable _ EGLConfig_p.OUT("configs", ""),
		AutoSize("configs") _ EGLint.IN("config_size", ""),
		Check(1) _ EGLint_p.OUT("num_config", "")
	)

	EGLDisplay(
		"GetCurrentDisplay",
		""
	)

	EGLSurface(
		"GetCurrentSurface",
		"",

		EGLint.IN("readdraw", "")
	)

	EGLDisplay(
		"GetDisplay",
		"",

		nullable _ EGLNativeDisplayType.IN("display_id", "")
	)

	EGLint(
		"GetError",
		""
	)

	__eglMustCastToProperFunctionPointerType(
		"GetProcAddress",
		"",

		const _ charASCII_p.IN("procname", "")
	)

	EGLBoolean(
		"Initialize",
		"",

		EGLDisplay.IN("dpy", ""),
		Check(1) _ EGLint_p.OUT("major", ""),
		Check(1) _ EGLint_p.OUT("minor", "")
	)

	EGLBoolean(
		"MakeCurrent",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("draw", ""),
		EGLSurface.IN("read", ""),
		EGLContext.IN("ctx", "")
	)

	EGLBoolean(
		"QueryContext",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLContext.IN("ctx", ""),
		EGLint.IN("attribute", ""),
		Check(1) _ EGLint_p.OUT("value", "")
	)

	charASCII_p(
		"QueryString",
		"",

		nullable _ EGLDisplay.IN("dpy", ""),
		EGLint.IN("name", "")
	)

	EGLBoolean(
		"QuerySurface",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surface", ""),
		EGLint.IN("attribute", ""),
		Check(1) _ EGLint_p.OUT("value", "")
	)

	EGLBoolean(
		"SwapBuffers",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSurface.IN("surface", "")
	)

	EGLBoolean(
		"Terminate",
		"",

		EGLDisplay.IN("dpy", "")
	)

	EGLBoolean(
		"WaitGL",
		""
	)

	EGLBoolean(
		"WaitNative",
		"",

		EGLint.IN("engine", "")
	)
}