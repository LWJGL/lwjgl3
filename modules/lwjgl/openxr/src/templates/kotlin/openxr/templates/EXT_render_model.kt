/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_render_model = "EXTRenderModel".nativeClassXR("EXT_render_model", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_render_model_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_RENDER_MODEL_EXTENSION_NAME".."XR_EXT_render_model"
    )

    EnumConstant(
        "NULL_RENDER_MODEL_ID_EXT".."0"
    )

    EnumConstant(
        "MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT".."64"
    )

    EnumConstant(
        "OBJECT_TYPE_RENDER_MODEL_EXT".."1000300000",
        "OBJECT_TYPE_RENDER_MODEL_ASSET_EXT".."1000300001"
    )

    EnumConstant(
        "TYPE_RENDER_MODEL_CREATE_INFO_EXT".."1000300000",
        "TYPE_RENDER_MODEL_PROPERTIES_GET_INFO_EXT".."1000300001",
        "TYPE_RENDER_MODEL_PROPERTIES_EXT".."1000300002",
        "TYPE_RENDER_MODEL_SPACE_CREATE_INFO_EXT".."1000300003",
        "TYPE_RENDER_MODEL_STATE_GET_INFO_EXT".."1000300004",
        "TYPE_RENDER_MODEL_STATE_EXT".."1000300005",
        "TYPE_RENDER_MODEL_ASSET_CREATE_INFO_EXT".."1000300006",
        "TYPE_RENDER_MODEL_ASSET_DATA_GET_INFO_EXT".."1000300007",
        "TYPE_RENDER_MODEL_ASSET_DATA_EXT".."1000300008",
        "TYPE_RENDER_MODEL_ASSET_PROPERTIES_GET_INFO_EXT".."1000300009",
        "TYPE_RENDER_MODEL_ASSET_PROPERTIES_EXT".."1000300010"
    )

    EnumConstant(
        "ERROR_RENDER_MODEL_ID_INVALID_EXT".."-1000300000",
        "ERROR_RENDER_MODEL_ASSET_UNAVAILABLE_EXT".."-1000300001",
        "ERROR_RENDER_MODEL_GLTF_EXTENSION_REQUIRED_EXT".."-1000300002"
    )

    XrResult(
        "CreateRenderModelEXT",

        XrSession("session"),
        XrRenderModelCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrRenderModelEXT.p("renderModel")
    )

    XrResult(
        "DestroyRenderModelEXT",

        XrRenderModelEXT("renderModel")
    )

    XrResult(
        "GetRenderModelPropertiesEXT",

        XrRenderModelEXT("renderModel"),
        nullable..XrRenderModelPropertiesGetInfoEXT.const.p("getInfo"),
        XrRenderModelPropertiesEXT.p("properties")
    )

    XrResult(
        "CreateRenderModelSpaceEXT",

        XrSession("session"),
        XrRenderModelSpaceCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )

    XrResult(
        "CreateRenderModelAssetEXT",

        XrSession("session"),
        XrRenderModelAssetCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrRenderModelAssetEXT.p("asset")
    )

    XrResult(
        "DestroyRenderModelAssetEXT",

        XrRenderModelAssetEXT("asset")
    )

    XrResult(
        "GetRenderModelAssetDataEXT",

        XrRenderModelAssetEXT("asset"),
        nullable..XrRenderModelAssetDataGetInfoEXT.const.p("getInfo"),
        XrRenderModelAssetDataEXT.p("buffer")
    )

    XrResult(
        "GetRenderModelAssetPropertiesEXT",

        XrRenderModelAssetEXT("asset"),
        nullable..XrRenderModelAssetPropertiesGetInfoEXT.const.p("getInfo"),
        XrRenderModelAssetPropertiesEXT.p("properties")
    )

    XrResult(
        "GetRenderModelStateEXT",

        XrRenderModelEXT("renderModel"),
        XrRenderModelStateGetInfoEXT.const.p("getInfo"),
        XrRenderModelStateEXT.p("state")
    )
}