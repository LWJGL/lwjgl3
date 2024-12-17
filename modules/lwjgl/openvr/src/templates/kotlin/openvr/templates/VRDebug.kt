/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRDebug = "VRDebug".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRDebug_",
    binding = OPENVR_FNTABLE_BINDING
) {
    EVRDebugError(
        "EmitVrProfilerEvent",

        charASCII.p("pchMessage")
    )

    EVRDebugError(
        "BeginVrProfilerEvent",

        Check(1)..VrProfilerEventHandle_t.p("pHandleOut")
    )

    EVRDebugError(
        "FinishVrProfilerEvent",

        VrProfilerEventHandle_t("hHandle"),
        charASCII.p("pchMessage")
    )

    uint32_t(
        "DriverDebugRequest",

        TrackedDeviceIndex_t("unDeviceIndex"),
        charASCII.p("pchRequest"),
        charASCII.p("pchResponseBuffer"),
        AutoSize("pchResponseBuffer")..uint32_t("unResponseBufferSize")
    )
}