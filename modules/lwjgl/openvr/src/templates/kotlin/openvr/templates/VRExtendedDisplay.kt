/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRExtendedDisplay = "VRExtendedDisplay".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRExtendedDisplay_",
    binding = OPENVR_FNTABLE_BINDING
) {
    void(
        "GetWindowBounds",

        Check(1)..int32_t.p("pnX"),
        Check(1)..int32_t.p("pnY"),
        Check(1)..uint32_t.p("pnWidth"),
        Check(1)..uint32_t.p("pnHeight")
    )

    void(
        "GetEyeOutputViewport",

        EVREye("eEye"),
        Check(1)..uint32_t.p("pnX"),
        Check(1)..uint32_t.p("pnY"),
        Check(1)..uint32_t.p("pnWidth"),
        Check(1)..uint32_t.p("pnHeight")
    )

    void(
        "GetDXGIOutputInfo",

        Check(1)..int32_t.p("pnAdapterIndex"),
        Check(1)..int32_t.p("pnAdapterOutputIndex")
    )
}