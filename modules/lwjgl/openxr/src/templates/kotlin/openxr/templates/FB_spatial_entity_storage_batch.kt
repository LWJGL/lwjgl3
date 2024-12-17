/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_storage_batch = "FBSpatialEntityStorageBatch".nativeClassXR("FB_spatial_entity_storage_batch", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_spatial_entity_storage_batch_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_SPATIAL_ENTITY_STORAGE_BATCH_EXTENSION_NAME".."XR_FB_spatial_entity_storage_batch"
    )

    EnumConstant(
        "TYPE_SPACE_LIST_SAVE_INFO_FB".."1000238000",
        "TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB".."1000238001"
    )

    XrResult(
        "SaveSpaceListFB",

        XrSession("session"),
        XrSpaceListSaveInfoFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )
}