/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_hand_tracking_capsules">XR_FB_hand_tracking_capsules</a> extension.
 * 
 * <p>The {@link EXTHandTracking XR_EXT_hand_tracking} extension provides a list of hand joint poses which include a collision sphere for each joint. However some physics systems prefer to use capsules as a collision stand in for the hands.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to get a list of capsules that represent the volume of the hand when using the {@link EXTHandTracking XR_EXT_hand_tracking} extension.</li>
 * </ul>
 */
public final class FBHandTrackingCapsules {

    /** The extension specification version. */
    public static final int XR_FB_hand_tracking_capsules_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_FB_HAND_TRACKING_CAPSULES_EXTENSION_NAME = "XR_FB_hand_tracking_capsules";

    /** XR_HAND_TRACKING_CAPSULE_POINT_COUNT_FB */
    public static final int XR_HAND_TRACKING_CAPSULE_POINT_COUNT_FB = 2;

    /** XR_HAND_TRACKING_CAPSULE_COUNT_FB */
    public static final int XR_HAND_TRACKING_CAPSULE_COUNT_FB = 19;

    /** XR_FB_HAND_TRACKING_CAPSULE_POINT_COUNT */
    public static final int XR_FB_HAND_TRACKING_CAPSULE_POINT_COUNT = 2;

    /** XR_FB_HAND_TRACKING_CAPSULE_COUNT */
    public static final int XR_FB_HAND_TRACKING_CAPSULE_COUNT = 19;

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_HAND_TRACKING_CAPSULES_STATE_FB = 1000112000;

    private FBHandTrackingCapsules() {}

}