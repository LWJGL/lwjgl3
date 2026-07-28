/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_spatial_plane_tracking = "EXTSpatialPlaneTracking".nativeClassXR("EXT_spatial_plane_tracking", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_spatial_plane_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SPATIAL_PLANE_TRACKING_EXTENSION_NAME".."XR_EXT_spatial_plane_tracking"
    )

    EnumConstant(
        "SPATIAL_CAPABILITY_PLANE_TRACKING_EXT".."1000741000"
    )

    EnumConstant(
        "SPATIAL_COMPONENT_TYPE_PLANE_ALIGNMENT_EXT".."1000741000",
        "SPATIAL_COMPONENT_TYPE_MESH_2D_EXT".."1000741001",
        "SPATIAL_COMPONENT_TYPE_POLYGON_2D_EXT".."1000741002",
        "SPATIAL_COMPONENT_TYPE_PLANE_SEMANTIC_LABEL_EXT".."1000741003"
    )

    EnumConstant(
        "TYPE_SPATIAL_CAPABILITY_CONFIGURATION_PLANE_TRACKING_EXT".."1000741000",
        "TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT".."1000741001",
        "TYPE_SPATIAL_COMPONENT_MESH_2D_LIST_EXT".."1000741002",
        "TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT".."1000741003",
        "TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT".."1000741004"
    )

    EnumConstant(
        "SPATIAL_PLANE_ALIGNMENT_HORIZONTAL_UPWARD_EXT".."0",
        "SPATIAL_PLANE_ALIGNMENT_HORIZONTAL_DOWNWARD_EXT".."1",
        "SPATIAL_PLANE_ALIGNMENT_VERTICAL_EXT".."2",
        "SPATIAL_PLANE_ALIGNMENT_ARBITRARY_EXT".."3"
    )

    EnumConstant(
        "SPATIAL_PLANE_SEMANTIC_LABEL_UNCATEGORIZED_EXT".."1",
        "SPATIAL_PLANE_SEMANTIC_LABEL_FLOOR_EXT".."2",
        "SPATIAL_PLANE_SEMANTIC_LABEL_WALL_EXT".."3",
        "SPATIAL_PLANE_SEMANTIC_LABEL_CEILING_EXT".."4",
        "SPATIAL_PLANE_SEMANTIC_LABEL_TABLE_EXT".."5"
    )
}