/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val MESA_framebuffer_swap_xy = "MESAFramebufferSwapXY".nativeClassGL("MESA_framebuffer_swap_xy", postfix = MESA) {
    IntConstant(
        "FRAMEBUFFER_SWAP_XY_MESA"..0x8BBD
    )
}