/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_spatial_anchor = "BDSpatialAnchor".nativeClassXR("BD_spatial_anchor", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_spatial_anchor_SPEC_VERSION".."2"
    )

    StringConstant(
        "BD_SPATIAL_ANCHOR_EXTENSION_NAME".."XR_BD_spatial_anchor"
    )

    EnumConstant(
        "ERROR_SPATIAL_ANCHOR_NOT_FOUND_BD".."-1000390000"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPATIAL_ANCHOR_PROPERTIES_BD".."1000390000",
        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_BD".."1000390001",
        "TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD".."1000390002",
        "TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD".."1000390003",
        "TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD".."1000390004"
    )

    EnumConstant(
        "SENSE_DATA_PROVIDER_TYPE_ANCHOR_BD".."1000390000"
    )

    EnumConstant(
        "PERSISTENCE_LOCATION_LOCAL_BD".."0"
    )

    XrResult(
        "CreateSpatialAnchorAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSpatialAnchorCreateInfoBD.const.p("info"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateSpatialAnchorCompleteBD",

        XrSenseDataProviderBD("provider"),
        XrFutureEXT("future"),
        XrSpatialAnchorCreateCompletionBD.p("completion")
    )

    XrResult(
        "PersistSpatialAnchorAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSpatialAnchorPersistInfoBD.const.p("info"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "PersistSpatialAnchorCompleteBD",

        XrSenseDataProviderBD("provider"),
        XrFutureEXT("future"),
        XrFutureCompletionEXT.p("completion")
    )

    XrResult(
        "UnpersistSpatialAnchorAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSpatialAnchorUnpersistInfoBD.const.p("info"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "UnpersistSpatialAnchorCompleteBD",

        XrSenseDataProviderBD("provider"),
        XrFutureEXT("future"),
        XrFutureCompletionEXT.p("completion")
    )
}