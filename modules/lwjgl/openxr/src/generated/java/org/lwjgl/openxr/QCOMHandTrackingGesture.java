/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class QCOMHandTrackingGesture {

    public static final int XR_QCOM_hand_tracking_gesture_SPEC_VERSION = 1;

    public static final String XR_QCOM_HAND_TRACKING_GESTURE_EXTENSION_NAME = "XR_QCOM_hand_tracking_gesture";

    public static final int
        XR_HAND_GESTURE_TYPE_OPEN_HAND_QCOM = 0,
        XR_HAND_GESTURE_TYPE_GRAB_QCOM      = 2,
        XR_HAND_GESTURE_TYPE_PINCH_QCOM     = 7,
        XR_HAND_GESTURE_TYPE_UNKNOWN_QCOM   = -1;

    protected QCOMHandTrackingGesture() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetHandGestureQCOM ] ---

    /** {@code XrResult xrGetHandGestureQCOM(XrHandTrackerEXT handTracker, XrTime time, XrHandGestureQCOM * handGesture)} */
    public static int nxrGetHandGestureQCOM(XrHandTrackerEXT handTracker, long time, long handGesture) {
        long __functionAddress = handTracker.getCapabilities().xrGetHandGestureQCOM;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(handTracker.address(), time, handGesture, __functionAddress);
    }

    /** {@code XrResult xrGetHandGestureQCOM(XrHandTrackerEXT handTracker, XrTime time, XrHandGestureQCOM * handGesture)} */
    @NativeType("XrResult")
    public static int xrGetHandGestureQCOM(XrHandTrackerEXT handTracker, @NativeType("XrTime") long time, @NativeType("XrHandGestureQCOM *") XrHandGestureQCOM handGesture) {
        return nxrGetHandGestureQCOM(handTracker, time, handGesture.address());
    }

}