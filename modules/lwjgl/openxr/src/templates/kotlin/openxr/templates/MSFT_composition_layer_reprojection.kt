/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_composition_layer_reprojection = "MSFTCompositionLayerReprojection".nativeClassXR("MSFT_composition_layer_reprojection", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_composition_layer_reprojection_SPEC_VERSION".."1"
    )

    StringConstant(
        "MSFT_COMPOSITION_LAYER_REPROJECTION_EXTENSION_NAME".."XR_MSFT_composition_layer_reprojection"
    )

    EnumConstant(
        "TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT".."1000066000",
        "TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT".."1000066001"
    )

    EnumConstant(
        "ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT".."-1000066000"
    )

    EnumConstant(
        "REPROJECTION_MODE_DEPTH_MSFT".."1",
        "REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT".."2",
        "REPROJECTION_MODE_PLANAR_MANUAL_MSFT".."3",
        "REPROJECTION_MODE_ORIENTATION_ONLY_MSFT".."4"
    )

    XrResult(
        "EnumerateReprojectionModesMSFT",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrViewConfigurationType("viewConfigurationType"),
        AutoSize("modes")..uint32_t("modeCapacityInput"),
        Check(1)..uint32_t.p("modeCountOutput"),
        nullable..XrReprojectionModeMSFT.p("modes")
    )
}