/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_CAPTURE = "EXTCapture".nativeClassALC("EXT_CAPTURE") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        An OpenAL 1.1 implementation will always support the $extensionName extension. This allows an application written to the OpenAL 1.0 specification to
        access the capture abilities.
        """

    IntConstant(
        "String queries.",

        "CAPTURE_DEVICE_SPECIFIER"..0x310,
        "CAPTURE_DEFAULT_DEVICE_SPECIFIER"..0x311
    )

    IntConstant(
        "Integer queries.",

        "CAPTURE_SAMPLES"..0x312
    )

    ALC11 reuse "CaptureOpenDevice"
    ALC11 reuse "CaptureCloseDevice"
    ALC11 reuse "CaptureStart"
    ALC11 reuse "CaptureStop"
    ALC11 reuse "CaptureSamples"
}