/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_query = "FBSpatialEntityQuery".nativeClassXR("FB_spatial_entity_query", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_spatial_entity_query_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_SPATIAL_ENTITY_QUERY_EXTENSION_NAME".."XR_FB_spatial_entity_query"
    )

    EnumConstant(
        "TYPE_SPACE_QUERY_INFO_FB".."1000156001",
        "TYPE_SPACE_QUERY_RESULTS_FB".."1000156002",
        "TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB".."1000156003",
        "TYPE_SPACE_COMPONENT_FILTER_INFO_FB".."1000156052",
        "TYPE_SPACE_UUID_FILTER_INFO_FB".."1000156054",
        "TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB".."1000156103",
        "TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB".."1000156104"
    )

    EnumConstant(
        "SPACE_QUERY_ACTION_LOAD_FB".."0"
    )

    EnumConstant(
        "SPACE_STORAGE_LOCATION_INVALID_FB".."0",
        "SPACE_STORAGE_LOCATION_LOCAL_FB".."1",
        "SPACE_STORAGE_LOCATION_CLOUD_FB".."2"
    )

    XrResult(
        "QuerySpacesFB",

        XrSession("session"),
        XrSpaceQueryInfoBaseHeaderFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )

    XrResult(
        "RetrieveSpaceQueryResultsFB",

        XrSession("session"),
        XrAsyncRequestIdFB("requestId"),
        XrSpaceQueryResultsFB.p("results")
    )
}