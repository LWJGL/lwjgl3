/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BDBodyTracking {

    public static final int XR_BD_body_tracking_SPEC_VERSION = 1;

    public static final String XR_BD_BODY_TRACKING_EXTENSION_NAME = "XR_BD_body_tracking";

    public static final int XR_OBJECT_TYPE_BODY_TRACKER_BD = 1000385000;

    public static final int
        XR_TYPE_BODY_TRACKER_CREATE_INFO_BD        = 1000385001,
        XR_TYPE_BODY_JOINTS_LOCATE_INFO_BD         = 1000385002,
        XR_TYPE_BODY_JOINT_LOCATIONS_BD            = 1000385003,
        XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD = 1000385004;

    public static final int
        XR_BODY_JOINT_PELVIS_BD         = 0,
        XR_BODY_JOINT_LEFT_HIP_BD       = 1,
        XR_BODY_JOINT_RIGHT_HIP_BD      = 2,
        XR_BODY_JOINT_SPINE1_BD         = 3,
        XR_BODY_JOINT_LEFT_KNEE_BD      = 4,
        XR_BODY_JOINT_RIGHT_KNEE_BD     = 5,
        XR_BODY_JOINT_SPINE2_BD         = 6,
        XR_BODY_JOINT_LEFT_ANKLE_BD     = 7,
        XR_BODY_JOINT_RIGHT_ANKLE_BD    = 8,
        XR_BODY_JOINT_SPINE3_BD         = 9,
        XR_BODY_JOINT_LEFT_FOOT_BD      = 10,
        XR_BODY_JOINT_RIGHT_FOOT_BD     = 11,
        XR_BODY_JOINT_NECK_BD           = 12,
        XR_BODY_JOINT_LEFT_COLLAR_BD    = 13,
        XR_BODY_JOINT_RIGHT_COLLAR_BD   = 14,
        XR_BODY_JOINT_HEAD_BD           = 15,
        XR_BODY_JOINT_LEFT_SHOULDER_BD  = 16,
        XR_BODY_JOINT_RIGHT_SHOULDER_BD = 17,
        XR_BODY_JOINT_LEFT_ELBOW_BD     = 18,
        XR_BODY_JOINT_RIGHT_ELBOW_BD    = 19,
        XR_BODY_JOINT_LEFT_WRIST_BD     = 20,
        XR_BODY_JOINT_RIGHT_WRIST_BD    = 21,
        XR_BODY_JOINT_LEFT_HAND_BD      = 22,
        XR_BODY_JOINT_RIGHT_HAND_BD     = 23;

    public static final int
        XR_BODY_JOINT_SET_BODY_WITHOUT_ARM_BD = 1,
        XR_BODY_JOINT_SET_FULL_BODY_JOINTS_BD = 2;

    protected BDBodyTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateBodyTrackerBD ] ---

    /** {@code XrResult xrCreateBodyTrackerBD(XrSession session, XrBodyTrackerCreateInfoBD const * createInfo, XrBodyTrackerBD * bodyTracker)} */
    public static int nxrCreateBodyTrackerBD(XrSession session, long createInfo, long bodyTracker) {
        long __functionAddress = session.getCapabilities().xrCreateBodyTrackerBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, bodyTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateBodyTrackerBD(XrSession session, XrBodyTrackerCreateInfoBD const * createInfo, XrBodyTrackerBD * bodyTracker)} */
    @NativeType("XrResult")
    public static int xrCreateBodyTrackerBD(XrSession session, @NativeType("XrBodyTrackerCreateInfoBD const *") XrBodyTrackerCreateInfoBD createInfo, @NativeType("XrBodyTrackerBD *") PointerBuffer bodyTracker) {
        if (CHECKS) {
            check(bodyTracker, 1);
        }
        return nxrCreateBodyTrackerBD(session, createInfo.address(), memAddress(bodyTracker));
    }

    // --- [ xrDestroyBodyTrackerBD ] ---

    /** {@code XrResult xrDestroyBodyTrackerBD(XrBodyTrackerBD bodyTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyBodyTrackerBD(XrBodyTrackerBD bodyTracker) {
        long __functionAddress = bodyTracker.getCapabilities().xrDestroyBodyTrackerBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(bodyTracker.address(), __functionAddress);
    }

    // --- [ xrLocateBodyJointsBD ] ---

    /** {@code XrResult xrLocateBodyJointsBD(XrBodyTrackerBD bodyTracker, XrBodyJointsLocateInfoBD const * locateInfo, XrBodyJointLocationsBD * locations)} */
    public static int nxrLocateBodyJointsBD(XrBodyTrackerBD bodyTracker, long locateInfo, long locations) {
        long __functionAddress = bodyTracker.getCapabilities().xrLocateBodyJointsBD;
        if (CHECKS) {
            check(__functionAddress);
            XrBodyJointsLocateInfoBD.validate(locateInfo);
        }
        return callPPPI(bodyTracker.address(), locateInfo, locations, __functionAddress);
    }

    /** {@code XrResult xrLocateBodyJointsBD(XrBodyTrackerBD bodyTracker, XrBodyJointsLocateInfoBD const * locateInfo, XrBodyJointLocationsBD * locations)} */
    @NativeType("XrResult")
    public static int xrLocateBodyJointsBD(XrBodyTrackerBD bodyTracker, @NativeType("XrBodyJointsLocateInfoBD const *") XrBodyJointsLocateInfoBD locateInfo, @NativeType("XrBodyJointLocationsBD *") XrBodyJointLocationsBD locations) {
        return nxrLocateBodyJointsBD(bodyTracker, locateInfo.address(), locations.address());
    }

}