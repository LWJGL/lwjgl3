/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_packed_depth_stencil = "OESPackedDepthStencil".nativeClassGLES("OES_packed_depth_stencil", postfix = OES) {
    IntConstant(
        "DEPTH_STENCIL_OES"..0x84F9
    )

    IntConstant(
        "UNSIGNED_INT_24_8_OES"..0x84FA
    )

    IntConstant(
        "DEPTH24_STENCIL8_OES"..0x88F0
    )
}