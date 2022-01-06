/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_view_configuration_depth_range = "EXTViewConfigurationDepthRange".nativeClassXR("EXT_view_configuration_depth_range", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_view_configuration_depth_range_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_VIEW_CONFIGURATION_DEPTH_RANGE_EXTENSION_NAME".."XR_EXT_view_configuration_depth_range"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT".."1000046000"
    )
}