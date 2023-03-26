/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_QCOM_tracking_optimization_settings">XR_QCOM_tracking_optimization_settings</a> extension.
 * 
 * <p>This extension defines an API for the application to give optimization hints to the runtime for tracker domains.</p>
 * 
 * <p>For example, an application might be interested in tracking targets that are at a far distance from the camera which <b>may</b> increase tracking latency, while another application might be interested in minimizing power consumption at the cost of tracking accuracy. Targets are domains which are defined in {@code XrTrackingOptimizationSettingsDomainQCOM}.</p>
 * 
 * <p>This allows the application to tailor the tracking algorithms to specific use-cases and scene-scales in order to provide the best experience possible.</p>
 * 
 * <p>Summary: provide domain hints to the run-time about which parameters to optimize tracking for.</p>
 */
public class QCOMTrackingOptimizationSettings {

    /** The extension specification version. */
    public static final int XR_QCOM_tracking_optimization_settings_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_QCOM_TRACKING_OPTIMIZATION_SETTINGS_EXTENSION_NAME = "XR_QCOM_tracking_optimization_settings";

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_HINT_ALREADY_SET_QCOM = -1000306000;

    /**
     * XrTrackingOptimizationSettingsDomainQCOM - Domains to apply tracking optimization hints
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM} — Setting applies to all QCOM tracking extensions.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrSetTrackingOptimizationSettingsHintQCOM SetTrackingOptimizationSettingsHintQCOM}</p>
     */
    public static final int XR_TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM = 1;

    /**
     * XrTrackingOptimizationSettingsHintQCOM - Hints for prioritizing different tracking goals
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM} — Used by the application to indicate that it does not have a preference to optimize for. The run-time is understood to choose a balanced approach.</li>
     * <li>{@link #XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_LONG_RANGE_PRIORIZATION_QCOM TRACKING_OPTIMIZATION_SETTINGS_HINT_LONG_RANGE_PRIORIZATION_QCOM} — Used by the application to indicate that it prefers tracking to be optimized for long range, possibly at the expense of competing interests.</li>
     * <li>{@link #XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_CLOSE_RANGE_PRIORIZATION_QCOM TRACKING_OPTIMIZATION_SETTINGS_HINT_CLOSE_RANGE_PRIORIZATION_QCOM} — Used by the application to indicate that it prefers tracking to be optimized for close range, possibly at the expense of competing interests.</li>
     * <li>{@link #XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_LOW_POWER_PRIORIZATION_QCOM TRACKING_OPTIMIZATION_SETTINGS_HINT_LOW_POWER_PRIORIZATION_QCOM} — Used by the application to indicate that it prefers tracking to be optimized for low power consumption, possibly at the expense of competing interests.</li>
     * <li>{@link #XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_HIGH_POWER_PRIORIZATION_QCOM TRACKING_OPTIMIZATION_SETTINGS_HINT_HIGH_POWER_PRIORIZATION_QCOM} — Used by the application to indicate that it prefers tracking to be optimized for increased tracking performance, possibly at the cost of increased power consumption.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrSetTrackingOptimizationSettingsHintQCOM SetTrackingOptimizationSettingsHintQCOM}</p>
     */
    public static final int
        XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM                     = 0,
        XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_LONG_RANGE_PRIORIZATION_QCOM  = 1,
        XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_CLOSE_RANGE_PRIORIZATION_QCOM = 2,
        XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_LOW_POWER_PRIORIZATION_QCOM   = 3,
        XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_HIGH_POWER_PRIORIZATION_QCOM  = 4;

    protected QCOMTrackingOptimizationSettings() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetTrackingOptimizationSettingsHintQCOM ] ---

    /**
     * Submit a tracking optimization hint.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetTrackingOptimizationSettingsHintQCOM SetTrackingOptimizationSettingsHintQCOM} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetTrackingOptimizationSettingsHintQCOM(
     *     XrSession                                   session,
     *     XrTrackingOptimizationSettingsDomainQCOM    domain,
     *     XrTrackingOptimizationSettingsHintQCOM      hint);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The XR runtime behaves as if {@link #XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM} was submitted if the application does not provide a hint.</p>
     * 
     * <p>The XR runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the application sets a domain or hint not part of {@code XrTrackingOptimizationSettingsDomainQCOM} or {@code XrTrackingOptimizationSettingsHintQCOM}.</p>
     * 
     * <p>A hint is typically set before a domain handle is created. If hints are set more than once from one or concurrent sessions, the runtime <b>may</b> accommodate the first hint it received and return {@link #XR_ERROR_HINT_ALREADY_SET_QCOM ERROR_HINT_ALREADY_SET_QCOM} for any subsequent calls made.</p>
     * 
     * <p>If the application destroys the active domain handle associated with the hint, the runtime <b>may</b> behave as if {@link #XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM} was set. In this scenario, the runtime <b>should</b> accommodate new valid hints that <b>may</b> be set for the same domain.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link QCOMTrackingOptimizationSettings XR_QCOM_tracking_optimization_settings} extension <b>must</b> be enabled prior to calling {@link #xrSetTrackingOptimizationSettingsHintQCOM SetTrackingOptimizationSettingsHintQCOM}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code domain} <b>must</b> be a valid {@code XrTrackingOptimizationSettingsDomainQCOM} value</li>
     * <li>{@code hint} <b>must</b> be a valid {@code XrTrackingOptimizationSettingsHintQCOM} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link #XR_ERROR_HINT_ALREADY_SET_QCOM ERROR_HINT_ALREADY_SET_QCOM}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session a valid {@code XrSession} handle.
     * @param domain  the tracking domain for which the hint is applied
     * @param hint    the hint to be applied
     */
    @NativeType("XrResult")
    public static int xrSetTrackingOptimizationSettingsHintQCOM(XrSession session, @NativeType("XrTrackingOptimizationSettingsDomainQCOM") int domain, @NativeType("XrTrackingOptimizationSettingsHintQCOM") int hint) {
        long __functionAddress = session.getCapabilities().xrSetTrackingOptimizationSettingsHintQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), domain, hint, __functionAddress);
    }

}