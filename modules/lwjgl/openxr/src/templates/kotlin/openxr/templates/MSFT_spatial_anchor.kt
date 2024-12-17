/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_spatial_anchor = "MSFTSpatialAnchor".nativeClassXR("MSFT_spatial_anchor", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_spatial_anchor_SPEC_VERSION".."2"
    )

    StringConstant(
        "MSFT_SPATIAL_ANCHOR_EXTENSION_NAME".."XR_MSFT_spatial_anchor"
    )

    EnumConstant(
        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT".."1000039000",
        "TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT".."1000039001"
    )

    EnumConstant(
        "OBJECT_TYPE_SPATIAL_ANCHOR_MSFT".."1000039000"
    )

    EnumConstant(
        "ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT".."-1000039001"
    )

    XrResult(
        "CreateSpatialAnchorMSFT",

        XrSession("session"),
        XrSpatialAnchorCreateInfoMSFT.const.p("createInfo"),
        Check(1)..XrSpatialAnchorMSFT.p("anchor")
    )

    XrResult(
        "CreateSpatialAnchorSpaceMSFT",

        XrSession("session"),
        XrSpatialAnchorSpaceCreateInfoMSFT.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )

    XrResult(
        "DestroySpatialAnchorMSFT",

        XrSpatialAnchorMSFT("anchor")
    )
}