/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_recommended_layer_resolution = "METARecommendedLayerResolution".nativeClassXR("META_recommended_layer_resolution", type = "instance", postfix = "META") {
    IntConstant(
        "META_recommended_layer_resolution_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_RECOMMENDED_LAYER_RESOLUTION_EXTENSION_NAME".."XR_META_recommended_layer_resolution"
    )

    EnumConstant(
        "TYPE_RECOMMENDED_LAYER_RESOLUTION_META".."1000254000",
        "TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META".."1000254001"
    )

    XrResult(
        "GetRecommendedLayerResolutionMETA",

        XrSession("session"),
        XrRecommendedLayerResolutionGetInfoMETA.const.p("info"),
        XrRecommendedLayerResolutionMETA.p("resolution")
    )
}