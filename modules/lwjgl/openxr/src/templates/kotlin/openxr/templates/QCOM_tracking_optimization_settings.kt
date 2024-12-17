/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val QCOM_tracking_optimization_settings = "QCOMTrackingOptimizationSettings".nativeClassXR("QCOM_tracking_optimization_settings", type = "instance", postfix = "QCOM") {
    IntConstant(
        "QCOM_tracking_optimization_settings_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_TRACKING_OPTIMIZATION_SETTINGS_EXTENSION_NAME".."XR_QCOM_tracking_optimization_settings"
    )

    EnumConstant(
        "ERROR_HINT_ALREADY_SET_QCOM".."-1000306000"
    )

    EnumConstant(
        "TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM".."1"
    )

    EnumConstant(
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM".."0",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_LONG_RANGE_PRIORIZATION_QCOM".."1",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_CLOSE_RANGE_PRIORIZATION_QCOM".."2",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_LOW_POWER_PRIORIZATION_QCOM".."3",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_HIGH_POWER_PRIORIZATION_QCOM".."4"
    )

    XrResult(
        "SetTrackingOptimizationSettingsHintQCOM",

        XrSession("session"),
        XrTrackingOptimizationSettingsDomainQCOM("domain"),
        XrTrackingOptimizationSettingsHintQCOM("hint")
    )
}