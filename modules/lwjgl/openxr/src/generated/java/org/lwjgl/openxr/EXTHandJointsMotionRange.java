/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** The EXT_hand_joints_motion_range extension. */
public final class EXTHandJointsMotionRange {

    /** The extension specification version. */
    public static final int XR_EXT_hand_joints_motion_range_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_HAND_JOINTS_MOTION_RANGE_EXTENSION_NAME = "XR_EXT_hand_joints_motion_range";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT = 1000080000;

    /**
     * XrHandJointsMotionRangeEXT - Describes the hand animation range of motion.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT} This option refers to the range of motion of a human hand, without any obstructions. Input systems that obstruct the movement of the user’s hand (e.g.: a held controller preventing the user from making a fist) or have only limited ability to track finger positions <b>must</b> use the information available to them to emulate an unobstructed range of motion.</li>
     * <li>{@link #XR_HAND_JOINTS_MOTION_RANGE_CONFORMING_TO_CONTROLLER_EXT HAND_JOINTS_MOTION_RANGE_CONFORMING_TO_CONTROLLER_EXT} This option refers to the range of motion of the hand joints taking into account any physical limits imposed by the controller itself. This will tend to be the most accurate pose compared to the user’s actual hand pose, but might not allow a closed fist for example.
     * 
     * <ul>
     * <li>If the current interaction profile represents a controller, or other device that obstructs the hand, the implementation <b>must</b> return joint locations conforming to the shape of that device. If the current interaction profile is being emulated by a different physical controller, the implementation <b>may</b> return joint locations conforming to the shape of either the current interaction profile or the actual physical controller.</li>
     * <li>If the current interaction profile does not represent a controller, the implementation <b>must</b> return joint locations based on the unobstructed joint locations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandJointsMotionRangeInfoEXT}, {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT}</p>
     */
    public static final int
        XR_HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT             = 1,
        XR_HAND_JOINTS_MOTION_RANGE_CONFORMING_TO_CONTROLLER_EXT = 2;

    private EXTHandJointsMotionRange() {}

}