/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_vive_wrist_tracker_interaction = "HTCViveWristTrackerInteraction".nativeClassXR("HTC_vive_wrist_tracker_interaction", type = "instance", postfix = "HTC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HTC_vive_wrist_tracker_interaction">XR_HTC_vive_wrist_tracker_interaction</a> extension.

        This extension provides an {@code XrPath} for getting device input from a VIVE wrist tracker to enable its interactions. VIVE wrist tracker is a tracked device mainly worn on user’s wrist for pose tracking. Besides this use case, user also can tie it to a physical object to track its object pose, e.g. tie on a gun.
        """

    IntConstant(
        "The extension specification version.",

        "HTC_vive_wrist_tracker_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_VIVE_WRIST_TRACKER_INTERACTION_EXTENSION_NAME".."XR_HTC_vive_wrist_tracker_interaction"
    )
}