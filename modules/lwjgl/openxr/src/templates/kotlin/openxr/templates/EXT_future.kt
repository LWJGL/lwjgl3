/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_future = "EXTFuture".nativeClassXR("EXT_future", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_future_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_FUTURE_EXTENSION_NAME".."XR_EXT_future"
    )

    EnumConstant(
        "NULL_FUTURE_EXT".."0"
    )

    EnumConstant(
        "ERROR_FUTURE_PENDING_EXT".."-1000469001",
        "ERROR_FUTURE_INVALID_EXT".."-1000469002"
    )

    EnumConstant(
        "TYPE_FUTURE_CANCEL_INFO_EXT".."1000469000",
        "TYPE_FUTURE_POLL_INFO_EXT".."1000469001",
        "TYPE_FUTURE_COMPLETION_EXT".."1000469002",
        "TYPE_FUTURE_POLL_RESULT_EXT".."1000469003"
    )

    EnumConstant(
        "FUTURE_STATE_PENDING_EXT".."1",
        "FUTURE_STATE_READY_EXT".."2"
    )

    XrResult(
        "PollFutureEXT",

        XrInstance("instance"),
        XrFuturePollInfoEXT.const.p("pollInfo"),
        XrFuturePollResultEXT.p("pollResult")
    )

    XrResult(
        "CancelFutureEXT",

        XrInstance("instance"),
        XrFutureCancelInfoEXT.const.p("cancelInfo")
    )
}