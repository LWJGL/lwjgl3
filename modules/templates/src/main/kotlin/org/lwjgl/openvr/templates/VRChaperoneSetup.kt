/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRChaperoneSetup = "VRChaperoneSetup".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRChaperoneSetup_",
    library = OPENVR_LIBRARY,
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

        EChaperoneConfigFile.IN("configFile", "")
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

        Check(1)..float_p.OUT("pSizeX", ""),
        Check(1)..float_p.OUT("pSizeZ", "")
    )

    bool(
        "GetWorkingPlayAreaRect",
        """
        Returns the 4 corner positions of the Play Area (formerly named Soft Bounds) from the working copy.

        Corners are in clockwise order. Tracking space center (0,0,0) is the center of the Play Area. It's a rectangle. 2 sides are parallel to the X axis and
        2 sides are parallel to the Z axis. Height of every corner is 0Y (on the floor).
        """,

        HmdQuad_t.p.OUT("rect", "")
    )

    bool(
        "GetWorkingCollisionBoundsInfo",
        "Returns the number of Quads if the buffer points to null. Otherwise it returns Quads into the buffer up to the max specified from the working copy.",

        nullable..HmdQuad_t.p.OUT("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..Check(1)..uint32_t_p.INOUT("punQuadsCount", "")
    )

    bool(
        "GetLiveCollisionBoundsInfo",
        "Returns the number of Quads if the buffer points to null. Otherwise it returns Quads into the buffer up to the max specified.",

        nullable..HmdQuad_t.p.OUT("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..Check(1)..uint32_t_p.INOUT("punQuadsCount", "")
    )

    bool(
        "GetWorkingSeatedZeroPoseToRawTrackingPose",
        "Returns the preferred seated position from the working copy.",

        HmdMatrix34_t.p.OUT("pmatSeatedZeroPoseToRawTrackingPose", "")
    )

    bool(
        "GetWorkingStandingZeroPoseToRawTrackingPose",
        "Returns the standing origin from the working copy.",

        HmdMatrix34_t.p.OUT("pmatStandingZeroPoseToRawTrackingPose", "")
    )

    void(
        "SetWorkingPlayAreaSize",
        "Sets the Play Area in the working copy.",

        float.IN("sizeX", ""),
        float.IN("sizeZ", "")
    )

    void(
        "SetWorkingCollisionBoundsInfo",
        "Sets the Collision Bounds in the working copy.",

        HmdQuad_t.p.IN("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..uint32_t.IN("unQuadsCount", "")
    )

    void(
        "SetWorkingSeatedZeroPoseToRawTrackingPose",
        "Sets the preferred seated position in the working copy.",

        const..HmdMatrix34_t.p.IN("pMatSeatedZeroPoseToRawTrackingPose", "")
    )

    void(
        "SetWorkingStandingZeroPoseToRawTrackingPose",
        "Sets the preferred standing position in the working copy.",

        const..HmdMatrix34_t.p.IN("pMatStandingZeroPoseToRawTrackingPose", "")
    )

    void(
        "ReloadFromDisk",
        "Tear everything down and reload it from the file on disk.",

        EChaperoneConfigFile.IN("configFile", "", "EChaperoneConfigFile_\\w+")
    )

    bool(
        "GetLiveSeatedZeroPoseToRawTrackingPose",
        "Returns the preferred seated position.",

        HmdMatrix34_t.p.OUT("pmatSeatedZeroPoseToRawTrackingPose", "")
    )

    void(
        "SetWorkingCollisionBoundsTagsInfo",
        "",

        uint8_t.p.IN("pTagsBuffer", ""),
        AutoSize("pTagsBuffer")..uint32_t.IN("unTagCount", "")
    )

    bool(
        "GetLiveCollisionBoundsTagsInfo",
        "",

        nullable..uint8_t.p.OUT("pTagsBuffer", ""),
        AutoSize("pTagsBuffer")..Check(1)..uint32_t_p.INOUT("punTagCount", "")
    )

    bool(
        "SetWorkingPhysicalBoundsInfo",
        "",

        HmdQuad_t.p.IN("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..uint32_t.IN("unQuadsCount", "")
    )

    bool(
        "GetLivePhysicalBoundsInfo",
        "",

        nullable..HmdQuad_t.p.OUT("pQuadsBuffer", ""),
        AutoSize("pQuadsBuffer")..Check(1)..uint32_t_p.INOUT("punQuadsCount", "")
    )

    bool(
        "ExportLiveToBuffer",
        "",

        nullable..char_p.OUT("pBuffer", ""),
        AutoSize("pBuffer")..Check(1)..uint32_t_p.INOUT("pnBufferLength", "")
    )

    bool(
        "ImportFromBufferToWorking",
        "",

        Unsafe..const..char_p.IN("pBuffer", ""),
        uint32_t.IN("nImportFlags", "")
    )
}