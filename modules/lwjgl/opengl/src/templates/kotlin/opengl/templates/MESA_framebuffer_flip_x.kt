/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val MESA_framebuffer_flip_x = "MESAFramebufferFlipX".nativeClassGL("MESA_framebuffer_flip_x", postfix = MESA) {
    IntConstant(
        "FRAMEBUFFER_FLIP_X_MESA"..0x8BBC
    )
}