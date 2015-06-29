/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_ARB_pbuffer = "WGLARBPbuffer".nativeClassWGL("WGL_ARB_pbuffer", ARB) {
	nativeImport (
		"OpenGL.h",
		"WGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "wgl_pbuffer")} extension.

		This extension defines pixel buffers (pbuffer for short). Pbuffers are additional non-visible rendering buffers for an OpenGL renderer. Pbuffers are
		equivalent to a window that has the same pixel format descriptor with the following exceptions:
		${ol(
			"There is no rendering to a pbuffer by GDI.",
			"The pixel format descriptors used for a pbuffer can only be those that are supported by the ICD.  Generic formats are not valid.",
			"The allocation of a pbuffer can fail if there are insufficient resources (i.e., all the pbuffer memory has been allocated).",
			"""
		The pixel buffer might be lost if a display mode change occurs. A query is provided that can be called after a display mode change to determine the
		state of the pixel buffer.
		"""
		)}
		The intent of the pbuffer semantics is to enable implementations to allocate pbuffers in non-visible frame buffer memory. These pbuffers are intended to
		be "static" resources in that a program will typically allocate them only once rather than as a part of its rendering loop.  (Pbuffers should be
		deallocated when the program is no longer using them -- for example, if the program is iconified.)

		The frame buffer resources that are associated with a pbuffer are also static and are deallocated when the pbuffer is destroyed or possibly when a
		display mode change occurs.

		Requires ${WGL_ARB_extensions_string.link} and ${WGL_ARB_pixel_format.link}.
		"""

	val wglGetPixelFormatAttribiARB = "WGLARBPixelFormat#GetPixelFormatAttribiARB()"

	HPBUFFERARB(
		"CreatePbufferARB",
		"""
		Creates a pixel buffer (pbuffer) and returns a handle to it.

		Support for pbuffers may be restricted to specific pixel formats. Use $wglGetPixelFormatAttribiARB to query the #DRAW_TO_PBUFFER_ARB
		attribute to determine which pixel formats support the creation of pbuffers.
		""",

		HDC.IN("hdc", "a device context for the device on which the pbuffer is created"),
		int.IN("pixelFormat", "a non-generic pixel format descriptor index"),
		int.IN("width", "the pixel width of the rectangular pbuffer"),
		int.IN("height", "the pixel height of the rectangular pbuffer"),
		const _ nullTerminated _ nullable _ int_p.IN(
			"attribList",
			"a 0-terminated list of attributes {type, value} pairs containing integer attribute values"
		)
	)

	HDC(
		"GetPbufferDCARB",
		"Creates a device context for the pbuffer.",

		HPBUFFERARB.IN("pbuffer", "a pbuffer handle returned from a previous call to #CreatePbufferARB()")
	)

	int(
		"ReleasePbufferDCARB",
		"Releases a device context obtained from a previous call to #GetPbufferDCARB().",

		HPBUFFERARB.IN("pbuffer", "a pbuffer handle"),
		HDC.IN("hdc", "a device context handle")
	)

	BOOL(
		"DestroyPbufferARB",
		"""
		Destroys a pbuffer.

		The pbuffer is destroyed once it is no longer current to any rendering context.  When a pbuffer is destroyed, any memory resources that are attached to
		it are freed and its handle is no longer valid.
		""",

		HPBUFFERARB.IN("pbuffer", "a pbuffer handle")
	)

	BOOL(
		"QueryPbufferARB",
		"Queries an attribute associated with a specific pbuffer.",

		HPBUFFERARB.IN("pbuffer", "a pbuffer handle"),
		int.IN("attribute", "the attribute to query", "#PBUFFER_WIDTH_ARB #PBUFFER_HEIGHT_ARB #PBUFFER_LOST_ARB"),
		Check(1) _ int_p.IN("value", "the attribute value")
	)

	IntConstant(
		"""
		Accepted by the {@code attribIList} parameter of WGLARBPixelFormat#ChoosePixelFormatARB() and the {@code attributes} parameter of
		$wglGetPixelFormatAttribiARB.
		""",

		"DRAW_TO_PBUFFER_ARB" _ 0x202D
	)

	IntConstant(
		"Accepted by the {@code attributes} parameter of $wglGetPixelFormatAttribiARB.",

		"MAX_PBUFFER_PIXELS_ARB" _ 0x202E,
		"MAX_PBUFFER_WIDTH_ARB" _ 0x202F,
		"MAX_PBUFFER_HEIGHT_ARB" _ 0x2030
	)

	IntConstant(
		"Accepted by the {@code attribList} parameter of #CreatePbufferARB().",

		"PBUFFER_LARGEST_ARB" _ 0x2033
	)

	IntConstant(
		"Accepted by the {@code attribute} parameter of #QueryPbufferARB().",

		"PBUFFER_WIDTH_ARB" _ 0x2034,
		"PBUFFER_HEIGHT_ARB" _ 0x2035,
		"PBUFFER_LOST_ARB" _ 0x2036
	)

}