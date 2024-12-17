/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_sharing = "FBSpatialEntitySharing".nativeClassXR("FB_spatial_entity_sharing", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_spatial_entity_sharing_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_SPATIAL_ENTITY_SHARING_EXTENSION_NAME".."XR_FB_spatial_entity_sharing"
    )

    EnumConstant(
        "TYPE_SPACE_SHARE_INFO_FB".."1000169001",
        "TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB".."1000169002"
    )

    EnumConstant(
        "ERROR_SPACE_MAPPING_INSUFFICIENT_FB".."-1000169000",
        "ERROR_SPACE_LOCALIZATION_FAILED_FB".."-1000169001",
        "ERROR_SPACE_NETWORK_TIMEOUT_FB".."-1000169002",
        "ERROR_SPACE_NETWORK_REQUEST_FAILED_FB".."-1000169003",
        "ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB".."-1000169004"
    )

    XrResult(
        "ShareSpacesFB",

        XrSession("session"),
        XrSpaceShareInfoFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )
}