/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_performance_metrics = "METAPerformanceMetrics".nativeClassXR("META_performance_metrics", type = "instance", postfix = "META") {
    IntConstant(
        "META_performance_metrics_SPEC_VERSION".."2"
    )

    StringConstant(
        "META_PERFORMANCE_METRICS_EXTENSION_NAME".."XR_META_performance_metrics"
    )

    EnumConstant(
        "TYPE_PERFORMANCE_METRICS_STATE_META".."1000232001",
        "TYPE_PERFORMANCE_METRICS_COUNTER_META".."1000232002"
    )

    EnumConstant(
        "PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META".enum(0x00000001),
        "PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META".enum(0x00000002),
        "PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META".enum(0x00000004)
    )

    EnumConstant(
        "PERFORMANCE_METRICS_COUNTER_UNIT_GENERIC_META".."0",
        "PERFORMANCE_METRICS_COUNTER_UNIT_PERCENTAGE_META".."1",
        "PERFORMANCE_METRICS_COUNTER_UNIT_MILLISECONDS_META".."2",
        "PERFORMANCE_METRICS_COUNTER_UNIT_BYTES_META".."3",
        "PERFORMANCE_METRICS_COUNTER_UNIT_HERTZ_META".."4"
    )

    XrResult(
        "EnumeratePerformanceMetricsCounterPathsMETA",

        XrInstance("instance"),
        AutoSize("counterPaths")..uint32_t("counterPathCapacityInput"),
        Check(1)..uint32_t.p("counterPathCountOutput"),
        nullable..XrPath.p("counterPaths")
    )

    XrResult(
        "SetPerformanceMetricsStateMETA",

        XrSession("session"),
        XrPerformanceMetricsStateMETA.const.p("state")
    )

    XrResult(
        "GetPerformanceMetricsStateMETA",

        XrSession("session"),
        XrPerformanceMetricsStateMETA.p("state")
    )

    XrResult(
        "QueryPerformanceMetricsCounterMETA",

        XrSession("session"),
        XrPath("counterPath"),
        XrPerformanceMetricsCounterMETA.p("counter")
    )
}