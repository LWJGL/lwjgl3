/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC11 = "ALC11".nativeClassALC("ALC11") {
    extends = ALC10
    documentation = "Native bindings to ALC 1.1 functionality."

    IntConstant(
        "Context creation attributes.",

        "MONO_SOURCES"..0x1010,
        "STEREO_SOURCES"..0x1011
    )

    IntConstant(
        "String queries.",

        "DEFAULT_ALL_DEVICES_SPECIFIER"..0x1012,
        "ALL_DEVICES_SPECIFIER"..0x1013,

        "CAPTURE_DEVICE_SPECIFIER"..0x310,
        "CAPTURE_DEFAULT_DEVICE_SPECIFIER"..0x311
    )

    IntConstant(
        "Integer queries.",

        "CAPTURE_SAMPLES"..0x312
    )

    ALCdevice.p(
        "CaptureOpenDevice",
        """
        Allows the application to connect to a capture device.

        The {@code deviceName} argument is a null terminated string that requests a certain device or device configuration. If #NULL is specified, the implementation
        will provide an implementation specific default.
        """,

        nullable..ALCcharUTF8.const.p.IN("deviceName", "the device or device configuration"),
        ALCuint.IN("frequency", "the audio frequency"),
        ALCenum.IN("format", "the audio format"),
        ALCsizei.IN("samples", "the number of sample frames to buffer in the AL")
    )

    ALCboolean(
        "CaptureCloseDevice",
        "Allows the application to disconnect from a capture device.",

        ALCdevice.p.IN("device", "the capture device to close")
    )

    ALCvoid(
        "CaptureStart",
        """
        Starts recording audio on the specific capture device.

        Once started, the device will record audio to an internal ring buffer, the size of which was specified when opening the device. The application may
        query the capture device to discover how much data is currently available via the alcGetInteger with the ALC_CAPTURE_SAMPLES token. This will report the
        number of sample frames currently available.
        """,

        ALCdevice.p.IN("device", "the capture device")
    )

    ALCvoid(
        "CaptureStop",
        """
        Halts audio capturing without closing the capture device.

        The implementation is encouraged to optimize for this case. The amount of audio samples available after restarting a stopped capture device is reset to
        zero. The application does not need to stop the capture device to read from it.
        """,

        ALCdevice.p.IN("device", "the capture device")
    )

    ALCvoid(
        "CaptureSamples",
        """
        Obtains captured audio samples from the AL.

        The implementation may defer conversion and resampling until this point. Requesting more sample frames than are currently available is an error.
        """,

        ALCdevice.p.IN("device", "the capture device"),
        Unsafe..MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALCvoid.p.OUT("buffer", "the buffer that will receive the samples. It must be big enough to contain at least {@code samples} sample frames."),
        ALCsizei.IN("samples", "the number of sample frames to obtain")
    )

}