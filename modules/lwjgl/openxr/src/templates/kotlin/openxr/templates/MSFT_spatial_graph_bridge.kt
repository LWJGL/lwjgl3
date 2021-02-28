/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_spatial_graph_bridge = "MSFTSpatialGraphBridge".nativeClassXR("MSFT_spatial_graph_bridge", type = "instance", postfix = MSFT) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_spatial_graph_bridge_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME".."XR_MSFT_spatial_graph_bridge"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT".."1000049000"
    )

    EnumConstant(
        "XrSpatialGraphNodeTypeMSFT",

        "SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT".."1",
        "SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT".."2"
    )

    XrResult(
        "CreateSpatialGraphNodeSpaceMSFT",
        "",

        XrSession("session", ""),
        XrSpatialGraphNodeSpaceCreateInfoMSFT.const.p("createInfo", ""),
        Check(1)..XrSpace.p("space", "")
    )
}