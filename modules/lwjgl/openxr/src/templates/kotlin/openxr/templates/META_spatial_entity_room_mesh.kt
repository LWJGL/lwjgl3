/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_room_mesh = "METASpatialEntityRoomMesh".nativeClassXR("META_spatial_entity_room_mesh", type = "instance", postfix = "META") {
    IntConstant(
        "META_spatial_entity_room_mesh_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SPATIAL_ENTITY_ROOM_MESH_EXTENSION_NAME".."XR_META_spatial_entity_room_mesh"
    )

    EnumConstant(
        "SPACE_COMPONENT_TYPE_ROOM_MESH_META".."1000553000"
    )

    EnumConstant(
        "TYPE_ROOM_MESH_FACE_INDICES_META".."1000553000",
        "TYPE_SPACE_ROOM_MESH_GET_INFO_META".."1000553001",
        "TYPE_ROOM_MESH_META".."1000553002"
    )

    XrResult(
        "GetSpaceRoomMeshMETA",

        XrSpace("space"),
        XrSpaceRoomMeshGetInfoMETA.const.p("getInfo"),
        XrRoomMeshMETA.p("roomMeshOutput")
    )

    XrResult(
        "GetSpaceRoomMeshFaceIndicesMETA",

        XrSpace("space"),
        XrUuid.const.p("faceUuid"),
        XrRoomMeshFaceIndicesMETA.p("roomMeshFaceIndicesOutput")
    )
}