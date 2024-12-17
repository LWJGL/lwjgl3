/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_storage = "FBSpatialEntityStorage".nativeClassXR("FB_spatial_entity_storage", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_spatial_entity_storage_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_SPATIAL_ENTITY_STORAGE_EXTENSION_NAME".."XR_FB_spatial_entity_storage"
    )

    EnumConstant(
        "TYPE_SPACE_SAVE_INFO_FB".."1000158000",
        "TYPE_SPACE_ERASE_INFO_FB".."1000158001",
        "TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB".."1000158106",
        "TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB".."1000158107"
    )

    EnumConstant(
        "SPACE_PERSISTENCE_MODE_INVALID_FB".."0",
        "SPACE_PERSISTENCE_MODE_INDEFINITE_FB".."1"
    )

    XrResult(
        "SaveSpaceFB",

        XrSession("session"),
        XrSpaceSaveInfoFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )

    XrResult(
        "EraseSpaceFB",

        XrSession("session"),
        XrSpaceEraseInfoFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )
}