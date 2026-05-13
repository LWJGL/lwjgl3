/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_light_estimation = "ANDROIDLightEstimation".nativeClassXR("ANDROID_light_estimation", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_light_estimation_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_LIGHT_ESTIMATION_EXTENSION_NAME".."XR_ANDROID_light_estimation"
    )

    EnumConstant(
        "TYPE_LIGHT_ESTIMATOR_CREATE_INFO_ANDROID".."1000700000",
        "TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID".."1000700001",
        "TYPE_LIGHT_ESTIMATE_ANDROID".."1000700002",
        "TYPE_DIRECTIONAL_LIGHT_ANDROID".."1000700003",
        "TYPE_SPHERICAL_HARMONICS_ANDROID".."1000700004",
        "TYPE_AMBIENT_LIGHT_ANDROID".."1000700005",
        "TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID".."1000700006"
    )

    EnumConstant(
        "OBJECT_TYPE_LIGHT_ESTIMATOR_ANDROID".."1000700000"
    )

    EnumConstant(
        "LIGHT_ESTIMATE_STATE_VALID_ANDROID".."0",
        "LIGHT_ESTIMATE_STATE_INVALID_ANDROID".."1"
    )

    EnumConstant(
        "SPHERICAL_HARMONICS_KIND_TOTAL_ANDROID".."0",
        "SPHERICAL_HARMONICS_KIND_AMBIENT_ANDROID".."1"
    )

    XrResult(
        "CreateLightEstimatorANDROID",

        XrSession("session"),
        XrLightEstimatorCreateInfoANDROID.p("createInfo"),
        Check(1)..XrLightEstimatorANDROID.p("outHandle")
    )

    XrResult(
        "DestroyLightEstimatorANDROID",

        XrLightEstimatorANDROID("estimator")
    )

    XrResult(
        "GetLightEstimateANDROID",

        XrLightEstimatorANDROID("estimator"),
        XrLightEstimateGetInfoANDROID.const.p("input"),
        XrLightEstimateANDROID.p("output")
    )
}