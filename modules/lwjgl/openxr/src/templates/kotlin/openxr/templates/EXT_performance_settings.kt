/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_performance_settings = "EXTPerformanceSettings".nativeClassXR("EXT_performance_settings", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_performance_settings_SPEC_VERSION".."4"
    )

    StringConstant(
        "EXT_PERFORMANCE_SETTINGS_EXTENSION_NAME".."XR_EXT_performance_settings"
    )

    EnumConstant(
        "TYPE_EVENT_DATA_PERF_SETTINGS_EXT".."1000015000"
    )

    EnumConstant(
        "PERF_SETTINGS_DOMAIN_CPU_EXT".."1",
        "PERF_SETTINGS_DOMAIN_GPU_EXT".."2"
    )

    EnumConstant(
        "PERF_SETTINGS_SUB_DOMAIN_COMPOSITING_EXT".."1",
        "PERF_SETTINGS_SUB_DOMAIN_RENDERING_EXT".."2",
        "PERF_SETTINGS_SUB_DOMAIN_THERMAL_EXT".."3"
    )

    EnumConstant(
        "PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT".."0",
        "PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT".."25",
        "PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT".."50",
        "PERF_SETTINGS_LEVEL_BOOST_EXT".."75"
    )

    EnumConstant(
        "PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT".."0",
        "PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT".."25",
        "PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT".."75"
    )

    XrResult(
        "PerfSettingsSetPerformanceLevelEXT",

        XrSession("session"),
        XrPerfSettingsDomainEXT("domain"),
        XrPerfSettingsLevelEXT("level")
    )
}