/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_performance_metrics = "ANDROIDPerformanceMetrics".nativeClassXR("ANDROID_performance_metrics", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_performance_metrics_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_PERFORMANCE_METRICS_EXTENSION_NAME".."XR_ANDROID_performance_metrics"
    )

    EnumConstant(
        "TYPE_PERFORMANCE_METRICS_STATE_ANDROID".."1000465000",
        "TYPE_PERFORMANCE_METRICS_COUNTER_ANDROID".."1000465001"
    )

    EnumConstant(
        "PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_ANDROID".."0",
        "PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_ANDROID".."1",
        "PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_ANDROID".."2",
        "PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_ANDROID".."3",
        "PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_ANDROID".."4"
    )

    EnumConstant(
        "PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_ANDROID".enum(0x00000001),
        "PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_ANDROID".enum(0x00000002),
        "PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_ANDROID".enum(0x00000004)
    )

    XrResult(
        "EnumeratePerformanceMetricsCounterPathsANDROID",

        XrInstance("instance"),
        AutoSize("counterPaths")..uint32_t("counterPathCapacityInput"),
        Check(1)..uint32_t.p("counterPathCountOutput"),
        nullable..XrPath.p("counterPaths")
    )

    XrResult(
        "SetPerformanceMetricsStateANDROID",

        XrSession("session"),
        XrPerformanceMetricsStateANDROID.const.p("state")
    )

    XrResult(
        "GetPerformanceMetricsStateANDROID",

        XrSession("session"),
        XrPerformanceMetricsStateANDROID.p("state")
    )

    XrResult(
        "QueryPerformanceMetricsCounterANDROID",

        XrSession("session"),
        XrPath("counterPath"),
        XrPerformanceMetricsCounterANDROID.p("counter")
    )
}