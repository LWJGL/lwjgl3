/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_spatial_anchors = "MLSpatialAnchors".nativeClassXR("ML_spatial_anchors", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_spatial_anchors_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_SPATIAL_ANCHORS_EXTENSION_NAME".."XR_ML_spatial_anchors"
    )

    EnumConstant(
        "TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML".."1000140000",
        "TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML".."1000140001",
        "TYPE_SPATIAL_ANCHOR_STATE_ML".."1000140002"
    )

    EnumConstant(
        "ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML".."-1000140000",
        "ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML".."-1000140001",
        "ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML".."-1000140002",
        "ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML".."-1000140003"
    )

    EnumConstant(
        "SPATIAL_ANCHOR_CONFIDENCE_LOW_ML".."0",
        "SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML".."1",
        "SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML".."2"
    )

    XrResult(
        "CreateSpatialAnchorsAsyncML",

        XrSession("session"),
        XrSpatialAnchorsCreateInfoBaseHeaderML.const.p("createInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateSpatialAnchorsCompleteML",

        XrSession("session"),
        XrFutureEXT("future"),
        XrCreateSpatialAnchorsCompletionML.p("completion")
    )

    XrResult(
        "GetSpatialAnchorStateML",

        XrSpace("anchor"),
        XrSpatialAnchorStateML.p("state")
    )
}