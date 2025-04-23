/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_spatial_scene = "BDSpatialScene".nativeClassXR("BD_spatial_scene", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_spatial_scene_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_SPATIAL_SCENE_EXTENSION_NAME".."XR_BD_spatial_scene"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPATIAL_SCENE_PROPERTIES_BD".."1000392000",
        "TYPE_SCENE_CAPTURE_INFO_BD".."1000392001"
    )

    EnumConstant(
        "SENSE_DATA_PROVIDER_TYPE_SCENE_BD".."1000392000"
    )

    EnumConstant(
        "ERROR_SCENE_CAPTURE_FAILURE_BD".."-1000392000"
    )

    XrResult(
        "CaptureSceneAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSceneCaptureInfoBD.const.p("info"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CaptureSceneCompleteBD",

        XrSenseDataProviderBD("provider"),
        XrFutureEXT("future"),
        XrFutureCompletionEXT.p("completion")
    )
}