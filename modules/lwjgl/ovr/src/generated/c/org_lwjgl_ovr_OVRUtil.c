/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1Detect(JNIEnv *__env, jclass clazz, jint timeoutMilliseconds, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((ovrDetectResult*)(uintptr_t)__result) = ovr_Detect(timeoutMilliseconds);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1Projection(JNIEnv *__env, jclass clazz, jlong fovAddress, jfloat znear, jfloat zfar, jint projectionModFlags, jlong __result) {
    ovrFovPort *fov = (ovrFovPort *)(uintptr_t)fovAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrMatrix4f*)(uintptr_t)__result) = ovrMatrix4f_Projection(*fov, znear, zfar, (unsigned int)projectionModFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrTimewarpProjectionDesc_1FromProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jint projectionModFlags, jlong __result) {
    ovrMatrix4f *projection = (ovrMatrix4f *)(uintptr_t)projectionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrTimewarpProjectionDesc*)(uintptr_t)__result) = ovrTimewarpProjectionDesc_FromProjection(*projection, (unsigned int)projectionModFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1OrthoSubProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jlong orthoScaleAddress, jfloat orthoDistance, jfloat HmdToEyeOffsetX, jlong __result) {
    ovrMatrix4f *projection = (ovrMatrix4f *)(uintptr_t)projectionAddress;
    ovrVector2f *orthoScale = (ovrVector2f *)(uintptr_t)orthoScaleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrMatrix4f*)(uintptr_t)__result) = ovrMatrix4f_OrthoSubProjection(*projection, *orthoScale, orthoDistance, HmdToEyeOffsetX);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1CalcEyePoses(JNIEnv *__env, jclass clazz, jlong headPoseAddress, jlong HmdToEyePoseAddress, jlong outEyePosesAddress) {
    ovrPosef *headPose = (ovrPosef *)(uintptr_t)headPoseAddress;
    ovrPosef const *HmdToEyePose = (ovrPosef const *)(uintptr_t)HmdToEyePoseAddress;
    ovrPosef *outEyePoses = (ovrPosef *)(uintptr_t)outEyePosesAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_CalcEyePoses(*headPose, HmdToEyePose, outEyePoses);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyePoseAddress, jlong outEyePosesAddress, jlong outSensorSampleTimeAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrPosef const *HmdToEyePose = (ovrPosef const *)(uintptr_t)HmdToEyePoseAddress;
    ovrPosef *outEyePoses = (ovrPosef *)(uintptr_t)outEyePosesAddress;
    double *outSensorSampleTime = (double *)(uintptr_t)outSensorSampleTimeAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_GetEyePoses(session, (long long)frameIndex, (ovrBool)latencyMarker, HmdToEyePose, outEyePoses, outSensorSampleTime);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrPosef_1FlipHandedness(JNIEnv *__env, jclass clazz, jlong inPoseAddress, jlong outPoseAddress) {
    ovrPosef const *inPose = (ovrPosef const *)(uintptr_t)inPoseAddress;
    ovrPosef *outPose = (ovrPosef *)(uintptr_t)outPoseAddress;
    UNUSED_PARAMS(__env, clazz)
    ovrPosef_FlipHandedness(inPose, outPose);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1ReadWavFromBuffer(JNIEnv *__env, jclass clazz, jlong outAudioChannelAddress, jlong inputDataAddress, jint dataSizeInBytes, jint stereoChannelToUse) {
    ovrAudioChannelData *outAudioChannel = (ovrAudioChannelData *)(uintptr_t)outAudioChannelAddress;
    void const *inputData = (void const *)(uintptr_t)inputDataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_ReadWavFromBuffer(outAudioChannel, inputData, dataSizeInBytes, stereoChannelToUse);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GenHapticsFromAudioData(JNIEnv *__env, jclass clazz, jlong outHapticsClipAddress, jlong audioChannelAddress, jint genMode) {
    ovrHapticsClip *outHapticsClip = (ovrHapticsClip *)(uintptr_t)outHapticsClipAddress;
    ovrAudioChannelData const *audioChannel = (ovrAudioChannelData const *)(uintptr_t)audioChannelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GenHapticsFromAudioData(outHapticsClip, audioChannel, (ovrHapticsGenMode)genMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1ReleaseAudioChannelData(JNIEnv *__env, jclass clazz, jlong audioChannelAddress) {
    ovrAudioChannelData *audioChannel = (ovrAudioChannelData *)(uintptr_t)audioChannelAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_ReleaseAudioChannelData(audioChannel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1ReleaseHapticsClip(JNIEnv *__env, jclass clazz, jlong hapticsClipAddress) {
    ovrHapticsClip *hapticsClip = (ovrHapticsClip *)(uintptr_t)hapticsClipAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_ReleaseHapticsClip(hapticsClip);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJ_3D(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyePoseAddress, jlong outEyePosesAddress, jdoubleArray outSensorSampleTimeAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrPosef const *HmdToEyePose = (ovrPosef const *)(uintptr_t)HmdToEyePoseAddress;
    ovrPosef *outEyePoses = (ovrPosef *)(uintptr_t)outEyePosesAddress;
    jdouble *outSensorSampleTime = outSensorSampleTimeAddress == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, outSensorSampleTimeAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    ovr_GetEyePoses(session, (long long)frameIndex, (ovrBool)latencyMarker, HmdToEyePose, outEyePoses, (double *)outSensorSampleTime);
    if (outSensorSampleTime != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, outSensorSampleTimeAddress, outSensorSampleTime, 0); }
}

EXTERN_C_EXIT
