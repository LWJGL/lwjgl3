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
    bool(
        "CommitWorkingCopy",

        EChaperoneConfigFile("configFile")
    )

    void("RevertWorkingCopy")

    bool(
        "GetWorkingPlayAreaSize",

        Check(1)..float.p("pSizeX"),
        Check(1)..float.p("pSizeZ")
    )

    bool(
        "GetWorkingPlayAreaRect",

        HmdQuad_t.p("rect")
    )

    bool(
        "GetWorkingCollisionBoundsInfo",

        nullable..HmdQuad_t.p("pQuadsBuffer"),
        AutoSize("pQuadsBuffer")..Check(1)..uint32_t.p("punQuadsCount")
    )

    bool(
        "GetLiveCollisionBoundsInfo",

        nullable..HmdQuad_t.p("pQuadsBuffer"),
        AutoSize("pQuadsBuffer")..Check(1)..uint32_t.p("punQuadsCount")
    )

    bool(
        "GetWorkingSeatedZeroPoseToRawTrackingPose",

        HmdMatrix34_t.p("pmatSeatedZeroPoseToRawTrackingPose")
    )

    bool(
        "GetWorkingStandingZeroPoseToRawTrackingPose",

        HmdMatrix34_t.p("pmatStandingZeroPoseToRawTrackingPose")
    )

    void(
        "SetWorkingPlayAreaSize",

        float("sizeX"),
        float("sizeZ")
    )

    void(
        "SetWorkingCollisionBoundsInfo",

        HmdQuad_t.p("pQuadsBuffer"),
        AutoSize("pQuadsBuffer")..uint32_t("unQuadsCount")
    )

    void(
        "SetWorkingPerimeter",

        HmdVector2_t.p("pPointBuffer"),
        AutoSize("pPointBuffer")..uint32_t("unPointCount")
    )

    void(
        "SetWorkingSeatedZeroPoseToRawTrackingPose",

        HmdMatrix34_t.const.p("pMatSeatedZeroPoseToRawTrackingPose")
    )

    void(
        "SetWorkingStandingZeroPoseToRawTrackingPose",

        HmdMatrix34_t.const.p("pMatStandingZeroPoseToRawTrackingPose")
    )

    void(
        "ReloadFromDisk",

        EChaperoneConfigFile("configFile")
    )

    bool(
        "GetLiveSeatedZeroPoseToRawTrackingPose",

        HmdMatrix34_t.p("pmatSeatedZeroPoseToRawTrackingPose")
    )

    bool(
        "ExportLiveToBuffer",

        nullable..char.p("pBuffer"),
        AutoSize("pBuffer")..Check(1)..uint32_t.p("pnBufferLength")
    )

    bool(
        "ImportFromBufferToWorking",

        Unsafe..char.const.p("pBuffer"),
        uint32_t("nImportFlags")
    )

    void("ShowWorkingSetPreview", void())
    void("HideWorkingSetPreview", void())
    void(
        "RoomSetupStarting",

        void()
    )
}