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
    documentation =
        """
        HIGH LEVEL TRACKING SPACE ASSUMPTIONS:
        ${ul(
            "0,0,0 is the preferred standing area center.",
            "0Y is the floor height.",
            "-Z is the preferred forward facing direction."
        )}
        """
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
        "Get the current state of Chaperone calibration. This state can change at any time during a session due to physical base station changes.",
        void()
    )

    bool(
        "GetPlayAreaSize",
        "Returns the width and depth of the Play Area (formerly named Soft Bounds) in X and Z. Tracking space center(0, 0, 0) is the center of the Play Area.",

        Check(1)..float.p("pSizeX", ""),
        Check(1)..float.p("pSizeZ", "")
    )

    bool(
        "GetPlayAreaRect",
        """
        Returns the 4 corner positions of the Play Area (formerly named Soft Bounds).

        Corners are in counter-clockwise order. Standing center (0,0,0) is the center of the Play Area. It's a rectangle. 2 sides are parallel to the X axis
        and 2 sides are parallel to the Z axis. Height of every corner is 0Y (on the floor).
        """,

        HmdQuad_t.p("rect", "")
    )

    void(
        "ReloadInfo",
        "Reload Chaperone data from the .vrchap file on disk."
    )

    void(
        "SetSceneColor",
        "Optionally give the chaperone system a hit about the color and brightness in the scene.",

        HmdColor_t("color", "")
    )

    void(
        "GetBoundsColor",
        "Get the current chaperone bounds draw color and brightness.",

        HmdColor_t.p("pOutputColorArray", ""),
        AutoSize("pOutputColorArray")..int("nNumOutputColors", ""),
        float("flCollisionBoundsFadeDistance", ""),
        HmdColor_t.p("pOutputCameraColor", "")
    )

    bool(
        "AreBoundsVisible",
        "Determine whether the bounds are showing right now.",
        void()
    )

    void(
        "ForceBoundsVisible",
        "Force the bounds to show, mostly for utilities.",

        bool("bForce", "")
    )

    void(
        "ResetZeroPose",
        """
        Sets the zero pose for the given tracker coordinate system to the current position and yaw of the HMD.

        After {@code ResetZeroPose} all #GetDeviceToAbsoluteTrackingPose() calls as the origin will be relative to this new zero pose. The new zero coordinate
        system will not change the fact that the Y axis is up in the real world, so the next pose returned from {@code GetDeviceToAbsoluteTrackingPose} after a
        call to {@code ResetZeroPose} may not be exactly an identity matrix.
	
	    NOTE: This function overrides the user's previously saved zero pose and should only be called as the result of a user action. Users are also able to
        set their zero pose via the OpenVR Dashboard.
        """,

        ETrackingUniverseOrigin("eTrackingUniverseOrigin", "", "ETrackingUniverseOrigin_\\w+")
    )
}