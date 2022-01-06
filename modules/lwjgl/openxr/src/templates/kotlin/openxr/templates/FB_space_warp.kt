/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_space_warp = "FBSpaceWarp".nativeClassXR("FB_space_warp", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_space_warp_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SPACE_WARP_EXTENSION_NAME".."XR_FB_space_warp"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_SPACE_WARP_INFO_FB".."1000171000",
        "TYPE_SYSTEM_SPACE_WARP_PROPERTIES_FB".."1000171001"
    )
}