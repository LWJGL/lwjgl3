/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_localization_map = "MLLocalizationMap".nativeClassXR("ML_localization_map", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_localization_map_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_LOCALIZATION_MAP_EXTENSION_NAME".."XR_ML_localization_map"
    )

    EnumConstant(
        "OBJECT_TYPE_EXPORTED_LOCALIZATION_MAP_ML".."1000139000"
    )

    EnumConstant(
        "TYPE_LOCALIZATION_MAP_ML".."1000139000",
        "TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML".."1000139001",
        "TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML".."1000139002",
        "TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML".."1000139003",
        "TYPE_LOCALIZATION_ENABLE_EVENTS_INFO_ML".."1000139004"
    )

    EnumConstant(
        "ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML".."-1000139000",
        "ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML".."-1000139001",
        "ERROR_LOCALIZATION_MAP_FAIL_ML".."-1000139002",
        "ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML".."-1000139003",
        "ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML".."-1000139004",
        "ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML".."-1000139005",
        "ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML".."-1000139006"
    )

    EnumConstant(
        "REFERENCE_SPACE_TYPE_LOCALIZATION_MAP_ML".."1000139000"
    )

    EnumConstant(
        "MAX_LOCALIZATION_MAP_NAME_LENGTH_ML".."64"
    )

    EnumConstant(
        "LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML".."0",
        "LOCALIZATION_MAP_STATE_LOCALIZED_ML".."1",
        "LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML".."2",
        "LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML".."3"
    )

    EnumConstant(
        "LOCALIZATION_MAP_TYPE_ON_DEVICE_ML".."0",
        "LOCALIZATION_MAP_TYPE_CLOUD_ML".."1"
    )

    EnumConstant(
        "LOCALIZATION_MAP_CONFIDENCE_POOR_ML".."0",
        "LOCALIZATION_MAP_CONFIDENCE_FAIR_ML".."1",
        "LOCALIZATION_MAP_CONFIDENCE_GOOD_ML".."2",
        "LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML".."3"
    )

    EnumConstant(
        "LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML".enum(0x00000001),
        "LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML".enum(0x00000002),
        "LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML".enum(0x00000004),
        "LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML".enum(0x00000008),
        "LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML".enum(0x00000010),
        "LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML".enum(0x00000020)
    )

    XrResult(
        "EnableLocalizationEventsML",

        XrSession("session"),
        XrLocalizationEnableEventsInfoML.const.p("info")
    )

    XrResult(
        "QueryLocalizationMapsML",

        XrSession("session"),
        nullable..XrLocalizationMapQueryInfoBaseHeaderML.const.p("queryInfo"),
        AutoSize("maps")..uint32_t("mapCapacityInput"),
        Check(1)..uint32_t.p("mapCountOutput"),
        nullable..XrLocalizationMapML.p("maps")
    )

    XrResult(
        "RequestMapLocalizationML",

        XrSession("session"),
        XrMapLocalizationRequestInfoML.const.p("requestInfo")
    )

    XrResult(
        "ImportLocalizationMapML",

        XrSession("session"),
        XrLocalizationMapImportInfoML.const.p("importInfo"),
        nullable..XrUuidEXT.p("mapUuid")
    )

    XrResult(
        "CreateExportedLocalizationMapML",

        XrSession("session"),
        XrUuidEXT.const.p("mapUuid"),
        Check(1)..XrExportedLocalizationMapML.p("map")
    )

    XrResult(
        "DestroyExportedLocalizationMapML",

        XrExportedLocalizationMapML("map")
    )

    XrResult(
        "GetExportedLocalizationMapDataML",

        XrExportedLocalizationMapML("map"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..char.p("buffer")
    )
}