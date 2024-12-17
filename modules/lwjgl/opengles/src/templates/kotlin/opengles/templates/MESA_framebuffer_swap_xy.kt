/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val MESA_framebuffer_swap_xy = "MESAFramebufferSwapXY".nativeClassGLES("MESA_framebuffer_swap_xy", postfix = MESA) {
    IntConstant(
        "FRAMEBUFFER_SWAP_XY_MESA"..0x8BBD
    )
}