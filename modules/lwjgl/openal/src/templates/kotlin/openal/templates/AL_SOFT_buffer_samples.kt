/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_buffer_samples = "SOFTBufferSamples".nativeClassAL("SOFT_buffer_samples") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a more flexible mechanism for loading buffer data, as well as a method to retrieve buffer data. Unextended OpenAL only provides
        a method to specify a single buffer format when loading data, which defines the data given by the application. The AL is given leeway in converting the
        data, so that it is possible or more efficient to use internally. However, there are some drawbacks to this approach:
        ${ul(
            """
            The conversion done by the implementation is hidden from the app. This makes it difficult for the app to know what kind of precision it will have,
            and impossible to request a storage precision.
            """,
            "Conversion is not guaranteed, so the application can be restricted in the formats that can be loaded depending on the implementation."
        )}

        If the application could specify the internal storage format, as well as use a separate format to specify the incoming data's format, it would allow to
        add more input formats (signed 8-bit, 32-bit int, and float, for example), with no undue burden placed on the implementation beyond needing some
        conversion routines. The application can then be assured that many different formats can be loaded, even if storage is restricted to a comparatively
        small subset.

        In addition, unextended OpenAL does not have any methods for updating only a portion of a buffer, nor a method to retrieve the data from a buffer.
        """

    val internalFormats = IntConstant(
        """
        Accepted by the {@code internalformat} parameter of #BufferSamplesSOFT() (values are shared with standard OpenAL, ${AL_EXT_FLOAT32.link}, and
        ${AL_EXT_MCFORMATS.link}).
        """,

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
    ).javaDocLinks

    val channels = IntConstant(
        "Accepted by the {@code channels} parameter of #BufferSamplesSOFT(), #BufferSubSamplesSOFT(), and #GetBufferSamplesSOFT().",

        "MONO_SOFT"..0x1500,
        "STEREO_SOFT"..0x1501,
        "QUAD_SOFT"..0x1502,
        "REAR_SOFT"..0x1503,
        "5POINT1_SOFT"..0x1504,
        "6POINT1_SOFT"..0x1505,
        "7POINT1_SOFT"..0x1506
    ).javaDocLinks

    val types = IntConstant(
        "Accepted by the {@code type} parameter of #BufferSamplesSOFT(), #BufferSubSamplesSOFT(), and #GetBufferSamplesSOFT().",

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
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code paramName} parameter of #GetBufferi() and #GetBufferiv().",

        "INTERNAL_FORMAT_SOFT"..0x2008,
        "BYTE_LENGTH_SOFT"..0x2009,
        "SAMPLE_LENGTH_SOFT"..0x200A
    )

    IntConstant(
        "Accepted by the {@code paramName} parameter of #GetBufferf() and #GetBufferfv().",

        "SEC_LENGTH_SOFT"..0x200B
    )

    IntConstant(
        "Accepted by the {@code paramName} parameter of #GetSourceiv() and #GetSourcefv() (these are the same as in ${AL_SOFT_buffer_sub_data.link}).",

        "BYTE_RW_OFFSETS_SOFT"..0x1031,
        "SAMPLE_RW_OFFSETS_SOFT"..0x1032
    )

    void(
        "BufferSamplesSOFT",
        "",

        ALuint("buffer", ""),
        ALuint("samplerate", ""),
        ALenum("internalformat", "", internalFormats),
        ALsizei("samples", ""),
        ALenum("channels", "", channels),
        ALenum("type", "", types),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..ALvoid.const.p("data", "")
    )

    void(
        "BufferSubSamplesSOFT",
        "",

        ALuint("buffer", ""),
        ALsizei("offset", ""),
        ALsizei("samples", ""),
        ALenum("channels", "", channels),
        ALenum("type", "", types),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..ALvoid.const.p("data", "")
    )

    void(
        "GetBufferSamplesSOFT",
        "",

        ALuint("buffer", ""),
        ALsizei("offset", ""),
        ALsizei("samples", ""),
        ALenum("channels", "", channels),
        ALenum("type", "", types),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
        )..Unsafe..ALvoid.p("data", "")
    )

    ALboolean(
        "IsBufferFormatSupportedSOFT",
        "",

        ALenum("format", "")
    )
}