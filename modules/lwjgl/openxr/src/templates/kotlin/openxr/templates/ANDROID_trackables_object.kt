/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_trackables_object = "ANDROIDTrackablesObject".nativeClassXR("ANDROID_trackables_object", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_trackables_object_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_TRACKABLES_OBJECT_EXTENSION_NAME".."XR_ANDROID_trackables_object"
    )

    EnumConstant(
        "TYPE_TRACKABLE_OBJECT_ANDROID".."1000466000",
        "TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID".."1000466001"
    )

    EnumConstant(
        "TRACKABLE_TYPE_OBJECT_ANDROID".."1000466000"
    )

    EnumConstant(
        "OBJECT_LABEL_UNKNOWN_ANDROID".."0",
        "OBJECT_LABEL_KEYBOARD_ANDROID".."1",
        "OBJECT_LABEL_MOUSE_ANDROID".."2",
        "OBJECT_LABEL_LAPTOP_ANDROID".."3"
    )

    XrResult(
        "GetTrackableObjectANDROID",

        XrTrackableTrackerANDROID("tracker"),
        XrTrackableGetInfoANDROID.const.p("getInfo"),
        XrTrackableObjectANDROID.p("objectOutput")
    )
}