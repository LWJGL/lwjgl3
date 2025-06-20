/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_spatial_plane = "BDSpatialPlane".nativeClassXR("BD_spatial_plane", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_spatial_plane_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_SPATIAL_PLANE_EXTENSION_NAME".."XR_BD_spatial_plane"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPATIAL_PLANE_PROPERTIES_BD".."1000396000",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD".."1000396001",
        "TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD".."1000396002"
    )

    EnumConstant(
        "SENSE_DATA_PROVIDER_TYPE_PLANE_BD".."1000396000"
    )

    EnumConstant(
        "SPATIAL_ENTITY_COMPONENT_TYPE_PLANE_ORIENTATION_BD".."1000396000"
    )

    EnumConstant(
        "PLANE_ORIENTATION_HORIZONTAL_UPWARD_BD".."0",
        "PLANE_ORIENTATION_HORIZONTAL_DOWNWARD_BD".."1",
        "PLANE_ORIENTATION_VERTICAL_BD".."2",
        "PLANE_ORIENTATION_ARBITRARY_BD".."3"
    )
}