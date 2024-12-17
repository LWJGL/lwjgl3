/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MNDX_force_feedback_curl = "MNDXForceFeedbackCurl".nativeClassXR("MNDX_force_feedback_curl", type = "instance", postfix = "MNDX") {
    IntConstant(
        "MNDX_force_feedback_curl_SPEC_VERSION".."1"
    )

    StringConstant(
        "MNDX_FORCE_FEEDBACK_CURL_EXTENSION_NAME".."XR_MNDX_force_feedback_curl"
    )

    EnumConstant(
        "TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX".."1000375000",
        "TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX".."1000375001"
    )

    EnumConstant(
        "FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX".."0",
        "FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX".."1",
        "FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX".."2",
        "FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX".."3",
        "FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX".."4"
    )

    XrResult(
        "ApplyForceFeedbackCurlMNDX",

        XrHandTrackerEXT("handTracker"),
        XrForceFeedbackCurlApplyLocationsMNDX.const.p("locations")
    )
}