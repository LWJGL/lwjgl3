/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_thermal_query = "EXTThermalQuery".nativeClassXR("EXT_thermal_query", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_thermal_query_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_THERMAL_QUERY_EXTENSION_NAME".."XR_EXT_thermal_query"
    )

    XrResult(
        "ThermalGetTemperatureTrendEXT",

        XrSession("session"),
        XrPerfSettingsDomainEXT("domain"),
        Check(1)..XrPerfSettingsNotificationLevelEXT.p("notificationLevel"),
        Check(1)..float.p("tempHeadroom"),
        Check(1)..float.p("tempSlope")
    )
}