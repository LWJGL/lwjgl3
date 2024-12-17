/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_marker_tracking = "VARJOMarkerTracking".nativeClassXR("VARJO_marker_tracking", type = "instance", postfix = "VARJO") {
    IntConstant(
        "VARJO_marker_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "VARJO_MARKER_TRACKING_EXTENSION_NAME".."XR_VARJO_marker_tracking"
    )

    EnumConstant(
        "TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO".."1000124000",
        "TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO".."1000124001",
        "TYPE_MARKER_SPACE_CREATE_INFO_VARJO".."1000124002"
    )

    EnumConstant(
        "ERROR_MARKER_NOT_TRACKED_VARJO".."-1000124000",
        "ERROR_MARKER_ID_INVALID_VARJO".."-1000124001"
    )

    XrResult(
        "SetMarkerTrackingVARJO",

        XrSession("session"),
        XrBool32("enabled")
    )

    XrResult(
        "SetMarkerTrackingTimeoutVARJO",

        XrSession("session"),
        uint64_t("markerId"),
        XrDuration("timeout")
    )

    XrResult(
        "SetMarkerTrackingPredictionVARJO",

        XrSession("session"),
        uint64_t("markerId"),
        XrBool32("enable")
    )

    XrResult(
        "GetMarkerSizeVARJO",

        XrSession("session"),
        uint64_t("markerId"),
        XrExtent2Df.p("size")
    )

    XrResult(
        "CreateMarkerSpaceVARJO",

        XrSession("session"),
        XrMarkerSpaceCreateInfoVARJO.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )
}