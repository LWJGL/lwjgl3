/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPIShim.c"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1Initialize(jlong paramsAddress) {
    ovrInitParams const *params = (ovrInitParams const *)(intptr_t)paramsAddress;
    return (jint)ovr_Initialize(params);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Initialize(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1Initialize(paramsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_ovr_1Shutdown(void) {
    ovr_Shutdown();
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_ovr_1Shutdown(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_ovr_1Shutdown();
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetLastErrorInfo(jlong errorInfoAddress) {
    ovrErrorInfo *errorInfo = (ovrErrorInfo *)(intptr_t)errorInfoAddress;
    ovr_GetLastErrorInfo(errorInfo);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetLastErrorInfo(JNIEnv *__env, jclass clazz, jlong errorInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetLastErrorInfo(errorInfoAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetVersionString(void) {
    return (jlong)(intptr_t)ovr_GetVersionString();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetVersionString(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetVersionString();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1TraceMessage(jint level, jlong messageAddress) {
    char const *message = (char const *)(intptr_t)messageAddress;
    return (jint)ovr_TraceMessage(level, message);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TraceMessage(JNIEnv *__env, jclass clazz, jint level, jlong messageAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1TraceMessage(level, messageAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1IdentifyClient(jlong identityAddress) {
    char const *identity = (char const *)(intptr_t)identityAddress;
    return (jint)ovr_IdentifyClient(identity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1IdentifyClient(JNIEnv *__env, jclass clazz, jlong identityAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1IdentifyClient(identityAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetHmdDesc(jlong sessionAddress, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    *((ovrHmdDesc*)(intptr_t)__result) = ovr_GetHmdDesc(session);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetHmdDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetHmdDesc(sessionAddress, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackerCount(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_GetTrackerCount(session);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerCount(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackerCount(sessionAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackerDesc(jlong sessionAddress, jint trackerDescIndex, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    *((ovrTrackerDesc*)(intptr_t)__result) = ovr_GetTrackerDesc(session, (unsigned int)trackerDescIndex);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint trackerDescIndex, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackerDesc(sessionAddress, trackerDescIndex, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1Create(jlong pSessionAddress, jlong pLuidAddress) {
    ovrSession *pSession = (ovrSession *)(intptr_t)pSessionAddress;
    ovrGraphicsLuid *pLuid = (ovrGraphicsLuid *)(intptr_t)pLuidAddress;
    return (jint)ovr_Create(pSession, pLuid);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Create(JNIEnv *__env, jclass clazz, jlong pSessionAddress, jlong pLuidAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1Create(pSessionAddress, pLuidAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1Destroy(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovr_Destroy(session);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1Destroy(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1Destroy(sessionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetSessionStatus(jlong sessionAddress, jlong sessionStatusAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrSessionStatus *sessionStatus = (ovrSessionStatus *)(intptr_t)sessionStatusAddress;
    return (jint)ovr_GetSessionStatus(session, sessionStatus);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetSessionStatus(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong sessionStatusAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetSessionStatus(sessionAddress, sessionStatusAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1IsExtensionSupported(jlong sessionAddress, jint extension, jlong outExtensionSupportedAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrBool *outExtensionSupported = (ovrBool *)(intptr_t)outExtensionSupportedAddress;
    return (jint)ovr_IsExtensionSupported(session, (ovrExtensions)extension, outExtensionSupported);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1IsExtensionSupported(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint extension, jlong outExtensionSupportedAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1IsExtensionSupported(sessionAddress, extension, outExtensionSupportedAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1EnableExtension(jlong sessionAddress, jint extension) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_EnableExtension(session, (ovrExtensions)extension);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1EnableExtension(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint extension) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1EnableExtension(sessionAddress, extension);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetTrackingOriginType(jlong sessionAddress, jint origin) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_SetTrackingOriginType(session, (ovrTrackingOrigin)origin);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetTrackingOriginType(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint origin) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetTrackingOriginType(sessionAddress, origin);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackingOriginType(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_GetTrackingOriginType(session);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackingOriginType(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackingOriginType(sessionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1RecenterTrackingOrigin(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_RecenterTrackingOrigin(session);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1RecenterTrackingOrigin(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1RecenterTrackingOrigin(sessionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SpecifyTrackingOrigin(jlong sessionAddress, jlong originPoseAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrPosef *originPose = (ovrPosef *)(intptr_t)originPoseAddress;
    return (jint)ovr_SpecifyTrackingOrigin(session, *originPose);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SpecifyTrackingOrigin(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong originPoseAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SpecifyTrackingOrigin(sessionAddress, originPoseAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1ClearShouldRecenterFlag(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovr_ClearShouldRecenterFlag(session);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1ClearShouldRecenterFlag(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1ClearShouldRecenterFlag(sessionAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackingState(jlong sessionAddress, jdouble absTime, jboolean latencyMarker, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    *((ovrTrackingState*)(intptr_t)__result) = ovr_GetTrackingState(session, absTime, (ovrBool)latencyMarker);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackingState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jdouble absTime, jboolean latencyMarker, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackingState(sessionAddress, absTime, latencyMarker, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__JJIDJ(jlong sessionAddress, jlong deviceTypesAddress, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTrackedDeviceType *deviceTypes = (ovrTrackedDeviceType *)(intptr_t)deviceTypesAddress;
    ovrPoseStatef *outDevicePoses = (ovrPoseStatef *)(intptr_t)outDevicePosesAddress;
    return (jint)ovr_GetDevicePoses(session, deviceTypes, deviceCount, absTime, outDevicePoses);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__JJIDJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong deviceTypesAddress, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__JJIDJ(sessionAddress, deviceTypesAddress, deviceCount, absTime, outDevicePosesAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackerPose(jlong sessionAddress, jint trackerPoseIndex, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    *((ovrTrackerPose*)(intptr_t)__result) = ovr_GetTrackerPose(session, (unsigned int)trackerPoseIndex);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerPose(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint trackerPoseIndex, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTrackerPose(sessionAddress, trackerPoseIndex, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetInputState(jlong sessionAddress, jint controllerType, jlong inputStateAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrInputState *inputState = (ovrInputState *)(intptr_t)inputStateAddress;
    return (jint)ovr_GetInputState(session, (ovrControllerType)controllerType, inputState);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInputState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong inputStateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetInputState(sessionAddress, controllerType, inputStateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetConnectedControllerTypes(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_GetConnectedControllerTypes(session);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetConnectedControllerTypes(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetConnectedControllerTypes(sessionAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTouchHapticsDesc(jlong sessionAddress, jint controllerType, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    *((ovrTouchHapticsDesc*)(intptr_t)__result) = ovr_GetTouchHapticsDesc(session, (ovrControllerType)controllerType);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTouchHapticsDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTouchHapticsDesc(sessionAddress, controllerType, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetControllerVibration(jlong sessionAddress, jint controllerType, jfloat frequency, jfloat amplitude) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_SetControllerVibration(session, (ovrControllerType)controllerType, frequency, amplitude);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetControllerVibration(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jfloat frequency, jfloat amplitude) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetControllerVibration(sessionAddress, controllerType, frequency, amplitude);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SubmitControllerVibration(jlong sessionAddress, jint controllerType, jlong bufferAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrHapticsBuffer const *buffer = (ovrHapticsBuffer const *)(intptr_t)bufferAddress;
    return (jint)ovr_SubmitControllerVibration(session, (ovrControllerType)controllerType, buffer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitControllerVibration(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SubmitControllerVibration(sessionAddress, controllerType, bufferAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetControllerVibrationState(jlong sessionAddress, jint controllerType, jlong outStateAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrHapticsPlaybackState *outState = (ovrHapticsPlaybackState *)(intptr_t)outStateAddress;
    return (jint)ovr_GetControllerVibrationState(session, (ovrControllerType)controllerType, outState);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetControllerVibrationState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong outStateAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetControllerVibrationState(sessionAddress, controllerType, outStateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1TestBoundary(jlong sessionAddress, jint deviceBitmask, jint boundaryType, jlong outTestResultAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrBoundaryTestResult *outTestResult = (ovrBoundaryTestResult *)(intptr_t)outTestResultAddress;
    return (jint)ovr_TestBoundary(session, (ovrTrackedDeviceType)deviceBitmask, (ovrBoundaryType)boundaryType, outTestResult);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TestBoundary(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint deviceBitmask, jint boundaryType, jlong outTestResultAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1TestBoundary(sessionAddress, deviceBitmask, boundaryType, outTestResultAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1TestBoundaryPoint(jlong sessionAddress, jlong pointAddress, jint singleBoundaryType, jlong outTestResultAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrVector3f const *point = (ovrVector3f const *)(intptr_t)pointAddress;
    ovrBoundaryTestResult *outTestResult = (ovrBoundaryTestResult *)(intptr_t)outTestResultAddress;
    return (jint)ovr_TestBoundaryPoint(session, point, (ovrBoundaryType)singleBoundaryType, outTestResult);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TestBoundaryPoint(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong pointAddress, jint singleBoundaryType, jlong outTestResultAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1TestBoundaryPoint(sessionAddress, pointAddress, singleBoundaryType, outTestResultAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetBoundaryLookAndFeel(jlong sessionAddress, jlong lookAndFeelAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrBoundaryLookAndFeel const *lookAndFeel = (ovrBoundaryLookAndFeel const *)(intptr_t)lookAndFeelAddress;
    return (jint)ovr_SetBoundaryLookAndFeel(session, lookAndFeel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetBoundaryLookAndFeel(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong lookAndFeelAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetBoundaryLookAndFeel(sessionAddress, lookAndFeelAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1ResetBoundaryLookAndFeel(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_ResetBoundaryLookAndFeel(session);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetBoundaryLookAndFeel(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1ResetBoundaryLookAndFeel(sessionAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJJ(jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jlong outFloorPointsCountAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrVector3f *outFloorPoints = (ovrVector3f *)(intptr_t)outFloorPointsAddress;
    int *outFloorPointsCount = (int *)(intptr_t)outFloorPointsCountAddress;
    return (jint)ovr_GetBoundaryGeometry(session, (ovrBoundaryType)boundaryType, outFloorPoints, outFloorPointsCount);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jlong outFloorPointsCountAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJJ(sessionAddress, boundaryType, outFloorPointsAddress, outFloorPointsCountAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryDimensions(jlong sessionAddress, jint boundaryType, jlong outDimensionsAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrVector3f *outDimensions = (ovrVector3f *)(intptr_t)outDimensionsAddress;
    return (jint)ovr_GetBoundaryDimensions(session, (ovrBoundaryType)boundaryType, outDimensions);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryDimensions(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outDimensionsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryDimensions(sessionAddress, boundaryType, outDimensionsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryVisible(jlong sessionAddress, jlong outIsVisibleAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrBool *outIsVisible = (ovrBool *)(intptr_t)outIsVisibleAddress;
    return (jint)ovr_GetBoundaryVisible(session, outIsVisible);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryVisible(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong outIsVisibleAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryVisible(sessionAddress, outIsVisibleAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1RequestBoundaryVisible(jlong sessionAddress, jboolean visible) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_RequestBoundaryVisible(session, (ovrBool)visible);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1RequestBoundaryVisible(JNIEnv *__env, jclass clazz, jlong sessionAddress, jboolean visible) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1RequestBoundaryVisible(sessionAddress, visible);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJJ(jlong sessionAddress, jlong camerasAddress, jlong inoutCameraCountAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrExternalCamera *cameras = (ovrExternalCamera *)(intptr_t)camerasAddress;
    unsigned int *inoutCameraCount = (unsigned int *)(intptr_t)inoutCameraCountAddress;
    return (jint)ovr_GetExternalCameras(session, cameras, inoutCameraCount);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong camerasAddress, jlong inoutCameraCountAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJJ(sessionAddress, camerasAddress, inoutCameraCountAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetExternalCameraProperties(jlong sessionAddress, jlong nameAddress, jlong intrinsicsAddress, jlong extrinsicsAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    ovrCameraIntrinsics const * const intrinsics = (ovrCameraIntrinsics const * const)(intptr_t)intrinsicsAddress;
    ovrCameraExtrinsics const * const extrinsics = (ovrCameraExtrinsics const * const)(intptr_t)extrinsicsAddress;
    return (jint)ovr_SetExternalCameraProperties(session, name, intrinsics, extrinsics);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetExternalCameraProperties(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong nameAddress, jlong intrinsicsAddress, jlong extrinsicsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetExternalCameraProperties(sessionAddress, nameAddress, intrinsicsAddress, extrinsicsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJJ(jlong sessionAddress, jlong chainAddress, jlong out_LengthAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    int *out_Length = (int *)(intptr_t)out_LengthAddress;
    return (jint)ovr_GetTextureSwapChainLength(session, chain, out_Length);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_LengthAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJJ(sessionAddress, chainAddress, out_LengthAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJJ(jlong sessionAddress, jlong chainAddress, jlong out_IndexAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    int *out_Index = (int *)(intptr_t)out_IndexAddress;
    return (jint)ovr_GetTextureSwapChainCurrentIndex(session, chain, out_Index);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_IndexAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJJ(sessionAddress, chainAddress, out_IndexAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainDesc(jlong sessionAddress, jlong chainAddress, jlong out_DescAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    ovrTextureSwapChainDesc *out_Desc = (ovrTextureSwapChainDesc *)(intptr_t)out_DescAddress;
    return (jint)ovr_GetTextureSwapChainDesc(session, chain, out_Desc);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_DescAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainDesc(sessionAddress, chainAddress, out_DescAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1CommitTextureSwapChain(jlong sessionAddress, jlong chainAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    return (jint)ovr_CommitTextureSwapChain(session, chain);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1CommitTextureSwapChain(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1CommitTextureSwapChain(sessionAddress, chainAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1DestroyTextureSwapChain(jlong sessionAddress, jlong chainAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    ovr_DestroyTextureSwapChain(session, chain);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroyTextureSwapChain(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1DestroyTextureSwapChain(sessionAddress, chainAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1DestroyMirrorTexture(jlong sessionAddress, jlong mirrorTextureAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(intptr_t)mirrorTextureAddress;
    ovr_DestroyMirrorTexture(session, mirrorTexture);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroyMirrorTexture(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1DestroyMirrorTexture(sessionAddress, mirrorTextureAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFovTextureSize(jlong sessionAddress, jint eye, jlong fovAddress, jfloat pixelsPerDisplayPixel, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
    *((ovrSizei*)(intptr_t)__result) = ovr_GetFovTextureSize(session, (ovrEyeType)eye, *fov, pixelsPerDisplayPixel);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFovTextureSize(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint eye, jlong fovAddress, jfloat pixelsPerDisplayPixel, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFovTextureSize(sessionAddress, eye, fovAddress, pixelsPerDisplayPixel, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetRenderDesc(jlong sessionAddress, jint eyeType, jlong fovAddress, jlong __result) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrFovPort *fov = (ovrFovPort *)(intptr_t)fovAddress;
    *((ovrEyeRenderDesc*)(intptr_t)__result) = ovr_GetRenderDesc(session, (ovrEyeType)eyeType, *fov);
}
JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetRenderDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint eyeType, jlong fovAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_ovr_OVR_novr_1GetRenderDesc(sessionAddress, eyeType, fovAddress, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFovStencil(jlong sessionAddress, jlong fovStencilDescAddress, jlong meshBufferAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrFovStencilDesc const *fovStencilDesc = (ovrFovStencilDesc const *)(intptr_t)fovStencilDescAddress;
    ovrFovStencilMeshBuffer *meshBuffer = (ovrFovStencilMeshBuffer *)(intptr_t)meshBufferAddress;
    return (jint)ovr_GetFovStencil(session, fovStencilDesc, meshBuffer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFovStencil(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong fovStencilDescAddress, jlong meshBufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFovStencil(sessionAddress, fovStencilDescAddress, meshBufferAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1WaitToBeginFrame(jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_WaitToBeginFrame(session, (long long)frameIndex);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1WaitToBeginFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1WaitToBeginFrame(sessionAddress, frameIndex);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1BeginFrame(jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_BeginFrame(session, (long long)frameIndex);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1BeginFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1BeginFrame(sessionAddress, frameIndex);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1EndFrame(jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrViewScaleDesc const *viewScaleDesc = (ovrViewScaleDesc const *)(intptr_t)viewScaleDescAddress;
    ovrLayerHeader const * const *layerPtrList = (ovrLayerHeader const * const *)(intptr_t)layerPtrListAddress;
    return (jint)ovr_EndFrame(session, (long long)frameIndex, viewScaleDesc, layerPtrList, (unsigned int)layerCount);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1EndFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1EndFrame(sessionAddress, frameIndex, viewScaleDescAddress, layerPtrListAddress, layerCount);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SubmitFrame(jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrViewScaleDesc const *viewScaleDesc = (ovrViewScaleDesc const *)(intptr_t)viewScaleDescAddress;
    ovrLayerHeader const * const *layerPtrList = (ovrLayerHeader const * const *)(intptr_t)layerPtrListAddress;
    return (jint)ovr_SubmitFrame(session, (long long)frameIndex, viewScaleDesc, layerPtrList, (unsigned int)layerCount);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SubmitFrame(sessionAddress, frameIndex, viewScaleDescAddress, layerPtrListAddress, layerCount);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetPerfStats(jlong sessionAddress, jlong outStatsAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrPerfStats *outStats = (ovrPerfStats *)(intptr_t)outStatsAddress;
    return (jint)ovr_GetPerfStats(session, outStats);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetPerfStats(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong outStatsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetPerfStats(sessionAddress, outStatsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1ResetPerfStats(jlong sessionAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jint)ovr_ResetPerfStats(session);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetPerfStats(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1ResetPerfStats(sessionAddress);
}

JNIEXPORT jdouble JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetPredictedDisplayTime(jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    return (jdouble)ovr_GetPredictedDisplayTime(session, (long long)frameIndex);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetPredictedDisplayTime(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetPredictedDisplayTime(sessionAddress, frameIndex);
}

JNIEXPORT jdouble JNICALL JavaCritical_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds(void) {
    return (jdouble)ovr_GetTimeInSeconds();
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds();
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBool(jlong sessionAddress, jlong propertyNameAddress, jboolean defaultVal) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    return (jboolean)ovr_GetBool(session, propertyName, (ovrBool)defaultVal);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBool(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jboolean defaultVal) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBool(sessionAddress, propertyNameAddress, defaultVal);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetBool(jlong sessionAddress, jlong propertyNameAddress, jboolean value) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    return (jboolean)ovr_SetBool(session, propertyName, (ovrBool)value);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetBool(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jboolean value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetBool(sessionAddress, propertyNameAddress, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetInt(jlong sessionAddress, jlong propertyNameAddress, jint defaultVal) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    return (jint)ovr_GetInt(session, propertyName, defaultVal);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInt(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jint defaultVal) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetInt(sessionAddress, propertyNameAddress, defaultVal);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetInt(jlong sessionAddress, jlong propertyNameAddress, jint value) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    return (jboolean)ovr_SetInt(session, propertyName, value);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetInt(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jint value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetInt(sessionAddress, propertyNameAddress, value);
}

JNIEXPORT jfloat JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloat(jlong sessionAddress, jlong propertyNameAddress, jfloat defaultVal) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    return (jfloat)ovr_GetFloat(session, propertyName, defaultVal);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloat(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloat defaultVal) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloat(sessionAddress, propertyNameAddress, defaultVal);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloat(jlong sessionAddress, jlong propertyNameAddress, jfloat value) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    return (jboolean)ovr_SetFloat(session, propertyName, value);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloat(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloat value) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloat(sessionAddress, propertyNameAddress, value);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJJI(jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesCapacity) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    float *values = (float *)(intptr_t)valuesAddress;
    return (jint)ovr_GetFloatArray(session, propertyName, values, (unsigned int)valuesCapacity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJJI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesCapacity) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJJI(sessionAddress, propertyNameAddress, valuesAddress, valuesCapacity);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJJI(jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesSize) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    float *values = (float *)(intptr_t)valuesAddress;
    return (jboolean)ovr_SetFloatArray(session, propertyName, values, (unsigned int)valuesSize);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJJI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJJI(sessionAddress, propertyNameAddress, valuesAddress, valuesSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetString(jlong sessionAddress, jlong propertyNameAddress, jlong defaultValAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    char const *defaultVal = (char const *)(intptr_t)defaultValAddress;
    return (jlong)(intptr_t)ovr_GetString(session, propertyName, defaultVal);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetString(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong defaultValAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetString(sessionAddress, propertyNameAddress, defaultValAddress);
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetString(jlong hmddescAddress, jlong propertyNameAddress, jlong valueAddress) {
    ovrSession hmddesc = (ovrSession)(intptr_t)hmddescAddress;
    char const *propertyName = (char const *)(intptr_t)propertyNameAddress;
    char const *value = (char const *)(intptr_t)valueAddress;
    return (jboolean)ovr_SetString(hmddesc, propertyName, value);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetString(JNIEnv *__env, jclass clazz, jlong hmddescAddress, jlong propertyNameAddress, jlong valueAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetString(hmddescAddress, propertyNameAddress, valueAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__J_3IIDJ(jlong sessionAddress, jint deviceTypes__length, jint* deviceTypes, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    UNUSED_PARAM(deviceTypes__length)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__JJIDJ(sessionAddress, (intptr_t)deviceTypes, deviceCount, absTime, outDevicePosesAddress);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__J_3IIDJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jintArray deviceTypesAddress, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    jint __result;
    jint *deviceTypes = (*__env)->GetPrimitiveArrayCritical(__env, deviceTypesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__JJIDJ(sessionAddress, (intptr_t)deviceTypes, deviceCount, absTime, outDevicePosesAddress);
    (*__env)->ReleasePrimitiveArrayCritical(__env, deviceTypesAddress, deviceTypes, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJ_3I(jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jint outFloorPointsCount__length, jint* outFloorPointsCount) {
    UNUSED_PARAM(outFloorPointsCount__length)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJJ(sessionAddress, boundaryType, outFloorPointsAddress, (intptr_t)outFloorPointsCount);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jintArray outFloorPointsCountAddress) {
    jint __result;
    jint *outFloorPointsCount = outFloorPointsCountAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, outFloorPointsCountAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJJ(sessionAddress, boundaryType, outFloorPointsAddress, (intptr_t)outFloorPointsCount);
    if (outFloorPointsCount != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, outFloorPointsCountAddress, outFloorPointsCount, 0); }
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJ_3I(jlong sessionAddress, jlong camerasAddress, jint inoutCameraCount__length, jint* inoutCameraCount) {
    UNUSED_PARAM(inoutCameraCount__length)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJJ(sessionAddress, camerasAddress, (intptr_t)inoutCameraCount);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong camerasAddress, jintArray inoutCameraCountAddress) {
    jint __result;
    jint *inoutCameraCount = (*__env)->GetPrimitiveArrayCritical(__env, inoutCameraCountAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJJ(sessionAddress, camerasAddress, (intptr_t)inoutCameraCount);
    (*__env)->ReleasePrimitiveArrayCritical(__env, inoutCameraCountAddress, inoutCameraCount, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJ_3I(jlong sessionAddress, jlong chainAddress, jint out_Length__length, jint* out_Length) {
    UNUSED_PARAM(out_Length__length)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJJ(sessionAddress, chainAddress, (intptr_t)out_Length);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jintArray out_LengthAddress) {
    jint __result;
    jint *out_Length = (*__env)->GetPrimitiveArrayCritical(__env, out_LengthAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJJ(sessionAddress, chainAddress, (intptr_t)out_Length);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_LengthAddress, out_Length, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJ_3I(jlong sessionAddress, jlong chainAddress, jint out_Index__length, jint* out_Index) {
    UNUSED_PARAM(out_Index__length)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJJ(sessionAddress, chainAddress, (intptr_t)out_Index);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jintArray out_IndexAddress) {
    jint __result;
    jint *out_Index = (*__env)->GetPrimitiveArrayCritical(__env, out_IndexAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJJ(sessionAddress, chainAddress, (intptr_t)out_Index);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_IndexAddress, out_Index, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJ_3FI(jlong sessionAddress, jlong propertyNameAddress, jint values__length, jfloat* values, jint valuesCapacity) {
    UNUSED_PARAM(values__length)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJJI(sessionAddress, propertyNameAddress, (intptr_t)values, valuesCapacity);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJ_3FI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloatArray valuesAddress, jint valuesCapacity) {
    jint __result;
    jfloat *values = (*__env)->GetPrimitiveArrayCritical(__env, valuesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJJI(sessionAddress, propertyNameAddress, (intptr_t)values, valuesCapacity);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valuesAddress, values, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJ_3FI(jlong sessionAddress, jlong propertyNameAddress, jint values__length, jfloat* values, jint valuesSize) {
    UNUSED_PARAM(values__length)
    return JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJJI(sessionAddress, propertyNameAddress, (intptr_t)values, valuesSize);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJ_3FI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloatArray valuesAddress, jint valuesSize) {
    jboolean __result;
    jfloat *values = (*__env)->GetPrimitiveArrayCritical(__env, valuesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJJI(sessionAddress, propertyNameAddress, (intptr_t)values, valuesSize);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valuesAddress, values, 0);
    return __result;
}

EXTERN_C_EXIT
