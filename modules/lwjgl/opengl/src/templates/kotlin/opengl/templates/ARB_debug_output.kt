/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_debug_output = "ARBDebugOutput".nativeClassGL("ARB_debug_output", postfix = ARB) {
    IntConstant(
        "DEBUG_OUTPUT_SYNCHRONOUS_ARB"..0x8242
    )

    IntConstant(
        "MAX_DEBUG_MESSAGE_LENGTH_ARB"..0x9143,
        "MAX_DEBUG_LOGGED_MESSAGES_ARB"..0x9144,
        "DEBUG_LOGGED_MESSAGES_ARB"..0x9145,
        "DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB"..0x8243
    )

    IntConstant(
        "DEBUG_CALLBACK_FUNCTION_ARB"..0x8244,
        "DEBUG_CALLBACK_USER_PARAM_ARB"..0x8245
    )

    IntConstant(
        "DEBUG_SOURCE_API_ARB"..0x8246,
        "DEBUG_SOURCE_WINDOW_SYSTEM_ARB"..0x8247,
        "DEBUG_SOURCE_SHADER_COMPILER_ARB"..0x8248,
        "DEBUG_SOURCE_THIRD_PARTY_ARB"..0x8249,
        "DEBUG_SOURCE_APPLICATION_ARB"..0x824A,
        "DEBUG_SOURCE_OTHER_ARB"..0x824B
    )

    IntConstant(
        "DEBUG_TYPE_ERROR_ARB"..0x824C,
        "DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB"..0x824D,
        "DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB"..0x824E,
        "DEBUG_TYPE_PORTABILITY_ARB"..0x824F,
        "DEBUG_TYPE_PERFORMANCE_ARB"..0x8250,
        "DEBUG_TYPE_OTHER_ARB"..0x8251
    )

    IntConstant(
        "DEBUG_SEVERITY_HIGH_ARB"..0x9146,
        "DEBUG_SEVERITY_MEDIUM_ARB"..0x9147,
        "DEBUG_SEVERITY_LOW_ARB"..0x9148
    )

    void(
        "DebugMessageControlARB",

        GLenum("source"),
        GLenum("type"),
        GLenum("severity"),
        AutoSize("ids")..GLsizei("count"),
        SingleValue("id")..nullable..GLuint.const.p("ids"),
        GLboolean("enabled")
    )

    void(
        "DebugMessageInsertARB",

        GLenum("source"),
        GLenum("type"),
        GLuint("id"),
        GLenum("severity"),
        AutoSize("buf")..GLsizei("length"),
        GLcharUTF8.const.p("buf")
    )

    void(
        "DebugMessageCallbackARB",

        nullable..GLDEBUGPROCARB("callback"),
        nullable..opaque_const_p("userParam")
    )

    GLuint(
        "GetDebugMessageLogARB",

        GLuint("count"),
        AutoSize("messageLog")..GLsizei("bufSize"),
        Check("count")..nullable..GLenum.p("sources"),
        Check("count")..nullable..GLenum.p("types"),
        Check("count")..nullable..GLuint.p("ids"),
        Check("count")..nullable..GLenum.p("severities"),
        Check("count")..nullable..GLsizei.p("lengths"),
        nullable..GLcharUTF8.p("messageLog")
    )
}