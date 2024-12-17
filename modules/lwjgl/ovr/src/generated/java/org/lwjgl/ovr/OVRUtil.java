/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OVRUtil {

    static { LibOVR.initialize(); }

    public static final int
        ovrProjection_None              = 0x00,
        ovrProjection_LeftHanded        = 0x01,
        ovrProjection_FarLessThanNear   = 0x02,
        ovrProjection_FarClipAtInfinity = 0x04,
        ovrProjection_ClipRangeOpenGL   = 0x08;

    public static final int
        ovrHapticsGenMode_PointSample = 0,
        ovrHapticsGenMode_Count       = 1;

    protected OVRUtil() {
        throw new UnsupportedOperationException();
    }

    // --- [ ovr_Detect ] ---

    /** {@code ovrDetectResult ovr_Detect(int timeoutMilliseconds)} */
    public static native void novr_Detect(int timeoutMilliseconds, long __result);

    /** {@code ovrDetectResult ovr_Detect(int timeoutMilliseconds)} */
    @NativeType("ovrDetectResult")
    public static OVRDetectResult ovr_Detect(int timeoutMilliseconds, @NativeType("ovrDetectResult") OVRDetectResult __result) {
        novr_Detect(timeoutMilliseconds, __result.address());
        return __result;
    }

    // --- [ ovrMatrix4f_Projection ] ---

    /** {@code ovrMatrix4f ovrMatrix4f_Projection(ovrFovPort fov, float znear, float zfar, unsigned int projectionModFlags)} */
    public static native void novrMatrix4f_Projection(long fov, float znear, float zfar, int projectionModFlags, long __result);

    /** {@code ovrMatrix4f ovrMatrix4f_Projection(ovrFovPort fov, float znear, float zfar, unsigned int projectionModFlags)} */
    @NativeType("ovrMatrix4f")
    public static OVRMatrix4f ovrMatrix4f_Projection(@NativeType("ovrFovPort") OVRFovPort fov, float znear, float zfar, @NativeType("unsigned int") int projectionModFlags, @NativeType("ovrMatrix4f") OVRMatrix4f __result) {
        novrMatrix4f_Projection(fov.address(), znear, zfar, projectionModFlags, __result.address());
        return __result;
    }

    // --- [ ovrTimewarpProjectionDesc_FromProjection ] ---

    /** {@code ovrTimewarpProjectionDesc ovrTimewarpProjectionDesc_FromProjection(ovrMatrix4f projection, unsigned int projectionModFlags)} */
    public static native void novrTimewarpProjectionDesc_FromProjection(long projection, int projectionModFlags, long __result);

    /** {@code ovrTimewarpProjectionDesc ovrTimewarpProjectionDesc_FromProjection(ovrMatrix4f projection, unsigned int projectionModFlags)} */
    @NativeType("ovrTimewarpProjectionDesc")
    public static OVRTimewarpProjectionDesc ovrTimewarpProjectionDesc_FromProjection(@NativeType("ovrMatrix4f") OVRMatrix4f projection, @NativeType("unsigned int") int projectionModFlags, @NativeType("ovrTimewarpProjectionDesc") OVRTimewarpProjectionDesc __result) {
        novrTimewarpProjectionDesc_FromProjection(projection.address(), projectionModFlags, __result.address());
        return __result;
    }

    // --- [ ovrMatrix4f_OrthoSubProjection ] ---

    /** {@code ovrMatrix4f ovrMatrix4f_OrthoSubProjection(ovrMatrix4f projection, ovrVector2f orthoScale, float orthoDistance, float HmdToEyeOffsetX)} */
    public static native void novrMatrix4f_OrthoSubProjection(long projection, long orthoScale, float orthoDistance, float HmdToEyeOffsetX, long __result);

    /** {@code ovrMatrix4f ovrMatrix4f_OrthoSubProjection(ovrMatrix4f projection, ovrVector2f orthoScale, float orthoDistance, float HmdToEyeOffsetX)} */
    @NativeType("ovrMatrix4f")
    public static OVRMatrix4f ovrMatrix4f_OrthoSubProjection(@NativeType("ovrMatrix4f") OVRMatrix4f projection, @NativeType("ovrVector2f") OVRVector2f orthoScale, float orthoDistance, float HmdToEyeOffsetX, @NativeType("ovrMatrix4f") OVRMatrix4f __result) {
        novrMatrix4f_OrthoSubProjection(projection.address(), orthoScale.address(), orthoDistance, HmdToEyeOffsetX, __result.address());
        return __result;
    }

    // --- [ ovr_CalcEyePoses ] ---

    /** {@code void ovr_CalcEyePoses(ovrPosef headPose, ovrPosef const * HmdToEyePose, ovrPosef * outEyePoses)} */
    public static native void novr_CalcEyePoses(long headPose, long HmdToEyePose, long outEyePoses);

    /** {@code void ovr_CalcEyePoses(ovrPosef headPose, ovrPosef const * HmdToEyePose, ovrPosef * outEyePoses)} */
    public static void ovr_CalcEyePoses(@NativeType("ovrPosef") OVRPosef headPose, @NativeType("ovrPosef const *") OVRPosef.Buffer HmdToEyePose, @NativeType("ovrPosef *") OVRPosef.Buffer outEyePoses) {
        if (CHECKS) {
            check(HmdToEyePose, 2);
            check(outEyePoses, 2);
        }
        novr_CalcEyePoses(headPose.address(), HmdToEyePose.address(), outEyePoses.address());
    }

    // --- [ ovr_GetEyePoses ] ---

    /** {@code void ovr_GetEyePoses(ovrSession session, long long frameIndex, ovrBool latencyMarker, ovrPosef const * HmdToEyePose, ovrPosef * outEyePoses, double * outSensorSampleTime)} */
    public static native void novr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, long HmdToEyePose, long outEyePoses, long outSensorSampleTime);

    /** {@code void ovr_GetEyePoses(ovrSession session, long long frameIndex, ovrBool latencyMarker, ovrPosef const * HmdToEyePose, ovrPosef * outEyePoses, double * outSensorSampleTime)} */
    public static void ovr_GetEyePoses(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @NativeType("ovrBool") boolean latencyMarker, @NativeType("ovrPosef const *") OVRPosef.Buffer HmdToEyePose, @NativeType("ovrPosef *") OVRPosef.Buffer outEyePoses, @NativeType("double *") @Nullable DoubleBuffer outSensorSampleTime) {
        if (CHECKS) {
            check(session);
            check(HmdToEyePose, 2);
            check(outEyePoses, 2);
            checkSafe(outSensorSampleTime, 1);
        }
        novr_GetEyePoses(session, frameIndex, latencyMarker, HmdToEyePose.address(), outEyePoses.address(), memAddressSafe(outSensorSampleTime));
    }

    // --- [ ovrPosef_FlipHandedness ] ---

    /** {@code void ovrPosef_FlipHandedness(ovrPosef const * inPose, ovrPosef * outPose)} */
    public static native void novrPosef_FlipHandedness(long inPose, long outPose);

    /** {@code void ovrPosef_FlipHandedness(ovrPosef const * inPose, ovrPosef * outPose)} */
    public static void ovrPosef_FlipHandedness(@NativeType("ovrPosef const *") OVRPosef inPose, @NativeType("ovrPosef *") OVRPosef outPose) {
        novrPosef_FlipHandedness(inPose.address(), outPose.address());
    }

    // --- [ ovr_ReadWavFromBuffer ] ---

    /** {@code ovrResult ovr_ReadWavFromBuffer(ovrAudioChannelData * outAudioChannel, void const * inputData, int dataSizeInBytes, int stereoChannelToUse)} */
    public static native int novr_ReadWavFromBuffer(long outAudioChannel, long inputData, int dataSizeInBytes, int stereoChannelToUse);

    /** {@code ovrResult ovr_ReadWavFromBuffer(ovrAudioChannelData * outAudioChannel, void const * inputData, int dataSizeInBytes, int stereoChannelToUse)} */
    @NativeType("ovrResult")
    public static int ovr_ReadWavFromBuffer(@NativeType("ovrAudioChannelData *") OVRAudioChannelData outAudioChannel, @NativeType("void const *") ByteBuffer inputData, int stereoChannelToUse) {
        return novr_ReadWavFromBuffer(outAudioChannel.address(), memAddress(inputData), inputData.remaining(), stereoChannelToUse);
    }

    // --- [ ovr_GenHapticsFromAudioData ] ---

    /** {@code ovrResult ovr_GenHapticsFromAudioData(ovrHapticsClip * outHapticsClip, ovrAudioChannelData const * audioChannel, ovrHapticsGenMode genMode)} */
    public static native int novr_GenHapticsFromAudioData(long outHapticsClip, long audioChannel, int genMode);

    /** {@code ovrResult ovr_GenHapticsFromAudioData(ovrHapticsClip * outHapticsClip, ovrAudioChannelData const * audioChannel, ovrHapticsGenMode genMode)} */
    @NativeType("ovrResult")
    public static int ovr_GenHapticsFromAudioData(@NativeType("ovrHapticsClip *") OVRHapticsClip outHapticsClip, @NativeType("ovrAudioChannelData const *") OVRAudioChannelData audioChannel, @NativeType("ovrHapticsGenMode") int genMode) {
        return novr_GenHapticsFromAudioData(outHapticsClip.address(), audioChannel.address(), genMode);
    }

    // --- [ ovr_ReleaseAudioChannelData ] ---

    /** {@code void ovr_ReleaseAudioChannelData(ovrAudioChannelData * audioChannel)} */
    public static native void novr_ReleaseAudioChannelData(long audioChannel);

    /** {@code void ovr_ReleaseAudioChannelData(ovrAudioChannelData * audioChannel)} */
    public static void ovr_ReleaseAudioChannelData(@NativeType("ovrAudioChannelData *") OVRAudioChannelData audioChannel) {
        novr_ReleaseAudioChannelData(audioChannel.address());
    }

    // --- [ ovr_ReleaseHapticsClip ] ---

    /** {@code void ovr_ReleaseHapticsClip(ovrHapticsClip * hapticsClip)} */
    public static native void novr_ReleaseHapticsClip(long hapticsClip);

    /** {@code void ovr_ReleaseHapticsClip(ovrHapticsClip * hapticsClip)} */
    public static void ovr_ReleaseHapticsClip(@NativeType("ovrHapticsClip *") OVRHapticsClip hapticsClip) {
        novr_ReleaseHapticsClip(hapticsClip.address());
    }

    /** {@code void ovr_GetEyePoses(ovrSession session, long long frameIndex, ovrBool latencyMarker, ovrPosef const * HmdToEyePose, ovrPosef * outEyePoses, double * outSensorSampleTime)} */
    public static native void novr_GetEyePoses(long session, long frameIndex, boolean latencyMarker, long HmdToEyePose, long outEyePoses, double[] outSensorSampleTime);

    /** {@code void ovr_GetEyePoses(ovrSession session, long long frameIndex, ovrBool latencyMarker, ovrPosef const * HmdToEyePose, ovrPosef * outEyePoses, double * outSensorSampleTime)} */
    public static void ovr_GetEyePoses(@NativeType("ovrSession") long session, @NativeType("long long") long frameIndex, @NativeType("ovrBool") boolean latencyMarker, @NativeType("ovrPosef const *") OVRPosef.Buffer HmdToEyePose, @NativeType("ovrPosef *") OVRPosef.Buffer outEyePoses, @NativeType("double *") double @Nullable [] outSensorSampleTime) {
        if (CHECKS) {
            check(session);
            check(HmdToEyePose, 2);
            check(outEyePoses, 2);
            checkSafe(outSensorSampleTime, 1);
        }
        novr_GetEyePoses(session, frameIndex, latencyMarker, HmdToEyePose.address(), outEyePoses.address(), outSensorSampleTime);
    }

}