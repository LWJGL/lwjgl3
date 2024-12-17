/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_mesh = "METASpatialEntityMesh".nativeClassXR("META_spatial_entity_mesh", type = "instance", postfix = "META") {
    IntConstant(
        "META_spatial_entity_mesh_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SPATIAL_ENTITY_MESH_EXTENSION_NAME".."XR_META_spatial_entity_mesh"
    )

    EnumConstant(
        "SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META".."1000269000"
    )

    EnumConstant(
        "TYPE_SPACE_TRIANGLE_MESH_GET_INFO_META".."1000269001",
        "TYPE_SPACE_TRIANGLE_MESH_META".."1000269002"
    )

    XrResult(
        "GetSpaceTriangleMeshMETA",

        XrSpace("space"),
        XrSpaceTriangleMeshGetInfoMETA.const.p("getInfo"),
        XrSpaceTriangleMeshMETA.p("triangleMeshOutput")
    )
}