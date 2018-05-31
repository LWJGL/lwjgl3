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

        ALenum.IN("paramName", "the parameter to modify"),
        ALfloat.IN("value1", "the first value"),
        ALfloat.IN("value2", "the second value"),
        ALfloat.IN("value3", "the third value")
    )

    ALvoid(
        "GetListeneriv",
        "Returns the integer values of the specified listener parameter.",

        ALenum.IN("param", "the parameter to query"),
        Check(1)..ALint.p.OUT("values", "the parameter values")
    )

    ALvoid(
        "Source3i",
        "Sets the 3 dimensional integer values of a source parameter.",

        ALuint.IN("source", "the source to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        ALint.IN("value1", "the first value"),
        ALint.IN("value2", "the second value"),
        ALint.IN("value3", "the third value")
    )

    ALvoid(
        "Listeneriv",
        "Pointer version.",

        ALenum.IN("listener", "the parameter to modify"),
        Check(1)..ALint.const.p.IN("value", "the parameter values")
    )

    ALvoid(
        "Sourceiv",
        "Pointer version.",

        ALuint.IN("source", "the source to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        Check(1)..ALint.const.p.IN("value", "the parameter values")
    )

    ALvoid(
        "Bufferf",
        "Sets the float value of a buffer parameter.",

        ALuint.IN("buffer", "the buffer to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        ALfloat.IN("value", "the value")
    )

    ALvoid(
        "Buffer3f",
        "Sets the dimensional value of a buffer parameter.",

        ALuint.IN("buffer", "the buffer to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        ALfloat.IN("value1", "the first value"),
        ALfloat.IN("value2", "the second value"),
        ALfloat.IN("value3", "the third value")
    )

    ALvoid(
        "Bufferfv",
        "the pointer version of #Bufferf()",

        ALuint.IN("buffer", "the buffer to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        Check(1)..ALfloat.const.p.IN("value", "the parameter values")
    )

    ALvoid(
        "Bufferi",
        "Sets the integer value of a buffer parameter.",

        ALuint.IN("buffer", "the buffer to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        ALint.IN("value", "the value")
    )

    ALvoid(
        "Buffer3i",
        "Sets the integer 3 dimensional value of a buffer parameter.",

        ALuint.IN("buffer", "the buffer to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        ALint.IN("value1", "the first value"),
        ALint.IN("value2", "the second value"),
        ALint.IN("value3", "the third value")
    )

    ALvoid(
        "Bufferiv",
        "the pointer version of #Bufferi()",

        ALuint.IN("buffer", "the buffer to modify"),
        ALenum.IN("paramName", "the parameter to modify"),
        Check(1)..ALint.const.p.IN("value", "the parameter values")
    )

    ALvoid(
        "GetBufferiv",
        "Returns the integer values of the specified buffer parameter.",

        ALuint.IN("buffer", "the buffer to query"),
        ALenum.IN("param", "the parameter to query"),
        Check(1)..ALint.p.OUT("values", "the parameter values")
    )

    ALvoid(
        "GetBufferfv",
        "Returns the float values of the specified buffer parameter.",

        ALuint.IN("buffer", "the buffer to query"),
        ALenum.IN("param", "the parameter to query"),
        Check(1)..ALfloat.p.OUT("values", "the parameter values")
    )

    ALvoid(
        "SpeedOfSound",
        "Sets the speed of sound.",

        ALfloat.IN("value", "the speed of sound")
    )
}