/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC11 = "ALC11".nativeClassALC("ALC11") {
    extends = ALC10
    IntConstant(
        "MONO_SOURCES"..0x1010,
        "STEREO_SOURCES"..0x1011
    )

    IntConstant(
        "DEFAULT_ALL_DEVICES_SPECIFIER"..0x1012,
        "ALL_DEVICES_SPECIFIER"..0x1013,

        "CAPTURE_DEVICE_SPECIFIER"..0x310,
        "CAPTURE_DEFAULT_DEVICE_SPECIFIER"..0x311
    )

    IntConstant(
        "CAPTURE_SAMPLES"..0x312
    )

    ALCdevice.p(
        "CaptureOpenDevice",

        nullable..ALCcharUTF8.const.p("deviceName"),
        ALCuint("frequency"),
        ALCenum("format"),
        ALCsizei("samples")
    )

    ALCboolean(
        "CaptureCloseDevice",

        ALCdevice.p("device")
    )

    ALCvoid(
        "CaptureStart",

        ALCdevice.p("device")
    )

    ALCvoid(
        "CaptureStop",

        ALCdevice.p("device")
    )

    ALCvoid(
        "CaptureSamples",

        ALCdevice.p("device"),
        Unsafe..MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALCvoid.p("buffer"),
        ALCsizei("samples")
    )

}