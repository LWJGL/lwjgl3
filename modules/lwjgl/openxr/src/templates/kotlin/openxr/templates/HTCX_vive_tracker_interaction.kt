/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTCX_vive_tracker_interaction = "HTCXViveTrackerInteraction".nativeClassXR("HTCX_vive_tracker_interaction", type = "instance", postfix = "HTCX") {
    IntConstant(
        "HTCX_vive_tracker_interaction_SPEC_VERSION".."3"
    )

    StringConstant(
        "HTCX_VIVE_TRACKER_INTERACTION_EXTENSION_NAME".."XR_HTCX_vive_tracker_interaction"
    )

    EnumConstant(
        "TYPE_VIVE_TRACKER_PATHS_HTCX".."1000103000",
        "TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX".."1000103001"
    )

    XrResult(
        "EnumerateViveTrackerPathsHTCX",

        XrInstance("instance"),
        AutoSize("paths")..uint32_t("pathCapacityInput"),
        Check(1)..uint32_t.p("pathCountOutput"),
        nullable..XrViveTrackerPathsHTCX.p("paths")
    )
}