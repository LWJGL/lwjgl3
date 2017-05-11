/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_swap_control_tear = "GLXEXTSwapControlTear".nativeClassGLX("GLX_EXT_swap_control_tear", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "glx_swap_control_tear")} extension.

        This extension extends the existing GLX_EXT_swap_control extension by allowing a negative {@code interval} parameter to
        GLXEXTSwapControl#glXSwapIntervalEXT(). The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
        reduces the visual stutter on late frames and reduces the stall on subsequent frames.

        Requires ${GLX_EXT_swap_control.link}.
        """

    IntConstant(
        "Accepted by #QueryDrawable().",

        "LATE_SWAPS_TEAR_EXT"..0x20F3
    )

}