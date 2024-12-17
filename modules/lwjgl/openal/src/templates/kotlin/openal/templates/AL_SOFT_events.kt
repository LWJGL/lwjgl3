/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_events = "SOFTEvents".nativeClassAL("SOFT_events", postfix = SOFT) {
    IntConstant(
        "EVENT_CALLBACK_FUNCTION_SOFT"..0x19A2,
        "EVENT_CALLBACK_USER_PARAM_SOFT"..0x19A3
    )

    IntConstant(
        "EVENT_TYPE_BUFFER_COMPLETED_SOFT"..0x19A4,
        "EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT"..0x19A5,
        "EVENT_TYPE_DISCONNECTED_SOFT"..0x19A6
    )

    void(
        "EventControlSOFT",

        AutoSize("types")..ALsizei("count"),
        ALenum.const.p("types"),
        ALboolean("enable")
    ).directContext()

    void(
        "EventCallbackSOFT",

        nullable..ALEVENTPROCSOFT("callback"),
        nullable.."ALvoid".opaque.p("userParam")
    ).directContext()

    "ALvoid".opaque.p(
        "GetPointerSOFT",

        ALenum("pname")
    ).directContext()

    void(
        "GetPointervSOFT",

        ALenum("pname"),
        Check(1)..ALvoid.p.p("values")
    ).directContext()
}