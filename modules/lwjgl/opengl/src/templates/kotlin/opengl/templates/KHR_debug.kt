/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val KHR_debug = "KHRDebug".nativeClassGL("KHR_debug") {
    IntConstant(
        "DEBUG_OUTPUT"..0x92E0,
        "DEBUG_OUTPUT_SYNCHRONOUS"..0x8242
    )

    IntConstant(
        "CONTEXT_FLAG_DEBUG_BIT"..0x00000002
    )

    IntConstant(
        "MAX_DEBUG_MESSAGE_LENGTH"..0x9143,
        "MAX_DEBUG_LOGGED_MESSAGES"..0x9144,
        "DEBUG_LOGGED_MESSAGES"..0x9145,
        "DEBUG_NEXT_LOGGED_MESSAGE_LENGTH"..0x8243,
        "MAX_DEBUG_GROUP_STACK_DEPTH"..0x826C,
        "DEBUG_GROUP_STACK_DEPTH"..0x826D,
        "MAX_LABEL_LENGTH"..0x82E8
    )

    IntConstant(
        "DEBUG_CALLBACK_FUNCTION"..0x8244,
        "DEBUG_CALLBACK_USER_PARAM"..0x8245
    )

    IntConstant(
        "DEBUG_SOURCE_API"..0x8246,
        "DEBUG_SOURCE_WINDOW_SYSTEM"..0x8247,
        "DEBUG_SOURCE_SHADER_COMPILER"..0x8248,
        "DEBUG_SOURCE_THIRD_PARTY"..0x8249,
        "DEBUG_SOURCE_APPLICATION"..0x824A,
        "DEBUG_SOURCE_OTHER"..0x824B
    )

    IntConstant(
        "DEBUG_TYPE_ERROR"..0x824C,
        "DEBUG_TYPE_DEPRECATED_BEHAVIOR"..0x824D,
        "DEBUG_TYPE_UNDEFINED_BEHAVIOR"..0x824E,
        "DEBUG_TYPE_PORTABILITY"..0x824F,
        "DEBUG_TYPE_PERFORMANCE"..0x8250,
        "DEBUG_TYPE_OTHER"..0x8251,
        "DEBUG_TYPE_MARKER"..0x8268
    )

    IntConstant(
        "DEBUG_TYPE_PUSH_GROUP"..0x8269,
        "DEBUG_TYPE_POP_GROUP"..0x826A
    )

    IntConstant(
        "DEBUG_SEVERITY_HIGH"..0x9146,
        "DEBUG_SEVERITY_MEDIUM"..0x9147,
        "DEBUG_SEVERITY_LOW"..0x9148,
        "DEBUG_SEVERITY_NOTIFICATION"..0x826B
    )

    IntConstant(
        "BUFFER"..0x82E0,
        "SHADER"..0x82E1,
        "PROGRAM"..0x82E2,
        "QUERY"..0x82E3,
        "PROGRAM_PIPELINE"..0x82E4,
        "SAMPLER"..0x82E6,
        "DISPLAY_LIST"..0x82E7
    )

    reuse(GL43C, "DebugMessageControl")
    reuse(GL43C, "DebugMessageInsert")
    reuse(GL43C, "DebugMessageCallback")
    reuse(GL43C, "GetDebugMessageLog")
    reuse(GL43C, "PushDebugGroup")
    reuse(GL43C, "PopDebugGroup")
    reuse(GL43C, "ObjectLabel")
    reuse(GL43C, "GetObjectLabel")
    reuse(GL43C, "ObjectPtrLabel")
    reuse(GL43C, "GetObjectPtrLabel")
}