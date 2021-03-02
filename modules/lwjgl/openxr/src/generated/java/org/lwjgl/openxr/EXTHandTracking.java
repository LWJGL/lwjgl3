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

/** The EXT_hand_tracking extension. */
public class EXTHandTracking {

    /** The extension specification version. */
    public static final int XR_EXT_hand_tracking_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_EXT_HAND_TRACKING_EXTENSION_NAME = "XR_EXT_hand_tracking";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_HAND_TRACKER_EXT = 1000051000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_TRACKER_CREATE_INFO_EXT TYPE_HAND_TRACKER_CREATE_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT TYPE_HAND_JOINTS_LOCATE_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_JOINT_LOCATIONS_EXT TYPE_HAND_JOINT_LOCATIONS_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_JOINT_VELOCITIES_EXT TYPE_HAND_JOINT_VELOCITIES_EXT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT = 1000051000,
        XR_TYPE_HAND_TRACKER_CREATE_INFO_EXT        = 1000051001,
        XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT         = 1000051002,
        XR_TYPE_HAND_JOINT_LOCATIONS_EXT            = 1000051003,
        XR_TYPE_HAND_JOINT_VELOCITIES_EXT           = 1000051004;

    /**
     * XrHandEXT
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_LEFT_EXT HAND_LEFT_EXT}</li>
     * <li>{@link #XR_HAND_RIGHT_EXT HAND_RIGHT_EXT}</li>
     * </ul>
     */
    public static final int
        XR_HAND_LEFT_EXT  = 1,
        XR_HAND_RIGHT_EXT = 2;

    /**
     * XrHandJointEXT
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_JOINT_PALM_EXT HAND_JOINT_PALM_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_WRIST_EXT HAND_JOINT_WRIST_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_METACARPAL_EXT HAND_JOINT_THUMB_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_PROXIMAL_EXT HAND_JOINT_THUMB_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_DISTAL_EXT HAND_JOINT_THUMB_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_TIP_EXT HAND_JOINT_THUMB_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_METACARPAL_EXT HAND_JOINT_INDEX_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_PROXIMAL_EXT HAND_JOINT_INDEX_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_INTERMEDIATE_EXT HAND_JOINT_INDEX_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_DISTAL_EXT HAND_JOINT_INDEX_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_TIP_EXT HAND_JOINT_INDEX_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_METACARPAL_EXT HAND_JOINT_MIDDLE_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_PROXIMAL_EXT HAND_JOINT_MIDDLE_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_INTERMEDIATE_EXT HAND_JOINT_MIDDLE_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_DISTAL_EXT HAND_JOINT_MIDDLE_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_TIP_EXT HAND_JOINT_MIDDLE_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_METACARPAL_EXT HAND_JOINT_RING_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_PROXIMAL_EXT HAND_JOINT_RING_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_INTERMEDIATE_EXT HAND_JOINT_RING_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_DISTAL_EXT HAND_JOINT_RING_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_TIP_EXT HAND_JOINT_RING_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_METACARPAL_EXT HAND_JOINT_LITTLE_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_PROXIMAL_EXT HAND_JOINT_LITTLE_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_INTERMEDIATE_EXT HAND_JOINT_LITTLE_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_DISTAL_EXT HAND_JOINT_LITTLE_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_TIP_EXT HAND_JOINT_LITTLE_TIP_EXT}</li>
     * </ul>
     */
    public static final int
        XR_HAND_JOINT_PALM_EXT                = 0,
        XR_HAND_JOINT_WRIST_EXT               = 1,
        XR_HAND_JOINT_THUMB_METACARPAL_EXT    = 2,
        XR_HAND_JOINT_THUMB_PROXIMAL_EXT      = 3,
        XR_HAND_JOINT_THUMB_DISTAL_EXT        = 4,
        XR_HAND_JOINT_THUMB_TIP_EXT           = 5,
        XR_HAND_JOINT_INDEX_METACARPAL_EXT    = 6,
        XR_HAND_JOINT_INDEX_PROXIMAL_EXT      = 7,
        XR_HAND_JOINT_INDEX_INTERMEDIATE_EXT  = 8,
        XR_HAND_JOINT_INDEX_DISTAL_EXT        = 9,
        XR_HAND_JOINT_INDEX_TIP_EXT           = 10,
        XR_HAND_JOINT_MIDDLE_METACARPAL_EXT   = 11,
        XR_HAND_JOINT_MIDDLE_PROXIMAL_EXT     = 12,
        XR_HAND_JOINT_MIDDLE_INTERMEDIATE_EXT = 13,
        XR_HAND_JOINT_MIDDLE_DISTAL_EXT       = 14,
        XR_HAND_JOINT_MIDDLE_TIP_EXT          = 15,
        XR_HAND_JOINT_RING_METACARPAL_EXT     = 16,
        XR_HAND_JOINT_RING_PROXIMAL_EXT       = 17,
        XR_HAND_JOINT_RING_INTERMEDIATE_EXT   = 18,
        XR_HAND_JOINT_RING_DISTAL_EXT         = 19,
        XR_HAND_JOINT_RING_TIP_EXT            = 20,
        XR_HAND_JOINT_LITTLE_METACARPAL_EXT   = 21,
        XR_HAND_JOINT_LITTLE_PROXIMAL_EXT     = 22,
        XR_HAND_JOINT_LITTLE_INTERMEDIATE_EXT = 23,
        XR_HAND_JOINT_LITTLE_DISTAL_EXT       = 24,
        XR_HAND_JOINT_LITTLE_TIP_EXT          = 25;

    /** XrHandJointSetEXT */
    public static final int XR_HAND_JOINT_SET_DEFAULT_EXT = 0;

    protected EXTHandTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateHandTrackerEXT ] ---

    public static int nxrCreateHandTrackerEXT(XrSession session, long createInfo, long handTracker) {
        long __functionAddress = session.getCapabilities().xrCreateHandTrackerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, handTracker, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateHandTrackerEXT(XrSession session, @NativeType("XrHandTrackerCreateInfoEXT const *") XrHandTrackerCreateInfoEXT createInfo, @NativeType("XrHandTrackerEXT *") PointerBuffer handTracker) {
        if (CHECKS) {
            check(handTracker, 1);
        }
        return nxrCreateHandTrackerEXT(session, createInfo.address(), memAddress(handTracker));
    }

    // --- [ xrDestroyHandTrackerEXT ] ---

    @NativeType("XrResult")
    public static int xrDestroyHandTrackerEXT(XrHandTrackerEXT handTracker) {
        long __functionAddress = handTracker.getCapabilities().xrDestroyHandTrackerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(handTracker.address(), __functionAddress);
    }

    // --- [ xrLocateHandJointsEXT ] ---

    public static int nxrLocateHandJointsEXT(XrHandTrackerEXT handTracker, long locateInfo, long locations) {
        long __functionAddress = handTracker.getCapabilities().xrLocateHandJointsEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrHandJointsLocateInfoEXT.validate(locateInfo);
        }
        return callPPPI(handTracker.address(), locateInfo, locations, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrLocateHandJointsEXT(XrHandTrackerEXT handTracker, @NativeType("XrHandJointsLocateInfoEXT const *") XrHandJointsLocateInfoEXT locateInfo, @NativeType("XrHandJointLocationsEXT *") XrHandJointLocationsEXT locations) {
        return nxrLocateHandJointsEXT(handTracker, locateInfo.address(), locations.address());
    }

}