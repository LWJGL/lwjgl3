/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_foveated_rendering = "VARJOFoveatedRendering".nativeClassXR("VARJO_foveated_rendering", type = "instance", postfix = "VARJO") {
    IntConstant(
        "VARJO_foveated_rendering_SPEC_VERSION".."3"
    )

    StringConstant(
        "VARJO_FOVEATED_RENDERING_EXTENSION_NAME".."XR_VARJO_foveated_rendering"
    )

    EnumConstant(
        "TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO".."1000121000",
        "TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO".."1000121001",
        "TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO".."1000121002"
    )

    EnumConstant(
        "REFERENCE_SPACE_TYPE_COMBINED_EYE_VARJO".."1000121000"
    )
}