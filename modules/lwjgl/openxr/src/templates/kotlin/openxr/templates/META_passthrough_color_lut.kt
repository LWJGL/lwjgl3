/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_passthrough_color_lut = "METAPassthroughColorLut".nativeClassXR("META_passthrough_color_lut", type = "instance", postfix = "META") {
    IntConstant(
        "META_passthrough_color_lut_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_PASSTHROUGH_COLOR_LUT_EXTENSION_NAME".."XR_META_passthrough_color_lut"
    )

    EnumConstant(
        "TYPE_SYSTEM_PASSTHROUGH_COLOR_LUT_PROPERTIES_META".."1000266000",
        "TYPE_PASSTHROUGH_COLOR_LUT_CREATE_INFO_META".."1000266001",
        "TYPE_PASSTHROUGH_COLOR_LUT_UPDATE_INFO_META".."1000266002",
        "TYPE_PASSTHROUGH_COLOR_MAP_LUT_META".."1000266100",
        "TYPE_PASSTHROUGH_COLOR_MAP_INTERPOLATED_LUT_META".."1000266101"
    )

    EnumConstant(
        "OBJECT_TYPE_PASSTHROUGH_COLOR_LUT_META".."1000266000"
    )

    EnumConstant(
        "ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META".."-1000266000"
    )

    EnumConstant(
        "PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META".."1",
        "PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META".."2"
    )

    XrResult(
        "CreatePassthroughColorLutMETA",

        XrPassthroughFB("passthrough"),
        XrPassthroughColorLutCreateInfoMETA.const.p("createInfo"),
        Check(1)..XrPassthroughColorLutMETA.p("colorLut")
    )

    XrResult(
        "DestroyPassthroughColorLutMETA",

        XrPassthroughColorLutMETA("colorLut")
    )

    XrResult(
        "UpdatePassthroughColorLutMETA",

        XrPassthroughColorLutMETA("colorLut"),
        XrPassthroughColorLutUpdateInfoMETA.const.p("updateInfo")
    )
}