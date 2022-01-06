/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** The FB_hand_tracking_aim extension. */
public final class FBHandTrackingAim {

    /** The extension specification version. */
    public static final int XR_FB_hand_tracking_aim_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_HAND_TRACKING_AIM_EXTENSION_NAME = "XR_FB_hand_tracking_aim";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_HAND_TRACKING_AIM_STATE_FB = 1000111001;

    /**
     * XrHandTrackingAimFlagBitsFB
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_TRACKING_AIM_COMPUTED_BIT_FB HAND_TRACKING_AIM_COMPUTED_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_VALID_BIT_FB HAND_TRACKING_AIM_VALID_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_RING_PINCHING_BIT_FB HAND_TRACKING_AIM_RING_PINCHING_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB}</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB}</li>
     * </ul>
     */
    public static final int
        XR_HAND_TRACKING_AIM_COMPUTED_BIT_FB        = 0x1,
        XR_HAND_TRACKING_AIM_VALID_BIT_FB           = 0x2,
        XR_HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB  = 0x4,
        XR_HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB = 0x8,
        XR_HAND_TRACKING_AIM_RING_PINCHING_BIT_FB   = 0x10,
        XR_HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB = 0x20,
        XR_HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB  = 0x40,
        XR_HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB   = 0x80,
        XR_HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB    = 0x100;

    private FBHandTrackingAim() {}

}