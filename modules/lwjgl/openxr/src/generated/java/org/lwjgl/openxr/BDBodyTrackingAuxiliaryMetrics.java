/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BDBodyTrackingAuxiliaryMetrics {

    public static final int XR_BD_body_tracking_auxiliary_metrics_SPEC_VERSION = 1;

    public static final String XR_BD_BODY_TRACKING_AUXILIARY_METRICS_EXTENSION_NAME = "XR_BD_body_tracking_auxiliary_metrics";

    public static final int
        XR_TYPE_BODY_TRACKING_POSTURE_DATA_BD = 1000395001,
        XR_TYPE_BODY_JOINT_VELOCITIES_BD      = 1000395002,
        XR_TYPE_BODY_JOINT_ACCELERATIONS_BD   = 1000395003,
        XR_TYPE_BODY_TRACKING_STATE_BD        = 1000395004;

    public static final int
        XR_BODY_TRACKING_POSTURE_STOMP_BD  = 1,
        XR_BODY_TRACKING_POSTURE_STATIC_BD = 2;

    public static final int
        XR_SPACE_ACCELERATION_LINEAR_VALID_BIT_BD  = 0x1,
        XR_SPACE_ACCELERATION_ANGULAR_VALID_BIT_BD = 0x2;

    public static final int
        XR_BODY_TRACKING_STATUS_INVALID_BD = 0,
        XR_BODY_TRACKING_STATUS_VALID_BD   = 1,
        XR_BODY_TRACKING_STATUS_LIMITED_BD = 2;

    public static final int
        XR_BODY_TRACKING_MESSAGE_NO_ERROR_BD                        = 0,
        XR_BODY_TRACKING_MESSAGE_TRACKER_NOT_CALIBRATED_BD          = 1,
        XR_BODY_TRACKING_MESSAGE_TRACKER_NUM_NOT_ENOUGH_BD          = 2,
        XR_BODY_TRACKING_MESSAGE_TRACKER_STATE_NOT_SATISFIED_BD     = 3,
        XR_BODY_TRACKING_MESSAGE_TRACKER_PERSISTENT_INVISIBILITY_BD = 4,
        XR_BODY_TRACKING_MESSAGE_TRACKER_DATA_ERROR_BD              = 5,
        XR_BODY_TRACKING_MESSAGE_USER_CHANGE_BD                     = 6,
        XR_BODY_TRACKING_MESSAGE_TRACKING_POSE_ERROR_BD             = 7;

    protected BDBodyTrackingAuxiliaryMetrics() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrStartBodyTrackingCalibrationAppBD ] ---

    /** {@code XrResult xrStartBodyTrackingCalibrationAppBD(XrSession session)} */
    @NativeType("XrResult")
    public static int xrStartBodyTrackingCalibrationAppBD(XrSession session) {
        long __functionAddress = session.getCapabilities().xrStartBodyTrackingCalibrationAppBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), __functionAddress);
    }

    // --- [ xrGetBodyTrackingStateBD ] ---

    /** {@code XrResult xrGetBodyTrackingStateBD(XrSession session, XrBodyTrackingStateBD * state)} */
    public static int nxrGetBodyTrackingStateBD(XrSession session, long state) {
        long __functionAddress = session.getCapabilities().xrGetBodyTrackingStateBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetBodyTrackingStateBD(XrSession session, XrBodyTrackingStateBD * state)} */
    @NativeType("XrResult")
    public static int xrGetBodyTrackingStateBD(XrSession session, @NativeType("XrBodyTrackingStateBD *") XrBodyTrackingStateBD state) {
        return nxrGetBodyTrackingStateBD(session, state.address());
    }

}