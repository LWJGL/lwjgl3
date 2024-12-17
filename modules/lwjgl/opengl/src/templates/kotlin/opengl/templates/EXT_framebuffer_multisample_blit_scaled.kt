/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_framebuffer_multisample_blit_scaled = "EXTFramebufferMultisampleBlitScaled".nativeClassGL("EXT_framebuffer_multisample_blit_scaled", postfix = EXT) {
    IntConstant(
        "SCALED_RESOLVE_FASTEST_EXT"..0x90BA,
        "SCALED_RESOLVE_NICEST_EXT"..0x90BB
    )
}