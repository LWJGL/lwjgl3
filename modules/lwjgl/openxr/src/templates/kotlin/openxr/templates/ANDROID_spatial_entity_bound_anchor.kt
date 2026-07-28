/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_spatial_entity_bound_anchor = "ANDROIDSpatialEntityBoundAnchor".nativeClassXR("ANDROID_spatial_entity_bound_anchor", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_spatial_entity_bound_anchor_SPEC_VERSION".."2"
    )

    StringConstant(
        "ANDROID_SPATIAL_ENTITY_BOUND_ANCHOR_EXTENSION_NAME".."XR_ANDROID_spatial_entity_bound_anchor"
    )

    EnumConstant(
        "ERROR_SPATIAL_ANCHOR_ATTACHABLE_COMPONENT_NOT_FOUND_ANDROID".."-1000790001"
    )

    EnumConstant(
        "TYPE_SPATIAL_ANCHOR_PARENT_ANDROID".."1000790000"
    )

    XrResult(
        "EnumerateSpatialAnchorAttachableComponentsANDROID",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("attachableComponents")..uint32_t("attachableComponentCapacityInput"),
        Check(1)..uint32_t.p("attachableComponentCountOutput"),
        nullable..XrSpatialComponentTypeEXT.p("attachableComponents")
    )
}