/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_spatial_anchor_sharing = "BDSpatialAnchorSharing".nativeClassXR("BD_spatial_anchor_sharing", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_spatial_anchor_sharing_SPEC_VERSION".."2"
    )

    StringConstant(
        "BD_SPATIAL_ANCHOR_SHARING_EXTENSION_NAME".."XR_BD_spatial_anchor_sharing"
    )

    EnumConstant(
        "ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_TIMEOUT_BD".."-1000391000",
        "ERROR_SPATIAL_ANCHOR_SHARING_AUTHENTICATION_FAILURE_BD".."-1000391001",
        "ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_FAILURE_BD".."-1000391002",
        "ERROR_SPATIAL_ANCHOR_SHARING_LOCALIZATION_FAIL_BD".."-1000391003",
        "ERROR_SPATIAL_ANCHOR_SHARING_MAP_INSUFFICIENT_BD".."-1000391004"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD".."1000391000",
        "TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD".."1000391001",
        "TYPE_SHARED_SPATIAL_ANCHOR_DOWNLOAD_INFO_BD".."1000391002"
    )

    XrResult(
        "ShareSpatialAnchorAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSpatialAnchorShareInfoBD.const.p("info"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "ShareSpatialAnchorCompleteBD",

        XrSenseDataProviderBD("provider"),
        XrFutureEXT("future"),
        XrFutureCompletionEXT.p("completion")
    )

    XrResult(
        "DownloadSharedSpatialAnchorAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSharedSpatialAnchorDownloadInfoBD.const.p("info"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "DownloadSharedSpatialAnchorCompleteBD",

        XrSenseDataProviderBD("provider"),
        XrFutureEXT("future"),
        XrFutureCompletionEXT.p("completion")
    )
}