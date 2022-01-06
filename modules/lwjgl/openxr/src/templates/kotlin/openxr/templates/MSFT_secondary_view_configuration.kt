/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_secondary_view_configuration = "MSFTSecondaryViewConfiguration".nativeClassXR("MSFT_secondary_view_configuration", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_secondary_view_configuration_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SECONDARY_VIEW_CONFIGURATION_EXTENSION_NAME".."XR_MSFT_secondary_view_configuration"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT".."1000053000",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT".."1000053001",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT".."1000053002",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT".."1000053003",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT".."1000053004",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT".."1000053005"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT".."-1000053000"
    )
}