/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_EXT_swap_control = "GLXEXTSwapControl".nativeClassGLX("GLX_EXT_swap_control", EXT) {
    documentation =
        """
        Native bindings to the ${registryLink("EXT", "swap_control")} extension.

        This extension allows an application to specify a minimum periodicity of color buffer swaps, measured in video frame periods, for a particular drawable.
        It also allows an application to query the swap interval and the implementation-dependent maximum swap interval of a drawable.
        """

    IntConstant(
        "The current swap interval and implementation-dependent max swap interval for a particular drawable.",

        "SWAP_INTERVAL_EXT"..0x20F1,
        "MAX_SWAP_INTERVAL_EXT"..0x20F2
    )

    void(
        "SwapIntervalEXT",
        """
        Specifies the minimum number of video frame periods per buffer swap for a particular GLX drawable (e.g. a value of two means that the color buffers will
        be swapped at most every other video frame). The interval takes effect when #SwapBuffers() is first called on the drawable subsequent to the
        {@code glXSwapIntervalEXT} call.
        """,

        DISPLAY,
        GLXDrawable.IN("drawable", "the drawable"),
        int.IN("interval", "the swap interval")
    )
}