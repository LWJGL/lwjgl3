/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_robustness = "EXTRobustness".nativeClassGLES("EXT_robustness", postfix = EXT) {
    IntConstant(
        "GUILTY_CONTEXT_RESET_EXT"..0x8253,
        "INNOCENT_CONTEXT_RESET_EXT"..0x8254,
        "UNKNOWN_CONTEXT_RESET_EXT"..0x8255
    )

    IntConstant(
        "CONTEXT_ROBUST_ACCESS_EXT"..0x90F3,
        "RESET_NOTIFICATION_STRATEGY_EXT"..0x8256
    )

    IntConstant(
        "LOSE_CONTEXT_ON_RESET_EXT"..0x8252,
        "NO_RESET_NOTIFICATION_EXT"..0x8261
    )

    GLenum("GetGraphicsResetStatusEXT", void())

    void(
        "ReadnPixelsEXT",

        GLint("x"),
        GLint("y"),
        GLsizei("width"),
        GLsizei("height"),
        GLenum("format"),
        GLenum("type"),
        AutoSize("data")..GLsizei("bufSize"),
        RawPointer..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT
        )..void.p("data")
    )

    void(
        "GetnUniformfvEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLfloat.p("params")
    )

    void(
        "GetnUniformivEXT",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLint.p("params")
    )
}