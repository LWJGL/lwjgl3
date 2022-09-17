/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HUAWEI_controller_interaction = "HUAWEIControllerInteraction".nativeClassXR("HUAWEI_controller_interaction", type = "instance", postfix = "HUAWEI") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HUAWEI_controller_interaction">XR_HUAWEI_controller_interaction</a> extension.

        This extension defines a new interaction profile for the Huawei Controller, including but not limited to Huawei VR Glasses Controller.
        """

    IntConstant(
        "The extension specification version.",

        "HUAWEI_controller_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HUAWEI_CONTROLLER_INTERACTION_EXTENSION_NAME".."XR_HUAWEI_controller_interaction"
    )
}