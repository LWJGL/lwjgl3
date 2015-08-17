/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val EGL15 = "EGL15".nativeClassEGL("EGL15", postfix = "") {
	documentation =
		"The core EGL 1.5 functionality."

	IntConstant(
		"",

		"CONTEXT_MAJOR_VERSION" _ 0x3098,
		"CONTEXT_MINOR_VERSION" _ 0x30FB,
		"CONTEXT_OPENGL_PROFILE_MASK" _ 0x30FD,
		"CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY" _ 0x31BD,
		"NO_RESET_NOTIFICATION" _ 0x31BE,
		"LOSE_CONTEXT_ON_RESET" _ 0x31BF,
		"CONTEXT_OPENGL_CORE_PROFILE_BIT" _ 0x00000001,
		"CONTEXT_OPENGL_COMPATIBILITY_PROFILE_BIT" _ 0x00000002,
		"CONTEXT_OPENGL_DEBUG" _ 0x31B0,
		"CONTEXT_OPENGL_FORWARD_COMPATIBLE" _ 0x31B1,
		"CONTEXT_OPENGL_ROBUST_ACCESS" _ 0x31B2,
		"OPENGL_ES3_BIT" _ 0x00000040,
		"CL_EVENT_HANDLE" _ 0x309C,
		"SYNC_CL_EVENT" _ 0x30FE,
		"SYNC_CL_EVENT_COMPLETE" _ 0x30FF,
		"SYNC_PRIOR_COMMANDS_COMPLETE" _ 0x30F0,
		"SYNC_TYPE" _ 0x30F7,
		"SYNC_STATUS" _ 0x30F1,
		"SYNC_CONDITION" _ 0x30F8,
		"SIGNALED" _ 0x30F2,
		"UNSIGNALED" _ 0x30F3,
		"SYNC_FLUSH_COMMANDS_BIT" _ 0x0001,
		"TIMEOUT_EXPIRED" _ 0x30F5,
		"CONDITION_SATISFIED" _ 0x30F6,
		"SYNC_FENCE" _ 0x30F9,
		"GL_COLORSPACE" _ 0x309D,
		"GL_COLORSPACE_SRGB" _ 0x3089,
		"GL_COLORSPACE_LINEAR" _ 0x308A,
		"GL_RENDERBUFFER" _ 0x30B9,
		"GL_TEXTURE_2D" _ 0x30B1,
		"GL_TEXTURE_LEVEL" _ 0x30BC,
		"GL_TEXTURE_3D" _ 0x30B2,
		"GL_TEXTURE_ZOFFSET" _ 0x30BD,
		"GL_TEXTURE_CUBE_MAP_POSITIVE_X" _ 0x30B3,
		"GL_TEXTURE_CUBE_MAP_NEGATIVE_X" _ 0x30B4,
		"GL_TEXTURE_CUBE_MAP_POSITIVE_Y" _ 0x30B5,
		"GL_TEXTURE_CUBE_MAP_NEGATIVE_Y" _ 0x30B6,
		"GL_TEXTURE_CUBE_MAP_POSITIVE_Z" _ 0x30B7,
		"GL_TEXTURE_CUBE_MAP_NEGATIVE_Z" _ 0x30B8,
		"IMAGE_PRESERVED" _ 0x30D2
	)

	LongConstant(
		"",

		"FOREVER" expr "0xFFFFFFFFFFFFFFFFL",
		"NO_SYNC" _ 0L,
		"NO_IMAGE" _ 0L
	)

	EGLSync(
		"CreateSync",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLenum.IN("type", ""),
		noneTerminated _ const _ EGLAttrib_p.IN("attrib_list", "")
	)

	EGLBoolean(
		"DestroySync",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSync.IN("sync", "")
	)

	EGLint(
		"ClientWaitSync",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSync.IN("sync", ""),
		EGLint.IN("flags", ""),
		EGLTime.IN("timeout", "")
	)

	EGLBoolean(
		"GetSyncAttrib",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSync.IN("sync", ""),
		EGLint.IN("attribute", ""),
		Check(1) _ EGLAttrib_p.OUT("value", "")
	)

	EGLImage(
		"CreateImage",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLContext.IN("ctx", ""),
		EGLenum.IN("target", ""),
		EGLClientBuffer.IN("buffer", ""),
		nullable _ noneTerminated _ const _ EGLAttrib_p.IN("attrib_list", "")
	)

	EGLBoolean(
		"DestroyImage",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLImage.IN("image", "")
	)

	EGLDisplay(
		"GetPlatformDisplay",
		"",

		EGLenum.IN("platform", ""),
		voidptr.IN("native_display", ""),
		nullable _ noneTerminated _ const _ EGLAttrib_p.IN("attrib_list", "")
	)

	EGLSurface(
		"CreatePlatformWindowSurface",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		voidptr.IN("native_window", ""),
		nullable _ noneTerminated _ const _ EGLAttrib_p.IN("attrib_list", "")
	)

	EGLSurface(
		"CreatePlatformPixmapSurface",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLConfig.IN("config", ""),
		voidptr.IN("native_pixmap", ""),
		nullable _ noneTerminated _ const _ EGLAttrib_p.IN("attrib_list", "")
	)

	EGLBoolean(
		"WaitSync",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLSync.IN("sync", ""),
		EGLint.IN("flags", "")
	)
}