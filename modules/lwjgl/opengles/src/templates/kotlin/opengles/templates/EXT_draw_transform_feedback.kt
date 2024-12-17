/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_draw_transform_feedback = "EXTDrawTransformFeedback".nativeClassGLES("EXT_draw_transform_feedback", postfix = EXT) {
    void(
        "DrawTransformFeedbackEXT",

        GLenum("mode"),
        GLuint("id")
    )

    void(
        "DrawTransformFeedbackInstancedEXT",

        GLenum("mode"),
        GLuint("id"),
        GLsizei("instancecount")
    )
}