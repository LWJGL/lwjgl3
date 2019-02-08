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

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1Detect(jint timeoutMilliseconds, jlong __result) {
    *((ovrDetectResult*)(intptr_t)__result) = ovr_Detect(timeoutMilliseconds);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1Detect(JNIEnv *__env, jclass clazz, jint timeoutMilliseconds, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1Detect(timeoutMilliseconds, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1Projection(jlong fovAddress, jfloat znear, jfloat zfar, jint projectionModFlags, jlong __result) {
    ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
    *((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_Projection(*fov, znear, zfar, (unsigned int)projectionModFlags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1Projection(JNIEnv *__env, jclass clazz, jlong fovAddress, jfloat znear, jfloat zfar, jint projectionModFlags, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1Projection(fovAddress, znear, zfar, projectionModFlags, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novrTimewarpProjectionDesc_1FromProjection(jlong projectionAddress, jint projectionModFlags, jlong __result) {
    ovrMatrix4f *projection = (ovrMatrix4f *)(intptr_t)projectionAddress;
    *((ovrTimewarpProjectionDesc*)(intptr_t)__result) = ovrTimewarpProjectionDesc_FromProjection(*projection, (unsigned int)projectionModFlags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrTimewarpProjectionDesc_1FromProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jint projectionModFlags, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novrTimewarpProjectionDesc_1FromProjection(projectionAddress, projectionModFlags, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1OrthoSubProjection(jlong projectionAddress, jlong orthoScaleAddress, jfloat orthoDistance, jfloat HmdToEyeOffsetX, jlong __result) {
    ovrMatrix4f *projection = (ovrMatrix4f *)(intptr_t)projectionAddress;
    ovrVector2f *orthoScale = (ovrVector2f *)(intptr_t)orthoScaleAddress;
    *((ovrMatrix4f*)(intptr_t)__result) = ovrMatrix4f_OrthoSubProjection(*projection, *orthoScale, orthoDistance, HmdToEyeOffsetX);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1OrthoSubProjection(JNIEnv *__env, jclass clazz, jlong projectionAddress, jlong orthoScaleAddress, jfloat orthoDistance, jfloat HmdToEyeOffsetX, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novrMatrix4f_1OrthoSubProjection(projectionAddress, orthoScaleAddress, orthoDistance, HmdToEyeOffsetX, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1CalcEyePoses(jlong headPoseAddress, jlong HmdToEyePoseAddress, jlong outEyePosesAddress) {
    ovrPosef *headPose = (ovrPosef *)(intptr_t)headPoseAddress;
    ovrPosef const *HmdToEyePose = (ovrPosef const *)(intptr_t)HmdToEyePoseAddress;
    ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
    ovr_CalcEyePoses(*headPose, HmdToEyePose, outEyePoses);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1CalcEyePoses(JNIEnv *__env, jclass clazz, jlong headPoseAddress, jlong HmdToEyePoseAddress, jlong outEyePosesAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1CalcEyePoses(headPoseAddress, HmdToEyePoseAddress, outEyePosesAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJJ)(jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyePoseAddress, jlong outEyePosesAddress, jlong outSensorSampleTimeAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrPosef const *HmdToEyePose = (ovrPosef const *)(intptr_t)HmdToEyePoseAddress;
    ovrPosef *outEyePoses = (ovrPosef *)(intptr_t)outEyePosesAddress;
    double *outSensorSampleTime = (double *)(intptr_t)outSensorSampleTimeAddress;
    ovr_GetEyePoses(session, (long long)frameIndex, (ovrBool)latencyMarker, HmdToEyePose, outEyePoses, outSensorSampleTime);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyePoseAddress, jlong outEyePosesAddress, jlong outSensorSampleTimeAddress) {
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJJ)(sessionAddress, frameIndex, latencyMarker, HmdToEyePoseAddress, outEyePosesAddress, outSensorSampleTimeAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novrPosef_1FlipHandedness(jlong inPoseAddress, jlong outPoseAddress) {
    ovrPosef const *inPose = (ovrPosef const *)(intptr_t)inPoseAddress;
    ovrPosef *outPose = (ovrPosef *)(intptr_t)outPoseAddress;
    ovrPosef_FlipHandedness(inPose, outPose);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novrPosef_1FlipHandedness(JNIEnv *__env, jclass clazz, jlong inPoseAddress, jlong outPoseAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novrPosef_1FlipHandedness(inPoseAddress, outPoseAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1ReadWavFromBuffer(jlong outAudioChannelAddress, jlong inputDataAddress, jint dataSizeInBytes, jint stereoChannelToUse) {
    ovrAudioChannelData *outAudioChannel = (ovrAudioChannelData *)(intptr_t)outAudioChannelAddress;
    void const *inputData = (void const *)(intptr_t)inputDataAddress;
    return (jint)ovr_ReadWavFromBuffer(outAudioChannel, inputData, dataSizeInBytes, stereoChannelToUse);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1ReadWavFromBuffer(JNIEnv *__env, jclass clazz, jlong outAudioChannelAddress, jlong inputDataAddress, jint dataSizeInBytes, jint stereoChannelToUse) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1ReadWavFromBuffer(outAudioChannelAddress, inputDataAddress, dataSizeInBytes, stereoChannelToUse);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1GenHapticsFromAudioData(jlong outHapticsClipAddress, jlong audioChannelAddress, jint genMode) {
    ovrHapticsClip *outHapticsClip = (ovrHapticsClip *)(intptr_t)outHapticsClipAddress;
    ovrAudioChannelData const *audioChannel = (ovrAudioChannelData const *)(intptr_t)audioChannelAddress;
    return (jint)ovr_GenHapticsFromAudioData(outHapticsClip, audioChannel, (ovrHapticsGenMode)genMode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GenHapticsFromAudioData(JNIEnv *__env, jclass clazz, jlong outHapticsClipAddress, jlong audioChannelAddress, jint genMode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1GenHapticsFromAudioData(outHapticsClipAddress, audioChannelAddress, genMode);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1ReleaseAudioChannelData(jlong audioChannelAddress) {
    ovrAudioChannelData *audioChannel = (ovrAudioChannelData *)(intptr_t)audioChannelAddress;
    ovr_ReleaseAudioChannelData(audioChannel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1ReleaseAudioChannelData(JNIEnv *__env, jclass clazz, jlong audioChannelAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1ReleaseAudioChannelData(audioChannelAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1ReleaseHapticsClip(jlong hapticsClipAddress) {
    ovrHapticsClip *hapticsClip = (ovrHapticsClip *)(intptr_t)hapticsClipAddress;
    ovr_ReleaseHapticsClip(hapticsClip);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1ReleaseHapticsClip(JNIEnv *__env, jclass clazz, jlong hapticsClipAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVRUtil_novr_1ReleaseHapticsClip(hapticsClipAddress);
}

JNIEXPORT_CRITICAL void JNICALL CRITICAL(org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJ_3D)(jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyePoseAddress, jlong outEyePosesAddress, jint outSensorSampleTime__length, jdouble* outSensorSampleTime) {
    UNUSED_PARAM(outSensorSampleTime__length)
    CRITICAL(org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJJ)(sessionAddress, frameIndex, latencyMarker, HmdToEyePoseAddress, outEyePosesAddress, (intptr_t)outSensorSampleTime);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJ_3D(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jboolean latencyMarker, jlong HmdToEyePoseAddress, jlong outEyePosesAddress, jdoubleArray outSensorSampleTimeAddress) {
    jdouble *outSensorSampleTime = outSensorSampleTimeAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, outSensorSampleTimeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    CRITICAL(org_lwjgl_ovr_OVRUtil_novr_1GetEyePoses__JJZJJJ)(sessionAddress, frameIndex, latencyMarker, HmdToEyePoseAddress, outEyePosesAddress, (intptr_t)outSensorSampleTime);
    if (outSensorSampleTime != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, outSensorSampleTimeAddress, outSensorSampleTime, 0); }
}

EXTERN_C_EXIT
