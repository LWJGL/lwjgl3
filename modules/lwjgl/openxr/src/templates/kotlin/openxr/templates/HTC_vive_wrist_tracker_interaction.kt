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
        The $templateName extension.
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