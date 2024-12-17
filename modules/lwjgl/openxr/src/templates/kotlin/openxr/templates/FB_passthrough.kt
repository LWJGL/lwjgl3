/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_passthrough = "FBPassthrough".nativeClassXR("FB_passthrough", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_passthrough_SPEC_VERSION".."4"
    )

    StringConstant(
        "FB_PASSTHROUGH_EXTENSION_NAME".."XR_FB_passthrough"
    )

    EnumConstant(
        "TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB".."1000118000",
        "TYPE_PASSTHROUGH_CREATE_INFO_FB".."1000118001",
        "TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB".."1000118002",
        "TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB".."1000118003",
        "TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB".."1000118004",
        "TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB".."1000118005",
        "TYPE_SYSTEM_PASSTHROUGH_PROPERTIES2_FB".."1000118006",
        "TYPE_PASSTHROUGH_STYLE_FB".."1000118020",
        "TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB".."1000118021",
        "TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB".."1000118022",
        "TYPE_PASSTHROUGH_BRIGHTNESS_CONTRAST_SATURATION_FB".."1000118023",
        "TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB".."1000118030"
    )

    EnumConstant(
        "ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB".."-1000118000",
        "ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB".."-1000118001",
        "ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB".."-1000118002",
        "ERROR_NOT_PERMITTED_PASSTHROUGH_FB".."-1000118003",
        "ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB".."-1000118004",
        "ERROR_UNKNOWN_PASSTHROUGH_FB".."-1000118050"
    )

    EnumConstant(
        "PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB".."256"
    )

    EnumConstant(
        "OBJECT_TYPE_PASSTHROUGH_FB".."1000118000",
        "OBJECT_TYPE_PASSTHROUGH_LAYER_FB".."1000118002",
        "OBJECT_TYPE_GEOMETRY_INSTANCE_FB".."1000118004"
    )

    EnumConstant(
        "PASSTHROUGH_CAPABILITY_BIT_FB".enum(0x00000001),
        "PASSTHROUGH_CAPABILITY_COLOR_BIT_FB".enum(0x00000002),
        "PASSTHROUGH_CAPABILITY_LAYER_DEPTH_BIT_FB".enum(0x00000004)
    )

    EnumConstant(
        "PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB".enum(0x00000001),
        "PASSTHROUGH_LAYER_DEPTH_BIT_FB".enum(0x00000002)
    )

    EnumConstant(
        "PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB".."0",
        "PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB".."1"
    )

    EnumConstant(
        "PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB".enum(0x00000001),
        "PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB".enum(0x00000002),
        "PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB".enum(0x00000004),
        "PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB".enum(0x00000008)
    )

    XrResult(
        "CreatePassthroughFB",

        XrSession("session"),
        XrPassthroughCreateInfoFB.const.p("createInfo"),
        Check(1)..XrPassthroughFB.p("outPassthrough")
    )

    XrResult(
        "DestroyPassthroughFB",

        XrPassthroughFB("passthrough")
    )

    XrResult(
        "PassthroughStartFB",

        XrPassthroughFB("passthrough")
    )

    XrResult(
        "PassthroughPauseFB",

        XrPassthroughFB("passthrough")
    )

    XrResult(
        "CreatePassthroughLayerFB",

        XrSession("session"),
        XrPassthroughLayerCreateInfoFB.const.p("createInfo"),
        Check(1)..XrPassthroughLayerFB.p("outLayer")
    )

    XrResult(
        "DestroyPassthroughLayerFB",

        XrPassthroughLayerFB("layer")
    )

    XrResult(
        "PassthroughLayerPauseFB",

        XrPassthroughLayerFB("layer")
    )

    XrResult(
        "PassthroughLayerResumeFB",

        XrPassthroughLayerFB("layer")
    )

    XrResult(
        "PassthroughLayerSetStyleFB",

        XrPassthroughLayerFB("layer"),
        XrPassthroughStyleFB.const.p("style")
    )

    XrResult(
        "CreateGeometryInstanceFB",

        XrSession("session"),
        XrGeometryInstanceCreateInfoFB.const.p("createInfo"),
        Check(1)..XrGeometryInstanceFB.p("outGeometryInstance")
    )

    XrResult(
        "DestroyGeometryInstanceFB",

        XrGeometryInstanceFB("instance")
    )

    XrResult(
        "GeometryInstanceSetTransformFB",

        XrGeometryInstanceFB("instance"),
        XrGeometryInstanceTransformFB.const.p("transformation")
    )
}