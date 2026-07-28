/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_trackables_image = "ANDROIDTrackablesImage".nativeClassXR("ANDROID_trackables_image", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_trackables_image_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_TRACKABLES_IMAGE_EXTENSION_NAME".."XR_ANDROID_trackables_image"
    )

    EnumConstant(
        "TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID".."1000709000",
        "TYPE_TRACKABLE_IMAGE_DATABASE_ENTRY_ANDROID".."1000709001",
        "TYPE_TRACKABLE_IMAGE_DATABASE_CREATE_INFO_ANDROID".."1000709002",
        "TYPE_CREATE_TRACKABLE_IMAGE_DATABASE_COMPLETION_ANDROID".."1000709003",
        "TYPE_TRACKABLE_IMAGE_CONFIGURATION_ANDROID".."1000709004",
        "TYPE_TRACKABLE_IMAGE_ANDROID".."1000709005",
        "TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID".."1000709006"
    )

    EnumConstant(
        "OBJECT_TYPE_TRACKABLE_IMAGE_DATABASE_ANDROID".."1000709000"
    )

    EnumConstant(
        "ERROR_IMAGE_FORMAT_UNSUPPORTED_ANDROID".."-1000709000"
    )

    EnumConstant(
        "TRACKABLE_TYPE_IMAGE_ANDROID".."1000709000"
    )

    EnumConstant(
        "TRACKABLE_IMAGE_TRACKING_MODE_DYNAMIC_ANDROID".."1",
        "TRACKABLE_IMAGE_TRACKING_MODE_STATIC_ANDROID".."2"
    )

    EnumConstant(
        "TRACKABLE_IMAGE_FORMAT_R8G8B8A8_ANDROID".."1"
    )

    XrResult(
        "CreateTrackableImageDatabaseAsyncANDROID",

        XrSession("session"),
        XrTrackableImageDatabaseCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateTrackableImageDatabaseCompleteANDROID",

        XrSession("session"),
        XrFutureEXT("future"),
        XrCreateTrackableImageDatabaseCompletionANDROID.p("completion")
    )

    XrResult(
        "DestroyTrackableImageDatabaseANDROID",

        XrTrackableImageDatabaseANDROID("database")
    )

    XrResult(
        "AddTrackableImageDatabaseANDROID",

        XrTrackableTrackerANDROID("tracker"),
        XrTrackableImageDatabaseANDROID("database")
    )

    XrResult(
        "RemoveTrackableImageDatabaseANDROID",

        XrTrackableTrackerANDROID("tracker"),
        XrTrackableImageDatabaseANDROID("database")
    )

    XrResult(
        "GetTrackableImageANDROID",

        XrTrackableTrackerANDROID("tracker"),
        XrTrackableGetInfoANDROID.const.p("getInfo"),
        XrTrackableImageANDROID.p("trackable")
    )
}