/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class MNDXForceFeedbackCurl {

    public static final int XR_MNDX_force_feedback_curl_SPEC_VERSION = 1;

    public static final String XR_MNDX_FORCE_FEEDBACK_CURL_EXTENSION_NAME = "XR_MNDX_force_feedback_curl";

    public static final int
        XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX = 1000375000,
        XR_TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX   = 1000375001;

    public static final int
        XR_FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX  = 0,
        XR_FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX  = 1,
        XR_FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX = 2,
        XR_FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX   = 3,
        XR_FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX = 4;

    protected MNDXForceFeedbackCurl() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrApplyForceFeedbackCurlMNDX ] ---

    /** {@code XrResult xrApplyForceFeedbackCurlMNDX(XrHandTrackerEXT handTracker, XrForceFeedbackCurlApplyLocationsMNDX const * locations)} */
    public static int nxrApplyForceFeedbackCurlMNDX(XrHandTrackerEXT handTracker, long locations) {
        long __functionAddress = handTracker.getCapabilities().xrApplyForceFeedbackCurlMNDX;
        if (CHECKS) {
            check(__functionAddress);
            XrForceFeedbackCurlApplyLocationsMNDX.validate(locations);
        }
        return callPPI(handTracker.address(), locations, __functionAddress);
    }

    /** {@code XrResult xrApplyForceFeedbackCurlMNDX(XrHandTrackerEXT handTracker, XrForceFeedbackCurlApplyLocationsMNDX const * locations)} */
    @NativeType("XrResult")
    public static int xrApplyForceFeedbackCurlMNDX(XrHandTrackerEXT handTracker, @NativeType("XrForceFeedbackCurlApplyLocationsMNDX const *") XrForceFeedbackCurlApplyLocationsMNDX locations) {
        return nxrApplyForceFeedbackCurlMNDX(handTracker, locations.address());
    }

}