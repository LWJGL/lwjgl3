/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_passthrough = "HTCPassthrough".nativeClassXR("HTC_passthrough", type = "instance", postfix = "HTC") {
    IntConstant(
        "HTC_passthrough_SPEC_VERSION".."1"
    )

    StringConstant(
        "HTC_PASSTHROUGH_EXTENSION_NAME".."XR_HTC_passthrough"
    )

    EnumConstant(
        "OBJECT_TYPE_PASSTHROUGH_HTC".."1000317000"
    )

    EnumConstant(
        "TYPE_PASSTHROUGH_CREATE_INFO_HTC".."1000317001",
        "TYPE_PASSTHROUGH_COLOR_HTC".."1000317002",
        "TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC".."1000317003",
        "TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC".."1000317004"
    )

    EnumConstant(
        "PASSTHROUGH_FORM_PLANAR_HTC".."0",
        "PASSTHROUGH_FORM_PROJECTED_HTC".."1"
    )

    XrResult(
        "CreatePassthroughHTC",

        XrSession("session"),
        XrPassthroughCreateInfoHTC.const.p("createInfo"),
        Check(1)..XrPassthroughHTC.p("passthrough")
    )

    XrResult(
        "DestroyPassthroughHTC",

        XrPassthroughHTC("passthrough")
    )
}