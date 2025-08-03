/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_persistence = "METASpatialEntityPersistence".nativeClassXR("META_spatial_entity_persistence", type = "instance", postfix = "META") {
    IntConstant(
        "META_spatial_entity_persistence_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SPATIAL_ENTITY_PERSISTENCE_EXTENSION_NAME".."XR_META_spatial_entity_persistence"
    )

    EnumConstant(
        "ERROR_SPACE_INSUFFICIENT_RESOURCES_META".."-1000259000",
        "ERROR_SPACE_STORAGE_AT_CAPACITY_META".."-1000259001",
        "ERROR_SPACE_INSUFFICIENT_VIEW_META".."-1000259002",
        "ERROR_SPACE_PERMISSION_INSUFFICIENT_META".."-1000259003",
        "ERROR_SPACE_RATE_LIMITED_META".."-1000259004",
        "ERROR_SPACE_TOO_DARK_META".."-1000259005",
        "ERROR_SPACE_TOO_BRIGHT_META".."-1000259006"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPACE_PERSISTENCE_PROPERTIES_META".."1000259000",
        "TYPE_SPACES_SAVE_INFO_META".."1000259001",
        "TYPE_EVENT_DATA_SPACES_SAVE_RESULT_META".."1000259002",
        "TYPE_SPACES_ERASE_INFO_META".."1000259003",
        "TYPE_EVENT_DATA_SPACES_ERASE_RESULT_META".."1000259004"
    )

    XrResult(
        "SaveSpacesMETA",

        XrSession("session"),
        XrSpacesSaveInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )

    XrResult(
        "EraseSpacesMETA",

        XrSession("session"),
        XrSpacesEraseInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )
}