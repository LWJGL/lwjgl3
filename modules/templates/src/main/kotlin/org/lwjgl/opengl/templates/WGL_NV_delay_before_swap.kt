/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_NV_delay_before_swap = "WGLNVDelayBeforeSwap".nativeClassWGL("WGL_NV_delay_before_swap", NV) {
	nativeImport (
		"OpenGL.h"
	)

	javaImport(
		"org.lwjgl.system.windows.WinBase"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("NV", "wgl_delay_before_swap")} extension.

		For most interactive applications, the standard rendering loop responding to input events on a frame granularity is sufficient. Some more demanding
		applications may want to exchange performance for the ability to sample input closer to the final frame swap and adjust rendering accordingly. This
		extension adds functionality to allow the application to wait until a specified time before a swapbuffers command would be able to execute.

		Requires ${GL21.core}.
		"""

	BOOL(
		"DelayBeforeSwapNV",
		"""
		Blocks the CPU until {@code seconds} seconds before a synchronized swap would occur on the window associated with {@code hDC}. It also returns a boolean
		value equal to WinBase##TRUE when the implementation had to wait for the synchronized swap and WinBase##FALSE otherwise.
  
		The parameter {@code hDC} must be a valid device context associated with a graphic adapter. If {@code hDC} is not valid, WinBase##GetLastError() will
		return WGL_INVALID_HDC, {@code DelayBeforeSwapNV} will return FALSE and will not wait for the swap. If {@code hDC} is not associated with a graphic
		adapter, {@code GetLastError} will return ERROR_DC_NOT_FOUND, {@code DelayBeforeSwapNV} will return FALSE and will not wait for the swap.

		The parameter {@code seconds} accepts positive floating point values not larger than the length in seconds of the swap period on the associated window.
		When buffer swaps are synchronized, the swap period is composed of one or multiple video frame periods. A video frame period is the time required by the
		monitor to display a full frame of video data. A swap interval set to a value of 2 means that the color buffers will be swapped at most every other
		video frame. If {@code seconds} is smaller than 0, {@code GetLastError} will return ERROR_INVALID_DATA, {@code DelayBeforeSwapNV} will return FALSE and
		will not wait for the end of the swap period. If {@code seconds} is greater than a swap period, {@code DelayBeforeSwapNV} will return immediately
		without generating any error and the return value will be FALSE.

		The application should use a {@code seconds} delay large enough to have time to complete its work before the end of the swap period. If {@code seconds}
		is close to 0.0, the application may miss the end of the swap period and it will have to wait an additional swap period before it can swap.
  
		If {@code DelayBeforeSwapNV} detects that there is less than {@code seconds} seconds before the end of the swap period, it will return immediately and
		the return value will be FALSE. The implementation will not wait an additional video frame period to have an exact delay of {@code seconds} seconds.

		If buffer swaps are unsynchronized, {@code DelayBeforeSwapNV} will return immediately and the return value will be FALSE. It could happen for multiple
		reasons, for example if the swap interval is equal to 0, if the window is in a mode switch or if no monitors are active.
		""",

		HDC.IN("hDC", "a handle to the DC"),
		GLfloat.IN("seconds", "the delay, in seconds")
	)
}