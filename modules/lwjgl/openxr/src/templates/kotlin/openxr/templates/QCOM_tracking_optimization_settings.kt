/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val QCOM_tracking_optimization_settings = "QCOMTrackingOptimizationSettings".nativeClassXR("QCOM_tracking_optimization_settings", type = "instance", postfix = "QCOM") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_QCOM_tracking_optimization_settings">XR_QCOM_tracking_optimization_settings</a> extension.

        This extension defines an API for the application to give optimization hints to the runtime for tracker domains.

        For example, an application might be interested in tracking targets that are at a far distance from the camera which <b>may</b> increase tracking latency, while another application might be interested in minimizing power consumption at the cost of tracking accuracy. Targets are domains which are defined in {@code XrTrackingOptimizationSettingsDomainQCOM}.

        This allows the application to tailor the tracking algorithms to specific use-cases and scene-scales in order to provide the best experience possible.

        Summary: provide domain hints to the run-time about which parameters to optimize tracking for.
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_tracking_optimization_settings_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "QCOM_TRACKING_OPTIMIZATION_SETTINGS_EXTENSION_NAME".."XR_QCOM_tracking_optimization_settings"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_HINT_ALREADY_SET_QCOM".."-1000306000"
    )

    EnumConstant(
        """
        XrTrackingOptimizationSettingsDomainQCOM - Domains to apply tracking optimization hints

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM — Setting applies to all QCOM tracking extensions.</li>
        </ul>

        <h5>See Also</h5>
        #SetTrackingOptimizationSettingsHintQCOM()
        """,

        "TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM".."1"
    )

    EnumConstant(
        """
        XrTrackingOptimizationSettingsHintQCOM - Hints for prioritizing different tracking goals

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM — Used by the application to indicate that it does not have a preference to optimize for. The run-time is understood to choose a balanced approach.</li>
            <li>#TRACKING_OPTIMIZATION_SETTINGS_HINT_LONG_RANGE_PRIORIZATION_QCOM — Used by the application to indicate that it prefers tracking to be optimized for long range, possibly at the expense of competing interests.</li>
            <li>#TRACKING_OPTIMIZATION_SETTINGS_HINT_CLOSE_RANGE_PRIORIZATION_QCOM — Used by the application to indicate that it prefers tracking to be optimized for close range, possibly at the expense of competing interests.</li>
            <li>#TRACKING_OPTIMIZATION_SETTINGS_HINT_LOW_POWER_PRIORIZATION_QCOM — Used by the application to indicate that it prefers tracking to be optimized for low power consumption, possibly at the expense of competing interests.</li>
            <li>#TRACKING_OPTIMIZATION_SETTINGS_HINT_HIGH_POWER_PRIORIZATION_QCOM — Used by the application to indicate that it prefers tracking to be optimized for increased tracking performance, possibly at the cost of increased power consumption.</li>
        </ul>

        <h5>See Also</h5>
        #SetTrackingOptimizationSettingsHintQCOM()
        """,

        "TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM".."0",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_LONG_RANGE_PRIORIZATION_QCOM".."1",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_CLOSE_RANGE_PRIORIZATION_QCOM".."2",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_LOW_POWER_PRIORIZATION_QCOM".."3",
        "TRACKING_OPTIMIZATION_SETTINGS_HINT_HIGH_POWER_PRIORIZATION_QCOM".."4"
    )

    XrResult(
        "SetTrackingOptimizationSettingsHintQCOM",
        """
        Submit a tracking optimization hint.

        <h5>C Specification</h5>
        The #SetTrackingOptimizationSettingsHintQCOM() function is defined as:

        <pre><code>
￿XrResult xrSetTrackingOptimizationSettingsHintQCOM(
￿    XrSession                                   session,
￿    XrTrackingOptimizationSettingsDomainQCOM    domain,
￿    XrTrackingOptimizationSettingsHintQCOM      hint);</code></pre>

        <h5>Description</h5>
        The XR runtime behaves as if #TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM was submitted if the application does not provide a hint.

        The XR runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the application sets a domain or hint not part of {@code XrTrackingOptimizationSettingsDomainQCOM} or {@code XrTrackingOptimizationSettingsHintQCOM}.

        A hint is typically set before a domain handle is created. If hints are set more than once from one or concurrent sessions, the runtime <b>may</b> accommodate the first hint it received and return #ERROR_HINT_ALREADY_SET_QCOM for any subsequent calls made.

        If the application destroys the active domain handle associated with the hint, the runtime <b>may</b> behave as if #TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM was set. In this scenario, the runtime <b>should</b> accommodate new valid hints that <b>may</b> be set for the same domain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link QCOMTrackingOptimizationSettings XR_QCOM_tracking_optimization_settings} extension <b>must</b> be enabled prior to calling #SetTrackingOptimizationSettingsHintQCOM()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code domain} <b>must</b> be a valid {@code XrTrackingOptimizationSettingsDomainQCOM} value</li>
            <li>{@code hint} <b>must</b> be a valid {@code XrTrackingOptimizationSettingsHintQCOM} value</li>
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
                <li>#ERROR_HINT_ALREADY_SET_QCOM</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "a valid {@code XrSession} handle."),
        XrTrackingOptimizationSettingsDomainQCOM("domain", "the tracking domain for which the hint is applied"),
        XrTrackingOptimizationSettingsHintQCOM("hint", "the hint to be applied")
    )
}