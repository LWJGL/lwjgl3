/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stdint.h>

#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdMatrix34_t
{
    float m[3][4];
} HmdMatrix34_t;

typedef struct HmdMatrix44_t
{
    float m[4][4];
} HmdMatrix44_t;

typedef struct HmdVector2_t
{
    float v[2];
} HmdVector2_t;

typedef struct HmdColor_t
{
    float r;
    float g;
    float b;
    float a;
} HmdColor_t;

typedef struct HiddenAreaMesh_t
{
    struct HmdVector2_t * pVertexData;
    uint32_t unTriangleCount;
    #ifdef LWJGL_x64
        char __padding[4];
    #endif
} HiddenAreaMesh_t;

typedef HmdMatrix44_t (APIENTRY *VRSystem_GetProjectionMatrixPROC) (jint, jfloat, jfloat);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetEyeToHeadTransformPROC) (jint);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPosePROC) (void);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPosePROC) (void);
typedef HmdMatrix34_t (APIENTRY *VRSystem_GetMatrix34TrackedDevicePropertyPROC) (jint, jint, uintptr_t);
typedef HiddenAreaMesh_t (APIENTRY *VRSystem_GetHiddenAreaMeshPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetProjectionMatrix(JNIEnv *__env, jclass clazz, jint eEye, jfloat fNearZ, jfloat fFarZ, jlong __functionAddress, jlong __result) {
    VRSystem_GetProjectionMatrixPROC VRSystem_GetProjectionMatrix = (VRSystem_GetProjectionMatrixPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((HmdMatrix44_t*)(uintptr_t)__result) = VRSystem_GetProjectionMatrix(eEye, fNearZ, fFarZ);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetEyeToHeadTransform(JNIEnv *__env, jclass clazz, jint eEye, jlong __functionAddress, jlong __result) {
    VRSystem_GetEyeToHeadTransformPROC VRSystem_GetEyeToHeadTransform = (VRSystem_GetEyeToHeadTransformPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((HmdMatrix34_t*)(uintptr_t)__result) = VRSystem_GetEyeToHeadTransform(eEye);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetSeatedZeroPoseToStandingAbsoluteTrackingPose(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPosePROC VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose = (VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPosePROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((HmdMatrix34_t*)(uintptr_t)__result) = VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose();
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetRawZeroPoseToStandingAbsoluteTrackingPose(JNIEnv *__env, jclass clazz, jlong __functionAddress, jlong __result) {
    VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPosePROC VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose = (VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPosePROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((HmdMatrix34_t*)(uintptr_t)__result) = VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose();
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetMatrix34TrackedDeviceProperty(JNIEnv *__env, jclass clazz, jint unDeviceIndex, jint prop, jlong pErrorAddress, jlong __functionAddress, jlong __result) {
    VRSystem_GetMatrix34TrackedDevicePropertyPROC VRSystem_GetMatrix34TrackedDeviceProperty = (VRSystem_GetMatrix34TrackedDevicePropertyPROC)(uintptr_t)__functionAddress;
    uintptr_t pError = (uintptr_t)pErrorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((HmdMatrix34_t*)(uintptr_t)__result) = VRSystem_GetMatrix34TrackedDeviceProperty(unDeviceIndex, prop, pError);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRSystem_nVRSystem_1GetHiddenAreaMesh(JNIEnv *__env, jclass clazz, jint eEye, jint type, jlong __functionAddress, jlong __result) {
    VRSystem_GetHiddenAreaMeshPROC VRSystem_GetHiddenAreaMesh = (VRSystem_GetHiddenAreaMeshPROC)(uintptr_t)__functionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((HiddenAreaMesh_t*)(uintptr_t)__result) = VRSystem_GetHiddenAreaMesh(eEye, type);
}

EXTERN_C_EXIT
