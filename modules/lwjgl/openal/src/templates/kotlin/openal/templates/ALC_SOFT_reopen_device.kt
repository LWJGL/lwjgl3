/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_reopen_device = "SOFTReopenDevice".nativeClassALC("SOFT_reopen_device") {
    ALCboolean(
        "ReopenDeviceSOFT",

        ALCdevice.p("device"),
        nullable..ALCcharUTF8.const.p("deviceName"),
        nullable..NullTerminated..ALCint.const.p("attribs")
    )
}