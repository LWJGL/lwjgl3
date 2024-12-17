/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_view_offset = "VARJOViewOffset".nativeClassXR("VARJO_view_offset", type = "instance", postfix = "VARJO") {
    IntConstant(
        "VARJO_view_offset_SPEC_VERSION".."1"
    )

    StringConstant(
        "VARJO_VIEW_OFFSET_EXTENSION_NAME".."XR_VARJO_view_offset"
    )

    XrResult(
        "SetViewOffsetVARJO",

        XrSession("session"),
        float("offset")
    )
}