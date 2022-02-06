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

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Initialize(JNIEnv *__env, jclass clazz, jlong paramsAddress) {
    ovrInitParams const *params = (ovrInitParams const *)(uintptr_t)paramsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_Initialize(params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_ovr_1Shutdown(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    ovr_Shutdown();
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetLastErrorInfo(JNIEnv *__env, jclass clazz, jlong errorInfoAddress) {
    ovrErrorInfo *errorInfo = (ovrErrorInfo *)(uintptr_t)errorInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_GetLastErrorInfo(errorInfo);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetVersionString(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)ovr_GetVersionString();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TraceMessage(JNIEnv *__env, jclass clazz, jint level, jlong messageAddress) {
    char const *message = (char const *)(uintptr_t)messageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_TraceMessage(level, message);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1IdentifyClient(JNIEnv *__env, jclass clazz, jlong identityAddress) {
    char const *identity = (char const *)(uintptr_t)identityAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_IdentifyClient(identity);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetHmdColorDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrHmdColorDesc*)(uintptr_t)__result) = ovr_GetHmdColorDesc(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetClientColorDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong colorDescAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrHmdColorDesc const *colorDesc = (ovrHmdColorDesc const *)(uintptr_t)colorDescAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetClientColorDesc(session, colorDesc);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetHmdDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrHmdDesc*)(uintptr_t)__result) = ovr_GetHmdDesc(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerCount(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetTrackerCount(session);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint trackerDescIndex, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrTrackerDesc*)(uintptr_t)__result) = ovr_GetTrackerDesc(session, (unsigned int)trackerDescIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1Create(JNIEnv *__env, jclass clazz, jlong pSessionAddress, jlong pLuidAddress) {
    ovrSession *pSession = (ovrSession *)(uintptr_t)pSessionAddress;
    ovrGraphicsLuid *pLuid = (ovrGraphicsLuid *)(uintptr_t)pLuidAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_Create(pSession, pLuid);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1Destroy(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_Destroy(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetSessionStatus(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong sessionStatusAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrSessionStatus *sessionStatus = (ovrSessionStatus *)(uintptr_t)sessionStatusAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetSessionStatus(session, sessionStatus);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1IsExtensionSupported(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint extension, jlong outExtensionSupportedAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrBool *outExtensionSupported = (ovrBool *)(uintptr_t)outExtensionSupportedAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_IsExtensionSupported(session, (ovrExtensions)extension, outExtensionSupported);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1EnableExtension(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint extension) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_EnableExtension(session, (ovrExtensions)extension);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetTrackingOriginType(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint origin) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetTrackingOriginType(session, (ovrTrackingOrigin)origin);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackingOriginType(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetTrackingOriginType(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1RecenterTrackingOrigin(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_RecenterTrackingOrigin(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SpecifyTrackingOrigin(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong originPoseAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrPosef *originPose = (ovrPosef *)(uintptr_t)originPoseAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SpecifyTrackingOrigin(session, *originPose);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1ClearShouldRecenterFlag(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_ClearShouldRecenterFlag(session);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackingState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jdouble absTime, jboolean latencyMarker, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrTrackingState*)(uintptr_t)__result) = ovr_GetTrackingState(session, absTime, (ovrBool)latencyMarker);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__JJIDJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong deviceTypesAddress, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTrackedDeviceType *deviceTypes = (ovrTrackedDeviceType *)(uintptr_t)deviceTypesAddress;
    ovrPoseStatef *outDevicePoses = (ovrPoseStatef *)(uintptr_t)outDevicePosesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetDevicePoses(session, deviceTypes, deviceCount, absTime, outDevicePoses);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTrackerPose(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint trackerPoseIndex, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrTrackerPose*)(uintptr_t)__result) = ovr_GetTrackerPose(session, (unsigned int)trackerPoseIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInputState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong inputStateAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrInputState *inputState = (ovrInputState *)(uintptr_t)inputStateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetInputState(session, (ovrControllerType)controllerType, inputState);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetConnectedControllerTypes(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetConnectedControllerTypes(session);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTouchHapticsDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrTouchHapticsDesc*)(uintptr_t)__result) = ovr_GetTouchHapticsDesc(session, (ovrControllerType)controllerType);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetControllerVibration(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jfloat frequency, jfloat amplitude) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetControllerVibration(session, (ovrControllerType)controllerType, frequency, amplitude);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitControllerVibration(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong bufferAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrHapticsBuffer const *buffer = (ovrHapticsBuffer const *)(uintptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SubmitControllerVibration(session, (ovrControllerType)controllerType, buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetControllerVibrationState(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint controllerType, jlong outStateAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrHapticsPlaybackState *outState = (ovrHapticsPlaybackState *)(uintptr_t)outStateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetControllerVibrationState(session, (ovrControllerType)controllerType, outState);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TestBoundary(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint deviceBitmask, jint boundaryType, jlong outTestResultAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrBoundaryTestResult *outTestResult = (ovrBoundaryTestResult *)(uintptr_t)outTestResultAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_TestBoundary(session, (ovrTrackedDeviceType)deviceBitmask, (ovrBoundaryType)boundaryType, outTestResult);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1TestBoundaryPoint(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong pointAddress, jint singleBoundaryType, jlong outTestResultAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrVector3f const *point = (ovrVector3f const *)(uintptr_t)pointAddress;
    ovrBoundaryTestResult *outTestResult = (ovrBoundaryTestResult *)(uintptr_t)outTestResultAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_TestBoundaryPoint(session, point, (ovrBoundaryType)singleBoundaryType, outTestResult);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetBoundaryLookAndFeel(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong lookAndFeelAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrBoundaryLookAndFeel const *lookAndFeel = (ovrBoundaryLookAndFeel const *)(uintptr_t)lookAndFeelAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetBoundaryLookAndFeel(session, lookAndFeel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetBoundaryLookAndFeel(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_ResetBoundaryLookAndFeel(session);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jlong outFloorPointsCountAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrVector3f *outFloorPoints = (ovrVector3f *)(uintptr_t)outFloorPointsAddress;
    int *outFloorPointsCount = (int *)(uintptr_t)outFloorPointsCountAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetBoundaryGeometry(session, (ovrBoundaryType)boundaryType, outFloorPoints, outFloorPointsCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryDimensions(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outDimensionsAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrVector3f *outDimensions = (ovrVector3f *)(uintptr_t)outDimensionsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetBoundaryDimensions(session, (ovrBoundaryType)boundaryType, outDimensions);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryVisible(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong outIsVisibleAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrBool *outIsVisible = (ovrBool *)(uintptr_t)outIsVisibleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetBoundaryVisible(session, outIsVisible);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1RequestBoundaryVisible(JNIEnv *__env, jclass clazz, jlong sessionAddress, jboolean visible) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_RequestBoundaryVisible(session, (ovrBool)visible);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong camerasAddress, jlong inoutCameraCountAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrExternalCamera *cameras = (ovrExternalCamera *)(uintptr_t)camerasAddress;
    unsigned int *inoutCameraCount = (unsigned int *)(uintptr_t)inoutCameraCountAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetExternalCameras(session, cameras, inoutCameraCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetExternalCameraProperties(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong nameAddress, jlong intrinsicsAddress, jlong extrinsicsAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    ovrCameraIntrinsics const * const intrinsics = (ovrCameraIntrinsics const * const)(uintptr_t)intrinsicsAddress;
    ovrCameraExtrinsics const * const extrinsics = (ovrCameraExtrinsics const * const)(uintptr_t)extrinsicsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetExternalCameraProperties(session, name, intrinsics, extrinsics);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_LengthAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    int *out_Length = (int *)(uintptr_t)out_LengthAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetTextureSwapChainLength(session, chain, out_Length);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_IndexAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    int *out_Index = (int *)(uintptr_t)out_IndexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetTextureSwapChainCurrentIndex(session, chain, out_Index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jlong out_DescAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    ovrTextureSwapChainDesc *out_Desc = (ovrTextureSwapChainDesc *)(uintptr_t)out_DescAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetTextureSwapChainDesc(session, chain, out_Desc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1CommitTextureSwapChain(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_CommitTextureSwapChain(session, chain);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroyTextureSwapChain(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_DestroyTextureSwapChain(session, chain);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1DestroyMirrorTexture(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(uintptr_t)mirrorTextureAddress;
    UNUSED_PARAMS(__env, clazz)
    ovr_DestroyMirrorTexture(session, mirrorTexture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFovTextureSize(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint eye, jlong fovAddress, jfloat pixelsPerDisplayPixel, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrFovPort *fov = (ovrFovPort *)(uintptr_t)fovAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrSizei*)(uintptr_t)__result) = ovr_GetFovTextureSize(session, (ovrEyeType)eye, *fov, pixelsPerDisplayPixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetRenderDesc(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint eyeType, jlong fovAddress, jlong __result) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrFovPort *fov = (ovrFovPort *)(uintptr_t)fovAddress;
    UNUSED_PARAMS(__env, clazz)
    *((ovrEyeRenderDesc*)(uintptr_t)__result) = ovr_GetRenderDesc(session, (ovrEyeType)eyeType, *fov);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFovStencil(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong fovStencilDescAddress, jlong meshBufferAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrFovStencilDesc const *fovStencilDesc = (ovrFovStencilDesc const *)(uintptr_t)fovStencilDescAddress;
    ovrFovStencilMeshBuffer *meshBuffer = (ovrFovStencilMeshBuffer *)(uintptr_t)meshBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetFovStencil(session, fovStencilDesc, meshBuffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1WaitToBeginFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_WaitToBeginFrame(session, (long long)frameIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1BeginFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_BeginFrame(session, (long long)frameIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1EndFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrViewScaleDesc const *viewScaleDesc = (ovrViewScaleDesc const *)(uintptr_t)viewScaleDescAddress;
    ovrLayerHeader const * const *layerPtrList = (ovrLayerHeader const * const *)(uintptr_t)layerPtrListAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_EndFrame(session, (long long)frameIndex, viewScaleDesc, layerPtrList, (unsigned int)layerCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1SubmitFrame(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex, jlong viewScaleDescAddress, jlong layerPtrListAddress, jint layerCount) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrViewScaleDesc const *viewScaleDesc = (ovrViewScaleDesc const *)(uintptr_t)viewScaleDescAddress;
    ovrLayerHeader const * const *layerPtrList = (ovrLayerHeader const * const *)(uintptr_t)layerPtrListAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SubmitFrame(session, (long long)frameIndex, viewScaleDesc, layerPtrList, (unsigned int)layerCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetPerfStats(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong outStatsAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrPerfStats *outStats = (ovrPerfStats *)(uintptr_t)outStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetPerfStats(session, outStats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1ResetPerfStats(JNIEnv *__env, jclass clazz, jlong sessionAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_ResetPerfStats(session);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetPredictedDisplayTime(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong frameIndex) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)ovr_GetPredictedDisplayTime(session, (long long)frameIndex);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_ovr_OVR_ovr_1GetTimeInSeconds(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)ovr_GetTimeInSeconds();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBool(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jboolean defaultVal) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)ovr_GetBool(session, propertyName, (ovrBool)defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetBool(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jboolean value) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)ovr_SetBool(session, propertyName, (ovrBool)value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetInt(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jint defaultVal) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetInt(session, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetInt(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jint value) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)ovr_SetInt(session, propertyName, value);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloat(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloat defaultVal) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)ovr_GetFloat(session, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloat(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloat value) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)ovr_SetFloat(session, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJJI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesCapacity) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    float *values = (float *)(uintptr_t)valuesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetFloatArray(session, propertyName, values, (unsigned int)valuesCapacity);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJJI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong valuesAddress, jint valuesSize) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    float *values = (float *)(uintptr_t)valuesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)ovr_SetFloatArray(session, propertyName, values, (unsigned int)valuesSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetString(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jlong defaultValAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    char const *defaultVal = (char const *)(uintptr_t)defaultValAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)ovr_GetString(session, propertyName, defaultVal);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetString(JNIEnv *__env, jclass clazz, jlong hmddescAddress, jlong propertyNameAddress, jlong valueAddress) {
    ovrSession hmddesc = (ovrSession)(uintptr_t)hmddescAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    char const *value = (char const *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)ovr_SetString(hmddesc, propertyName, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetDevicePoses__J_3IIDJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jintArray deviceTypesAddress, jint deviceCount, jdouble absTime, jlong outDevicePosesAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrPoseStatef *outDevicePoses = (ovrPoseStatef *)(uintptr_t)outDevicePosesAddress;
    jint __result;
    jint *deviceTypes = (*__env)->GetIntArrayElements(__env, deviceTypesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetDevicePoses(session, (ovrTrackedDeviceType *)deviceTypes, deviceCount, absTime, outDevicePoses);
    (*__env)->ReleaseIntArrayElements(__env, deviceTypesAddress, deviceTypes, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetBoundaryGeometry__JIJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jint boundaryType, jlong outFloorPointsAddress, jintArray outFloorPointsCountAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrVector3f *outFloorPoints = (ovrVector3f *)(uintptr_t)outFloorPointsAddress;
    jint __result;
    jint *outFloorPointsCount = outFloorPointsCountAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, outFloorPointsCountAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetBoundaryGeometry(session, (ovrBoundaryType)boundaryType, outFloorPoints, (int *)outFloorPointsCount);
    if (outFloorPointsCount != NULL) { (*__env)->ReleaseIntArrayElements(__env, outFloorPointsCountAddress, outFloorPointsCount, 0); }
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetExternalCameras__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong camerasAddress, jintArray inoutCameraCountAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrExternalCamera *cameras = (ovrExternalCamera *)(uintptr_t)camerasAddress;
    jint __result;
    jint *inoutCameraCount = (*__env)->GetIntArrayElements(__env, inoutCameraCountAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetExternalCameras(session, cameras, (unsigned int *)inoutCameraCount);
    (*__env)->ReleaseIntArrayElements(__env, inoutCameraCountAddress, inoutCameraCount, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainLength__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jintArray out_LengthAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    jint __result;
    jint *out_Length = (*__env)->GetIntArrayElements(__env, out_LengthAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetTextureSwapChainLength(session, chain, (int *)out_Length);
    (*__env)->ReleaseIntArrayElements(__env, out_LengthAddress, out_Length, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetTextureSwapChainCurrentIndex__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jintArray out_IndexAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    jint __result;
    jint *out_Index = (*__env)->GetIntArrayElements(__env, out_IndexAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetTextureSwapChainCurrentIndex(session, chain, (int *)out_Index);
    (*__env)->ReleaseIntArrayElements(__env, out_IndexAddress, out_Index, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVR_novr_1GetFloatArray__JJ_3FI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloatArray valuesAddress, jint valuesCapacity) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    jint __result;
    jfloat *values = (*__env)->GetFloatArrayElements(__env, valuesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetFloatArray(session, propertyName, (float *)values, (unsigned int)valuesCapacity);
    (*__env)->ReleaseFloatArrayElements(__env, valuesAddress, values, 0);
    return __result;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_ovr_OVR_novr_1SetFloatArray__JJ_3FI(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong propertyNameAddress, jfloatArray valuesAddress, jint valuesSize) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    char const *propertyName = (char const *)(uintptr_t)propertyNameAddress;
    jboolean __result;
    jfloat *values = (*__env)->GetFloatArrayElements(__env, valuesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jboolean)ovr_SetFloatArray(session, propertyName, (float *)values, (unsigned int)valuesSize);
    (*__env)->ReleaseFloatArrayElements(__env, valuesAddress, values, 0);
    return __result;
}

EXTERN_C_EXIT
