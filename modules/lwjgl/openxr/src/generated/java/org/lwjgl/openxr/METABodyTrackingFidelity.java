/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METABodyTrackingFidelity {

    public static final int XR_META_body_tracking_fidelity_SPEC_VERSION = 1;

    public static final String XR_META_BODY_TRACKING_FIDELITY_EXTENSION_NAME = "XR_META_body_tracking_fidelity";

    public static final int
        XR_TYPE_BODY_TRACKING_FIDELITY_STATUS_META            = 1000284000,
        XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META = 1000284001;

    public static final int
        XR_BODY_TRACKING_FIDELITY_LOW_META  = 1,
        XR_BODY_TRACKING_FIDELITY_HIGH_META = 2;

    protected METABodyTrackingFidelity() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrRequestBodyTrackingFidelityMETA ] ---

    /** {@code XrResult xrRequestBodyTrackingFidelityMETA(XrBodyTrackerFB bodyTracker, XrBodyTrackingFidelityMETA fidelity)} */
    @NativeType("XrResult")
    public static int xrRequestBodyTrackingFidelityMETA(XrBodyTrackerFB bodyTracker, @NativeType("XrBodyTrackingFidelityMETA") int fidelity) {
        long __functionAddress = bodyTracker.getCapabilities().xrRequestBodyTrackingFidelityMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(bodyTracker.address(), fidelity, __functionAddress);
    }

}