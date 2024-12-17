/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class QCOMTrackingOptimizationSettings {

    public static final int XR_QCOM_tracking_optimization_settings_SPEC_VERSION = 1;

    public static final String XR_QCOM_TRACKING_OPTIMIZATION_SETTINGS_EXTENSION_NAME = "XR_QCOM_tracking_optimization_settings";

    public static final int XR_ERROR_HINT_ALREADY_SET_QCOM = -1000306000;

    public static final int XR_TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM = 1;

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

    /** {@code XrResult xrSetTrackingOptimizationSettingsHintQCOM(XrSession session, XrTrackingOptimizationSettingsDomainQCOM domain, XrTrackingOptimizationSettingsHintQCOM hint)} */
    @NativeType("XrResult")
    public static int xrSetTrackingOptimizationSettingsHintQCOM(XrSession session, @NativeType("XrTrackingOptimizationSettingsDomainQCOM") int domain, @NativeType("XrTrackingOptimizationSettingsHintQCOM") int hint) {
        long __functionAddress = session.getCapabilities().xrSetTrackingOptimizationSettingsHintQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), domain, hint, __functionAddress);
    }

}