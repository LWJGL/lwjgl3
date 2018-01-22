/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRChaperone = "VRChaperone".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRChaperone_",
    library = OPENVR_LIBRARY,
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

    ChaperoneCalibrationState(
        "GetCalibrationState",
        "Get the current state of Chaperone calibration. This state can change at any time during a session due to physical base station changes."
    )

    bool(
        "GetPlayAreaSize",
        "Returns the width and depth of the Play Area (formerly named Soft Bounds) in X and Z. Tracking space center(0, 0, 0) is the center of the Play Area.",

        Check(1)..float_p.OUT("pSizeX", ""),
        Check(1)..float_p.OUT("pSizeZ", "")
    )

    bool(
        "GetPlayAreaRect",
        """
        Returns the 4 corner positions of the Play Area (formerly named Soft Bounds).

        Corners are in counter-clockwise order. Standing center (0,0,0) is the center of the Play Area. It's a rectangle. 2 sides are parallel to the X axis
        and 2 sides are parallel to the Z axis. Height of every corner is 0Y (on the floor).
        """,

        HmdQuad_t.p.OUT("rect", "")
    )

    void(
        "ReloadInfo",
        "Reload Chaperone data from the .vrchap file on disk."
    )

    void(
        "SetSceneColor",
        "Optionally give the chaperone system a hit about the color and brightness in the scene.",

        HmdColor_t.IN("color", "")
    )

    void(
        "GetBoundsColor",
        "Get the current chaperone bounds draw color and brightness.",

        HmdColor_t.p.OUT("pOutputColorArray", ""),
        AutoSize("pOutputColorArray")..int.IN("nNumOutputColors", ""),
        float.IN("flCollisionBoundsFadeDistance", ""),
        HmdColor_t.p.OUT("pOutputCameraColor", "")
    )

    bool(
        "AreBoundsVisible",
        "Determine whether the bounds are showing right now."
    )

    void(
        "ForceBoundsVisible",
        "Force the bounds to show, mostly for utilities.",

        bool.IN("bForce", "")
    )
}