/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_geospatial = "ANDROIDGeospatial".nativeClassXR("ANDROID_geospatial", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_geospatial_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_GEOSPATIAL_EXTENSION_NAME".."XR_ANDROID_geospatial"
    )

    EnumConstant(
        "TYPE_SYSTEM_GEOSPATIAL_PROPERTIES_ANDROID".."1000789000",
        "TYPE_GEOSPATIAL_TRACKER_CREATE_INFO_ANDROID".."1000789001",
        "TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID".."1000789002",
        "TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID".."1000789003",
        "TYPE_GEOSPATIAL_POSE_RESULT_ANDROID".."1000789004",
        "TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID".."1000789005",
        "TYPE_VPS_AVAILABILITY_CHECK_COMPLETION_ANDROID".."1000789006"
    )

    EnumConstant(
        "OBJECT_TYPE_GEOSPATIAL_TRACKER_ANDROID".."1000789000"
    )

    EnumConstant(
        "ERROR_GEOSPATIAL_TRACKER_NOT_RUNNING_ANDROID".."-1000789000",
        "ERROR_GEOSPATIAL_COORDINATES_INVALID_ANDROID".."-1000789001",
        "ERROR_GEOSPATIAL_CLOUD_AUTH_FAILED_ANDROID".."-1000789002"
    )

    EnumConstant(
        "GEOSPATIAL_TRACKER_STATE_STOPPED_ANDROID".."0",
        "GEOSPATIAL_TRACKER_STATE_RUNNING_ANDROID".."1",
        "GEOSPATIAL_TRACKER_STATE_INITIALIZATION_FAILED_ANDROID".."2"
    )

    EnumConstant(
        "GEOSPATIAL_POSE_ORIENTATION_VALID_BIT_ANDROID".enum(0x00000001),
        "GEOSPATIAL_POSE_POSITION_VALID_BIT_ANDROID".enum(0x00000002)
    )

    EnumConstant(
        "VPS_AVAILABILITY_UNAVAILABLE_ANDROID".."1",
        "VPS_AVAILABILITY_AVAILABLE_ANDROID".."2"
    )

    XrResult(
        "CreateGeospatialTrackerANDROID",

        XrSession("session"),
        XrGeospatialTrackerCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrGeospatialTrackerANDROID.p("geospatialTrackerOutput")
    )

    XrResult(
        "DestroyGeospatialTrackerANDROID",

        XrGeospatialTrackerANDROID("geospatialTracker")
    )

    XrResult(
        "LocateGeospatialPoseFromPoseANDROID",

        XrGeospatialTrackerANDROID("geospatialTracker"),
        XrGeospatialPoseFromPoseLocateInfoANDROID.const.p("locateInfo"),
        XrGeospatialPoseResultANDROID.p("geospatialPoseResult")
    )

    XrResult(
        "LocateGeospatialPoseANDROID",

        XrGeospatialTrackerANDROID("geospatialTracker"),
        XrGeospatialPoseLocateInfoANDROID.const.p("locateInfo"),
        XrSpaceLocation.p("location")
    )

    XrResult(
        "CheckVpsAvailabilityAsyncANDROID",

        XrSession("session"),
        double("latitude"),
        double("longitude"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CheckVpsAvailabilityCompleteANDROID",

        XrSession("session"),
        XrFutureEXT("future"),
        XrVPSAvailabilityCheckCompletionANDROID.p("completion")
    )
}