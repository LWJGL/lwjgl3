/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_display_refresh_rate = "FBDisplayRefreshRate".nativeClassXR("FB_display_refresh_rate", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_display_refresh_rate_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_DISPLAY_REFRESH_RATE_EXTENSION_NAME".."XR_FB_display_refresh_rate"
    )

    EnumConstant(
        "TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB".."1000101000"
    )

    EnumConstant(
        "ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB".."-1000101000"
    )

    XrResult(
        "EnumerateDisplayRefreshRatesFB",

        XrSession("session"),
        AutoSize("displayRefreshRates")..uint32_t("displayRefreshRateCapacityInput"),
        Check(1)..uint32_t.p("displayRefreshRateCountOutput"),
        nullable..float.p("displayRefreshRates")
    )

    XrResult(
        "GetDisplayRefreshRateFB",

        XrSession("session"),
        Check(1)..float.p("displayRefreshRate")
    )

    XrResult(
        "RequestDisplayRefreshRateFB",

        XrSession("session"),
        float("displayRefreshRate")
    )
}