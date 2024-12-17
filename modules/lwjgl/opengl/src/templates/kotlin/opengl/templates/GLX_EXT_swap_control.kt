/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_EXT_swap_control = "GLXEXTSwapControl".nativeClassGLX("GLX_EXT_swap_control", EXT) {
    IntConstant(
        "SWAP_INTERVAL_EXT"..0x20F1,
        "MAX_SWAP_INTERVAL_EXT"..0x20F2
    )

    void(
        "SwapIntervalEXT",

        DISPLAY,
        GLXDrawable("drawable"),
        int("interval")
    )
}