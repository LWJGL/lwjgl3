/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_buffer_samples = "SOFTBufferSamples".nativeClassAL("SOFT_buffer_samples") {
    IntConstant(
        "MONO8_SOFT"..0x1100,
        "MONO16_SOFT"..0x1101,
        "MONO32F_SOFT"..0x10010,
        "STEREO8_SOFT"..0x1102,
        "STEREO16_SOFT"..0x1103,
        "STEREO32F_SOFT"..0x10011,
        "QUAD8_SOFT"..0x1204,
        "QUAD16_SOFT"..0x1205,
        "QUAD32F_SOFT"..0x1206,
        "REAR8_SOFT"..0x1207,
        "REAR16_SOFT"..0x1208,
        "REAR32F_SOFT"..0x1209,
        "5POINT1_8_SOFT"..0x120A,
        "5POINT1_16_SOFT"..0x120B,
        "5POINT1_32F_SOFT"..0x120C,
        "6POINT1_8_SOFT"..0x120D,
        "6POINT1_16_SOFT"..0x120E,
        "6POINT1_32F_SOFT"..0x120F,
        "7POINT1_8_SOFT"..0x1210,
        "7POINT1_16_SOFT"..0x1211,
        "7POINT1_32F_SOFT"..0x1212
    )

    IntConstant(
        "MONO_SOFT"..0x1500,
        "STEREO_SOFT"..0x1501,
        "QUAD_SOFT"..0x1502,
        "REAR_SOFT"..0x1503,
        "5POINT1_SOFT"..0x1504,
        "6POINT1_SOFT"..0x1505,
        "7POINT1_SOFT"..0x1506
    )

    IntConstant(
        "BYTE_SOFT"..0x1400,
        "UNSIGNED_BYTE_SOFT"..0x1401,
        "SHORT_SOFT"..0x1402,
        "UNSIGNED_SHORT_SOFT"..0x1403,
        "INT_SOFT"..0x1404,
        "UNSIGNED_INT_SOFT"..0x1405,
        "FLOAT_SOFT"..0x1406,
        "DOUBLE_SOFT"..0x1407,
        "BYTE3_SOFT"..0x1408,
        "UNSIGNED_BYTE3_SOFT"..0x1409
    )

    IntConstant(
        "INTERNAL_FORMAT_SOFT"..0x2008,
        "BYTE_LENGTH_SOFT"..0x2009,
        "SAMPLE_LENGTH_SOFT"..0x200A
    )

    IntConstant(
        "SEC_LENGTH_SOFT"..0x200B
    )

    IntConstant(
        "BYTE_RW_OFFSETS_SOFT"..0x1031,
        "SAMPLE_RW_OFFSETS_SOFT"..0x1032
    )

    void(
        "BufferSamplesSOFT",

        ALuint("buffer"),
        ALuint("samplerate"),
        ALenum("internalformat"),
        ALsizei("samples"),
        ALenum("channels"),
        ALenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..ALvoid.const.p("data")
    )

    void(
        "BufferSubSamplesSOFT",

        ALuint("buffer"),
        ALsizei("offset"),
        ALsizei("samples"),
        ALenum("channels"),
        ALenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..ALvoid.const.p("data")
    )

    void(
        "GetBufferSamplesSOFT",

        ALuint("buffer"),
        ALsizei("offset"),
        ALsizei("samples"),
        ALenum("channels"),
        ALenum("type"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..ALvoid.p("data")
    )

    ALboolean(
        "IsBufferFormatSupportedSOFT",

        ALenum("format")
    )
}