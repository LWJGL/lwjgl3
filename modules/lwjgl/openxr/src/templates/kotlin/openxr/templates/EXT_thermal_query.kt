/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_thermal_query = "EXTThermalQuery".nativeClassXR("EXT_thermal_query", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_thermal_query_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_THERMAL_QUERY_EXTENSION_NAME".."XR_EXT_thermal_query"
    )

    XrResult(
        "ThermalGetTemperatureTrendEXT",
        """
        xrThermalGetTemperatureTrendEXT.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrThermalGetTemperatureTrendEXT(
￿    XrSession                                   session,
￿    XrPerfSettingsDomainEXT                     domain,
￿    XrPerfSettingsNotificationLevelEXT*         notificationLevel,
￿    float*                                      tempHeadroom,
￿    float*                                      tempSlope);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTThermalQuery XR_EXT_thermal_query} extension <b>must</b> be enabled prior to calling #ThermalGetTemperatureTrendEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code domain} <b>must</b> be a valid {@code XrPerfSettingsDomainEXT} value</li>
            <li>{@code notificationLevel} <b>must</b> be a pointer to an {@code XrPerfSettingsNotificationLevelEXT} value</li>
            <li>{@code tempHeadroom} <b>must</b> be a pointer to a {@code float} value</li>
            <li>{@code tempSlope} <b>must</b> be a pointer to a {@code float} value</li>
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
        XrPerfSettingsDomainEXT("domain", ": the processing domain"),
        Check(1)..XrPerfSettingsNotificationLevelEXT.p("notificationLevel", ": the current warning level"),
        Check(1)..float.p("tempHeadroom", ": temperature headroom in degrees Celsius, expressing how far the most-critical temperature of the domain is from its thermal throttling threshold temperature."),
        Check(1)..float.p("tempSlope", ": the current trend in degrees Celsius per second of the most critical temperature of the domain.")
    )
}