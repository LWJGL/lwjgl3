/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_hand_tracking_aim = "FBHandTrackingAim".nativeClassXR("FB_hand_tracking_aim", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_hand_tracking_aim_SPEC_VERSION".."2"
    )

    StringConstant(
        "FB_HAND_TRACKING_AIM_EXTENSION_NAME".."XR_FB_hand_tracking_aim"
    )

    EnumConstant(
        "TYPE_HAND_TRACKING_AIM_STATE_FB".."1000111001"
    )

    EnumConstant(
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