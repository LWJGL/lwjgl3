/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRHeadsetView = "VRHeadsetView".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRHeadsetView_",
    binding = OPENVR_FNTABLE_BINDING
) {
    void(
        "SetHeadsetViewSize",

        uint32_t("nWidth"),
        uint32_t("nHeight")
    )

    void(
        "GetHeadsetViewSize",

        Check(1)..uint32_t.p("pnWidth"),
        Check(1)..uint32_t.p("pnHeight")
    )

    void(
        "SetHeadsetViewMode",

        HeadsetViewMode_t("eHeadsetViewMode")
    )

    HeadsetViewMode_t(
        "GetHeadsetViewMode",

        void()
    )

    void(
        "SetHeadsetViewCropped",

        bool("bCropped")
    )

    bool(
        "GetHeadsetViewCropped",

        void()
    )

    float(
        "GetHeadsetViewAspectRatio",

        void()
    )

    void(
        "SetHeadsetViewBlendRange",

        float("flStartPct"),
        float("flEndPct")
    )

    void(
        "GetHeadsetViewBlendRange",

        Check(1)..float.p("pStartPct"),
        Check(1)..float.p("pEndPct")
    )
}