/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_environment_raycast = "METAEnvironmentRaycast".nativeClassXR("META_environment_raycast", type = "instance", postfix = "META") {
    IntConstant(
        "META_environment_raycast_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_ENVIRONMENT_RAYCAST_EXTENSION_NAME".."XR_META_environment_raycast"
    )

    EnumConstant(
        "OBJECT_TYPE_ENVIRONMENT_RAYCASTER_META".."1000592000"
    )

    EnumConstant(
        "TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META".."1000592000",
        "TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META".."1000592001",
        "TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META".."1000592002",
        "TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META".."1000592003",
        "TYPE_ENVIRONMENT_RAYCAST_HIT_META".."1000592004",
        "TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META".."1000592005"
    )

    EnumConstant(
        "ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_META".."1",
        "ENVIRONMENT_RAYCAST_HIT_STATUS_NO_HIT_META".."2",
        "ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_POINT_OCCLUDED_META".."3",
        "ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_POINT_OUTSIDE_OF_FOV_META".."4",
        "ENVIRONMENT_RAYCAST_HIT_STATUS_RAY_OCCLUDED_META".."5",
        "ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_INVALID_ORIENTATION_META".."6"
    )

    XrResult(
        "CreateEnvironmentRaycasterAsyncMETA",

        XrSession("session"),
        nullable..XrEnvironmentRaycasterCreateInfoMETA.const.p("info"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateEnvironmentRaycasterCompleteMETA",

        XrSession("session"),
        XrFutureEXT("future"),
        XrEnvironmentRaycasterCreateCompletionMETA.p("completion")
    )

    XrResult(
        "DestroyEnvironmentRaycasterMETA",

        XrEnvironmentRaycasterMETA("environmentRaycaster")
    )

    XrResult(
        "PerformEnvironmentRaycastMETA",

        XrEnvironmentRaycasterMETA("environmentRaycaster"),
        XrEnvironmentRaycastHitGetInfoMETA.const.p("info"),
        XrEnvironmentRaycastHitMETA.p("hitPoint")
    )
}