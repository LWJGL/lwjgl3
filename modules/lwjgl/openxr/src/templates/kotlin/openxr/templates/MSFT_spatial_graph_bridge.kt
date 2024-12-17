/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_spatial_graph_bridge = "MSFTSpatialGraphBridge".nativeClassXR("MSFT_spatial_graph_bridge", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_spatial_graph_bridge_SPEC_VERSION".."2"
    )

    StringConstant(
        "MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME".."XR_MSFT_spatial_graph_bridge"
    )

    EnumConstant(
        "GUID_SIZE_MSFT".."16"
    )

    EnumConstant(
        "OBJECT_TYPE_SPATIAL_GRAPH_NODE_BINDING_MSFT".."1000049000"
    )

    EnumConstant(
        "TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT".."1000049000",
        "TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT".."1000049001",
        "TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT".."1000049002",
        "TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT".."1000049003"
    )

    EnumConstant(
        "SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT".."1",
        "SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT".."2"
    )

    XrResult(
        "CreateSpatialGraphNodeSpaceMSFT",

        XrSession("session"),
        XrSpatialGraphNodeSpaceCreateInfoMSFT.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )

    XrResult(
        "TryCreateSpatialGraphStaticNodeBindingMSFT",

        XrSession("session"),
        XrSpatialGraphStaticNodeBindingCreateInfoMSFT.const.p("createInfo"),
        Check(1)..XrSpatialGraphNodeBindingMSFT.p("nodeBinding")
    )

    XrResult(
        "DestroySpatialGraphNodeBindingMSFT",

        XrSpatialGraphNodeBindingMSFT("nodeBinding")
    )

    XrResult(
        "GetSpatialGraphNodeBindingPropertiesMSFT",

        XrSpatialGraphNodeBindingMSFT("nodeBinding"),
        nullable..XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.const.p("getInfo"),
        XrSpatialGraphNodeBindingPropertiesMSFT.p("properties")
    )
}