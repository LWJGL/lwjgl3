/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_tiled_rendering = "QCOMTiledRendering".nativeClassGLES("QCOM_tiled_rendering", postfix = QCOM) {
    IntConstant(
        "COLOR_BUFFER_BIT0_QCOM"..0x00000001,
        "COLOR_BUFFER_BIT1_QCOM"..0x00000002,
        "COLOR_BUFFER_BIT2_QCOM"..0x00000004,
        "COLOR_BUFFER_BIT3_QCOM"..0x00000008,
        "COLOR_BUFFER_BIT4_QCOM"..0x00000010,
        "COLOR_BUFFER_BIT5_QCOM"..0x00000020,
        "COLOR_BUFFER_BIT6_QCOM"..0x00000040,
        "COLOR_BUFFER_BIT7_QCOM"..0x00000080,
        "DEPTH_BUFFER_BIT0_QCOM"..0x00000100,
        "DEPTH_BUFFER_BIT1_QCOM"..0x00000200,
        "DEPTH_BUFFER_BIT2_QCOM"..0x00000400,
        "DEPTH_BUFFER_BIT3_QCOM"..0x00000800,
        "DEPTH_BUFFER_BIT4_QCOM"..0x00001000,
        "DEPTH_BUFFER_BIT5_QCOM"..0x00002000,
        "DEPTH_BUFFER_BIT6_QCOM"..0x00004000,
        "DEPTH_BUFFER_BIT7_QCOM"..0x00008000,
        "STENCIL_BUFFER_BIT0_QCOM"..0x00010000,
        "STENCIL_BUFFER_BIT1_QCOM"..0x00020000,
        "STENCIL_BUFFER_BIT2_QCOM"..0x00040000,
        "STENCIL_BUFFER_BIT3_QCOM"..0x00080000,
        "STENCIL_BUFFER_BIT4_QCOM"..0x00100000,
        "STENCIL_BUFFER_BIT5_QCOM"..0x00200000,
        "STENCIL_BUFFER_BIT6_QCOM"..0x00400000,
        "STENCIL_BUFFER_BIT7_QCOM"..0x00800000,
        "MULTISAMPLE_BUFFER_BIT0_QCOM"..0x01000000,
        "MULTISAMPLE_BUFFER_BIT1_QCOM"..0x02000000,
        "MULTISAMPLE_BUFFER_BIT2_QCOM"..0x04000000,
        "MULTISAMPLE_BUFFER_BIT3_QCOM"..0x08000000,
        "MULTISAMPLE_BUFFER_BIT4_QCOM"..0x10000000,
        "MULTISAMPLE_BUFFER_BIT5_QCOM"..0x20000000,
        "MULTISAMPLE_BUFFER_BIT6_QCOM"..0x40000000,
        "MULTISAMPLE_BUFFER_BIT7_QCOM".."0x80000000"
    )

    void(
        "StartTilingQCOM",

        GLuint("x"),
        GLuint("y"),
        GLuint("width"),
        GLuint("height"),
        GLbitfield("preserveMask")
    )

    void(
        "EndTilingQCOM",

        GLbitfield("preserveMask")
    )
}