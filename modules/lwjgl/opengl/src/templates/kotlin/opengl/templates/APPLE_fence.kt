/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_fence = "APPLEFence".nativeClassGL("APPLE_fence") {
    IntConstant(
        "DRAW_PIXELS_APPLE"..0x8A0A,
        "FENCE_APPLE"..0x8A0B
    )

    void(
        "GenFencesAPPLE",

        AutoSize("fences")..GLsizei("n"),
        ReturnParam..GLuint.p("fences")
    )

    void(
        "DeleteFencesAPPLE",

        AutoSize("fences")..GLsizei("n"),
        SingleValue("fence")..GLuint.const.p("fences")
    )

    void(
        "SetFenceAPPLE",

        GLuint("fence")
    )

    GLboolean(
        "IsFenceAPPLE",

        GLuint("fence")
    )

    GLboolean(
        "TestFenceAPPLE",

        GLuint("fence")
    )

    void(
        "FinishFenceAPPLE",

        GLuint("fence")
    )

    GLboolean(
        "TestObjectAPPLE",

        GLenum("object"),
        GLuint("name")
    )

    void(
        "FinishObjectAPPLE",

        GLenum("object"),
        GLint("name")
    )
}