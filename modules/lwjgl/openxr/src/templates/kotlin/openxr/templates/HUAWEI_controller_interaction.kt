/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.HUAWEI as HUAWEI_

val HUAWEI_controller_interaction = "HUAWEIControllerInteraction".nativeClassXR("HUAWEI_controller_interaction", type = "instance", postfix = HUAWEI_) {
    documentation =
        """
        The $templateName extension.
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