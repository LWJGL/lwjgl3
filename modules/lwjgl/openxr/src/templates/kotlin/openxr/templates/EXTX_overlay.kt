/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXTX_overlay = "EXTXOverlay".nativeClassXR("EXTX_overlay", type = "instance", postfix = "EXTX") {
    IntConstant(
        "EXTX_overlay_SPEC_VERSION".."5"
    )

    StringConstant(
        "EXTX_OVERLAY_EXTENSION_NAME".."XR_EXTX_overlay"
    )

    EnumConstant(
        "TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX".."1000033000",
        "TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX".."1000033003"
    )

    EnumConstant(
        "OVERLAY_MAIN_SESSION_ENABLED_COMPOSITION_LAYER_INFO_DEPTH_BIT_EXTX".enum(0x00000001)
    )
}