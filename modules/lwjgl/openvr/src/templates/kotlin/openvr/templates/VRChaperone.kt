/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRChaperone = "VRChaperone".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRChaperone_",
    binding = OPENVR_FNTABLE_BINDING
) {
    nativeDirective("""
#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdColor_t
{
	float r;
	float g;
	float b;
	float a;
} HmdColor_t;""")

    ChaperoneCalibrationState(
        "GetCalibrationState",
        void()
    )

    bool(
        "GetPlayAreaSize",

        Check(1)..float.p("pSizeX"),
        Check(1)..float.p("pSizeZ")
    )

    bool(
        "GetPlayAreaRect",

        HmdQuad_t.p("rect")
    )

    void("ReloadInfo")

    void(
        "SetSceneColor",

        HmdColor_t("color")
    )

    void(
        "GetBoundsColor",

        HmdColor_t.p("pOutputColorArray"),
        AutoSize("pOutputColorArray")..int("nNumOutputColors"),
        float("flCollisionBoundsFadeDistance"),
        HmdColor_t.p("pOutputCameraColor")
    )

    bool(
        "AreBoundsVisible",
        void()
    )

    void(
        "ForceBoundsVisible",

        bool("bForce")
    )

    void(
        "ResetZeroPose",

        ETrackingUniverseOrigin("eTrackingUniverseOrigin")
    )
}