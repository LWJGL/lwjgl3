/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_composition_layer_passthrough_mesh = "ANDROIDCompositionLayerPassthroughMesh".nativeClassXR("ANDROID_composition_layer_passthrough_mesh", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_composition_layer_passthrough_mesh_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_COMPOSITION_LAYER_PASSTHROUGH_MESH_EXTENSION_NAME".."XR_ANDROID_composition_layer_passthrough_mesh"
    )

    EnumConstant(
        "TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID".."1000462000",
        "TYPE_PASSTHROUGH_LAYER_MESH_ANDROID".."1000462001",
        "TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID".."1000462002",
        "TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID".."1000462003"
    )

    EnumConstant(
        "ERROR_MESH_DATA_LIMIT_EXCEEDED_ANDROID".."-1000462000"
    )

    EnumConstant(
        "OBJECT_TYPE_PASSTHROUGH_LAYER_ANDROID".."1000462000"
    )

    EnumConstant(
        "WINDING_ORDER_UNKNOWN_ANDROID".."0",
        "WINDING_ORDER_CW_ANDROID".."1",
        "WINDING_ORDER_CCW_ANDROID".."2"
    )

    XrResult(
        "CreatePassthroughLayerANDROID",

        XrSession("session"),
        XrPassthroughLayerCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrPassthroughLayerANDROID.p("layer")
    )

    XrResult(
        "DestroyPassthroughLayerANDROID",

        XrPassthroughLayerANDROID("layer")
    )

    XrResult(
        "SetPassthroughLayerMeshANDROID",

        XrPassthroughLayerANDROID("layer"),
        XrPassthroughLayerMeshANDROID.const.p("mesh")
    )
}