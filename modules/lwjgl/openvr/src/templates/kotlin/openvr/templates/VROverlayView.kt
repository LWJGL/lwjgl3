/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VROverlayView = "VROverlayView".nativeClass(
    Module.OPENVR,
    prefixMethod = "VROverlayView_",
    binding = OPENVR_FNTABLE_BINDING
) {
    EVROverlayError(
        "AcquireOverlayView",

        VROverlayHandle_t("ulOverlayHandle"),
        VRNativeDevice_t.p("pNativeDevice"),
        VROverlayView_t.p("pOverlayView"),
        uint32_t("unOverlayViewSize")
    )

    EVROverlayError(
        "ReleaseOverlayView",

        VROverlayView_t.p("pOverlayView")
    )

    void(
        "PostOverlayEvent",

        VROverlayHandle_t("ulOverlayHandle"),
        VREvent_t.p("pvrEvent")
    )

    bool(
        "IsViewingPermitted",

        VROverlayHandle_t("ulOverlayHandle")
    )
}