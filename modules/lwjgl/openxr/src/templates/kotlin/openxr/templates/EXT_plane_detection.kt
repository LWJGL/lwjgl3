/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_plane_detection = "EXTPlaneDetection".nativeClassXR("EXT_plane_detection", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_plane_detection_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_PLANE_DETECTION_EXTENSION_NAME".."XR_EXT_plane_detection"
    )

    EnumConstant(
        "ERROR_SPACE_NOT_LOCATABLE_EXT".."-1000429000",
        "ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT".."-1000429001"
    )

    EnumConstant(
        "OBJECT_TYPE_PLANE_DETECTOR_EXT".."1000429000"
    )

    EnumConstant(
        "TYPE_PLANE_DETECTOR_CREATE_INFO_EXT".."1000429001",
        "TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT".."1000429002",
        "TYPE_PLANE_DETECTOR_GET_INFO_EXT".."1000429003",
        "TYPE_PLANE_DETECTOR_LOCATIONS_EXT".."1000429004",
        "TYPE_PLANE_DETECTOR_LOCATION_EXT".."1000429005",
        "TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT".."1000429006",
        "TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT".."1000429007"
    )

    EnumConstant(
        "PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT".enum(0x00000001),
        "PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT".enum(0x00000002),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT".enum(0x00000004),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT".enum(0x00000008),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT".enum(0x00000010),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT".enum(0x00000020),
        "PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT".enum(0x00000040)
    )

    EnumConstant(
        "PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT".."0",
        "PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT".."1",
        "PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT".."2",
        "PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT".."3"
    )

    EnumConstant(
        "PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT".."0",
        "PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT".."1",
        "PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT".."2",
        "PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT".."3",
        "PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT".."4"
    )

    EnumConstant(
        "PLANE_DETECTION_STATE_NONE_EXT".."0",
        "PLANE_DETECTION_STATE_PENDING_EXT".."1",
        "PLANE_DETECTION_STATE_DONE_EXT".."2",
        "PLANE_DETECTION_STATE_ERROR_EXT".."3",
        "PLANE_DETECTION_STATE_FATAL_EXT".."4"
    )

    XrResult(
        "CreatePlaneDetectorEXT",

        XrSession("session"),
        XrPlaneDetectorCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrPlaneDetectorEXT.p("planeDetector")
    )

    XrResult(
        "DestroyPlaneDetectorEXT",

        XrPlaneDetectorEXT("planeDetector")
    )

    XrResult(
        "BeginPlaneDetectionEXT",

        XrPlaneDetectorEXT("planeDetector"),
        XrPlaneDetectorBeginInfoEXT.const.p("beginInfo")
    )

    XrResult(
        "GetPlaneDetectionStateEXT",

        XrPlaneDetectorEXT("planeDetector"),
        Check(1)..XrPlaneDetectionStateEXT.p("state")
    )

    XrResult(
        "GetPlaneDetectionsEXT",

        XrPlaneDetectorEXT("planeDetector"),
        XrPlaneDetectorGetInfoEXT.const.p("info"),
        XrPlaneDetectorLocationsEXT.p("locations")
    )

    XrResult(
        "GetPlanePolygonBufferEXT",

        XrPlaneDetectorEXT("planeDetector"),
        uint64_t("planeId"),
        uint32_t("polygonBufferIndex"),
        XrPlaneDetectorPolygonBufferEXT.p("polygonBuffer")
    )
}