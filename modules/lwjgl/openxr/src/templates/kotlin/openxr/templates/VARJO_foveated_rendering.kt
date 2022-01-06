/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_foveated_rendering = "VARJOFoveatedRendering".nativeClassXR("VARJO_foveated_rendering", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_foveated_rendering_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "VARJO_FOVEATED_RENDERING_EXTENSION_NAME".."XR_VARJO_foveated_rendering"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO".."1000121000",
        "TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO".."1000121001",
        "TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO".."1000121002"
    )

    EnumConstant(
        "Extends {@code XrReferenceSpaceType}.",

        "REFERENCE_SPACE_TYPE_COMBINED_EYE_VARJO".."1000121000"
    )
}