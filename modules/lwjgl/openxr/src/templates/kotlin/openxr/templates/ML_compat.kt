/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_compat = "MLCompat".nativeClassXR("ML_compat", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_compat_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_COMPAT_EXTENSION_NAME".."XR_ML_compat"
    )

    EnumConstant(
        "TYPE_COORDINATE_SPACE_CREATE_INFO_ML".."1000137000"
    )

    XrResult(
        "CreateSpaceFromCoordinateFrameUIDML",

        XrSession("session"),
        XrCoordinateSpaceCreateInfoML.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )
}