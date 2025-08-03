/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_trackables = "ANDROIDTrackables".nativeClassXR("ANDROID_trackables", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_trackables_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_TRACKABLES_EXTENSION_NAME".."XR_ANDROID_trackables"
    )

    EnumConstant(
        "TYPE_TRACKABLE_GET_INFO_ANDROID".."1000455000",
        "TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID".."1000455001",
        "TYPE_TRACKABLE_PLANE_ANDROID".."1000455003",
        "TYPE_TRACKABLE_TRACKER_CREATE_INFO_ANDROID".."1000455004",
        "TYPE_SYSTEM_TRACKABLES_PROPERTIES_ANDROID".."1000455005"
    )

    EnumConstant(
        "OBJECT_TYPE_TRACKABLE_TRACKER_ANDROID".."1000455001"
    )

    EnumConstant(
        "ERROR_MISMATCHING_TRACKABLE_TYPE_ANDROID".."-1000455000",
        "ERROR_TRACKABLE_TYPE_NOT_SUPPORTED_ANDROID".."-1000455001"
    )

    EnumConstant(
        "TRACKING_STATE_PAUSED_ANDROID".."0",
        "TRACKING_STATE_STOPPED_ANDROID".."1",
        "TRACKING_STATE_TRACKING_ANDROID".."2"
    )

    EnumConstant(
        "TRACKABLE_TYPE_NOT_VALID_ANDROID".."0",
        "TRACKABLE_TYPE_PLANE_ANDROID".."1"
    )

    EnumConstant(
        "PLANE_TYPE_HORIZONTAL_DOWNWARD_FACING_ANDROID".."0",
        "PLANE_TYPE_HORIZONTAL_UPWARD_FACING_ANDROID".."1",
        "PLANE_TYPE_VERTICAL_ANDROID".."2",
        "PLANE_TYPE_ARBITRARY_ANDROID".."3"
    )

    EnumConstant(
        "PLANE_LABEL_UNKNOWN_ANDROID".."0",
        "PLANE_LABEL_WALL_ANDROID".."1",
        "PLANE_LABEL_FLOOR_ANDROID".."2",
        "PLANE_LABEL_CEILING_ANDROID".."3",
        "PLANE_LABEL_TABLE_ANDROID".."4"
    )

    XrResult(
        "EnumerateSupportedTrackableTypesANDROID",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("trackableTypes")..uint32_t("trackableTypeCapacityInput"),
        Check(1)..uint32_t.p("trackableTypeCountOutput"),
        nullable..XrTrackableTypeANDROID.p("trackableTypes")
    )

    XrResult(
        "EnumerateSupportedAnchorTrackableTypesANDROID",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("trackableTypes")..uint32_t("trackableTypeCapacityInput"),
        Check(1)..uint32_t.p("trackableTypeCountOutput"),
        nullable..XrTrackableTypeANDROID.p("trackableTypes")
    )

    XrResult(
        "CreateTrackableTrackerANDROID",

        XrSession("session"),
        XrTrackableTrackerCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrTrackableTrackerANDROID.p("trackableTracker")
    )

    XrResult(
        "DestroyTrackableTrackerANDROID",

        XrTrackableTrackerANDROID("trackableTracker")
    )

    XrResult(
        "GetAllTrackablesANDROID",

        XrTrackableTrackerANDROID("trackableTracker"),
        AutoSize("trackables")..uint32_t("trackableCapacityInput"),
        Check(1)..uint32_t.p("trackableCountOutput"),
        nullable..XrTrackableANDROID.p("trackables")
    )

    XrResult(
        "GetTrackablePlaneANDROID",

        XrTrackableTrackerANDROID("trackableTracker"),
        XrTrackableGetInfoANDROID.const.p("getInfo"),
        XrTrackablePlaneANDROID.p("planeOutput")
    )

    XrResult(
        "CreateAnchorSpaceANDROID",

        XrSession("session"),
        XrAnchorSpaceCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrSpace.p("anchorOutput")
    )
}