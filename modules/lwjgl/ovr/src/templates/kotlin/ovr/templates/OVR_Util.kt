/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*
import ovr.*

val OVR_Util = "OVRUtil".nativeClass(Module.OVR, prefixMethod = "ovr", prefixConstant = "ovr") {
    includeOVRCAPI()

    EnumConstant(
        "Projection_None".enum("0x00"),
        "Projection_LeftHanded".enum("0x01"),
        "Projection_FarLessThanNear".enum("0x02"),
        "Projection_FarClipAtInfinity".enum("0x04"),
        "Projection_ClipRangeOpenGL".enum("0x08")
    )

    EnumConstant(
        "HapticsGenMode_PointSample".enum,
        "HapticsGenMode_Count".enum
    )

    ovrDetectResult(
        "_Detect",

        int("timeoutMilliseconds")
    )

    ovrMatrix4f(
        "Matrix4f_Projection",

        ovrFovPort("fov"),
        float("znear"),
        float("zfar"),
        unsigned_int("projectionModFlags")
    )

    ovrTimewarpProjectionDesc(
        "TimewarpProjectionDesc_FromProjection",

        ovrMatrix4f("projection"),
        unsigned_int("projectionModFlags")
    )

    ovrMatrix4f(
        "Matrix4f_OrthoSubProjection",

        ovrMatrix4f("projection"),
        ovrVector2f("orthoScale"),
        float("orthoDistance"),
        float("HmdToEyeOffsetX")
    )

    void(
        "_CalcEyePoses",

        ovrPosef("headPose"),
        Check(2)..ovrPosef.const.p("HmdToEyePose"),
        Check(2)..ovrPosef.p("outEyePoses")
    )

    void(
        "_GetEyePoses",

        ovrSession("session"),
        long_long("frameIndex"),
        ovrBool("latencyMarker"),
        Check(2)..ovrPosef.const.p("HmdToEyePose"),
        Check(2)..ovrPosef.p("outEyePoses"),
        Check(1)..nullable..double.p("outSensorSampleTime")
    )

    void(
        "Posef_FlipHandedness",

        ovrPosef.const.p("inPose"),
        ovrPosef.p("outPose")
    )

    ovrResult(
        "_ReadWavFromBuffer",

        ovrAudioChannelData.p("outAudioChannel"),
        void.const.p("inputData"),
        AutoSize("inputData")..int("dataSizeInBytes"),
        int("stereoChannelToUse")
    )

    ovrResult(
        "_GenHapticsFromAudioData",

        ovrHapticsClip.p("outHapticsClip"),
        ovrAudioChannelData.const.p("audioChannel"),
        ovrHapticsGenMode("genMode")
    )

    void(
        "_ReleaseAudioChannelData",

        ovrAudioChannelData.p("audioChannel")
    )

    void(
        "_ReleaseHapticsClip",

        ovrHapticsClip.p("hapticsClip")
    )
}