/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_scene_marker = "MSFTSceneMarker".nativeClassXR("MSFT_scene_marker", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_scene_marker_SPEC_VERSION".."1"
    )

    StringConstant(
        "MSFT_SCENE_MARKER_EXTENSION_NAME".."XR_MSFT_scene_marker"
    )

    EnumConstant(
        "SCENE_COMPUTE_FEATURE_MARKER_MSFT".."1000147000"
    )

    EnumConstant(
        "SCENE_COMPONENT_TYPE_MARKER_MSFT".."1000147000"
    )

    EnumConstant(
        "TYPE_SCENE_MARKERS_MSFT".."1000147000",
        "TYPE_SCENE_MARKER_TYPE_FILTER_MSFT".."1000147001",
        "TYPE_SCENE_MARKER_QR_CODES_MSFT".."1000147002"
    )

    EnumConstant(
        "SCENE_MARKER_DATA_NOT_STRING_MSFT".."1000147000"
    )

    EnumConstant(
        "SCENE_MARKER_TYPE_QR_CODE_MSFT".."1"
    )

    EnumConstant(
        "SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT".."1",
        "SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT".."2"
    )

    XrResult(
        "GetSceneMarkerRawDataMSFT",

        XrSceneMSFT("scene"),
        XrUuidMSFT.const.p("markerId"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..uint8_t.p("buffer")
    )

    XrResult(
        "GetSceneMarkerDecodedStringMSFT",

        XrSceneMSFT("scene"),
        XrUuidMSFT.const.p("markerId"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..char.p("buffer")
    )
}