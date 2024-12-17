/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_headset_id = "METAHeadsetId".nativeClassXR("META_headset_id", type = "instance", postfix = "META") {
    IntConstant(
        "META_headset_id_SPEC_VERSION".."2"
    )

    StringConstant(
        "META_HEADSET_ID_EXTENSION_NAME".."XR_META_headset_id"
    )

    EnumConstant(
        "TYPE_SYSTEM_HEADSET_ID_PROPERTIES_META".."1000245000"
    )
}