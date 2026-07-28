/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_spatial_entity = "EXTSpatialEntity".nativeClassXR("EXT_spatial_entity", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_spatial_entity_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SPATIAL_ENTITY_EXTENSION_NAME".."XR_EXT_spatial_entity"
    )

    EnumConstant(
        "OBJECT_TYPE_SPATIAL_ENTITY_EXT".."1000740000",
        "OBJECT_TYPE_SPATIAL_CONTEXT_EXT".."1000740001",
        "OBJECT_TYPE_SPATIAL_SNAPSHOT_EXT".."1000740002"
    )

    EnumConstant(
        "ERROR_SPATIAL_CAPABILITY_UNSUPPORTED_EXT".."-1000740001",
        "ERROR_SPATIAL_ENTITY_ID_INVALID_EXT".."-1000740002",
        "ERROR_SPATIAL_BUFFER_ID_INVALID_EXT".."-1000740003",
        "ERROR_SPATIAL_COMPONENT_UNSUPPORTED_FOR_CAPABILITY_EXT".."-1000740004",
        "ERROR_SPATIAL_CAPABILITY_CONFIGURATION_INVALID_EXT".."-1000740005",
        "ERROR_SPATIAL_COMPONENT_NOT_ENABLED_EXT".."-1000740006"
    )

    EnumConstant(
        "TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT".."1000740000",
        "TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT".."1000740001",
        "TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT".."1000740002",
        "TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT".."1000740003",
        "TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT".."1000740004",
        "TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT".."1000740005",
        "TYPE_SPATIAL_COMPONENT_DATA_QUERY_CONDITION_EXT".."1000740006",
        "TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT".."1000740007",
        "TYPE_SPATIAL_BUFFER_GET_INFO_EXT".."1000740008",
        "TYPE_SPATIAL_COMPONENT_BOUNDED_2D_LIST_EXT".."1000740009",
        "TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT".."1000740010",
        "TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT".."1000740011",
        "TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT".."1000740012",
        "TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT".."1000740013",
        "TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT".."1000740014",
        "TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT".."1000740015",
        "TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT".."1000740016"
    )

    EnumConstant(
        "SPATIAL_COMPONENT_TYPE_BOUNDED_2D_EXT".."1",
        "SPATIAL_COMPONENT_TYPE_BOUNDED_3D_EXT".."2",
        "SPATIAL_COMPONENT_TYPE_PARENT_EXT".."3",
        "SPATIAL_COMPONENT_TYPE_MESH_3D_EXT".."4"
    )

    EnumConstant(
        "SPATIAL_ENTITY_TRACKING_STATE_STOPPED_EXT".."1",
        "SPATIAL_ENTITY_TRACKING_STATE_PAUSED_EXT".."2",
        "SPATIAL_ENTITY_TRACKING_STATE_TRACKING_EXT".."3"
    )

    EnumConstant(
        "SPATIAL_BUFFER_TYPE_UNKNOWN_EXT".."0",
        "SPATIAL_BUFFER_TYPE_STRING_EXT".."1",
        "SPATIAL_BUFFER_TYPE_UINT8_EXT".."2",
        "SPATIAL_BUFFER_TYPE_UINT16_EXT".."3",
        "SPATIAL_BUFFER_TYPE_UINT32_EXT".."4",
        "SPATIAL_BUFFER_TYPE_FLOAT_EXT".."5",
        "SPATIAL_BUFFER_TYPE_VECTOR2F_EXT".."6",
        "SPATIAL_BUFFER_TYPE_VECTOR3F_EXT".."7"
    )

    XrResult(
        "EnumerateSpatialCapabilitiesEXT",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("capabilities")..uint32_t("capabilityCapacityInput"),
        Check(1)..uint32_t.p("capabilityCountOutput"),
        nullable..XrSpatialCapabilityEXT.p("capabilities")
    )

    XrResult(
        "EnumerateSpatialCapabilityComponentTypesEXT",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrSpatialCapabilityEXT("capability"),
        XrSpatialCapabilityComponentTypesEXT.p("capabilityComponents")
    )

    XrResult(
        "EnumerateSpatialCapabilityFeaturesEXT",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrSpatialCapabilityEXT("capability"),
        AutoSize("capabilityFeatures")..uint32_t("capabilityFeatureCapacityInput"),
        Check(1)..uint32_t.p("capabilityFeatureCountOutput"),
        nullable..XrSpatialCapabilityFeatureEXT.p("capabilityFeatures")
    )

    XrResult(
        "CreateSpatialContextAsyncEXT",

        XrSession("session"),
        XrSpatialContextCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateSpatialContextCompleteEXT",

        XrSession("session"),
        XrFutureEXT("future"),
        XrCreateSpatialContextCompletionEXT.p("completion")
    )

    XrResult(
        "DestroySpatialContextEXT",

        XrSpatialContextEXT("spatialContext")
    )

    XrResult(
        "CreateSpatialDiscoverySnapshotAsyncEXT",

        XrSpatialContextEXT("spatialContext"),
        XrSpatialDiscoverySnapshotCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateSpatialDiscoverySnapshotCompleteEXT",

        XrSpatialContextEXT("spatialContext"),
        XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.const.p("createSnapshotCompletionInfo"),
        XrCreateSpatialDiscoverySnapshotCompletionEXT.p("completion")
    )

    XrResult(
        "QuerySpatialComponentDataEXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialComponentDataQueryConditionEXT.const.p("queryCondition"),
        XrSpatialComponentDataQueryResultEXT.p("queryResult")
    )

    XrResult(
        "DestroySpatialSnapshotEXT",

        XrSpatialSnapshotEXT("snapshot")
    )

    XrResult(
        "CreateSpatialEntityFromIdEXT",

        XrSpatialContextEXT("spatialContext"),
        XrSpatialEntityFromIdCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrSpatialEntityEXT.p("spatialEntity")
    )

    XrResult(
        "DestroySpatialEntityEXT",

        XrSpatialEntityEXT("spatialEntity")
    )

    XrResult(
        "CreateSpatialUpdateSnapshotEXT",

        XrSpatialContextEXT("spatialContext"),
        XrSpatialUpdateSnapshotCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrSpatialSnapshotEXT.p("snapshot")
    )

    XrResult(
        "GetSpatialBufferStringEXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialBufferGetInfoEXT.const.p("info"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..char.p("buffer")
    )

    XrResult(
        "GetSpatialBufferUint8EXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialBufferGetInfoEXT.const.p("info"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..uint8_t.p("buffer")
    )

    XrResult(
        "GetSpatialBufferUint16EXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialBufferGetInfoEXT.const.p("info"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..uint16_t.p("buffer")
    )

    XrResult(
        "GetSpatialBufferUint32EXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialBufferGetInfoEXT.const.p("info"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..uint32_t.p("buffer")
    )

    XrResult(
        "GetSpatialBufferFloatEXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialBufferGetInfoEXT.const.p("info"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..float.p("buffer")
    )

    XrResult(
        "GetSpatialBufferVector2fEXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialBufferGetInfoEXT.const.p("info"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..XrVector2f.p("buffer")
    )

    XrResult(
        "GetSpatialBufferVector3fEXT",

        XrSpatialSnapshotEXT("snapshot"),
        XrSpatialBufferGetInfoEXT.const.p("info"),
        AutoSize("buffer")..uint32_t("bufferCapacityInput"),
        Check(1)..uint32_t.p("bufferCountOutput"),
        nullable..XrVector3f.p("buffer")
    )
}