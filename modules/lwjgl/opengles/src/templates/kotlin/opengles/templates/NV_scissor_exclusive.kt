/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_scissor_exclusive = "NVScissorExclusive".nativeClassGLES("NV_scissor_exclusive", postfix = NV) {
    IntConstant(
        "SCISSOR_TEST_EXCLUSIVE_NV"..0x9555
    )

    IntConstant(
        "SCISSOR_BOX_EXCLUSIVE_NV"..0x9556
    )

    void(
        "ScissorExclusiveArrayvNV",

        GLuint("first"),
        AutoSize(4, "v")..GLsizei("count"),
        GLint.const.p("v")
    )

    void(
        "ScissorExclusiveNV",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height")
    )
}