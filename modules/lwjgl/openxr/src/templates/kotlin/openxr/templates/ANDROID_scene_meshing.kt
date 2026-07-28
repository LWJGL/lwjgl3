/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_scene_meshing = "ANDROIDSceneMeshing".nativeClassXR("ANDROID_scene_meshing", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_scene_meshing_SPEC_VERSION".."3"
    )

    StringConstant(
        "ANDROID_SCENE_MESHING_EXTENSION_NAME".."XR_ANDROID_scene_meshing"
    )

    EnumConstant(
        "TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID".."1000718000",
        "TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID".."1000718001",
        "TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID".."1000718002",
        "TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID".."1000718003",
        "TYPE_SCENE_SUBMESH_STATE_ANDROID".."1000718004",
        "TYPE_SCENE_SUBMESH_DATA_ANDROID".."1000718005"
    )

    EnumConstant(
        "OBJECT_TYPE_SCENE_MESHING_TRACKER_ANDROID".."1000718000",
        "OBJECT_TYPE_SCENE_MESH_SNAPSHOT_ANDROID".."1000718001"
    )

    EnumConstant(
        "SCENE_MESH_SEMANTIC_LABEL_SET_NONE_ANDROID".."0",
        "SCENE_MESH_SEMANTIC_LABEL_SET_DEFAULT_ANDROID".."1"
    )

    EnumConstant(
        "SCENE_MESH_TRACKING_STATE_INITIALIZING_ANDROID".."0",
        "SCENE_MESH_TRACKING_STATE_TRACKING_ANDROID".."1",
        "SCENE_MESH_TRACKING_STATE_WAITING_ANDROID".."2",
        "SCENE_MESH_TRACKING_STATE_ERROR_ANDROID".."3"
    )

    EnumConstant(
        "SCENE_MESH_SEMANTIC_LABEL_OTHER_ANDROID".."0",
        "SCENE_MESH_SEMANTIC_LABEL_FLOOR_ANDROID".."1",
        "SCENE_MESH_SEMANTIC_LABEL_CEILING_ANDROID".."2",
        "SCENE_MESH_SEMANTIC_LABEL_WALL_ANDROID".."3",
        "SCENE_MESH_SEMANTIC_LABEL_TABLE_ANDROID".."4"
    )

    XrResult(
        "EnumerateSupportedSemanticLabelSetsANDROID",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("supportedSemanticLabelSets")..uint32_t("supportedSemanticLabelSetsInputCapacity"),
        Check(1)..uint32_t.p("supportedSemanticLabelSetsOutputCount"),
        nullable..XrSceneMeshSemanticLabelSetANDROID.p("supportedSemanticLabelSets")
    )

    XrResult(
        "CreateSceneMeshingTrackerANDROID",

        XrSession("session"),
        XrSceneMeshingTrackerCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrSceneMeshingTrackerANDROID.p("tracker")
    )

    XrResult(
        "DestroySceneMeshingTrackerANDROID",

        XrSceneMeshingTrackerANDROID("tracker")
    )

    XrResult(
        "CreateSceneMeshSnapshotANDROID",

        XrSceneMeshingTrackerANDROID("tracker"),
        XrSceneMeshSnapshotCreateInfoANDROID.const.p("createInfo"),
        XrSceneMeshSnapshotCreationResultANDROID.p("outSnapshotCreationResult")
    )

    XrResult(
        "DestroySceneMeshSnapshotANDROID",

        XrSceneMeshSnapshotANDROID("snapshot")
    )

    XrResult(
        "GetAllSubmeshStatesANDROID",

        XrSceneMeshSnapshotANDROID("snapshot"),
        AutoSize("submeshStates")..uint32_t("submeshStateCapacityInput"),
        Check(1)..uint32_t.p("submeshStateCountOutput"),
        nullable..XrSceneSubmeshStateANDROID.p("submeshStates")
    )

    XrResult(
        "GetSubmeshDataANDROID",

        XrSceneMeshSnapshotANDROID("snapshot"),
        AutoSize("inoutSubmeshData")..uint32_t("submeshDataCount"),
        XrSceneSubmeshDataANDROID.p("inoutSubmeshData")
    )
}