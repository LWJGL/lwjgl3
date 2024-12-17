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

public class FBBodyTracking {

    public static final int XR_FB_body_tracking_SPEC_VERSION = 1;

    public static final String XR_FB_BODY_TRACKING_EXTENSION_NAME = "XR_FB_body_tracking";

    public static final int XR_OBJECT_TYPE_BODY_TRACKER_FB = 1000076000;

    public static final int
        XR_TYPE_BODY_TRACKER_CREATE_INFO_FB        = 1000076001,
        XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB         = 1000076002,
        XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB = 1000076004,
        XR_TYPE_BODY_JOINT_LOCATIONS_FB            = 1000076005,
        XR_TYPE_BODY_SKELETON_FB                   = 1000076006;

    public static final int
        XR_BODY_JOINT_ROOT_FB                           = 0,
        XR_BODY_JOINT_HIPS_FB                           = 1,
        XR_BODY_JOINT_SPINE_LOWER_FB                    = 2,
        XR_BODY_JOINT_SPINE_MIDDLE_FB                   = 3,
        XR_BODY_JOINT_SPINE_UPPER_FB                    = 4,
        XR_BODY_JOINT_CHEST_FB                          = 5,
        XR_BODY_JOINT_NECK_FB                           = 6,
        XR_BODY_JOINT_HEAD_FB                           = 7,
        XR_BODY_JOINT_LEFT_SHOULDER_FB                  = 8,
        XR_BODY_JOINT_LEFT_SCAPULA_FB                   = 9,
        XR_BODY_JOINT_LEFT_ARM_UPPER_FB                 = 10,
        XR_BODY_JOINT_LEFT_ARM_LOWER_FB                 = 11,
        XR_BODY_JOINT_LEFT_HAND_WRIST_TWIST_FB          = 12,
        XR_BODY_JOINT_RIGHT_SHOULDER_FB                 = 13,
        XR_BODY_JOINT_RIGHT_SCAPULA_FB                  = 14,
        XR_BODY_JOINT_RIGHT_ARM_UPPER_FB                = 15,
        XR_BODY_JOINT_RIGHT_ARM_LOWER_FB                = 16,
        XR_BODY_JOINT_RIGHT_HAND_WRIST_TWIST_FB         = 17,
        XR_BODY_JOINT_LEFT_HAND_PALM_FB                 = 18,
        XR_BODY_JOINT_LEFT_HAND_WRIST_FB                = 19,
        XR_BODY_JOINT_LEFT_HAND_THUMB_METACARPAL_FB     = 20,
        XR_BODY_JOINT_LEFT_HAND_THUMB_PROXIMAL_FB       = 21,
        XR_BODY_JOINT_LEFT_HAND_THUMB_DISTAL_FB         = 22,
        XR_BODY_JOINT_LEFT_HAND_THUMB_TIP_FB            = 23,
        XR_BODY_JOINT_LEFT_HAND_INDEX_METACARPAL_FB     = 24,
        XR_BODY_JOINT_LEFT_HAND_INDEX_PROXIMAL_FB       = 25,
        XR_BODY_JOINT_LEFT_HAND_INDEX_INTERMEDIATE_FB   = 26,
        XR_BODY_JOINT_LEFT_HAND_INDEX_DISTAL_FB         = 27,
        XR_BODY_JOINT_LEFT_HAND_INDEX_TIP_FB            = 28,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_METACARPAL_FB    = 29,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_PROXIMAL_FB      = 30,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_INTERMEDIATE_FB  = 31,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_DISTAL_FB        = 32,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_TIP_FB           = 33,
        XR_BODY_JOINT_LEFT_HAND_RING_METACARPAL_FB      = 34,
        XR_BODY_JOINT_LEFT_HAND_RING_PROXIMAL_FB        = 35,
        XR_BODY_JOINT_LEFT_HAND_RING_INTERMEDIATE_FB    = 36,
        XR_BODY_JOINT_LEFT_HAND_RING_DISTAL_FB          = 37,
        XR_BODY_JOINT_LEFT_HAND_RING_TIP_FB             = 38,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_METACARPAL_FB    = 39,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_PROXIMAL_FB      = 40,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_INTERMEDIATE_FB  = 41,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_DISTAL_FB        = 42,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_TIP_FB           = 43,
        XR_BODY_JOINT_RIGHT_HAND_PALM_FB                = 44,
        XR_BODY_JOINT_RIGHT_HAND_WRIST_FB               = 45,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_METACARPAL_FB    = 46,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_PROXIMAL_FB      = 47,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_DISTAL_FB        = 48,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_TIP_FB           = 49,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_METACARPAL_FB    = 50,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_PROXIMAL_FB      = 51,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_INTERMEDIATE_FB  = 52,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_DISTAL_FB        = 53,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_TIP_FB           = 54,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_METACARPAL_FB   = 55,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_PROXIMAL_FB     = 56,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_INTERMEDIATE_FB = 57,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_DISTAL_FB       = 58,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_TIP_FB          = 59,
        XR_BODY_JOINT_RIGHT_HAND_RING_METACARPAL_FB     = 60,
        XR_BODY_JOINT_RIGHT_HAND_RING_PROXIMAL_FB       = 61,
        XR_BODY_JOINT_RIGHT_HAND_RING_INTERMEDIATE_FB   = 62,
        XR_BODY_JOINT_RIGHT_HAND_RING_DISTAL_FB         = 63,
        XR_BODY_JOINT_RIGHT_HAND_RING_TIP_FB            = 64,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_METACARPAL_FB   = 65,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_PROXIMAL_FB     = 66,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_INTERMEDIATE_FB = 67,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_DISTAL_FB       = 68,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_TIP_FB          = 69,
        XR_BODY_JOINT_COUNT_FB                          = 70,
        XR_BODY_JOINT_NONE_FB                           = -1;

