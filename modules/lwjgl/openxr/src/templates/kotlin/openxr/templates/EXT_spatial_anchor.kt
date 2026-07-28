/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_spatial_anchor = "EXTSpatialAnchor".nativeClassXR("EXT_spatial_anchor", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_spatial_anchor_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SPATIAL_ANCHOR_EXTENSION_NAME".."XR_EXT_spatial_anchor"
    )

    EnumConstant(
        "SPATIAL_CAPABILITY_ANCHOR_EXT".."1000762000"
    )

    EnumConstant(
        "SPATIAL_COMPONENT_TYPE_ANCHOR_EXT".."1000762000"
    )

    EnumConstant(
        "TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ANCHOR_EXT".."1000762000",
        "TYPE_SPATIAL_COMPONENT_ANCHOR_LIST_EXT".."1000762001",
        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT".."1000762002"
    )

    XrResult(
        "CreateSpatialAnchorEXT",

        XrSpatialContextEXT("spatialContext"),
        XrSpatialAnchorCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrSpatialEntityIdEXT.p("anchorEntityId"),
        Check(1)..XrSpatialEntityEXT.p("anchorEntity")
    )
}