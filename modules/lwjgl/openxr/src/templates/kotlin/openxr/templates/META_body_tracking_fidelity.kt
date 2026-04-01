/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_body_tracking_fidelity = "METABodyTrackingFidelity".nativeClassXR("META_body_tracking_fidelity", type = "instance", postfix = "META") {
    IntConstant(
        "META_body_tracking_fidelity_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_BODY_TRACKING_FIDELITY_EXTENSION_NAME".."XR_META_body_tracking_fidelity"
    )

    EnumConstant(
        "TYPE_BODY_TRACKING_FIDELITY_STATUS_META".."1000284000",
        "TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FIDELITY_META".."1000284001"
    )

    EnumConstant(
        "BODY_TRACKING_FIDELITY_LOW_META".."1",
        "BODY_TRACKING_FIDELITY_HIGH_META".."2"
    )

    XrResult(
        "RequestBodyTrackingFidelityMETA",

        XrBodyTrackerFB("bodyTracker"),
        XrBodyTrackingFidelityMETA("fidelity")
    )
}