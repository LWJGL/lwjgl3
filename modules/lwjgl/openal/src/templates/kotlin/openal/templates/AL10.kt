/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL10 = "AL10".nativeClassAL("AL10") {
    IntConstant(
        "INVALID"..0xFFFFFFFF.i,
        "NONE"..0x0,
        "FALSE"..0x0,
        "TRUE"..0x1
    )

    IntConstant(
        "NO_ERROR"..0x0,
        "INVALID_NAME"..0xA001,
        "INVALID_ENUM"..0xA002,
        "INVALID_VALUE"..0xA003,
        "INVALID_OPERATION"..0xA004,
        "OUT_OF_MEMORY"..0xA005
    )

    IntConstant(
        "DOPPLER_FACTOR"..0xC000,
        "DISTANCE_MODEL"..0xD000
    )

    IntConstant(
        "VENDOR"..0xB001,
        "VERSION"..0xB002,
        "RENDERER"..0xB003,
        "EXTENSIONS"..0xB004
    )

    IntConstant(
        "INVERSE_DISTANCE"..0xD001,
        "INVERSE_DISTANCE_CLAMPED"..0xD002
    )

    IntConstant(
        "SOURCE_ABSOLUTE"..0x201,
        "SOURCE_RELATIVE"..0x202
    )

    IntConstant(
        "POSITION"..0x1004,
        "VELOCITY"..0x1006,
        "GAIN"..0x100A
    )

    IntConstant(
        "CONE_INNER_ANGLE"..0x1001,
        "CONE_OUTER_ANGLE"..0x1002,
        "PITCH"..0x1003,
        "DIRECTION"..0x1005,
        "LOOPING"..0x1007,
        "BUFFER"..0x1009,
        "SOURCE_STATE"..0x1010,
        "CONE_OUTER_GAIN"..0x1022,
        "SOURCE_TYPE"..0x1027
    )

    IntConstant(
        "INITIAL"..0x1011,
        "PLAYING"..0x1012,
        "PAUSED"..0x1013,
        "STOPPED"..0x1014
    )

    IntConstant(
        "ORIENTATION"..0x100F
    )

    IntConstant(
        "BUFFERS_QUEUED"..0x1015,
        "BUFFERS_PROCESSED"..0x1016
    )

    IntConstant(
        "MIN_GAIN"..0x100D,
        "MAX_GAIN"..0x100E
    )

    IntConstant(
        "REFERENCE_DISTANCE"..0x1020,
        "ROLLOFF_FACTOR"..0x1021,
        "MAX_DISTANCE"..0x1023
    )

    IntConstant(
        "FREQUENCY"..0x2001,
        "BITS"..0x2002,
        "CHANNELS"..0x2003,
        "SIZE"..0x2004
    )

    IntConstant(
        "FORMAT_MONO8"..0x1100,
        "FORMAT_MONO16"..0x1101,
        "FORMAT_STEREO8"..0x1102,
        "FORMAT_STEREO16"..0x1103
    )

    IntConstant(
        "UNUSED"..0x2010,
        "PENDING"..0x2011,
        "PROCESSED"..0x2012
    )

    ALenum(
        "GetError",
        void()
    ).directContext()

    ALvoid(
        "Enable",

        ALenum("target")
    ).directContext()

    ALvoid(
        "Disable",

        ALenum("target")
    ).directContext()

    ALboolean(
        "IsEnabled",

        ALenum("target")
    ).directContext()

    ALboolean(
        "GetBoolean",

        ALenum("paramName")
    ).directContext()

    ALint(
        "GetInteger",

        ALenum("paramName")
    ).directContext()

    ALfloat(
        "GetFloat",

        ALenum("paramName")
    ).directContext()

    ALdouble(
        "GetDouble",

        ALenum("paramName")
    ).directContext()

    ALvoid(
        "GetBooleanv",

        ALenum("paramName"),
        Check(1)..ALboolean.p("dest")
    ).directContext()

    ALvoid(
        "GetIntegerv",

        ALenum("paramName"),
        Check(1)..ALint.p("dest")
    ).directContext()

    ALvoid(
        "GetFloatv",

        ALenum("paramName"),
        Check(1)..ALfloat.p("dest")
    ).directContext()

    ALvoid(
        "GetDoublev",

        ALenum("paramName"),
        Check(1)..ALdouble.p("dest")
    ).directContext()

    ALcharUTF8.const.p(
        "GetString",

        ALenum("paramName")
    ).directContext()

    ALvoid(
        "DistanceModel",

        ALenum("modelName")
    ).directContext()

    ALvoid(
        "DopplerFactor",

        ALfloat("dopplerFactor")
    ).directContext()

    ALvoid(
        "DopplerVelocity",

        ALfloat("dopplerVelocity")
    )

    ALvoid(
        "Listenerf",

        ALenum("paramName"),
        ALfloat("value")
    ).directContext()

    ALvoid(
        "Listeneri",

        ALenum("paramName"),
        ALint("values")
    ).directContext()

    ALvoid(
        "Listener3f",

        ALenum("paramName"),
        ALfloat("value1"),
        ALfloat("value2"),
        ALfloat("value3")
    ).directContext()

    ALvoid(
        "Listenerfv",

        ALenum("paramName"),
        Check(1)..ALfloat.const.p("values")
    ).directContext()

    ALvoid(
        "GetListenerf",

        ALenum("paramName"),
        Check(1)..ReturnParam..ALfloat.p("value")
    ).directContext()

    ALvoid(
        "GetListeneri",

        ALenum("paramName"),
        Check(1)..ReturnParam..ALint.p("value")
    ).directContext()

    ALvoid(
        "GetListener3f",

        ALenum("paramName"),
        Check(1)..ALfloat.p("value1"),
        Check(1)..ALfloat.p("value2"),
        Check(1)..ALfloat.p("value3")
    ).directContext()

    ALvoid(
        "GetListenerfv",

        ALenum("paramName"),
        Check(1)..ALfloat.p("values")
    ).directContext()

    ALvoid(
        "GenSources",

        AutoSize("srcNames")..ALsizei("n"),
        ReturnParam..ALuint.p("srcNames")
    ).directContext()

    ALvoid(
        "DeleteSources",

        AutoSize("sources")..ALsizei("n"),
        SingleValue("source")..ALuint.p("sources")
    ).directContext()

    ALboolean(
        "IsSource",

        ALuint("sourceName")
    ).directContext()

    ALvoid(
        "Sourcef",

        ALuint("source"),
        ALenum("param"),
        ALfloat("value")
    ).directContext()

    ALvoid(
        "Source3f",

        ALuint("source"),
        ALenum("param"),
        ALfloat("v1"),
        ALfloat("v2"),
        ALfloat("v3")
    ).directContext()

    ALvoid(
        "Sourcefv",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALfloat.const.p("values")
    ).directContext()

    ALvoid(
        "Sourcei",

        ALuint("source"),
        ALenum("param"),
        ALint("value")
    ).directContext()

    ALvoid(
        "GetSourcef",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ReturnParam..ALfloat.p("value")
    ).directContext()

    ALvoid(
        "GetSource3f",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALfloat.p("v1"),
        Check(1)..ALfloat.p("v2"),
        Check(1)..ALfloat.p("v3")
    ).directContext()

    ALvoid(
        "GetSourcefv",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALfloat.p("values")
    ).directContext()

    ALvoid(
        "GetSourcei",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ReturnParam..ALint.p("value")
    ).directContext()

    ALvoid(
        "GetSourceiv",

        ALuint("source"),
        ALenum("param"),
        Check(1)..ALint.p("values")
    ).directContext()

    ALvoid(
        "SourceQueueBuffers",

        ALuint("sourceName"),
        AutoSize("bufferNames")..ALsizei("numBuffers"),
        SingleValue("bufferName")..ALuint.p("bufferNames")
    ).directContext()

    ALvoid(
        "SourceUnqueueBuffers",

        ALuint("sourceName"),
        AutoSize("bufferNames")..ALsizei("numEntries"),
        ReturnParam..ALuint.p("bufferNames")
    ).directContext()

    ALvoid(
        "SourcePlay",

        ALuint("source")
    ).directContext()

    ALvoid(
        "SourcePause",

        ALuint("source")
    ).directContext()

    ALvoid(
        "SourceStop",

        ALuint("source")
    ).directContext()

    ALvoid(
        "SourceRewind",

        ALuint("source")
    ).directContext()

    ALvoid(
        "SourcePlayv",

        AutoSize("sources")..ALsizei("n"),
        ALuint.const.p("sources")
    ).directContext()

    ALvoid(
        "SourcePausev",

        AutoSize("sources")..ALsizei("n"),
        ALuint.const.p("sources")
    ).directContext()

    ALvoid(
        "SourceStopv",

        AutoSize("sources")..ALsizei("n"),
        ALuint.const.p("sources")
    ).directContext()

    ALvoid(
        "SourceRewindv",

        AutoSize("sources")..ALsizei("n"),
        ALuint.const.p("sources")
    ).directContext()

    ALvoid(
        "GenBuffers",

        AutoSize("bufferNames")..ALsizei("n"),
        ReturnParam..ALuint.p("bufferNames")
    ).directContext()

    ALvoid(
        "DeleteBuffers",

        AutoSize("bufferNames")..ALsizei("n"),
        SingleValue("bufferName")..ALuint.const.p("bufferNames")
    ).directContext()

    ALboolean(
        "IsBuffer",

        ALuint("bufferName")
    ).directContext()

    ALvoid(
        "GetBufferf",

        ALuint("bufferName"),
        ALenum("paramName"),
        Check(1)..ReturnParam..ALfloat.p("value")
    ).directContext()

    ALvoid(
        "GetBufferi",

        ALuint("bufferName"),
        ALenum("paramName"),
        Check(1)..ReturnParam..ALint.p("value")
    ).directContext()

    ALvoid(
        "BufferData",

        ALuint("bufferName"),
        ALenum("format"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALvoid.const.p("data"),
        AutoSize("data")..ALsizei("size"),
        ALsizei("frequency")
    ).directContext()

    ALenum(
        "GetEnumValue",

        ALcharASCII.const.p("enumName")
    ).directContext()

    "ALvoid".opaque.p(
        "GetProcAddress",

        ALcharASCII.const.p("funcName")
    ).directContext()

    ALCboolean(
        "IsExtensionPresent",

        ALcharASCII.const.p("extName")
    ).directContext()
}