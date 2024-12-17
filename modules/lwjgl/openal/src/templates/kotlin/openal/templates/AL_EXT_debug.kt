/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_debug = "EXTDebug".nativeClassAL("EXT_debug", postfix = EXT) {
    IntConstant(
        "ALC_CONTEXT_FLAGS_EXT"..0x19CF
    ).noPrefix()

    IntConstant(
        "ALC_CONTEXT_DEBUG_BIT_EXT"..0x0001
    ).noPrefix()

    IntConstant(
        "CONTEXT_FLAGS_EXT"..0x19CF
    )

    IntConstant(
        "CONTEXT_DEBUG_BIT_EXT"..0x0001
    )

    IntConstant(
        "DEBUG_OUTPUT_EXT"..0x19B2
    )

    IntConstant(
        "DEBUG_CALLBACK_FUNCTION_EXT"..0x19B3,
        "DEBUG_CALLBACK_USER_PARAM_EXT"..0x19B4
    )

    IntConstant(
        "DEBUG_SOURCE_API_EXT"..0x19B5,
        "DEBUG_SOURCE_AUDIO_SYSTEM_EXT"..0x19B6,
        "DEBUG_SOURCE_THIRD_PARTY_EXT"..0x19B7,
        "DEBUG_SOURCE_APPLICATION_EXT"..0x19B8,
        "DEBUG_SOURCE_OTHER_EXT"..0x19B9
    )

    IntConstant(
        "DEBUG_TYPE_ERROR_EXT"..0x19BA,
        "DEBUG_TYPE_DEPRECATED_BEHAVIOR_EXT"..0x19BB,
        "DEBUG_TYPE_UNDEFINED_BEHAVIOR_EXT"..0x19BC,
        "DEBUG_TYPE_PORTABILITY_EXT"..0x19BD,
        "DEBUG_TYPE_PERFORMANCE_EXT"..0x19BE,
        "DEBUG_TYPE_MARKER_EXT"..0x19BF,
        "DEBUG_TYPE_OTHER_EXT"..0x19C2
    )

    IntConstant(
        "DEBUG_TYPE_PUSH_GROUP_EXT"..0x19C0,
        "DEBUG_TYPE_POP_GROUP_EXT"..0x19C1
    )

    IntConstant(
        "DEBUG_SEVERITY_HIGH_EXT"..0x19C3,
        "DEBUG_SEVERITY_MEDIUM_EXT"..0x19C4,
        "DEBUG_SEVERITY_LOW_EXT"..0x19C5,
        "DEBUG_SEVERITY_NOTIFICATION_EXT"..0x19C6
    )

    IntConstant(
        "DONT_CARE_EXT"..0x0002
    )

    IntConstant(
        "DEBUG_LOGGED_MESSAGES_EXT"..0x19C7,
        "DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_EXT"..0x19C8,
        "MAX_DEBUG_MESSAGE_LENGTH_EXT"..0x19C9,
        "MAX_DEBUG_LOGGED_MESSAGES_EXT"..0x19CA,
        "MAX_DEBUG_GROUP_STACK_DEPTH_EXT"..0x19CB,
        "MAX_LABEL_LENGTH_EXT"..0x19CC
    )

    IntConstant(
        "STACK_OVERFLOW_EXT"..0x19CD,
        "STACK_UNDERFLOW_EXT"..0x19CE
    )

    IntConstant(
        "BUFFER_EXT"..0x1009,
        "SOURCE_EXT"..0x19D0
    )

    IntConstant(
        "FILTER_EXT"..0x19D1,
        "EFFECT_EXT"..0x19D2,
        "AUXILIARY_EFFECT_SLOT_EXT"..0x19D3
    )

    ALvoid(
        "DebugMessageCallbackEXT",

        nullable..ALDEBUGPROCEXT("callback"),
        nullable.."ALvoid".opaque.p("userParam")
    ).directContext()

    ALvoid(
        "DebugMessageInsertEXT",

        ALenum("source"),
        ALenum("type"),
        ALuint("id"),
        ALenum("severity"),
        AutoSize("message")..ALsizei("length"),
        ALcharUTF8.const.p("message")
    ).directContext()

    ALvoid(
        "DebugMessageControlEXT",

        ALenum("source"),
        ALenum("type"),
        ALenum("severity"),
        AutoSize("ids")..ALsizei("count"),
        nullable..ALuint.const.p("ids"),
        ALboolean("enable")
    ).directContext()

    ALvoid(
        "PushDebugGroupEXT",

        ALenum("source"),
        ALuint("id"),
        AutoSize("message")..ALsizei("length"),
        ALcharUTF8.const.p("message")
    ).directContext()

    ALvoid("PopDebugGroupEXT").directContext()

    ALuint(
        "GetDebugMessageLogEXT",

        AutoSize(
            "sources",
            "types",
            "ids",
            "severities",
            "lengths"
        )..ALuint("count"),
        AutoSize("logBuf")..ALsizei("logBufSize"),
        nullable..ALenum.p("sources"),
        nullable..ALenum.p("types"),
        nullable..ALuint.p("ids"),
        nullable..ALenum.p("severities"),
        nullable..ALsizei.p("lengths"),
        nullable..ALcharUTF8.p("logBuf")
    ).directContext()

    ALvoid(
        "ObjectLabelEXT",

        ALenum("identifier"),
        ALuint("name"),
        AutoSize("label")..ALsizei("length"),
        ALcharUTF8.const.p("label")
    ).directContext()

    ALvoid(
        "GetObjectLabelEXT",

        ALenum("identifier"),
        ALuint("name"),
        AutoSize("label")..ALsizei("bufSize"),
        Check(1)..ALsizei.p("length"),
        nullable..ALcharUTF8.p("label")
    ).directContext()

    "ALvoid".opaque.p(
        "GetPointerEXT",

        ALenum("pname")
    ).directContext()

    ALvoid(
        "GetPointervEXT",

        ALenum("pname"),
        Check(1)..ALvoid.p.p("values")
    ).directContext()
}