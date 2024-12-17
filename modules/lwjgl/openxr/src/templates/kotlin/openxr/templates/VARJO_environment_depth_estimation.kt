/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_environment_depth_estimation = "VARJOEnvironmentDepthEstimation".nativeClassXR("VARJO_environment_depth_estimation", type = "instance", postfix = "VARJO") {
    IntConstant(
        "VARJO_environment_depth_estimation_SPEC_VERSION".."1"
    )

    StringConstant(
        "VARJO_ENVIRONMENT_DEPTH_ESTIMATION_EXTENSION_NAME".."XR_VARJO_environment_depth_estimation"
    )

    XrResult(
        "SetEnvironmentDepthEstimationVARJO",

        XrSession("session"),
        XrBool32("enabled")
    )
}