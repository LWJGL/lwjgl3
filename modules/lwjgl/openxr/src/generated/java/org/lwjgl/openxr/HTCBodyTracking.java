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

public class HTCBodyTracking {

    public static final int XR_HTC_body_tracking_SPEC_VERSION = 1;

    public static final String XR_HTC_BODY_TRACKING_EXTENSION_NAME = "XR_HTC_body_tracking";

    public static final int XR_OBJECT_TYPE_BODY_TRACKER_HTC = 1000320000;

    public static final int
        XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC = 1000320000,
        XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC        = 1000320001,
        XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC         = 1000320002,
        XR_TYPE_BODY_JOINT_LOCATIONS_HTC            = 1000320003,
        XR_TYPE_BODY_SKELETON_HTC                   = 1000320004;

    public static final int
        XR_BODY_JOINT_PELVIS_HTC         = 0,
        XR_BODY_JOINT_LEFT_HIP_HTC       = 1,
        XR_BODY_JOINT_LEFT_KNEE_HTC      = 2,
        XR_BODY_JOINT_LEFT_ANKLE_HTC     = 3,
        XR_BODY_JOINT_LEFT_FEET_HTC      = 4,
        XR_BODY_JOINT_RIGHT_HIP_HTC      = 5,
        XR_BODY_JOINT_RIGHT_KNEE_HTC     = 6,
        XR_BODY_JOINT_RIGHT_ANKLE_HTC    = 7,
        XR_BODY_JOINT_RIGHT_FEET_HTC     = 8,
        XR_BODY_JOINT_WAIST_HTC          = 9,
        XR_BODY_JOINT_SPINE_LOWER_HTC    = 10,
        XR_BODY_JOINT_SPINE_MIDDLE_HTC   = 11,
        XR_BODY_JOINT_SPINE_HIGH_HTC     = 12,
        XR_BODY_JOINT_CHEST_HTC          = 13,
        XR_BODY_JOINT_NECK_HTC           = 14,
        XR_BODY_JOINT_HEAD_HTC           = 15,
        XR_BODY_JOINT_LEFT_CLAVICLE_HTC  = 16,
        XR_BODY_JOINT_LEFT_SCAPULA_HTC   = 17,
        XR_BODY_JOINT_LEFT_ARM_HTC       = 18,
        XR_BODY_JOINT_LEFT_ELBOW_HTC     = 19,
        XR_BODY_JOINT_LEFT_WRIST_HTC     = 20,
        XR_BODY_JOINT_RIGHT_CLAVICLE_HTC = 21,
        XR_BODY_JOINT_RIGHT_SCAPULA_HTC  = 22,
        XR_BODY_JOINT_RIGHT_ARM_HTC      = 23,
        XR_BODY_JOINT_RIGHT_ELBOW_HTC    = 24,
        XR_BODY_JOINT_RIGHT_WRIST_HTC    = 25;

    public static final int XR_BODY_JOINT_SET_FULL_HTC = 0;

    public static final int
        XR_BODY_JOINT_CONFIDENCE_NONE_HTC = 0,
        XR_BODY_JOINT_CONFIDENCE_LOW_HTC  = 1,
        XR_BODY_JOINT_CONFIDENCE_HIGH_HTC = 2;

    public static final int XR_BODY_JOINT_COUNT_HTC = 0x1A;

