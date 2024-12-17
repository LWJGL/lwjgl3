/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_packed_depth_stencil = "NVPackedDepthStencil".nativeClassGL("NV_packed_depth_stencil", postfix = NV) {
    IntConstant(
        "DEPTH_STENCIL_NV"..0x84F9
    )

    IntConstant(
        "UNSIGNED_INT_24_8_NV"..0x84FA
    )
}