    public static final int XR_BODY_JOINT_SET_DEFAULT_FB = 0;

    protected FBBodyTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateBodyTrackerFB ] ---

    /** {@code XrResult xrCreateBodyTrackerFB(XrSession session, XrBodyTrackerCreateInfoFB const * createInfo, XrBodyTrackerFB * bodyTracker)} */
    public static int nxrCreateBodyTrackerFB(XrSession session, long createInfo, long bodyTracker) {
        long __functionAddress = session.getCapabilities().xrCreateBodyTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, bodyTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateBodyTrackerFB(XrSession session, XrBodyTrackerCreateInfoFB const * createInfo, XrBodyTrackerFB * bodyTracker)} */
    @NativeType("XrResult")
    public static int xrCreateBodyTrackerFB(XrSession session, @NativeType("XrBodyTrackerCreateInfoFB const *") XrBodyTrackerCreateInfoFB createInfo, @NativeType("XrBodyTrackerFB *") PointerBuffer bodyTracker) {
        if (CHECKS) {
            check(bodyTracker, 1);
        }
        return nxrCreateBodyTrackerFB(session, createInfo.address(), memAddress(bodyTracker));
    }

    // --- [ xrDestroyBodyTrackerFB ] ---

    /** {@code XrResult xrDestroyBodyTrackerFB(XrBodyTrackerFB bodyTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyBodyTrackerFB(XrBodyTrackerFB bodyTracker) {
        long __functionAddress = bodyTracker.getCapabilities().xrDestroyBodyTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(bodyTracker.address(), __functionAddress);
    }

    // --- [ xrLocateBodyJointsFB ] ---

    /** {@code XrResult xrLocateBodyJointsFB(XrBodyTrackerFB bodyTracker, XrBodyJointsLocateInfoFB const * locateInfo, XrBodyJointLocationsFB * locations)} */
    public static int nxrLocateBodyJointsFB(XrBodyTrackerFB bodyTracker, long locateInfo, long locations) {
        long __functionAddress = bodyTracker.getCapabilities().xrLocateBodyJointsFB;
        if (CHECKS) {
            check(__functionAddress);
            XrBodyJointsLocateInfoFB.validate(locateInfo);
        }
        return callPPPI(bodyTracker.address(), locateInfo, locations, __functionAddress);
    }

    /** {@code XrResult xrLocateBodyJointsFB(XrBodyTrackerFB bodyTracker, XrBodyJointsLocateInfoFB const * locateInfo, XrBodyJointLocationsFB * locations)} */
    @NativeType("XrResult")
    public static int xrLocateBodyJointsFB(XrBodyTrackerFB bodyTracker, @NativeType("XrBodyJointsLocateInfoFB const *") XrBodyJointsLocateInfoFB locateInfo, @NativeType("XrBodyJointLocationsFB *") XrBodyJointLocationsFB locations) {
        return nxrLocateBodyJointsFB(bodyTracker, locateInfo.address(), locations.address());
    }

    // --- [ xrGetBodySkeletonFB ] ---

    /** {@code XrResult xrGetBodySkeletonFB(XrBodyTrackerFB bodyTracker, XrBodySkeletonFB * skeleton)} */
    public static int nxrGetBodySkeletonFB(XrBodyTrackerFB bodyTracker, long skeleton) {
        long __functionAddress = bodyTracker.getCapabilities().xrGetBodySkeletonFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(bodyTracker.address(), skeleton, __functionAddress);
    }

    /** {@code XrResult xrGetBodySkeletonFB(XrBodyTrackerFB bodyTracker, XrBodySkeletonFB * skeleton)} */
    @NativeType("XrResult")
    public static int xrGetBodySkeletonFB(XrBodyTrackerFB bodyTracker, @NativeType("XrBodySkeletonFB *") XrBodySkeletonFB skeleton) {
        return nxrGetBodySkeletonFB(bodyTracker, skeleton.address());
    }

}