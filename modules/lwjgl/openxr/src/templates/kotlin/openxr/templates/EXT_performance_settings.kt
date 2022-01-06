/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_performance_settings = "EXTPerformanceSettings".nativeClassXR("EXT_performance_settings", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_performance_settings_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_PERFORMANCE_SETTINGS_EXTENSION_NAME".."XR_EXT_performance_settings"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_EVENT_DATA_PERF_SETTINGS_EXT".."1000015000"
    )

    EnumConstant(
        """
        XrPerfSettingsDomainEXT - XrPerfSettingsDomainEXT

        <h5>See Also</h5>
        ##XrEventDataPerfSettingsEXT, #PerfSettingsSetPerformanceLevelEXT(), #ThermalGetTemperatureTrendEXT()
        """,

        "PERF_SETTINGS_DOMAIN_CPU_EXT".."1",
        "PERF_SETTINGS_DOMAIN_GPU_EXT".."2"
    )

    EnumConstant(
        """
        XrPerfSettingsSubDomainEXT - XrPerfSettingsSubDomainEXT

        <h5>See Also</h5>
        ##XrEventDataPerfSettingsEXT
        """,

        "PERF_SETTINGS_SUB_DOMAIN_COMPOSITING_EXT".."1",
        "PERF_SETTINGS_SUB_DOMAIN_RENDERING_EXT".."2",
        "PERF_SETTINGS_SUB_DOMAIN_THERMAL_EXT".."3"
    )

    EnumConstant(
        """
        XrPerfSettingsLevelEXT - XrPerfSettingsLevelEXT

        <h5>See Also</h5>
        #PerfSettingsSetPerformanceLevelEXT()
        """,

        "PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT".."0",
        "PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT".."25",
        "PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT".."50",
        "PERF_SETTINGS_LEVEL_BOOST_EXT".."75"
    )

    EnumConstant(
        """
        XrPerfSettingsNotificationLevelEXT - XrPerfSettingsNotificationLevelEXT

        <h5>See Also</h5>
        ##XrEventDataPerfSettingsEXT, #ThermalGetTemperatureTrendEXT()
        """,

        "PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT".."0",
        "PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT".."25",
        "PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT".."75"
    )

    XrResult(
        "PerfSettingsSetPerformanceLevelEXT",
        """
        xrPerfSettingsSetPerformanceLevelEXT.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrPerfSettingsSetPerformanceLevelEXT(
￿    XrSession                                   session,
￿    XrPerfSettingsDomainEXT                     domain,
￿    XrPerfSettingsLevelEXT                      level);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPerformanceSettings XR_EXT_performance_settings} extension <b>must</b> be enabled prior to calling #PerfSettingsSetPerformanceLevelEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code domain} <b>must</b> be a valid {@code XrPerfSettingsDomainEXT} value</li>
            <li>{@code level} <b>must</b> be a valid {@code XrPerfSettingsLevelEXT} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "a valid {@code XrSession} handle."),
        XrPerfSettingsDomainEXT("domain", "the processing domain for which the level hint is applied"),
        XrPerfSettingsLevelEXT("level", "the level hint to be applied")
    )
}