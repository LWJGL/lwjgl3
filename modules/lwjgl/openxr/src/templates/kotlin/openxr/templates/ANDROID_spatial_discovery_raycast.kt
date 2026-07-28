/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_spatial_discovery_raycast = "ANDROIDSpatialDiscoveryRaycast".nativeClassXR("ANDROID_spatial_discovery_raycast", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_spatial_discovery_raycast_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_SPATIAL_DISCOVERY_RAYCAST_EXTENSION_NAME".."XR_ANDROID_spatial_discovery_raycast"
    )

    EnumConstant(
        "SPATIAL_CAPABILITY_DEPTH_RAYCAST_ANDROID".."1000786000"
    )

    EnumConstant(
        "SPATIAL_COMPONENT_TYPE_RAYCAST_RESULT_ANDROID".."1000786000"
    )

    EnumConstant(
        "TYPE_SPATIAL_CAPABILITY_CONFIGURATION_DEPTH_RAYCAST_ANDROID".."1000786000",
        "TYPE_SPATIAL_RAYCAST_INFO_ANDROID".."1000786001",
        "TYPE_SPATIAL_COMPONENT_RAYCAST_RESULT_LIST_ANDROID".."1000786002",
        "TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID".."1000786003"
    )

    XrResult(
        "CreateSpatialRaycastSnapshotANDROID",

        XrSpatialContextEXT("spatialContext"),
        XrSpatialRaycastSnapshotCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrSpatialSnapshotEXT.p("snapshot")
    )
}