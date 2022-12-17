/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_hand_tracking_aim = "FBHandTrackingAim".nativeClassXR("FB_hand_tracking_aim", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_hand_tracking_aim">XR_FB_hand_tracking_aim</a> extension.

        The {@link EXTHandTracking XR_EXT_hand_tracking} extension provides a list of hand joint poses which represent the current configuration of the tracked hands. This extension adds a layer of gesture recognition that is used by the system.

        This extension allows:

        <ul>
            <li>An application to get a set of basic gesture states for the hand when using the {@link EXTHandTracking XR_EXT_hand_tracking} extension.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "FB_hand_tracking_aim_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "FB_HAND_TRACKING_AIM_EXTENSION_NAME".."XR_FB_hand_tracking_aim"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_HAND_TRACKING_AIM_STATE_FB".."1000111001"
    )

    EnumConstant(
        """
        XrHandTrackingAimFlagBitsFB - XrHandTrackingAimFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#HAND_TRACKING_AIM_COMPUTED_BIT_FB — Aiming data is computed from additional sources beyond the hand data in the base structure</li>
            <li>#HAND_TRACKING_AIM_VALID_BIT_FB — Aiming data is valid</li>
            <li>#HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB — Index finger pinch discrete signal</li>
            <li>#HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB — Middle finger pinch discrete signal</li>
            <li>#HAND_TRACKING_AIM_RING_PINCHING_BIT_FB — Ring finger pinch discrete signal</li>
            <li>#HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB — Little finger pinch discrete signal</li>
            <li>#HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB — System gesture is active</li>
            <li>#HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB — Hand is currently marked as dominant for the system</li>
            <li>#HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB — System menu gesture is active</li>
        </ul>
        """,

        "HAND_TRACKING_AIM_COMPUTED_BIT_FB".enum(0x00000001),
        "HAND_TRACKING_AIM_VALID_BIT_FB".enum(0x00000002),
        "HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB".enum(0x00000004),
        "HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB".enum(0x00000008),
        "HAND_TRACKING_AIM_RING_PINCHING_BIT_FB".enum(0x00000010),
        "HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB".enum(0x00000020),
        "HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB".enum(0x00000040),
        "HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB".enum(0x00000080),
        "HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB".enum(0x00000100)
    )
}