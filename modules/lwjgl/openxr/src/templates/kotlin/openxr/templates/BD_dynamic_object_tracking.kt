/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_dynamic_object_tracking = "BDDynamicObjectTracking".nativeClassXR("BD_dynamic_object_tracking", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_dynamic_object_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_DYNAMIC_OBJECT_TRACKING_EXTENSION_NAME".."XR_BD_dynamic_object_tracking"
    )

    EnumConstant(
        "TYPE_SYSTEM_DYNAMIC_OBJECT_TRACKING_PROPERTIES_BD".."1000746000",
        "TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_DYNAMIC_OBJECT_BD".."1000746001",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_DYNAMIC_OBJECT_BD".."1000746002",
        "TYPE_DYNAMIC_OBJECT_DATA_BD".."1000746003",
        "TYPE_SENSE_DATA_FILTER_DYNAMIC_OBJECT_TYPE_BD".."1000746004"
    )

    EnumConstant(
        "SENSE_DATA_PROVIDER_TYPE_DYNAMIC_OBJECT_BD".."1000746000"
    )

    EnumConstant(
        "SPATIAL_ENTITY_COMPONENT_TYPE_DYNAMIC_OBJECT_BD".."1000746000"
    )

    EnumConstant(
        "DYNAMIC_OBJECT_TYPE_UNKNOWN_BD".."0"
    )
}