/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_convert_timespec_time = "KHRConvertTimespecTime".nativeClassXR("KHR_convert_timespec_time", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_convert_timespec_time_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_CONVERT_TIMESPEC_TIME_EXTENSION_NAME".."XR_KHR_convert_timespec_time"
    )

    XrResult(
        "ConvertTimespecTimeToTimeKHR",

        XrInstance("instance"),
        timespec.const.p("timespecTime"),
        Check(1)..XrTime.p("time")
    )

    XrResult(
        "ConvertTimeToTimespecTimeKHR",

        XrInstance("instance"),
        XrTime("time"),
        timespec.p("timespecTime")
    )
}