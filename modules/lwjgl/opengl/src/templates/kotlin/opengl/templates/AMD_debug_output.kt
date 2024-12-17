/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_debug_output = "AMDDebugOutput".nativeClassGL("AMD_debug_output", postfix = AMD) {
    IntConstant(
        "MAX_DEBUG_MESSAGE_LENGTH_AMD"..0x9143,
        "MAX_DEBUG_LOGGED_MESSAGES_AMD"..0x9144,
        "DEBUG_LOGGED_MESSAGES_AMD"..0x9145
    )

    IntConstant(
        "DEBUG_SEVERITY_HIGH_AMD"..0x9146,
        "DEBUG_SEVERITY_MEDIUM_AMD"..0x9147,
        "DEBUG_SEVERITY_LOW_AMD"..0x9148
    )

    IntConstant(
        "DEBUG_CATEGORY_API_ERROR_AMD"..0x9149,
        "DEBUG_CATEGORY_WINDOW_SYSTEM_AMD"..0x914A,
        "DEBUG_CATEGORY_DEPRECATION_AMD"..0x914B,
        "DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD"..0x914C,
        "DEBUG_CATEGORY_PERFORMANCE_AMD"..0x914D,
        "DEBUG_CATEGORY_SHADER_COMPILER_AMD"..0x914E,
        "DEBUG_CATEGORY_APPLICATION_AMD"..0x914F,
        "DEBUG_CATEGORY_OTHER_AMD"..0x9150
    )

    void(
        "DebugMessageEnableAMD",

        GLenum("category"),
        GLenum("severity"),
        AutoSize("ids")..GLsizei("count"),
        SingleValue("id")..nullable..GLuint.const.p("ids"),
        GLboolean("enabled")
    )

    void(
        "DebugMessageInsertAMD",

        GLenum("category"),
        GLenum("severity"),
        GLuint("id"),
        AutoSize("buf")..GLsizei("length"),
        GLcharUTF8.const.p("buf")
    )

    void(
        "DebugMessageCallbackAMD",

        nullable..GLDEBUGPROCAMD("callback"),
        nullable..opaque_p("userParam")
    )

    GLuint(
        "GetDebugMessageLogAMD",

        GLuint("count"),
        AutoSize("messageLog")..GLsizei("bufsize"),
        Check("count")..nullable..GLenum.p("categories"),
        Check("count")..nullable..GLenum.p("severities"),
        Check("count")..nullable..GLuint.p("ids"),
        Check("count")..nullable..GLsizei.p("lengths"),
        nullable..GLcharUTF8.p("messageLog")
    )
}