    protected HTCBodyTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateBodyTrackerHTC ] ---

    /** {@code XrResult xrCreateBodyTrackerHTC(XrSession session, XrBodyTrackerCreateInfoHTC const * createInfo, XrBodyTrackerHTC * bodyTracker)} */
    public static int nxrCreateBodyTrackerHTC(XrSession session, long createInfo, long bodyTracker) {
        long __functionAddress = session.getCapabilities().xrCreateBodyTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, bodyTracker, __functionAddress);
    }

    /** {@code XrResult xrCreateBodyTrackerHTC(XrSession session, XrBodyTrackerCreateInfoHTC const * createInfo, XrBodyTrackerHTC * bodyTracker)} */
    @NativeType("XrResult")
    public static int xrCreateBodyTrackerHTC(XrSession session, @NativeType("XrBodyTrackerCreateInfoHTC const *") XrBodyTrackerCreateInfoHTC createInfo, @NativeType("XrBodyTrackerHTC *") PointerBuffer bodyTracker) {
        if (CHECKS) {
            check(bodyTracker, 1);
        }
        return nxrCreateBodyTrackerHTC(session, createInfo.address(), memAddress(bodyTracker));
    }

    // --- [ xrDestroyBodyTrackerHTC ] ---

    /** {@code XrResult xrDestroyBodyTrackerHTC(XrBodyTrackerHTC bodyTracker)} */
    @NativeType("XrResult")
    public static int xrDestroyBodyTrackerHTC(XrBodyTrackerHTC bodyTracker) {
        long __functionAddress = bodyTracker.getCapabilities().xrDestroyBodyTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(bodyTracker.address(), __functionAddress);
    }

    // --- [ xrLocateBodyJointsHTC ] ---

    /** {@code XrResult xrLocateBodyJointsHTC(XrBodyTrackerHTC bodyTracker, XrBodyJointsLocateInfoHTC const * locateInfo, XrBodyJointLocationsHTC * locations)} */
    public static int nxrLocateBodyJointsHTC(XrBodyTrackerHTC bodyTracker, long locateInfo, long locations) {
        long __functionAddress = bodyTracker.getCapabilities().xrLocateBodyJointsHTC;
        if (CHECKS) {
            check(__functionAddress);
            XrBodyJointsLocateInfoHTC.validate(locateInfo);
        }
        return callPPPI(bodyTracker.address(), locateInfo, locations, __functionAddress);
    }

    /** {@code XrResult xrLocateBodyJointsHTC(XrBodyTrackerHTC bodyTracker, XrBodyJointsLocateInfoHTC const * locateInfo, XrBodyJointLocationsHTC * locations)} */
    @NativeType("XrResult")
    public static int xrLocateBodyJointsHTC(XrBodyTrackerHTC bodyTracker, @NativeType("XrBodyJointsLocateInfoHTC const *") XrBodyJointsLocateInfoHTC locateInfo, @NativeType("XrBodyJointLocationsHTC *") XrBodyJointLocationsHTC locations) {
        return nxrLocateBodyJointsHTC(bodyTracker, locateInfo.address(), locations.address());
    }

    // --- [ xrGetBodySkeletonHTC ] ---

    /** {@code XrResult xrGetBodySkeletonHTC(XrBodyTrackerHTC bodyTracker, XrSpace baseSpace, uint32_t skeletonGenerationId, XrBodySkeletonHTC * skeleton)} */
    public static int nxrGetBodySkeletonHTC(XrBodyTrackerHTC bodyTracker, XrSpace baseSpace, int skeletonGenerationId, long skeleton) {
        long __functionAddress = bodyTracker.getCapabilities().xrGetBodySkeletonHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(bodyTracker.address(), baseSpace.address(), skeletonGenerationId, skeleton, __functionAddress);
    }

    /** {@code XrResult xrGetBodySkeletonHTC(XrBodyTrackerHTC bodyTracker, XrSpace baseSpace, uint32_t skeletonGenerationId, XrBodySkeletonHTC * skeleton)} */
    @NativeType("XrResult")
    public static int xrGetBodySkeletonHTC(XrBodyTrackerHTC bodyTracker, XrSpace baseSpace, @NativeType("uint32_t") int skeletonGenerationId, @NativeType("XrBodySkeletonHTC *") XrBodySkeletonHTC skeleton) {
        return nxrGetBodySkeletonHTC(bodyTracker, baseSpace, skeletonGenerationId, skeleton.address());
    }

}