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
    documentation =
        """
        """

    void(
        "SetHeadsetViewSize",
        """
        Sets the resolution in pixels to render the headset view.

        These values are clamped to #k_unHeadsetViewMaxWidth and #k_unHeadsetViewMaxHeight respectively. For cropped views, the rendered output will be fit to
        aspect ratio defined by the the specified dimensions. For uncropped views, the caller should use #GetHeadsetViewAspectRatio() to adjust the requested
        render size to avoid squashing or stretching, and then apply letterboxing to compensate when displaying the results.
        """,

        uint32_t("nWidth", ""),
        uint32_t("nHeight", "")
    )

    void(
        "GetHeadsetViewSize",
        "Gets the current resolution used to render the headset view.",

        Check(1)..uint32_t.p("pnWidth", ""),
        Check(1)..uint32_t.p("pnHeight", "")
    )

    void(
        "SetHeadsetViewMode",
        "Sets the mode used to render the headset view.",

        HeadsetViewMode_t("eHeadsetViewMode", "", "HeadsetViewMode_t_\\w+")
    )

    HeadsetViewMode_t(
        "GetHeadsetViewMode",
        "Gets the current mode used to render the headset view.",

        void()
    )

    void(
        "SetHeadsetViewCropped",
        "Sets whether or not the headset view should be rendered cropped to hide the hidden area mesh or not.",

        bool("bCropped", "")
    )

    bool(
        "GetHeadsetViewCropped",
        "Gets the current cropping status of the headset view.",

        void()
    )

    float(
        "GetHeadsetViewAspectRatio",
        "Gets the aspect ratio (width:height) of the uncropped headset view (accounting for the current set mode).",

        void()
    )

    void(
        "SetHeadsetViewBlendRange",
        "Sets the range {@code [0..1]} that the headset view blends across the stereo overlapped area in cropped both mode.",

        float("flStartPct", ""),
        float("flEndPct", "")
    )

    void(
        "GetHeadsetViewBlendRange",
        "Gets the current range {@code [0..1]} that the headset view blends across the stereo overlapped area in cropped both mode.",

        Check(1)..float.p("pStartPct", ""),
        Check(1)..float.p("pEndPct", "")
    )
}