/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EPIC_view_configuration_fov = "EPICViewConfigurationFov".nativeClassXR("EPIC_view_configuration_fov", type = "instance", postfix = "EPIC") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EPIC_view_configuration_fov_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EPIC_VIEW_CONFIGURATION_FOV_EXTENSION_NAME".."XR_EPIC_view_configuration_fov"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VIEW_CONFIGURATION_VIEW_FOV_EPIC".."1000059000"
    )
}