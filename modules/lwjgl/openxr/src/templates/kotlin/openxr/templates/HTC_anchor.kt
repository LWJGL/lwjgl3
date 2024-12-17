/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_anchor = "HTCAnchor".nativeClassXR("HTC_anchor", type = "instance", postfix = "HTC") {
    IntConstant(
        "HTC_anchor_SPEC_VERSION".."1"
    )

    StringConstant(
        "HTC_ANCHOR_EXTENSION_NAME".."XR_HTC_anchor"
    )

    EnumConstant(
        "MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC".."256"
    )

    EnumConstant(
        "TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC".."1000319000",
        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC".."1000319001"
    )

    EnumConstant(
        "ERROR_NOT_AN_ANCHOR_HTC".."-1000319000"
    )

    XrResult(
        "CreateSpatialAnchorHTC",

        XrSession("session"),
        XrSpatialAnchorCreateInfoHTC.const.p("createInfo"),
        Check(1)..XrSpace.p("anchor")
    )

    XrResult(
        "GetSpatialAnchorNameHTC",

        XrSpace("anchor"),
        XrSpatialAnchorNameHTC.p("name")
    )
}