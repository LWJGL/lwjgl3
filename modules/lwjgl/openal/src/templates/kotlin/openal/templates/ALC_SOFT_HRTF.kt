/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_HRTF = "SOFTHRTF".nativeClassALC("SOFT_HRTF") {
    IntConstant(
        "HRTF_SOFT"..0x1992
    )

    IntConstant(
        "HRTF_ID_SOFT"..0x1996
    )

    IntConstant(
        "DONT_CARE_SOFT"..0x0002
    )

    IntConstant(
        "HRTF_STATUS_SOFT"..0x1993,
        "NUM_HRTF_SPECIFIERS_SOFT"..0x1994
    )

    IntConstant(
        "HRTF_SPECIFIER_SOFT"..0x1995
    )

    IntConstant(
        "HRTF_DISABLED_SOFT"..0x0000,
        "HRTF_ENABLED_SOFT"..0x0001,
        "HRTF_DENIED_SOFT"..0x0002,
        "HRTF_REQUIRED_SOFT"..0x0003,
        "HRTF_HEADPHONES_DETECTED_SOFT"..0x0004,
        "HRTF_UNSUPPORTED_FORMAT_SOFT"..0x0005
    )

    ALCcharUTF8.const.p(
        "GetStringiSOFT",

        ALCdevice.p("device"),
        ALCenum("paramName"),
        ALCsizei("index")
    )

    ALCboolean(
        "ResetDeviceSOFT",

        ALCdevice.p("device"),
        nullable..NullTerminated..ALCint.const.p("attrList")
    )
}