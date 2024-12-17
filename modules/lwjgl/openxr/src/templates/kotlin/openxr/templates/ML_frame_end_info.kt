/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_frame_end_info = "MLFrameEndInfo".nativeClassXR("ML_frame_end_info", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_frame_end_info_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_FRAME_END_INFO_EXTENSION_NAME".."XR_ML_frame_end_info"
    )

    EnumConstant(
        "TYPE_FRAME_END_INFO_ML".."1000135000"
    )

    EnumConstant(
        "FRAME_END_INFO_PROTECTED_BIT_ML".enum(0x00000001),
        "FRAME_END_INFO_VIGNETTE_BIT_ML".enum(0x00000002)
    )
}