/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_spatial_discovery_bounds = "ANDROIDSpatialDiscoveryBounds".nativeClassXR("ANDROID_spatial_discovery_bounds", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_spatial_discovery_bounds_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_SPATIAL_DISCOVERY_BOUNDS_EXTENSION_NAME".."XR_ANDROID_spatial_discovery_bounds"
    )

    EnumConstant(
        "SPATIAL_CAPABILITY_FEATURE_SPHERE_BOUNDS_FILTER_ANDROID".."1000761000",
        "SPATIAL_CAPABILITY_FEATURE_BOX_BOUNDS_FILTER_ANDROID".."1000761001",
        "SPATIAL_CAPABILITY_FEATURE_FRUSTUM_BOUNDS_FILTER_ANDROID".."1000761002"
    )

    EnumConstant(
        "TYPE_SPATIAL_BOUNDS_SPHEREF_ANDROID".."1000761000",
        "TYPE_SPATIAL_BOUNDS_BOXF_ANDROID".."1000761001",
        "TYPE_SPATIAL_BOUNDS_FRUSTUMF_ANDROID".."1000761002"
    )
}