/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun GLX_EXT_swap_control_tear() = "GLXEXTSwapControlTear".nativeClassGLX("GLX_EXT_swap_control_tear", EXT) {
	javaImport("org.lwjgl.linux.system")

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/glx_swap_control_tear.txt", templateName)} extension.

		This extension extends the existing GLX_EXT_swap_control extension by allowing a negative {@code interval} parameter to
		{@link GLXEXTSwapControl#glXSwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
		reduces the visual stutter on late frames and reduces the stall on subsequent frames.
		"""
	)

	IntConstant.block(
		"Accepted by {@link GLX13#glXQueryDrawable}:",

		"LATE_SWAPS_TEAR_EXT" _ 0x20F3
	)

}