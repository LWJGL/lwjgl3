/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_spatial_mesh = "BDSpatialMesh".nativeClassXR("BD_spatial_mesh", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_spatial_mesh_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_SPATIAL_MESH_EXTENSION_NAME".."XR_BD_spatial_mesh"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPATIAL_MESH_PROPERTIES_BD".."1000393000",
        "TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD".."1000393001"
    )

    EnumConstant(
        "SENSE_DATA_PROVIDER_TYPE_MESH_BD".."1000393000"
    )

    EnumConstant(
        "SPATIAL_MESH_CONFIG_SEMANTIC_BIT_BD".enum(0x00000001),
        "SPATIAL_MESH_CONFIG_ALIGN_SEMANTIC_WITH_VERTEX_BIT_BD".enum(0x00000002)
    )

    EnumConstant(
        "SPATIAL_MESH_LOD_COARSE_BD".."0",
        "SPATIAL_MESH_LOD_MEDIUM_BD".."1",
        "SPATIAL_MESH_LOD_FINE_BD".."2"
    )
}