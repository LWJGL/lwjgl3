/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_spatial_object_tracking = "ANDROIDSpatialObjectTracking".nativeClassXR("ANDROID_spatial_object_tracking", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_spatial_object_tracking_SPEC_VERSION".."2"
    )

    StringConstant(
        "ANDROID_SPATIAL_OBJECT_TRACKING_EXTENSION_NAME".."XR_ANDROID_spatial_object_tracking"
    )

    EnumConstant(
        "TYPE_SPATIAL_CAPABILITY_CONFIGURATION_OBJECT_TRACKING_ANDROID".."1000785000",
        "TYPE_SPATIAL_COMPONENT_OBJECT_SEMANTIC_LABEL_LIST_ANDROID".."1000785001"
    )

    EnumConstant(
        "SPATIAL_CAPABILITY_OBJECT_TRACKING_ANDROID".."1000785000"
    )

    EnumConstant(
        "SPATIAL_COMPONENT_TYPE_OBJECT_SEMANTIC_LABEL_ANDROID".."1000785000"
    )

    EnumConstant(
        "SPATIAL_OBJECT_SEMANTIC_LABEL_UNCATEGORIZED_ANDROID".."0",
        "SPATIAL_OBJECT_SEMANTIC_LABEL_KEYBOARD_ANDROID".."1",
        "SPATIAL_OBJECT_SEMANTIC_LABEL_MOUSE_ANDROID".."2",
        "SPATIAL_OBJECT_SEMANTIC_LABEL_LAPTOP_BASE_ANDROID".."3"
    )
}