/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_spatial_anchors_storage = "MLSpatialAnchorsStorage".nativeClassXR("ML_spatial_anchors_storage", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_spatial_anchors_storage_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_SPATIAL_ANCHORS_STORAGE_EXTENSION_NAME".."XR_ML_spatial_anchors_storage"
    )

    EnumConstant(
        "OBJECT_TYPE_SPATIAL_ANCHORS_STORAGE_ML".."1000141000"
    )

    EnumConstant(
        "ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML".."-1000141000"
    )

    EnumConstant(
        "TYPE_SPATIAL_ANCHORS_CREATE_STORAGE_INFO_ML".."1000141000",
        "TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML".."1000141001",
        "TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML".."1000141002",
        "TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML".."1000141003",
        "TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML".."1000141004",
        "TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML".."1000141005",
        "TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML".."1000141006",
        "TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_ML".."1000141007",
        "TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML".."1000141008",
        "TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML".."1000141009",
        "TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML".."1000141010",
        "TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML".."1000141011",
        "TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML".."1000141012"
    )

    XrResult(
        "CreateSpatialAnchorsStorageML",

        XrSession("session"),
        XrSpatialAnchorsCreateStorageInfoML.const.p("createInfo"),
        Check(1)..XrSpatialAnchorsStorageML.p("storage")
    )

    XrResult(
        "DestroySpatialAnchorsStorageML",

        XrSpatialAnchorsStorageML("storage")
    )

    XrResult(
        "QuerySpatialAnchorsAsyncML",

        XrSpatialAnchorsStorageML("storage"),
        XrSpatialAnchorsQueryInfoBaseHeaderML.const.p("queryInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "QuerySpatialAnchorsCompleteML",

        XrSpatialAnchorsStorageML("storage"),
        XrFutureEXT("future"),
        XrSpatialAnchorsQueryCompletionML.p("completion")
    )

    XrResult(
        "PublishSpatialAnchorsAsyncML",

        XrSpatialAnchorsStorageML("storage"),
        XrSpatialAnchorsPublishInfoML.const.p("publishInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "PublishSpatialAnchorsCompleteML",

        XrSpatialAnchorsStorageML("storage"),
        XrFutureEXT("future"),
        XrSpatialAnchorsPublishCompletionML.p("completion")
    )

    XrResult(
        "DeleteSpatialAnchorsAsyncML",

        XrSpatialAnchorsStorageML("storage"),
        XrSpatialAnchorsDeleteInfoML.const.p("deleteInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "DeleteSpatialAnchorsCompleteML",

        XrSpatialAnchorsStorageML("storage"),
        XrFutureEXT("future"),
        XrSpatialAnchorsDeleteCompletionML.p("completion")
    )

    XrResult(
        "UpdateSpatialAnchorsExpirationAsyncML",

        XrSpatialAnchorsStorageML("storage"),
        XrSpatialAnchorsUpdateExpirationInfoML.const.p("updateInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "UpdateSpatialAnchorsExpirationCompleteML",

        XrSpatialAnchorsStorageML("storage"),
        XrFutureEXT("future"),
        XrSpatialAnchorsUpdateExpirationCompletionML.p("completion")
    )
}