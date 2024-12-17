/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_transform_feedback2 = "NVTransformFeedback2".nativeClassGL("NV_transform_feedback2", postfix = NV) {
    IntConstant(
        "TRANSFORM_FEEDBACK_NV"..0x8E22
    )

    IntConstant(
        "TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV"..0x8E23,
        "TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV"..0x8E24,
        "TRANSFORM_FEEDBACK_BINDING_NV"..0x8E25
    )

    void(
        "BindTransformFeedbackNV",

        GLenum("target"),
        GLuint("id")
    )

    void(
        "DeleteTransformFeedbacksNV",

        AutoSize("ids")..GLsizei("n"),
        SingleValue("id")..GLuint.const.p("ids")
    )

    void(
        "GenTransformFeedbacksNV",

        AutoSize("ids")..GLsizei("n"),
        Check(1)..ReturnParam..GLuint.p("ids")
    )

    GLboolean(
        "IsTransformFeedbackNV",

        GLuint("id")
    )

    void("PauseTransformFeedbackNV")

    void("ResumeTransformFeedbackNV")

    void(
        "DrawTransformFeedbackNV",

        GLenum("mode"),
        GLuint("id")
    )
}