/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL11 = "AL11".nativeClassAL("AL11") {
    extends = AL10
    IntConstant(
        "SEC_OFFSET"..0x1024,
        "SAMPLE_OFFSET"..0x1025,
        "BYTE_OFFSET"..0x1026,
        "STATIC"..0x1028,
        "STREAMING"..0x1029,
        "UNDETERMINED"..0x1030,
        "ILLEGAL_COMMAND"..0xA004,
        "SPEED_OF_SOUND"..0xC003,
        "LINEAR_DISTANCE"..0xD003,
        "LINEAR_DISTANCE_CLAMPED"..0xD004,
        "EXPONENT_DISTANCE"..0xD005,
        "EXPONENT_DISTANCE_CLAMPED"..0xD006
    )

    ALvoid(
        "Listener3i",

        ALenum("paramName"),
        ALint("value1"),
        ALint("value2"),
        ALint("value3")
    ).directContext()

    ALvoid(
        "GetListener3i",

        ALenum("param"),
        Check(1)..ALint.p("value1"),
        Check(1)..ALint.p("value2"),
        Check(1)..ALint.p("value3")
    ).directContext()

    ALvoid(
        "GetListeneriv",

        ALenum("param"),
        Check(1)..ALint.p("values")
    ).directContext()

    ALvoid(
        "Source3i",

        ALuint("source"),
        ALenum("paramName"),
        ALint("value1"),
        ALint("value2"),
        ALint("value3")
    ).directContext()

    ALvoid(
        "GetSource3i",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALint.p("value1"),
        Check(1)..ALint.p("value2"),
        Check(1)..ALint.p("value3")
    ).directContext()

    ALvoid(
        "Listeneriv",

        ALenum("listener"),
        Check(1)..ALint.const.p("value")
    ).directContext()

    ALvoid(
        "Sourceiv",

        ALuint("source"),
        ALenum("paramName"),
        Check(1)..ALint.const.p("value")
    ).directContext()

    ALvoid(
        "Bufferf",

        ALuint("buffer"),
        ALenum("paramName"),
        ALfloat("value")
    ).directContext()

    ALvoid(
        "Buffer3f",

        ALuint("buffer"),
        ALenum("paramName"),
        ALfloat("value1"),
        ALfloat("value2"),
        ALfloat("value3")
    ).directContext()

    ALvoid(
        "Bufferfv",

        ALuint("buffer"),
        ALenum("paramName"),
        Check(1)..ALfloat.const.p("value")
    ).directContext()

    ALvoid(
        "Bufferi",

        ALuint("buffer"),
        ALenum("paramName"),
        ALint("value")
    ).directContext()

    ALvoid(
        "Buffer3i",

        ALuint("buffer"),
        ALenum("paramName"),
        ALint("value1"),
        ALint("value2"),
        ALint("value3")
    ).directContext()

    ALvoid(
        "Bufferiv",

        ALuint("buffer"),
        ALenum("paramName"),
        Check(1)..ALint.const.p("value")
    ).directContext()

    ALvoid(
        "GetBuffer3i",

        ALuint("buffer"),
        ALenum("param"),
        Check(1)..ALint.p("value1"),
        Check(1)..ALint.p("value2"),
        Check(1)..ALint.p("value3")
    ).directContext()

    ALvoid(
        "GetBufferiv",

        ALuint("buffer"),
        ALenum("param"),
        Check(1)..ALint.p("values")
    ).directContext()

    ALvoid(
        "GetBuffer3f",

        ALuint("buffer"),
        ALenum("param"),
        Check(1)..ALfloat.p("value1"),
        Check(1)..ALfloat.p("value2"),
        Check(1)..ALfloat.p("value3")
    ).directContext()

    ALvoid(
        "GetBufferfv",

        ALuint("buffer"),
        ALenum("param"),
        Check(1)..ALfloat.p("values")
    ).directContext()

    ALvoid(
        "SpeedOfSound",

        ALfloat("value")
    ).directContext()
}
