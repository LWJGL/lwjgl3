/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_scene_understanding = "MSFTSceneUnderstanding".nativeClassXR("MSFT_scene_understanding", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_scene_understanding_SPEC_VERSION".."2"
    )

    StringConstant(
        "MSFT_SCENE_UNDERSTANDING_EXTENSION_NAME".."XR_MSFT_scene_understanding"
    )

    EnumConstant(
        "OBJECT_TYPE_SCENE_OBSERVER_MSFT".."1000097000",
        "OBJECT_TYPE_SCENE_MSFT".."1000097001"
    )

    EnumConstant(
        "TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT".."1000097000",
        "TYPE_SCENE_CREATE_INFO_MSFT".."1000097001",
        "TYPE_NEW_SCENE_COMPUTE_INFO_MSFT".."1000097002",
        "TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT".."1000097003",
        "TYPE_SCENE_COMPONENTS_MSFT".."1000097004",
        "TYPE_SCENE_COMPONENTS_GET_INFO_MSFT".."1000097005",
        "TYPE_SCENE_COMPONENT_LOCATIONS_MSFT".."1000097006",
        "TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT".."1000097007",
        "TYPE_SCENE_OBJECTS_MSFT".."1000097008",
        "TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT".."1000097009",
        "TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT".."1000097010",
        "TYPE_SCENE_PLANES_MSFT".."1000097011",
        "TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT".."1000097012",
        "TYPE_SCENE_MESHES_MSFT".."1000097013",
        "TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT".."1000097014",
        "TYPE_SCENE_MESH_BUFFERS_MSFT".."1000097015",
        "TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT".."1000097016",
        "TYPE_SCENE_MESH_INDICES_UINT32_MSFT".."1000097017",
        "TYPE_SCENE_MESH_INDICES_UINT16_MSFT".."1000097018"
    )

    EnumConstant(
        "ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT".."-1000097000",
        "ERROR_SCENE_COMPONENT_ID_INVALID_MSFT".."-1000097001",
        "ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT".."-1000097002",
        "ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT".."-1000097003",
        "ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT".."-1000097004",
        "ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT".."-1000097005"
    )

    EnumConstant(
        "SCENE_COMPUTE_FEATURE_PLANE_MSFT".."1",
        "SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT".."2",
        "SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT".."3",
        "SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT".."4"
    )

    EnumConstant(
        "SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT".."1",
        "SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT".."2",
        "SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT".."3"
    )

    EnumConstant(
        "MESH_COMPUTE_LOD_COARSE_MSFT".."1",
        "MESH_COMPUTE_LOD_MEDIUM_MSFT".."2",
        "MESH_COMPUTE_LOD_FINE_MSFT".."3",
        "MESH_COMPUTE_LOD_UNLIMITED_MSFT".."4"
    )

    EnumConstant(
        "SCENE_COMPONENT_TYPE_OBJECT_MSFT".."1",
        "SCENE_COMPONENT_TYPE_PLANE_MSFT".."2",
        "SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT".."3",
        "SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT".."4",
        "SCENE_COMPONENT_TYPE_INVALID_MSFT".."-1"
    )

    EnumConstant(
        "SCENE_OBJECT_TYPE_BACKGROUND_MSFT".."1",
        "SCENE_OBJECT_TYPE_WALL_MSFT".."2",
        "SCENE_OBJECT_TYPE_FLOOR_MSFT".."3",
        "SCENE_OBJECT_TYPE_CEILING_MSFT".."4",
        "SCENE_OBJECT_TYPE_PLATFORM_MSFT".."5",
        "SCENE_OBJECT_TYPE_INFERRED_MSFT".."6",
        "SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT".."-1"
    )

    EnumConstant(
        "SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT".."0",
        "SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT".."1",
        "SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT".."2"
    )

    EnumConstant(
        "SCENE_COMPUTE_STATE_NONE_MSFT".."0",
        "SCENE_COMPUTE_STATE_UPDATING_MSFT".."1",
        "SCENE_COMPUTE_STATE_COMPLETED_MSFT".."2",
        "SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT".."3"
    )

    XrResult(
        "EnumerateSceneComputeFeaturesMSFT",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("features")..uint32_t("featureCapacityInput"),
        Check(1)..uint32_t.p("featureCountOutput"),
        nullable..XrSceneComputeFeatureMSFT.p("features")
    )

    XrResult(
        "CreateSceneObserverMSFT",

        XrSession("session"),
        nullable..XrSceneObserverCreateInfoMSFT.const.p("createInfo"),
        Check(1)..XrSceneObserverMSFT.p("sceneObserver")
    )

    XrResult(
        "DestroySceneObserverMSFT",

        XrSceneObserverMSFT("sceneObserver")
    )

    XrResult(
        "CreateSceneMSFT",

        XrSceneObserverMSFT("sceneObserver"),
        nullable..XrSceneCreateInfoMSFT.const.p("createInfo"),
        Check(1)..XrSceneMSFT.p("scene")
    )

    XrResult(
        "DestroySceneMSFT",

        XrSceneMSFT("scene")
    )

    XrResult(
        "ComputeNewSceneMSFT",

        XrSceneObserverMSFT("sceneObserver"),
        XrNewSceneComputeInfoMSFT.const.p("computeInfo")
    )

    XrResult(
        "GetSceneComputeStateMSFT",

        XrSceneObserverMSFT("sceneObserver"),
        Check(1)..XrSceneComputeStateMSFT.p("state")
    )

    XrResult(
        "GetSceneComponentsMSFT",

        XrSceneMSFT("scene"),
        XrSceneComponentsGetInfoMSFT.const.p("getInfo"),
        XrSceneComponentsMSFT.p("components")
    )

    XrResult(
        "LocateSceneComponentsMSFT",

        XrSceneMSFT("scene"),
        XrSceneComponentsLocateInfoMSFT.const.p("locateInfo"),
        XrSceneComponentLocationsMSFT.p("locations")
    )

    XrResult(
        "GetSceneMeshBuffersMSFT",

        XrSceneMSFT("scene"),
        XrSceneMeshBuffersGetInfoMSFT.const.p("getInfo"),
        XrSceneMeshBuffersMSFT.p("buffers")
    )
}