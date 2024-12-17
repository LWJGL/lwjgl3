/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_depth_buffer_float = "ARBDepthBufferFloat".nativeClassGL("ARB_depth_buffer_float", postfix = ARB) {
    IntConstant(
        "DEPTH_COMPONENT32F"..0x8CAC,
        "DEPTH32F_STENCIL8"..0x8CAD
    )

    IntConstant(
        "FLOAT_32_UNSIGNED_INT_24_8_REV"..0x8DAD
    )
}