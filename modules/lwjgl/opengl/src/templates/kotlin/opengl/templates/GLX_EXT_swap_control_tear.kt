/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_swap_control_tear = "GLXEXTSwapControlTear".nativeClassGLX("GLX_EXT_swap_control_tear", EXT) {
    IntConstant(
        "LATE_SWAPS_TEAR_EXT"..0x20F3
    )

}