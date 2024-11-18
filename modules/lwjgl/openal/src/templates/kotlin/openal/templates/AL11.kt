/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL11 = "AL11".nativeClassAL("AL11") {
    extends = AL10
    documentation = "Native bindings to AL 1.1 functionality."

    IntConstant(
        "General tokens.",

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
        "Sets the 3 dimensional integer values of a listener parameter.",

        ALenum("paramName", "the parameter to modify"),
        ALint("value1", "the first value"),
        ALint("value2", "the second value"),
        ALint("value3", "the third value")
    ).directContext()

    ALvoid(
        "GetListener3i",
        "",

        ALenum("param", ""),
        Check(1)..ALint.p("value1", ""),
        Check(1)..ALint.p("value2", ""),
        Check(1)..ALint.p("value3", "")
    ).directContext()

    ALvoid(
        "GetListeneriv",
        "Returns the integer values of the specified listener parameter.",

        ALenum("param", "the parameter to query"),
        Check(1)..ALint.p("values", "the parameter values")
    ).directContext()

    ALvoid(
        "Source3i",
        "Sets the 3 dimensional integer values of a source parameter.",

        ALuint("source", "the source to modify"),
        ALenum("paramName", "the parameter to modify"),
        ALint("value1", "the first value"),
        ALint("value2", "the second value"),
        ALint("value3", "the third value")
    ).directContext()

    ALvoid(
        "GetSource3i",
        "",

        ALuint("source", ""),
        ALenum("param", ""),
        Check(1)..ALint.p("value1", ""),
        Check(1)..ALint.p("value2", ""),
        Check(1)..ALint.p("value3", "")
    ).directContext()

    ALvoid(
        "Listeneriv",
        "Pointer version.",

        ALenum("listener", "the parameter to modify"),
        Check(1)..ALint.const.p("value", "the parameter values")
    ).directContext()

    ALvoid(
        "Sourceiv",
        "Pointer version.",

        ALuint("source", "the source to modify"),
        ALenum("paramName", "the parameter to modify"),
        Check(1)..ALint.const.p("value", "the parameter values")
    ).directContext()

    ALvoid(
        "Bufferf",
        "Sets the float value of a buffer parameter.",

        ALuint("buffer", "the buffer to modify"),
        ALenum("paramName", "the parameter to modify"),
        ALfloat("value", "the value")
    ).directContext()

    ALvoid(
        "Buffer3f",
        "Sets the dimensional value of a buffer parameter.",

        ALuint("buffer", "the buffer to modify"),
        ALenum("paramName", "the parameter to modify"),
        ALfloat("value1", "the first value"),
        ALfloat("value2", "the second value"),
        ALfloat("value3", "the third value")
    ).directContext()

    ALvoid(
        "Bufferfv",
        "the pointer version of #Bufferf()",

        ALuint("buffer", "the buffer to modify"),
        ALenum("paramName", "the parameter to modify"),
        Check(1)..ALfloat.const.p("value", "the parameter values")
    ).directContext()

    ALvoid(
        "Bufferi",
        "Sets the integer value of a buffer parameter.",

        ALuint("buffer", "the buffer to modify"),
        ALenum("paramName", "the parameter to modify"),
        ALint("value", "the value")
    ).directContext()

    ALvoid(
        "Buffer3i",
        "Sets the integer 3 dimensional value of a buffer parameter.",

        ALuint("buffer", "the buffer to modify"),
        ALenum("paramName", "the parameter to modify"),
        ALint("value1", "the first value"),
        ALint("value2", "the second value"),
        ALint("value3", "the third value")
    ).directContext()

    ALvoid(
        "Bufferiv",
        "the pointer version of #Bufferi()",

        ALuint("buffer", "the buffer to modify"),
        ALenum("paramName", "the parameter to modify"),
        Check(1)..ALint.const.p("value", "the parameter values")
    ).directContext()

    ALvoid(
        "GetBuffer3i",
        "",

        ALuint("buffer", ""),
        ALenum("param", ""),
        Check(1)..ALint.p("value1", ""),
        Check(1)..ALint.p("value2", ""),
        Check(1)..ALint.p("value3", "")
    ).directContext()

    ALvoid(
        "GetBufferiv",
        "Returns the integer values of the specified buffer parameter.",

        ALuint("buffer", "the buffer to query"),
        ALenum("param", "the parameter to query"),
        Check(1)..ALint.p("values", "the parameter values")
    ).directContext()

    ALvoid(
        "GetBuffer3f",
        "",

        ALuint("buffer", ""),
        ALenum("param", ""),
        Check(1)..ALfloat.p("value1", ""),
        Check(1)..ALfloat.p("value2", ""),
        Check(1)..ALfloat.p("value3", "")
    ).directContext()

    ALvoid(
        "GetBufferfv",
        "Returns the float values of the specified buffer parameter.",

        ALuint("buffer", "the buffer to query"),
        ALenum("param", "the parameter to query"),
        Check(1)..ALfloat.p("values", "the parameter values")
    ).directContext()

    ALvoid(
        "SpeedOfSound",
        "Sets the speed of sound.",

        ALfloat("value", "the speed of sound")
    ).directContext()
}
