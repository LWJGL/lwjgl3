/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_device_clock = "SOFTDeviceClock".nativeClassALC("SOFT_device_clock") {
    IntConstant(
        "DEVICE_CLOCK_SOFT"..0x1600,
        "DEVICE_LATENCY_SOFT"..0x1601,
        "DEVICE_CLOCK_LATENCY_SOFT"..0x1602
    )

    IntConstant(
        "AL_SAMPLE_OFFSET_CLOCK_SOFT"..0x1202
    ).noPrefix()

    IntConstant(
        "AL_SEC_OFFSET_CLOCK_SOFT"..0x1203
    ).noPrefix()

    ALCvoid(
        "GetInteger64vSOFT",

        nullable..ALCdevice.p("device"),
        ALCenum("pname"),
        AutoSize("values")..ALsizei("size"),
        ReturnParam..ALCint64SOFT.p("values")
    )
}