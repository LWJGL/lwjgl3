/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_spatial_sensing = "BDSpatialSensing".nativeClassXR("BD_spatial_sensing", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_spatial_sensing_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_SPATIAL_SENSING_EXTENSION_NAME".."XR_BD_spatial_sensing"
    )

    EnumConstant(
        "ERROR_SPATIAL_ENTITY_ID_INVALID_BD".."-1000389000",
        "ERROR_SPATIAL_SENSING_SERVICE_UNAVAILABLE_BD".."-1000389001",
        "ERROR_ANCHOR_NOT_SUPPORTED_FOR_ENTITY_BD".."-1000389002"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD".."1000389000",
        "TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD".."1000389001",
        "TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD".."1000389002",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_LOCATION_BD".."1000389003",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD".."1000389004",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD".."1000389005",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_POLYGON_BD".."1000389006",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD".."1000389007",
        "TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD".."1000389008",
        "TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD".."1000389009",
        "TYPE_SENSE_DATA_PROVIDER_START_INFO_BD".."1000389010",
        "TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD".."1000389011",
        "TYPE_EVENT_DATA_SENSE_DATA_UPDATED_BD".."1000389012",
        "TYPE_SENSE_DATA_QUERY_INFO_BD".."1000389013",
        "TYPE_SENSE_DATA_QUERY_COMPLETION_BD".."1000389014",
        "TYPE_SENSE_DATA_FILTER_UUID_BD".."1000389015",
        "TYPE_SENSE_DATA_FILTER_SEMANTIC_BD".."1000389016",
        "TYPE_QUERIED_SENSE_DATA_GET_INFO_BD".."1000389017",
        "TYPE_QUERIED_SENSE_DATA_BD".."1000389018",
        "TYPE_SPATIAL_ENTITY_STATE_BD".."1000389019",
        "TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD".."1000389020",
        "TYPE_ANCHOR_SPACE_CREATE_INFO_BD".."1000389021"
    )

    EnumConstant(
        "OBJECT_TYPE_SENSE_DATA_PROVIDER_BD".."1000389000",
        "OBJECT_TYPE_SENSE_DATA_SNAPSHOT_BD".."1000389001",
        "OBJECT_TYPE_ANCHOR_BD".."1000389002"
    )

    EnumConstant(
        "SPATIAL_ENTITY_COMPONENT_TYPE_LOCATION_BD".."0",
        "SPATIAL_ENTITY_COMPONENT_TYPE_SEMANTIC_BD".."1",
        "SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_2D_BD".."2",
        "SPATIAL_ENTITY_COMPONENT_TYPE_POLYGON_BD".."3",
        "SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_3D_BD".."4",
        "SPATIAL_ENTITY_COMPONENT_TYPE_TRIANGLE_MESH_BD".."5"
    )

    EnumConstant(
        "SEMANTIC_LABEL_UNKNOWN_BD".."0",
        "SEMANTIC_LABEL_FLOOR_BD".."1",
        "SEMANTIC_LABEL_CEILING_BD".."2",
        "SEMANTIC_LABEL_WALL_BD".."3",
        "SEMANTIC_LABEL_DOOR_BD".."4",
        "SEMANTIC_LABEL_WINDOW_BD".."5",
        "SEMANTIC_LABEL_OPENING_BD".."6",
        "SEMANTIC_LABEL_TABLE_BD".."7",
        "SEMANTIC_LABEL_SOFA_BD".."8",
        "SEMANTIC_LABEL_CHAIR_BD".."9",
        "SEMANTIC_LABEL_HUMAN_BD".."10",
        "SEMANTIC_LABEL_BEAM_BD".."11",
        "SEMANTIC_LABEL_COLUMN_BD".."12",
        "SEMANTIC_LABEL_CURTAIN_BD".."13",
        "SEMANTIC_LABEL_CABINET_BD".."14",
        "SEMANTIC_LABEL_BED_BD".."15",
        "SEMANTIC_LABEL_PLANT_BD".."16",
        "SEMANTIC_LABEL_SCREEN_BD".."17",
        "SEMANTIC_LABEL_VIRTUAL_WALL_BD".."18",
        "SEMANTIC_LABEL_REFRIGERATOR_BD".."19",
        "SEMANTIC_LABEL_WASHING_MACHINE_BD".."20",
        "SEMANTIC_LABEL_AIR_CONDITIONER_BD".."21",
        "SEMANTIC_LABEL_LAMP_BD".."22",
        "SEMANTIC_LABEL_WALL_ART_BD".."23",
        "SEMANTIC_LABEL_STAIRWAY_BD".."24"
    )

    EnumConstant(
        "SENSE_DATA_PROVIDER_STATE_INITIALIZED_BD".."0",
        "SENSE_DATA_PROVIDER_STATE_RUNNING_BD".."1",
        "SENSE_DATA_PROVIDER_STATE_STOPPED_BD".."2"
    )

    XrResult(
        "EnumerateSpatialEntityComponentTypesBD",

        XrSenseDataSnapshotBD("snapshot"),
        XrSpatialEntityIdBD("entityId"),
        AutoSize("componentTypes")..uint32_t("componentTypeCapacityInput"),
        Check(1)..uint32_t.p("componentTypeCountOutput"),
        nullable..XrSpatialEntityComponentTypeBD.p("componentTypes")
    )

    XrResult(
        "GetSpatialEntityUuidBD",

        XrSenseDataSnapshotBD("snapshot"),
        XrSpatialEntityIdBD("entityId"),
        XrUuidEXT.p("uuid")
    )

    XrResult(
        "GetSpatialEntityComponentDataBD",

        XrSenseDataSnapshotBD("snapshot"),
        XrSpatialEntityComponentGetInfoBD.const.p("getInfo"),
        XrSpatialEntityComponentDataBaseHeaderBD.p("componentData")
    )

    XrResult(
        "CreateSenseDataProviderBD",

        XrSession("session"),
        XrSenseDataProviderCreateInfoBD.const.p("createInfo"),
        Check(1)..XrSenseDataProviderBD.p("provider")
    )

    XrResult(
        "StartSenseDataProviderAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSenseDataProviderStartInfoBD.const.p("startInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "StartSenseDataProviderCompleteBD",

        XrSession("session"),
        XrFutureEXT("future"),
        XrFutureCompletionEXT.p("completion")
    )

    XrResult(
        "GetSenseDataProviderStateBD",

        XrSenseDataProviderBD("provider"),
        Check(1)..XrSenseDataProviderStateBD.p("state")
    )

    XrResult(
        "QuerySenseDataAsyncBD",

        XrSenseDataProviderBD("provider"),
        XrSenseDataQueryInfoBD.const.p("queryInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "QuerySenseDataCompleteBD",

        XrSenseDataProviderBD("provider"),
        XrFutureEXT("future"),
        XrSenseDataQueryCompletionBD.p("completion")
    )

    XrResult(
        "DestroySenseDataSnapshotBD",

        XrSenseDataSnapshotBD("snapshot")
    )

    XrResult(
        "GetQueriedSenseDataBD",

        XrSenseDataSnapshotBD("snapshot"),
        XrQueriedSenseDataGetInfoBD.p("getInfo"),
        XrQueriedSenseDataBD.p("queriedSenseData")
    )

    XrResult(
        "StopSenseDataProviderBD",

        XrSenseDataProviderBD("provider")
    )

    XrResult(
        "DestroySenseDataProviderBD",

        XrSenseDataProviderBD("provider")
    )

    XrResult(
        "CreateSpatialEntityAnchorBD",

        XrSenseDataProviderBD("provider"),
        XrSpatialEntityAnchorCreateInfoBD.const.p("createInfo"),
        Check(1)..XrAnchorBD.p("anchor")
    )

    XrResult(
        "DestroyAnchorBD",

        XrAnchorBD("anchor")
    )

    XrResult(
        "GetAnchorUuidBD",

        XrAnchorBD("anchor"),
        XrUuidEXT.p("uuid")
    )

    XrResult(
        "CreateAnchorSpaceBD",

        XrSession("session"),
        XrAnchorSpaceCreateInfoBD.const.p("createInfo"),
        Check(1)..XrSpace.p("space")
    )
}