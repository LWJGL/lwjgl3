/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.EXTX as EXTX_

val EXTX_overlay = "EXTXOverlay".nativeClassXR("EXTX_overlay", type = "instance", postfix = EXTX_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXTX_overlay_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "EXTX_OVERLAY_EXTENSION_NAME".."XR_EXTX_overlay"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX".."1000033000",
        "TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX".."1000033003"
    )
}