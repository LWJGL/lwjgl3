/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_local_dimming = "METALocalDimming".nativeClassXR("META_local_dimming", type = "instance", postfix = "META") {
    IntConstant(
        "META_local_dimming_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_LOCAL_DIMMING_EXTENSION_NAME".."XR_META_local_dimming"
    )

    EnumConstant(
        "TYPE_LOCAL_DIMMING_FRAME_END_INFO_META".."1000216000"
    )

    EnumConstant(
        "LOCAL_DIMMING_MODE_OFF_META".."0",
        "LOCAL_DIMMING_MODE_ON_META".."1"
    )
}