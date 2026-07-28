/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_stationary_reference_space = "EXTStationaryReferenceSpace".nativeClassXR("EXT_stationary_reference_space", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_stationary_reference_space_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_STATIONARY_REFERENCE_SPACE_EXTENSION_NAME".."XR_EXT_stationary_reference_space"
    )

    EnumConstant(
        "REFERENCE_SPACE_TYPE_STATIONARY_EXT".."1000742000"
    )

    EnumConstant(
        "TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_GET_INFO_EXT".."1000742001",
        "TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT".."1000742002"
    )

    XrResult(
        "GetStationaryReferenceSpaceGenerationIdEXT",

        XrSession("session"),
        nullable..XrStationaryReferenceSpaceGenerationIdGetInfoEXT.const.p("getInfo"),
        XrStationaryReferenceSpaceGenerationIdResultEXT.p("generationIdResult")
    )
}