/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_pause_device = "SOFTPauseDevice".nativeClassALC("SOFT_pause_device") {
    ALCvoid(
        "DevicePauseSOFT",

        ALCdevice.p("device")
    )

    ALCvoid(
        "DeviceResumeSOFT",

        ALCdevice.p("device")
    )
}