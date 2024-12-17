/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_packed_depth_stencil = "EXTPackedDepthStencil".nativeClassGL("EXT_packed_depth_stencil", postfix = EXT) {
    IntConstant(
        "DEPTH_STENCIL_EXT"..0x84F9
    )

    IntConstant(
        "UNSIGNED_INT_24_8_EXT"..0x84FA
    )

    IntConstant(
        "DEPTH24_STENCIL8_EXT"..0x88F0
    )

    IntConstant(
        "TEXTURE_STENCIL_SIZE_EXT"..0x88F1
    )
}