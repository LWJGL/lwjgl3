/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_raycast = "ANDROIDRaycast".nativeClassXR("ANDROID_raycast", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_raycast_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_RAYCAST_EXTENSION_NAME".."XR_ANDROID_raycast"
    )

    EnumConstant(
        "TYPE_RAYCAST_INFO_ANDROID".."1000463000",
        "TYPE_RAYCAST_HIT_RESULTS_ANDROID".."1000463001"
    )

    EnumConstant(
        "TRACKABLE_TYPE_DEPTH_ANDROID".."1000463000"
    )

    XrResult(
        "EnumerateRaycastSupportedTrackableTypesANDROID",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("trackableTypes")..uint32_t("trackableTypeCapacityInput"),
        Check(1)..uint32_t.p("trackableTypeCountOutput"),
        nullable..XrTrackableTypeANDROID.p("trackableTypes")
    )

    XrResult(
        "RaycastANDROID",

        XrSession("session"),
        XrRaycastInfoANDROID.const.p("rayInfo"),
        XrRaycastHitResultsANDROID.p("results")
    )
}