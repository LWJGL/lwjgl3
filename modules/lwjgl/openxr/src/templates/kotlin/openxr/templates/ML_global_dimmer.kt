/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_global_dimmer = "MLGlobalDimmer".nativeClassXR("ML_global_dimmer", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_global_dimmer_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_GLOBAL_DIMMER_EXTENSION_NAME".."XR_ML_global_dimmer"
    )

    EnumConstant(
        "TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML".."1000136000"
    )

    EnumConstant(
        "GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML".enum(0x00000001)
    )
}