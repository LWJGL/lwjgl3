/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_color_buffer_float = "ARBColorBufferFloat".nativeClassGL("ARB_color_buffer_float", postfix = ARB) {
    IntConstant(
        "RGBA_FLOAT_MODE_ARB"..0x8820
    )

    IntConstant(
        "CLAMP_VERTEX_COLOR_ARB"..0x891A,
        "CLAMP_FRAGMENT_COLOR_ARB"..0x891B,
        "CLAMP_READ_COLOR_ARB"..0x891C
    )

    IntConstant(
        "FIXED_ONLY_ARB"..0x891D
    )

    void(
        "ClampColorARB",

        GLenum("target"),
        GLenum("clamp")
    )
}