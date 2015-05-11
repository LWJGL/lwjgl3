/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_EXT_swap_control = "WGLEXTSwapControl".nativeClassWGL("WGL_EXT_swap_control", EXT) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "wgl_swap_control")} extension.

		This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods.

		Requires ${WGL_EXT_extensions_string.link}.
		"""

	BOOL(
		"SwapIntervalEXT",
		"""
		Specifies the minimum number of video frame periods per buffer swap for the window associated with the current context. The interval takes effect when
		org.lwjgl.system.windows.WinGDI##SwapBuffers() or wglSwapLayerBuffer is first called subsequent to the {@code wglSwapIntervalEXT} call.

		A video frame period is the time required by the monitor to display a full frame of video data.  In the case of an interlaced monitor, this is typically
		the time required to display both the even and odd fields of a frame of video data.  An interval set to a value of 2 means that the color buffers will
		be swapped at most every other video frame.

		If {@code interval} is set to a value of 0, buffer swaps are not synchronized to a video frame.  The {@code interval} value is silently clamped to the
		maximum implementation-dependent value supported before being stored.

		The swap interval is not part of the render context state. It cannot be pushed or popped. The default swap interval is 1.
		""",

		int.IN("interval", "the minimum number of video frames that are displayed before a buffer swap will occur")
	)

	int("GetSwapIntervalEXT", "Returns the current swap interval for the window associated with the current context.")
}