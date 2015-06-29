/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_swap_control_tear = "GLXEXTSwapControlTear".nativeClassGLX("GLX_EXT_swap_control_tear", EXT) {
	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "glx_swap_control_tear")} extension.

		This extension extends the existing GLX_EXT_swap_control extension by allowing a negative {@code interval} parameter to
		GLXEXTSwapControl#SwapIntervalEXT(). The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
		reduces the visual stutter on late frames and reduces the stall on subsequent frames.

		Requires ${GLX_EXT_swap_control.link}.
		"""

	IntConstant(
		"Accepted by GLX13#QueryDrawable().",

		"LATE_SWAPS_TEAR_EXT" _ 0x20F3
	)

}