/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_device_anchor_persistence = "ANDROIDDeviceAnchorPersistence".nativeClassXR("ANDROID_device_anchor_persistence", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_device_anchor_persistence_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_DEVICE_ANCHOR_PERSISTENCE_EXTENSION_NAME".."XR_ANDROID_device_anchor_persistence"
    )

    EnumConstant(
        "TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID".."1000457001",
        "TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID".."1000457002",
        "TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID".."1000457003",
        "TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID".."1000457004"
    )

    EnumConstant(
        "ERROR_ANCHOR_ID_NOT_FOUND_ANDROID".."-1000457000",
        "ERROR_ANCHOR_ALREADY_PERSISTED_ANDROID".."-1000457001",
        "ERROR_ANCHOR_NOT_TRACKING_ANDROID".."-1000457002",
        "ERROR_PERSISTED_DATA_NOT_READY_ANDROID".."-1000457003"
    )

    EnumConstant(
        "OBJECT_TYPE_DEVICE_ANCHOR_PERSISTENCE_ANDROID".."1000457000"
    )

    EnumConstant(
        "ANCHOR_PERSIST_STATE_PERSIST_NOT_REQUESTED_ANDROID".."0",
        "ANCHOR_PERSIST_STATE_PERSIST_PENDING_ANDROID".."1",
        "ANCHOR_PERSIST_STATE_PERSISTED_ANDROID".."2"
    )

    XrResult(
        "EnumerateSupportedPersistenceAnchorTypesANDROID",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("trackableTypes")..uint32_t("trackableTypeCapacityInput"),
        Check(1)..uint32_t.p("trackableTypeCountOutput"),
        nullable..XrTrackableTypeANDROID.p("trackableTypes")
    )

    XrResult(
        "CreateDeviceAnchorPersistenceANDROID",

        XrSession("session"),
        XrDeviceAnchorPersistenceCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrDeviceAnchorPersistenceANDROID.p("outHandle")
    )

    XrResult(
        "DestroyDeviceAnchorPersistenceANDROID",

        XrDeviceAnchorPersistenceANDROID("handle")
    )

    XrResult(
        "PersistAnchorANDROID",

        XrDeviceAnchorPersistenceANDROID("handle"),
        XrPersistedAnchorSpaceInfoANDROID.const.p("persistedInfo"),
        XrUuidEXT.p("anchorIdOutput")
    )

    XrResult(
        "GetAnchorPersistStateANDROID",

        XrDeviceAnchorPersistenceANDROID("handle"),
        XrUuidEXT.const.p("anchorId"),
        Check(1)..XrAnchorPersistStateANDROID.p("persistState")
    )

    XrResult(
        "CreatePersistedAnchorSpaceANDROID",

        XrDeviceAnchorPersistenceANDROID("handle"),
        XrPersistedAnchorSpaceCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrSpace.p("anchorOutput")
    )

    XrResult(
        "EnumeratePersistedAnchorsANDROID",

        XrDeviceAnchorPersistenceANDROID("handle"),
        AutoSize("anchorIds")..uint32_t("anchorIdCapacityInput"),
        Check(1)..uint32_t.p("anchorIdCountOutput"),
        nullable..XrUuidEXT.p("anchorIds")
    )

    XrResult(
        "UnpersistAnchorANDROID",

        XrDeviceAnchorPersistenceANDROID("handle"),
        XrUuidEXT.const.p("anchorId")
    )
}