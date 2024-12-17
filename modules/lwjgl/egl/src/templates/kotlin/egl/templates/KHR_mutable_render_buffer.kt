/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_mutable_render_buffer = "KHRMutableRenderBuffer".nativeClassEGL("KHR_mutable_render_buffer", postfix = KHR) {
    IntConstant(
        "MUTABLE_RENDER_BUFFER_BIT_KHR"..0x00001000
    )
}