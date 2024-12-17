/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val KHR_debug = "KHRDebug".nativeClassGLES("KHR_debug", postfix = KHR) {
    IntConstant(
        "DEBUG_OUTPUT_KHR"..0x92E0,
        "DEBUG_OUTPUT_SYNCHRONOUS_KHR"..0x8242
    )

    IntConstant(
        "CONTEXT_FLAG_DEBUG_BIT_KHR"..0x00000002
    )

    IntConstant(
        "MAX_DEBUG_MESSAGE_LENGTH_KHR"..0x9143,
        "MAX_DEBUG_LOGGED_MESSAGES_KHR"..0x9144,
        "DEBUG_LOGGED_MESSAGES_KHR"..0x9145,
        "DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR"..0x8243,
        "MAX_DEBUG_GROUP_STACK_DEPTH_KHR"..0x826C,
        "DEBUG_GROUP_STACK_DEPTH_KHR"..0x826D,
        "MAX_LABEL_LENGTH_KHR"..0x82E8
    )

    IntConstant(
        "DEBUG_CALLBACK_FUNCTION_KHR"..0x8244,
        "DEBUG_CALLBACK_USER_PARAM_KHR"..0x8245
    )

    IntConstant(
        "DEBUG_SOURCE_API_KHR"..0x8246,
        "DEBUG_SOURCE_WINDOW_SYSTEM_KHR"..0x8247,
        "DEBUG_SOURCE_SHADER_COMPILER_KHR"..0x8248,
        "DEBUG_SOURCE_THIRD_PARTY_KHR"..0x8249,
        "DEBUG_SOURCE_APPLICATION_KHR"..0x824A,
        "DEBUG_SOURCE_OTHER_KHR"..0x824B
    )

    IntConstant(
        "DEBUG_TYPE_ERROR_KHR"..0x824C,
        "DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR"..0x824D,
        "DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR"..0x824E,
        "DEBUG_TYPE_PORTABILITY_KHR"..0x824F,
        "DEBUG_TYPE_PERFORMANCE_KHR"..0x8250,
        "DEBUG_TYPE_OTHER_KHR"..0x8251,
        "DEBUG_TYPE_MARKER_KHR"..0x8268
    )

    IntConstant(
        "DEBUG_TYPE_PUSH_GROUP_KHR"..0x8269,
        "DEBUG_TYPE_POP_GROUP_KHR"..0x826A
    )

    IntConstant(
        "DEBUG_SEVERITY_HIGH_KHR"..0x9146,
        "DEBUG_SEVERITY_MEDIUM_KHR"..0x9147,
        "DEBUG_SEVERITY_LOW_KHR"..0x9148,
        "DEBUG_SEVERITY_NOTIFICATION_KHR"..0x826B
    )

    IntConstant(
        "STACK_UNDERFLOW_KHR"..0x0504,
        "STACK_OVERFLOW_KHR"..0x0503
    )

    IntConstant(
        "BUFFER_KHR"..0x82E0,
        "SHADER_KHR"..0x82E1,
        "PROGRAM_KHR"..0x82E2,
        "QUERY_KHR"..0x82E3,
        "PROGRAM_PIPELINE_KHR"..0x82E4,
        "SAMPLER_KHR"..0x82E6
    )

    void(
        "DebugMessageControlKHR",

        GLenum("source"),
        GLenum("type"),
        GLenum("severity"),
        AutoSize("ids")..GLsizei("count"),
        SingleValue("id")..nullable..GLuint.const.p("ids"),
        GLboolean("enabled")
    )

    void(
        "DebugMessageInsertKHR",

        GLenum("source"),
        GLenum("type"),
        GLuint("id"),
        GLenum("severity"),
        AutoSize("message")..GLsizei("length"),
        GLcharUTF8.const.p("message")
    )

    void(
        "DebugMessageCallbackKHR",

        nullable..GLDEBUGPROCKHR("callback"),
        nullable..opaque_const_p("userParam")
    )

    GLuint(
        "GetDebugMessageLogKHR",

        GLuint("count"),
        AutoSize("messageLog")..GLsizei("bufsize"),
        Check("count")..nullable..GLenum.p("sources"),
        Check("count")..nullable..GLenum.p("types"),
        Check("count")..nullable..GLuint.p("ids"),
        Check("count")..nullable..GLenum.p("severities"),
        Check("count")..nullable..GLsizei.p("lengths"),
        nullable..GLcharUTF8.p("messageLog")
    )

    void(
        "GetPointervKHR",

        GLenum("pname"),
        ReturnParam..Check(1)..void.p.p("params")
    )

    void(
        "PushDebugGroupKHR",

        GLenum("source"),
        GLuint("id"),
        AutoSize("message")..GLsizei("length"),
        GLcharUTF8.const.p("message")
    )

    void("PopDebugGroupKHR")

    void(
        "ObjectLabelKHR",

        GLenum("identifier"),
        GLuint("name"),
        AutoSize("label")..GLsizei("length"),
        GLcharUTF8.const.p("label")
    )

    void(
        "GetObjectLabelKHR",

        GLenum("identifier"),
        GLuint("name"),
        AutoSize("label")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return("length", "GLES20.glGetInteger(GL_MAX_LABEL_LENGTH_KHR)")..GLcharUTF8.p("label")
    )

    void(
        "ObjectPtrLabelKHR",

        opaque_p("ptr"),
        AutoSize("label")..GLsizei("length"),
        GLcharUTF8.const.p("label")
    )

    void(
        "GetObjectPtrLabelKHR",

        opaque_p("ptr"),
        AutoSize("label")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        Return("length", "GLES20.glGetInteger(GL_MAX_LABEL_LENGTH_KHR)")..GLcharUTF8.p("label")
    )
}