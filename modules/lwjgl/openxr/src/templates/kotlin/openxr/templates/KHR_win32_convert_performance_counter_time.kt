/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import core.windows.*
import openxr.*

val KHR_win32_convert_performance_counter_time = "KHRWin32ConvertPerformanceCounterTime".nativeClassXR("KHR_win32_convert_performance_counter_time", type = "instance", postfix = KHR) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_win32_convert_performance_counter_time_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_WIN32_CONVERT_PERFORMANCE_COUNTER_TIME_EXTENSION_NAME".."XR_KHR_win32_convert_performance_counter_time"
    )

//    XrResult(
//        "ConvertWin32PerformanceCounterToTimeKHR",
//        "",
//
//        XrInstance("instance", ""),
//        LARGE_INTEGER.const.p("performanceCounter", ""),
//        Check(1)..XrTime.p("time", "")
//    )
//
//    XrResult(
//        "ConvertTimeToWin32PerformanceCounterKHR",
//        "",
//
//        XrInstance("instance", ""),
//        XrTime("time", ""),
//        Check(1)..LARGE_INTEGER.p("performanceCounter", "")
//    )
}