/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_EXT_swap_control = "GLXEXTSwapControl".nativeClassGLX("GLX_EXT_swap_control", EXT) {
	javaImport("org.lwjgl.system.linux.*")

	nativeImport (
		"<GL/glx.h>"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "swap_control")} extension.

		This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods, for a particular drawable.
		It also allows an application to query the swap interval and the implementation-dependent maximum swap interval of a drawable.
		"""

	GLvoid(
		"SwapIntervalEXT",
		"""
		Specifies the minimum number of video frame periods per buffer swap for a particular GLX drawable (e.g. a value of two means that the color buffers will
		be swapped at most every other video frame). The interval takes effect when GLX#SwapBuffers() is first called on the drawable subsequent to the
		{@code glXSwapIntervalEXT} call.
		""",

		DISPLAY,
		GLXDrawable.IN("drawable", "the drawable"),
		int.IN("interval", "the swap interval")
	)
}