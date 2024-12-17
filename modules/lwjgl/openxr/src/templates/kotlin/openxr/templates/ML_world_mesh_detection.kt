/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_world_mesh_detection = "MLWorldMeshDetection".nativeClassXR("ML_world_mesh_detection", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_world_mesh_detection_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_WORLD_MESH_DETECTION_EXTENSION_NAME".."XR_ML_world_mesh_detection"
    )

    EnumConstant(
        "OBJECT_TYPE_WORLD_MESH_DETECTOR_ML".."1000474000"
    )

    EnumConstant(
        "ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML".."-1000474000",
        "ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML".."-1000474001"
    )

    EnumConstant(
        "TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML".."1000474001",
        "TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML".."1000474002",
        "TYPE_WORLD_MESH_BLOCK_STATE_ML".."1000474003",
        "TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML".."1000474004",
        "TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML".."1000474005",
        "TYPE_WORLD_MESH_BUFFER_SIZE_ML".."1000474006",
        "TYPE_WORLD_MESH_BUFFER_ML".."1000474007",
        "TYPE_WORLD_MESH_BLOCK_REQUEST_ML".."1000474008",
        "TYPE_WORLD_MESH_GET_INFO_ML".."1000474009",
        "TYPE_WORLD_MESH_BLOCK_ML".."1000474010",
        "TYPE_WORLD_MESH_REQUEST_COMPLETION_ML".."1000474011",
        "TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML".."1000474012"
    )

    EnumConstant(
        "WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML".enum(0x00000001),
        "WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML".enum(0x00000002),
        "WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML".enum(0x00000004),
        "WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML".enum(0x00000008),
        "WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML".enum(0x00000010),
        "WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML".enum(0x00000020)
    )

    EnumConstant(
        "WORLD_MESH_DETECTOR_LOD_MINIMUM_ML".."0",
        "WORLD_MESH_DETECTOR_LOD_MEDIUM_ML".."1",
        "WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML".."2"
    )

    EnumConstant(
        "WORLD_MESH_BLOCK_STATUS_NEW_ML".."0",
        "WORLD_MESH_BLOCK_STATUS_UPDATED_ML".."1",
        "WORLD_MESH_BLOCK_STATUS_DELETED_ML".."2",
        "WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML".."3"
    )

    EnumConstant(
        "WORLD_MESH_BLOCK_RESULT_SUCCESS_ML".."0",
        "WORLD_MESH_BLOCK_RESULT_FAILED_ML".."1",
        "WORLD_MESH_BLOCK_RESULT_PENDING_ML".."2",
        "WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML".."3"
    )

    XrResult(
        "CreateWorldMeshDetectorML",

        XrSession("session"),
        XrWorldMeshDetectorCreateInfoML.const.p("createInfo"),
        Check(1)..XrWorldMeshDetectorML.p("detector")
    )

    XrResult(
        "DestroyWorldMeshDetectorML",

        XrWorldMeshDetectorML("detector")
    )

    XrResult(
        "RequestWorldMeshStateAsyncML",

        XrWorldMeshDetectorML("detector"),
        XrWorldMeshStateRequestInfoML.const.p("stateRequest"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "RequestWorldMeshStateCompleteML",

        XrWorldMeshDetectorML("detector"),
        XrFutureEXT("future"),
        XrWorldMeshStateRequestCompletionML.p("completion")
    )

    XrResult(
        "GetWorldMeshBufferRecommendSizeML",

        XrWorldMeshDetectorML("detector"),
        XrWorldMeshBufferRecommendedSizeInfoML.const.p("sizeInfo"),
        XrWorldMeshBufferSizeML.p("size")
    )

    XrResult(
        "AllocateWorldMeshBufferML",

        XrWorldMeshDetectorML("detector"),
        XrWorldMeshBufferSizeML.const.p("size"),
        XrWorldMeshBufferML.p("buffer")
    )

    XrResult(
        "FreeWorldMeshBufferML",

        XrWorldMeshDetectorML("detector"),
        XrWorldMeshBufferML.const.p("buffer")
    )

    XrResult(
        "RequestWorldMeshAsyncML",

        XrWorldMeshDetectorML("detector"),
        XrWorldMeshGetInfoML.const.p("getInfo"),
        XrWorldMeshBufferML.p("buffer"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "RequestWorldMeshCompleteML",

        XrWorldMeshDetectorML("detector"),
        XrWorldMeshRequestCompletionInfoML.const.p("completionInfo"),
        XrFutureEXT("future"),
        XrWorldMeshRequestCompletionML.p("completion")
    )
}