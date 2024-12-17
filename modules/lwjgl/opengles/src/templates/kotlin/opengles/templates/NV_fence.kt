/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_fence = "NVFence".nativeClassGLES("NV_fence", postfix = NV) {
    IntConstant(
        "ALL_COMPLETED_NV"..0x84F2
    )

    IntConstant(
        "FENCE_STATUS_NV"..0x84F3,
        "FENCE_CONDITION_NV"..0x84F4
    )

    void(
        "DeleteFencesNV",

        AutoSize("fences")..GLsizei("n"),
        SingleValue("fence")..GLuint.const.p("fences")
    )

    void(
        "GenFencesNV",

        AutoSize("fences")..GLsizei("n"),
        ReturnParam..GLuint.p("fences")
    )

    GLboolean(
        "IsFenceNV",

        GLuint("fence")
    )

    GLboolean(
        "TestFenceNV",

        GLuint("fence")
    )

    void(
        "GetFenceivNV",

        GLuint("fence"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "FinishFenceNV",

        GLuint("fence")
    )

    void(
        "SetFenceNV",

        GLuint("fence"),
        GLenum("condition")
    )
}