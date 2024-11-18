/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_system_events = "SOFTSystemEvents".nativeClassALC("SOFT_system_events") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows applications to be notified of system events related to audio devices. In particular, when a new device becomes available, an
        existing device becomes unavailable, and when the default device changes. Standard OpenAL has no mechanism to detect these events aside from maybe
        querying the device names and comparing to a previous query, but this requires the application to actively query and compare two lists, and OpenAL
        makes no guarantee that the device list will change at run-time, and the same goes for the default device name. This extension allows an application to
        register a callback to be automatically alerted to such changes, providing the appropriate guarantees.
        """

    IntConstant(
        """
        Accepted as the {@code eventType} parameter of #EventIsSupportedSOFT(), as an element of the {@code events} parameter of #EventControlSOFT(), and
        provided as the {@code eventType} parameter of {@code ALCEVENTPROCTYPESOFT} callback functions.
        """,

        "EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT"..0x19D6,
        "EVENT_TYPE_DEVICE_ADDED_SOFT"..0x19D7,
        "EVENT_TYPE_DEVICE_REMOVED_SOFT"..0x19D8
    )

    IntConstant(
        """
        Accepted as the {@code deviceType} parameter of #EventIsSupportedSOFT(), and provided as the {@code deviceType} parameter of
        {@code ALCEVENTPROCTYPESOFT} callback functions.
        """,

        "PLAYBACK_DEVICE_SOFT"..0x19D4,
        "CAPTURE_DEVICE_SOFT"..0x19D5
    )

    IntConstant(
        "Returned from #EventIsSupportedSOFT().",

        "EVENT_SUPPORTED_SOFT"..0x19D9,
        "EVENT_NOT_SUPPORTED_SOFT"..0x19DA
    )

    ALCenum(
        "EventIsSupportedSOFT",
        "",

        ALCenum("eventType", ""),
        ALCenum("deviceType", "")
    )

    ALCboolean(
        "EventControlSOFT",
        "",

        AutoSize("events")..ALCsizei("count", ""),
        nullable..ALCenum.const.p("events", ""),
        ALCboolean("enable", "")
    )

    ALCvoid(
        "EventCallbackSOFT",
        "",

        nullable..ALCEVENTPROCTYPESOFT("callback", ""),
        nullable.."ALCvoid".opaque.p("userParam", "")
    )
}