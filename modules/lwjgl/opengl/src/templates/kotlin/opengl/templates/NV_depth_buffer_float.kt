/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_depth_buffer_float = "NVDepthBufferFloat".nativeClassGL("NV_depth_buffer_float", postfix = NV) {
    IntConstant(
        "DEPTH_COMPONENT32F_NV"..0x8DAB,
        "DEPTH32F_STENCIL8_NV"..0x8DAC
    )

    IntConstant(
        "FLOAT_32_UNSIGNED_INT_24_8_REV_NV"..0x8DAD
    )

    IntConstant(
        "DEPTH_BUFFER_FLOAT_MODE_NV"..0x8DAF
    )

    void(
        "DepthRangedNV",

        GLdouble("zNear"),
        GLdouble("zFar")
    )

    void(
        "ClearDepthdNV",

        GLdouble("depth")
    )

    void(
        "DepthBoundsdNV",

        GLdouble("zmin"),
        GLdouble("zmax")
    )
}