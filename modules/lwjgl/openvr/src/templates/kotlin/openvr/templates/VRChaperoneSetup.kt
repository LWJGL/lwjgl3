/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRChaperoneSetup = "VRChaperoneSetup".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRChaperoneSetup_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        Manages the working copy of the chaperone info. By default this will be the same as the live copy. Any changes made with this interface will stay in
        the working copy until #CommitWorkingCopy() is called, at which point the working copy and the live copy will be the same again.
        """

    bool(
        "CommitWorkingCopy",
        "Saves the current working copy to disk.",

        EChaperoneConfigFile("configFile", "", "EChaperoneConfigFile_\\w+")
    )

    void(
        "RevertWorkingCopy",
        """
        Reverts the working copy to match the live chaperone calibration.

        To modify existing data this MUST be do WHILE getting a non-error {@code ChaperoneCalibrationStatus}. Only after this should you do gets and sets on
        the existing data.
        """
    )

    bool(
        "GetWorkingPlayAreaSize",
        """
        Returns the width and depth of the Play Area (formerly named Soft Bounds) in X and Z from the working copy. Tracking space center (0,0,0) is the center
        of the Play Area.
        """,

        Check(1)..float.p("pSizeX", ""),
        Check(1)..float.p("pSizeZ", "")
    )

    bool(
        "GetWorkingPlayAreaRect",
        """
        Returns the 4 corner positions of the Play Area (formerly named Soft Bounds) from the working copy.

        Corners are in clockwise order. Tracking space center (0,0,0) is the center of the Play Area. It's a rectangle. 2 sides are parallel to the X axis and
        2 sides are parallel to the Z axis. Height of every corner is 0Y (on the floor).
        """,

        HmdQuad_t.p("rect", "")
    )

    bool(
        "GetWorkingCollisionBoundsInfo",
        "Returns the number of Quads if the buffer points to null. Otherwise it returns Quads into the buffer up to the max specified from the working copy.",

        nullable..HmdQuad_t.p("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..Check(1)..uint32_t.p("punQuadsCount", "")
    )

    bool(
        "GetLiveCollisionBoundsInfo",
        "Returns the number of Quads if the buffer points to null. Otherwise it returns Quads into the buffer up to the max specified.",

        nullable..HmdQuad_t.p("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..Check(1)..uint32_t.p("punQuadsCount", "")
    )

    bool(
        "GetWorkingSeatedZeroPoseToRawTrackingPose",
        "Returns the preferred seated position from the working copy.",

        HmdMatrix34_t.p("pmatSeatedZeroPoseToRawTrackingPose", "")
    )

    bool(
        "GetWorkingStandingZeroPoseToRawTrackingPose",
        "Returns the standing origin from the working copy.",

        HmdMatrix34_t.p("pmatStandingZeroPoseToRawTrackingPose", "")
    )

    void(
        "SetWorkingPlayAreaSize",
        "Sets the Play Area in the working copy.",

        float("sizeX", ""),
        float("sizeZ", "")
    )

    void(
        "SetWorkingCollisionBoundsInfo",
        """
        Sets the Collision Bounds in the working copy.
        
        Note: ceiling height is ignored.
        """,

        HmdQuad_t.p("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..uint32_t("unQuadsCount", "")
    )

    void(
        "SetWorkingPerimeter",
        "Sets the Collision Bounds in the working copy",

        HmdVector2_t.p("pPointBuffer", ""),
        AutoSize("pPointBuffer")..uint32_t("unPointCount", "")
    )

    void(
        "SetWorkingSeatedZeroPoseToRawTrackingPose",
        "Sets the preferred seated position in the working copy.",

        HmdMatrix34_t.const.p("pMatSeatedZeroPoseToRawTrackingPose", "")
    )

    void(
        "SetWorkingStandingZeroPoseToRawTrackingPose",
        "Sets the preferred standing position in the working copy.",

        HmdMatrix34_t.const.p("pMatStandingZeroPoseToRawTrackingPose", "")
    )

    void(
        "ReloadFromDisk",
        "Tear everything down and reload it from the file on disk.",

        EChaperoneConfigFile("configFile", "", "EChaperoneConfigFile_\\w+")
    )

    bool(
        "GetLiveSeatedZeroPoseToRawTrackingPose",
        "Returns the preferred seated position.",

        HmdMatrix34_t.p("pmatSeatedZeroPoseToRawTrackingPose", "")
    )

    bool(
        "ExportLiveToBuffer",
        "",

        nullable..char.p("pBuffer", ""),
        AutoSize("pBuffer")..Check(1)..uint32_t.p("pnBufferLength", "")
    )

    bool(
        "ImportFromBufferToWorking",
        "",

        Unsafe..char.const.p("pBuffer", ""),
        uint32_t("nImportFlags", "")
    )

    void("ShowWorkingSetPreview", "Shows the chaperone data in the working set to preview in the compositor.", void())
    void("HideWorkingSetPreview", "Hides the chaperone data in the working set to preview in the compositor (if it was visible).", void())
    void(
        "RoomSetupStarting",
        """
        Fires an event that the tracking system can use to know room setup is about to begin.
        
        This lets the tracking system make any last minute adjustments that should be incorporated into the new setup. If the user is adjusting live in HMD
        using a tweak tool, keep in mind that calling this might cause the user to see the room jump.
        """,

        void()
    )
}