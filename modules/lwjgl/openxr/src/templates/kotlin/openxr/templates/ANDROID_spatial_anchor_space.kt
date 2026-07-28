/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_spatial_anchor_space = "ANDROIDSpatialAnchorSpace".nativeClassXR("ANDROID_spatial_anchor_space", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_spatial_anchor_space_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_SPATIAL_ANCHOR_SPACE_EXTENSION_NAME".."XR_ANDROID_spatial_anchor_space"
    )

    EnumConstant(
        "ERROR_SPATIAL_ANCHOR_ENTITY_ID_INVALID_ANDROID".."-1000795001"
    )

    EnumConstant(
        "TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID".."1000795000"
    )

    XrResult(
        "CreateSpatialAnchorSpaceANDROID",

        XrSession("session"),
        XrSpatialContextEXT("spatialContext"),
        XrSpatialAnchorCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrSpatialEntityIdEXT.p("anchorEntityId"),
        Check(1)..XrSpace.p("anchorSpace")
    )

    XrResult(
        "CreateSpatialAnchorSpaceFromIdANDROID",

        XrSession("session"),
        XrSpatialContextEXT("spatialContext"),
        XrSpatialAnchorSpaceFromIdCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrSpace.p("anchorSpace")
    )
}