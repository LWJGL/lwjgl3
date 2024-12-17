/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val KHR_robustness = "KHRRobustness".nativeClassGLES("KHR_robustness", postfix = KHR) {
    IntConstant(
        "GUILTY_CONTEXT_RESET_KHR"..0x8253,
        "INNOCENT_CONTEXT_RESET_KHR"..0x8254,
        "UNKNOWN_CONTEXT_RESET_KHR"..0x8255
    )

    IntConstant(
        "CONTEXT_ROBUST_ACCESS_KHR"..0x90F3,
        "RESET_NOTIFICATION_STRATEGY_KHR"..0x8256
    )

    IntConstant(
        "LOSE_CONTEXT_ON_RESET_KHR"..0x8252,
        "NO_RESET_NOTIFICATION_KHR"..0x8261
    )

    IntConstant(
        "CONTEXT_LOST_KHR"..0x0507
    )

    GLenum(
        "GetGraphicsResetStatusKHR",
        void()
    )

    void(
        "ReadnPixelsKHR",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        AutoSize("pixels")..GLsizei("bufSize"),
        RawPointer..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..void.p("pixels")
    )

    void(
        "GetnUniformfvKHR",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    void(
        "GetnUniformivKHR",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    void(
        "GetnUniformuivKHR",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )
}