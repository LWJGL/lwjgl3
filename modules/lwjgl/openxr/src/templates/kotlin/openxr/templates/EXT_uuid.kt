/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_uuid = "EXTUUIUD".nativeClassXR("EXT_uuid", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_uuid_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_UUID_EXTENSION_NAME".."XR_EXT_uuid"
    )

    EnumConstant(
        "UUID_SIZE_EXT".."16"
    )
}