/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.MSFT as MSFT_

val MSFT_spatial_anchor = "MSFTSpatialAnchor".nativeClassXR("MSFT_spatial_anchor", type = "instance", postfix = MSFT_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_spatial_anchor_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SPATIAL_ANCHOR_EXTENSION_NAME".."XR_MSFT_spatial_anchor"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT".."1000039000",
        "TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT".."1000039001"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_SPATIAL_ANCHOR_MSFT".."1000039000"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT".."-1000039001"
    )

    XrResult(
        "CreateSpatialAnchorMSFT",
        "",

        XrSession("session", ""),
        XrSpatialAnchorCreateInfoMSFT.const.p("createInfo", ""),
        Check(1)..XrSpatialAnchorMSFT.p("anchor", "")
    )

    XrResult(
        "CreateSpatialAnchorSpaceMSFT",
        "",

        XrSession("session", ""),
        XrSpatialAnchorSpaceCreateInfoMSFT.const.p("createInfo", ""),
        Check(1)..XrSpace.p("space", "")
    )

    XrResult(
        "DestroySpatialAnchorMSFT",
        "",

        XrSpatialAnchorMSFT("anchor", "")
    )
}