/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_loopback = "SOFTLoopback".nativeClassALC("SOFT_loopback") {
    IntConstant(
        "BYTE_SOFT"..0x1400,
        "UNSIGNED_BYTE_SOFT"..0x1401,
        "SHORT_SOFT"..0x1402,
        "UNSIGNED_SHORT_SOFT"..0x1403,
        "INT_SOFT"..0x1404,
        "UNSIGNED_INT_SOFT"..0x1405,
        "FLOAT_SOFT"..0x1406
    )

    IntConstant(
        "MONO_SOFT"..0x1500,
        "STEREO_SOFT"..0x1501,
        "QUAD_SOFT"..0x1503,
        "5POINT1_SOFT"..0x1504,
        "6POINT1_SOFT"..0x1505,
        "7POINT1_SOFT"..0x1506
    )

    IntConstant(
        "FORMAT_CHANNELS_SOFT"..0x1990,
        "FORMAT_TYPE_SOFT"..0x1991
    )

    ALCdevice.p(
        "LoopbackOpenDeviceSOFT",

        nullable..ALCcharUTF8.const.p("deviceName")
    )

    ALCboolean(
        "IsRenderFormatSupportedSOFT",

        ALCdevice.p("device"),
        ALCsizei("frequency"),
        ALCenum("channels"),
        ALCenum("type")
    )

    ALCvoid(
        "RenderSamplesSOFT",

        ALCdevice.p("device"),
        Unsafe..MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALCvoid.p("buffer"),
        ALCsizei("samples")
    )
}