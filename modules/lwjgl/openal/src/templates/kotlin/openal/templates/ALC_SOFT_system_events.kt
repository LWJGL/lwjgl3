/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_system_events = "SOFTSystemEvents".nativeClassALC("SOFT_system_events") {
    IntConstant(
        "EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT"..0x19D6,
        "EVENT_TYPE_DEVICE_ADDED_SOFT"..0x19D7,
        "EVENT_TYPE_DEVICE_REMOVED_SOFT"..0x19D8
    )

    IntConstant(
        "PLAYBACK_DEVICE_SOFT"..0x19D4,
        "CAPTURE_DEVICE_SOFT"..0x19D5
    )

    IntConstant(
        "EVENT_SUPPORTED_SOFT"..0x19D9,
        "EVENT_NOT_SUPPORTED_SOFT"..0x19DA
    )

    ALCenum(
        "EventIsSupportedSOFT",

        ALCenum("eventType"),
        ALCenum("deviceType")
    )

    ALCboolean(
        "EventControlSOFT",

        AutoSize("events")..ALCsizei("count"),
        nullable..ALCenum.const.p("events"),
        ALCboolean("enable")
    )

    ALCvoid(
        "EventCallbackSOFT",

        nullable..ALCEVENTPROCTYPESOFT("callback"),
        nullable.."ALCvoid".opaque.p("userParam")
    )
}