/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_loopback = "SOFTLoopback".nativeClassALC("SOFT_loopback") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows an application to read back OpenAL's rendered audio instead of having it output to an audio device on the system. Unextended
        OpenAL will output audio to an audio device, with no mechanism to allow an application to divert the audio somewhere else.
        """

    val Types = IntConstant(
        "Accepted by the {@code type} parameter of #IsRenderFormatSupportedSOFT().",

        "BYTE_SOFT"..0x1400,
        "UNSIGNED_BYTE_SOFT"..0x1401,
        "SHORT_SOFT"..0x1402,
        "UNSIGNED_SHORT_SOFT"..0x1403,
        "INT_SOFT"..0x1404,
        "UNSIGNED_INT_SOFT"..0x1405,
        "FLOAT_SOFT"..0x1406
    ).javaDocLinks

    val Channels = IntConstant(
        "Accepted by the {@code channels} parameter of #IsRenderFormatSupportedSOFT().",

        "MONO_SOFT"..0x1500,
        "STEREO_SOFT"..0x1501,
        "QUAD_SOFT"..0x1503,
        "5POINT1_SOFT"..0x1504,
        "6POINT1_SOFT"..0x1505,
        "7POINT1_SOFT"..0x1506
    ).javaDocLinks

    IntConstant(
        "Accepted as part of the {@code attrList} parameter of #CreateContext().",

        "FORMAT_CHANNELS_SOFT"..0x1990,
        "FORMAT_TYPE_SOFT"..0x1991
    )

    ALCdevice.p(
        "LoopbackOpenDeviceSOFT",
        """
        Loopback devices provide a way for applications to "read back" rendered audio without it being sent to an actual audio device. It allows applications to
        render audio as fast or slow as it needs, making it suitable for non-real-time rendering, and so it can be passed to an audio codec or something for
        further processing.

        To open a loopback device, use this function.

        A loopback device behaves largely the same as a playback device. You may query playback state and error codes, and create contexts, which can then be
        set as current to generate sources and buffers like normal.

        Note that loopback devices do not have either the #SYNC or #REFRESH attributes. Attempting to query them will result in an ALC10#ALC_INVALID_ENUM
        error.
        """,

        nullable..ALCcharUTF8.const.p.IN(
            "deviceName",
            """
            which device or device driver to use for subsequent rendering. This may be #NULL for an implementation-defined default, otherwise it must be a
            valid name returned by enumeration (and further must be a device capable of loopback rendering).
            """
        )
    )

    ALCboolean(
        "IsRenderFormatSupportedSOFT",
        """
        When creating contexts, the attribute list must specify the format used for rendering. This is done with the #FORMAT_CHANNELS_SOFT, #FORMAT_TYPE_SOFT,
        and ALC10#ALC_FREQUENCY attributes. This controls the format of the audio subsequently rendered by the device.

        To check if a particular rendering format is available, use this function.
        """,

        ALCdevice.p.IN("device", "the loopback device to query"),
        ALCsizei.IN("frequency", "the sample rate of the rendered audio"),
        ALCenum.IN("channels", "the channel configuration used for rendering", Channels),
        ALCenum.IN("type", "sample type of the written audio", Types)
    )

    ALCvoid(
        "RenderSamplesSOFT",
        """
        The state of various objects on loopback devices (including processed buffers and source offsets) is processed only when new samples are rendered. To
        render samples, use this function.
        """,

        ALCdevice.p.IN("device", "the loopback device which samples are rendered from, using its contexts and associated buffers and sources"),
        Unsafe..MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALCvoid.p.OUT("buffer", "the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames."),
        ALCsizei.IN("samples", "the number of sample frames to render")
    )
}