/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_local_floor = "EXTLocalFloor".nativeClassXR("EXT_local_floor", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_local_floor_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_LOCAL_FLOOR_EXTENSION_NAME".."XR_EXT_local_floor"
    )

    EnumConstant(
        "REFERENCE_SPACE_TYPE_LOCAL_FLOOR_EXT".."1000426000"
    )
}