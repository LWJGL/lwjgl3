/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_hand_tracking_aim">XR_FB_hand_tracking_aim</a> extension.
 * 
 * <p>The {@link EXTHandTracking XR_EXT_hand_tracking} extension provides a list of hand joint poses which represent the current configuration of the tracked hands. This extension adds a layer of gesture recognition that is used by the system.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to get a set of basic gesture states for the hand when using the {@link EXTHandTracking XR_EXT_hand_tracking} extension.</li>
 * </ul>
 */
public final class FBHandTrackingAim {

    /** The extension specification version. */
    public static final int XR_FB_hand_tracking_aim_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_FB_HAND_TRACKING_AIM_EXTENSION_NAME = "XR_FB_hand_tracking_aim";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_HAND_TRACKING_AIM_STATE_FB = 1000111001;

    /**
     * XrHandTrackingAimFlagBitsFB - XrHandTrackingAimFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_TRACKING_AIM_COMPUTED_BIT_FB HAND_TRACKING_AIM_COMPUTED_BIT_FB} — Aiming data is computed from additional sources beyond the hand data in the base structure</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_VALID_BIT_FB HAND_TRACKING_AIM_VALID_BIT_FB} — Aiming data is valid</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB} — Index finger pinch discrete signal</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB} — Middle finger pinch discrete signal</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_RING_PINCHING_BIT_FB HAND_TRACKING_AIM_RING_PINCHING_BIT_FB} — Ring finger pinch discrete signal</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB} — Little finger pinch discrete signal</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB} — System gesture is active</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB} — Hand is currently marked as dominant for the system</li>
     * <li>{@link #XR_HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB} — System menu gesture is active</li>
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