/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_geospatial_anchor = "ANDROIDGeospatialAnchor".nativeClassXR("ANDROID_geospatial_anchor", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_geospatial_anchor_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_GEOSPATIAL_ANCHOR_EXTENSION_NAME".."XR_ANDROID_geospatial_anchor"
    )

    EnumConstant(
        "TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID".."1000797000",
        "TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID".."1000797001",
        "TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID".."1000797002",
        "TYPE_SYSTEM_GEOSPATIAL_ANCHOR_PROPERTIES_ANDROID".."1000797003",
        "TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID".."1000797004"
    )

    EnumConstant(
        "ERROR_SURFACE_ANCHOR_LOCATION_UNSUPPORTED_ANDROID".."-1000797000"
    )

    EnumConstant(
        "SURFACE_ANCHOR_TYPE_TERRAIN_ANDROID".."1",
        "SURFACE_ANCHOR_TYPE_ROOFTOP_ANDROID".."2"
    )

    XrResult(
        "CreateGeospatialAnchorANDROID",

        XrSpatialContextEXT("spatialContext"),
        XrGeospatialAnchorCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrSpatialEntityIdEXT.p("anchorEntityId")
    )

    XrResult(
        "CreateSurfaceAnchorAsyncANDROID",

        XrSpatialContextEXT("spatialContext"),
        XrSurfaceAnchorCreateInfoANDROID.const.p("createInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateSurfaceAnchorCompleteANDROID",

        XrSpatialContextEXT("spatialContext"),
        XrFutureEXT("future"),
        XrSurfaceAnchorCreateCompletionANDROID.p("completion")
    )
}