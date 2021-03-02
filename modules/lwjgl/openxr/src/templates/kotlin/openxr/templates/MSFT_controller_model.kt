/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.MSFT as MSFT_

val MSFT_controller_model = "MSFTControllerModel".nativeClassXR("MSFT_controller_model", type = "instance", postfix = MSFT_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_controller_model_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MSFT_CONTROLLER_MODEL_EXTENSION_NAME".."XR_MSFT_controller_model"
    )

    EnumConstant(
        "XR_MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT",

        "MAX_CONTROLLER_MODEL_NODE_NAME_SIZE_MSFT".."64"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_CONTROLLER_MODEL_KEY_STATE_MSFT".."1000055000",
        "TYPE_CONTROLLER_MODEL_NODE_PROPERTIES_MSFT".."1000055001",
        "TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT".."1000055002",
        "TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT".."1000055003",
        "TYPE_CONTROLLER_MODEL_STATE_MSFT".."1000055004"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT".."-1000055000"
    )

    XrResult(
        "GetControllerModelKeyMSFT",
        "",

        XrSession("session", ""),
        XrPath("topLevelUserPath", ""),
        XrControllerModelKeyStateMSFT.p("controllerModelKeyState", "")
    )

    XrResult(
        "LoadControllerModelMSFT",
        "",

        XrSession("session", ""),
        XrControllerModelKeyMSFT("modelKey", ""),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", ""),
        Check(1)..uint32_t.p("bufferCountOutput", ""),
        nullable..uint8_t.p("buffer", "")
    )

    XrResult(
        "GetControllerModelPropertiesMSFT",
        "",

        XrSession("session", ""),
        XrControllerModelKeyMSFT("modelKey", ""),
        XrControllerModelPropertiesMSFT.p("properties", "")
    )

    XrResult(
        "GetControllerModelStateMSFT",
        "",

        XrSession("session", ""),
        XrControllerModelKeyMSFT("modelKey", ""),
        XrControllerModelStateMSFT.p("state", "")
    )
}