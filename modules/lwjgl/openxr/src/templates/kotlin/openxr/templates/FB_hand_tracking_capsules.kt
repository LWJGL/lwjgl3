/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_hand_tracking_capsules = "FBHandTrackingCapsules".nativeClassXR("FB_hand_tracking_capsules", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_hand_tracking_capsules_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "FB_HAND_TRACKING_CAPSULES_EXTENSION_NAME".."XR_FB_hand_tracking_capsules"
    )

    EnumConstant(
        "XR_HAND_TRACKING_CAPSULE_POINT_COUNT_FB",

        "HAND_TRACKING_CAPSULE_POINT_COUNT_FB".."2"
    )

    EnumConstant(
        "XR_HAND_TRACKING_CAPSULE_COUNT_FB",

        "HAND_TRACKING_CAPSULE_COUNT_FB".."19"
    )

    EnumConstant(
        "XR_FB_HAND_TRACKING_CAPSULE_POINT_COUNT",

        "FB_HAND_TRACKING_CAPSULE_POINT_COUNT".."2"
    )

    EnumConstant(
        "XR_FB_HAND_TRACKING_CAPSULE_COUNT",

        "FB_HAND_TRACKING_CAPSULE_COUNT".."19"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_HAND_TRACKING_CAPSULES_STATE_FB".."1000112000"
    )
}