/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_EXT_swap_control_tear() = "WGLEXTSwapControlTear".nativeClassWGL("WGL_EXT_swap_control_tear", "EXT") {
	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/wgl_swap_control_tear.txt", templateName)} extension.

		This extension extends the existing {@link WGLEXTSwapControl} extension by allowing a negative {@code interval} parameter to
		{@link WGLEXTSwapControl#wglSwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
		reduces the visual stutter on late frames and reduces the stall on subsequent frames.
		"""
	)
}