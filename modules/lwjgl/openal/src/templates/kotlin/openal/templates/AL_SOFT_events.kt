/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_events = "SOFTEvents".nativeClassAL("SOFT_events", postfix = SOFT) {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a method for applications to receive notifications about audio events via an asynchronous callback. This can help alleviate the
        need for applications to continually poll the AL to check if an event happened, and instead allow them to respond when events happen. Such events can
        include a source changing state or a device becoming disconnected.
        """

    IntConstant(
        "Accepted as the {@code pname} parameter of #GetPointerSOFT() and #GetPointervSOFT().",

        "EVENT_CALLBACK_FUNCTION_SOFT"..0x19A2,
        "EVENT_CALLBACK_USER_PARAM_SOFT"..0x19A3
    )

    IntConstant(
        """
        Accepted as an element in the {@code types} parameter of #EventControlSOFT(), and provided as the {@code eventType} parameter of
        {@code ALEVENTPROCSOFT} callback functions.
        """,

        "EVENT_TYPE_BUFFER_COMPLETED_SOFT"..0x19A4,
        "EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT"..0x19A5,
        "EVENT_TYPE_DISCONNECTED_SOFT"..0x19A6
    )

    void(
        "EventControlSOFT",
        "",

        AutoSize("types")..ALsizei("count", ""),
        ALenum.const.p("types", ""),
        ALboolean("enable", "")
    ).directContext()

    void(
        "EventCallbackSOFT",
        "",

        nullable..ALEVENTPROCSOFT("callback", ""),
        nullable.."ALvoid".opaque.p("userParam", "")
    ).directContext()

    "ALvoid".opaque.p(
        "GetPointerSOFT",
        "",

        ALenum("pname", "")
    ).directContext()

    void(
        "GetPointervSOFT",
        "",

        ALenum("pname", ""),
        Check(1)..ALvoid.p.p("values", "")
    ).directContext()
}