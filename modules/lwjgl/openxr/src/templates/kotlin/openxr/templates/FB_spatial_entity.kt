/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity = "FBSpatialEntity".nativeClassXR("FB_spatial_entity", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_spatial_entity_SPEC_VERSION".."3"
    )

    StringConstant(
        "FB_SPATIAL_ENTITY_EXTENSION_NAME".."XR_FB_spatial_entity"
    )

    EnumConstant(
        "TYPE_SPACE_COMPONENT_STATUS_FB".."1000113001",
        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_FB".."1000113003",
        "TYPE_SYSTEM_SPATIAL_ENTITY_PROPERTIES_FB".."1000113004",
        "TYPE_EVENT_DATA_SPATIAL_ANCHOR_CREATE_COMPLETE_FB".."1000113005",
        "TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB".."1000113006",
        "TYPE_SPACE_COMPONENT_STATUS_SET_INFO_FB".."1000113007"
    )

    EnumConstant(
        "ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB".."-1000113000",
        "ERROR_SPACE_COMPONENT_NOT_ENABLED_FB".."-1000113001",
        "ERROR_SPACE_COMPONENT_STATUS_PENDING_FB".."-1000113002",
        "ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB".."-1000113003"
    )

    EnumConstant(
        "SPACE_COMPONENT_TYPE_LOCATABLE_FB".."0",
        "SPACE_COMPONENT_TYPE_STORABLE_FB".."1",
        "SPACE_COMPONENT_TYPE_SHARABLE_FB".."2",
        "SPACE_COMPONENT_TYPE_BOUNDED_2D_FB".."3",
        "SPACE_COMPONENT_TYPE_BOUNDED_3D_FB".."4",
        "SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB".."5",
        "SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB".."6",
        "SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB".."7"
    )

    XrResult(
        "CreateSpatialAnchorFB",

        XrSession("session"),
        XrSpatialAnchorCreateInfoFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )

    XrResult(
        "GetSpaceUuidFB",

        XrSpace("space"),
        XrUuidEXT.p("uuid")
    )

    XrResult(
        "EnumerateSpaceSupportedComponentsFB",

        XrSpace("space"),
        AutoSize("componentTypes")..uint32_t("componentTypeCapacityInput"),
        Check(1)..uint32_t.p("componentTypeCountOutput"),
        nullable..XrSpaceComponentTypeFB.p("componentTypes")
    )

    XrResult(
        "SetSpaceComponentStatusFB",

        XrSpace("space"),
        XrSpaceComponentStatusSetInfoFB.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )

    XrResult(
        "GetSpaceComponentStatusFB",

        XrSpace("space"),
        XrSpaceComponentTypeFB("componentType"),
        XrSpaceComponentStatusFB.p("status")
    )
}