/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_spatial_anchor_persistence = "MSFTSpatialAnchorPersistence".nativeClassXR("MSFT_spatial_anchor_persistence", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_spatial_anchor_persistence_SPEC_VERSION".."2"
    )

    StringConstant(
        "MSFT_SPATIAL_ANCHOR_PERSISTENCE_EXTENSION_NAME".."XR_MSFT_spatial_anchor_persistence"
    )

    EnumConstant(
        "OBJECT_TYPE_SPATIAL_ANCHOR_STORE_CONNECTION_MSFT".."1000142000"
    )

    EnumConstant(
        "TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT".."1000142000",
        "TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT".."1000142001"
    )

    EnumConstant(
        "ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT".."-1000142001",
        "ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT".."-1000142002"
    )

    EnumConstant(
        "MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT".."256"
    )

    XrResult(
        "CreateSpatialAnchorStoreConnectionMSFT",

        XrSession("session"),
        Check(1)..XrSpatialAnchorStoreConnectionMSFT.p("spatialAnchorStore")
    )

    XrResult(
        "DestroySpatialAnchorStoreConnectionMSFT",

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore")
    )

    XrResult(
        "PersistSpatialAnchorMSFT",

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore"),
        XrSpatialAnchorPersistenceInfoMSFT.const.p("spatialAnchorPersistenceInfo")
    )

    XrResult(
        "EnumeratePersistedSpatialAnchorNamesMSFT",

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore"),
        AutoSize("spatialAnchorNames")..uint32_t("spatialAnchorNameCapacityInput"),
        Check(1)..uint32_t.p("spatialAnchorNameCountOutput"),
        nullable..XrSpatialAnchorPersistenceNameMSFT.p("spatialAnchorNames")
    )

    XrResult(
        "CreateSpatialAnchorFromPersistedNameMSFT",

        XrSession("session"),
        XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.const.p("spatialAnchorCreateInfo"),
        Check(1)..XrSpatialAnchorMSFT.p("spatialAnchor")
    )

    XrResult(
        "UnpersistSpatialAnchorMSFT",

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore"),
        XrSpatialAnchorPersistenceNameMSFT.const.p("spatialAnchorPersistenceName")
    )

    XrResult(
        "ClearSpatialAnchorStoreMSFT",

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore")
    )
}