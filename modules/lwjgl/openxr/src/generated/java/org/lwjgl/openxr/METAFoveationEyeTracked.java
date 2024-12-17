/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METAFoveationEyeTracked {

    public static final int XR_META_foveation_eye_tracked_SPEC_VERSION = 1;

    public static final String XR_META_FOVEATION_EYE_TRACKED_EXTENSION_NAME = "XR_META_foveation_eye_tracked";

    public static final int XR_FOVEATION_CENTER_SIZE_META = 2;

    public static final int
        XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META = 1000200000,
        XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META               = 1000200001,
        XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META   = 1000200002;

    public static final int XR_FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META = 0x1;

    protected METAFoveationEyeTracked() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetFoveationEyeTrackedStateMETA ] ---

    /** {@code XrResult xrGetFoveationEyeTrackedStateMETA(XrSession session, XrFoveationEyeTrackedStateMETA * foveationState)} */
    public static int nxrGetFoveationEyeTrackedStateMETA(XrSession session, long foveationState) {
        long __functionAddress = session.getCapabilities().xrGetFoveationEyeTrackedStateMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), foveationState, __functionAddress);
    }

    /** {@code XrResult xrGetFoveationEyeTrackedStateMETA(XrSession session, XrFoveationEyeTrackedStateMETA * foveationState)} */
    @NativeType("XrResult")
    public static int xrGetFoveationEyeTrackedStateMETA(XrSession session, @NativeType("XrFoveationEyeTrackedStateMETA *") XrFoveationEyeTrackedStateMETA foveationState) {
        return nxrGetFoveationEyeTrackedStateMETA(session, foveationState.address());
    }

}