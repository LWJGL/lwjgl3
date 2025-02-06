/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_frame_synthesis = "EXTFrameSynthesis".nativeClassXR("EXT_frame_synthesis", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_frame_synthesis_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_FRAME_SYNTHESIS_EXTENSION_NAME".."XR_EXT_frame_synthesis"
    )

    EnumConstant(
        "TYPE_FRAME_SYNTHESIS_INFO_EXT".."1000211000",
        "TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT".."1000211001"
    )

    EnumConstant(
        "FRAME_SYNTHESIS_INFO_USE_2D_MOTION_VECTOR_BIT_EXT".enum(0x00000001),
        "FRAME_SYNTHESIS_INFO_REQUEST_RELAXED_FRAME_INTERVAL_BIT_EXT".enum(0x00000002)
    )
}