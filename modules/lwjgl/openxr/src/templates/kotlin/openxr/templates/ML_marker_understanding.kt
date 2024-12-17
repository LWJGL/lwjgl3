/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_marker_understanding = "MLMarkerUnderstanding".nativeClassXR("ML_marker_understanding", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_marker_understanding_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_MARKER_UNDERSTANDING_EXTENSION_NAME".."XR_ML_marker_understanding"
    )

    EnumConstant(
        "OBJECT_TYPE_MARKER_DETECTOR_ML".."1000138000"
    )

    EnumConstant(
        "TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML".."1000138000",
        "TYPE_MARKER_DETECTOR_CREATE_INFO_ML".."1000138001",
        "TYPE_MARKER_DETECTOR_ARUCO_INFO_ML".."1000138002",
        "TYPE_MARKER_DETECTOR_SIZE_INFO_ML".."1000138003",
        "TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML".."1000138004",
        "TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML".."1000138005",
        "TYPE_MARKER_DETECTOR_SNAPSHOT_INFO_ML".."1000138006",
        "TYPE_MARKER_DETECTOR_STATE_ML".."1000138007",
        "TYPE_MARKER_SPACE_CREATE_INFO_ML".."1000138008"
    )

    EnumConstant(
        "ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML".."-1000138000",
        "ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML".."-1000138001",
        "ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML".."-1000138002",
        "ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML".."-1000138003",
        "ERROR_MARKER_INVALID_ML".."-1000138004"
    )

    EnumConstant(
        "MARKER_DETECTOR_PROFILE_DEFAULT_ML".."0",
        "MARKER_DETECTOR_PROFILE_SPEED_ML".."1",
        "MARKER_DETECTOR_PROFILE_ACCURACY_ML".."2",
        "MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML".."3",
        "MARKER_DETECTOR_PROFILE_LARGE_FOV_ML".."4",
        "MARKER_DETECTOR_PROFILE_CUSTOM_ML".."5"
    )

    EnumConstant(
        "MARKER_TYPE_ARUCO_ML".."0",
        "MARKER_TYPE_APRIL_TAG_ML".."1",
        "MARKER_TYPE_QR_ML".."2",
        "MARKER_TYPE_EAN_13_ML".."3",
        "MARKER_TYPE_UPC_A_ML".."4",
        "MARKER_TYPE_CODE_128_ML".."5"
    )

    EnumConstant(
        "MARKER_ARUCO_DICT_4X4_50_ML".."0",
        "MARKER_ARUCO_DICT_4X4_100_ML".."1",
        "MARKER_ARUCO_DICT_4X4_250_ML".."2",
        "MARKER_ARUCO_DICT_4X4_1000_ML".."3",
        "MARKER_ARUCO_DICT_5X5_50_ML".."4",
        "MARKER_ARUCO_DICT_5X5_100_ML".."5",
        "MARKER_ARUCO_DICT_5X5_250_ML".."6",
        "MARKER_ARUCO_DICT_5X5_1000_ML".."7",
        "MARKER_ARUCO_DICT_6X6_50_ML".."8",
        "MARKER_ARUCO_DICT_6X6_100_ML".."9",
        "MARKER_ARUCO_DICT_6X6_250_ML".."10",
        "MARKER_ARUCO_DICT_6X6_1000_ML".."11",
        "MARKER_ARUCO_DICT_7X7_50_ML".."12",
        "MARKER_ARUCO_DICT_7X7_100_ML".."13",
        "MARKER_ARUCO_DICT_7X7_250_ML".."14",
        "MARKER_ARUCO_DICT_7X7_1000_ML".."15"
    )

    EnumConstant(
        "MARKER_APRIL_TAG_DICT_16H5_ML".."0",
        "MARKER_APRIL_TAG_DICT_25H9_ML".."1",
        "MARKER_APRIL_TAG_DICT_36H10_ML".."2",
        "MARKER_APRIL_TAG_DICT_36H11_ML".."3"
    )

    EnumConstant(
        "MARKER_DETECTOR_FPS_LOW_ML".."0",
        "MARKER_DETECTOR_FPS_MEDIUM_ML".."1",
        "MARKER_DETECTOR_FPS_HIGH_ML".."2",
        "MARKER_DETECTOR_FPS_MAX_ML".."3"
    )

    EnumConstant(
        "MARKER_DETECTOR_RESOLUTION_LOW_ML".."0",
        "MARKER_DETECTOR_RESOLUTION_MEDIUM_ML".."1",
        "MARKER_DETECTOR_RESOLUTION_HIGH_ML".."2"
    )

    EnumConstant(
        "MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML".."0",
        "MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML".."1"
    )

    EnumConstant(
        "MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML".."0",
        "MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML".."1",
        "MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML".."2",
        "MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML".."3"
    )

    EnumConstant(
        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML".."0",
        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML".."1",
        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML".."2",
        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML".."3"
    )

    EnumConstant(
        "MARKER_DETECTOR_STATUS_PENDING_ML".."0",
        "MARKER_DETECTOR_STATUS_READY_ML".."1",
        "MARKER_DETECTOR_STATUS_ERROR_ML".."2"
    )

    XrResult(
        "CreateMarkerDetectorML",

        XrSession("session"),
        XrMarkerDetectorCreateInfoML.const.p("createInfo"),
        Check(1)..XrMarkerDetectorML.p("markerDetector")
    )

    XrResult(
        "DestroyMarkerDetectorML",

        XrMarkerDetectorML("markerDetector")
    )

    XrResult(
        "SnapshotMarkerDetectorML",

        XrMarkerDetectorML("markerDetector"),
        XrMarkerDetectorSnapshotInfoML.p("snapshotInfo")
    )

    XrResult(
        "GetMarkerDetectorStateML",

        XrMarkerDetectorML("markerDetector"),
        XrMarkerDetectorStateML.p("state")
    )

    XrResult(
        "GetMarkersML",

        XrMarkerDetectorML("markerDetector"),
        AutoSize("markers")..uint32_t("markerCapacityInput"),
        Check(1)..uint32_t.p("markerCountOutput"),
        nullable..XrMarkerML.p("markers")
    )

    XrResult(
        "GetMarkerReprojectionErrorML",

        XrMarkerDetectorML("markerDetector"),
        XrMarkerML("marker"),
        Check(1)..float.p("reprojectionErrorMeters")
    )

    XrResult(
        "GetMarkerLengthML",

        XrMarkerDetectorML("markerDetector"),
        XrMarkerML("marker"),
        Check(1)..float.p("meters")
    )

    XrResult(
        "GetMarkerNumberML",

        XrMarkerDetectorML("markerDetector"),
        XrMarkerML("marker"),
        Check(1)..uint64_t.p("number")
    )

    XrResult(
        "GetMarkerStringML",

        XrMarkerDetectorML("markerDetector"),
        XrMarkerML("marker"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..char.p("buffer")
    )

    XrResult(
        "CreateMarkerSpaceML",

        XrSession("session"),
        XrMarkerSpaceCreateInfoML.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )
}