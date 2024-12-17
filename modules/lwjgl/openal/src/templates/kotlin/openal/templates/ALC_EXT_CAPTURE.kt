/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_CAPTURE = "EXTCapture".nativeClassALC("EXT_CAPTURE") {
    IntConstant(
        "CAPTURE_DEVICE_SPECIFIER"..0x310,
        "CAPTURE_DEFAULT_DEVICE_SPECIFIER"..0x311
    )

    IntConstant(
        "CAPTURE_SAMPLES"..0x312
    )

    reuse(ALC11, "CaptureOpenDevice")
    reuse(ALC11, "CaptureCloseDevice")
    reuse(ALC11, "CaptureStart")
    reuse(ALC11, "CaptureStop")
    reuse(ALC11, "CaptureSamples")
}