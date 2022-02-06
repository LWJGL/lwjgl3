/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdVector2_t
{
    float v[2];
} HmdVector2_t;

typedef struct HmdRect2_t
{
	struct HmdVector2_t vTopLeft;
	struct HmdVector2_t vBottomRight;
} HmdRect2_t;

typedef jint (APIENTRY *VROverlay_GetTransformForOverlayCoordinatesPROC) (jlong, jint, HmdVector2_t, uintptr_t);
typedef void (APIENTRY *VROverlay_SetKeyboardPositionForOverlayPROC) (jlong, HmdRect2_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_openvr_VROverlay_nVROverlay_1GetTransformForOverlayCoordinates(JNIEnv *__env, jclass clazz, jlong ulOverlayHandle, jint eTrackingOrigin, jlong coordinatesInOverlayAddress, jlong pmatTransformAddress, jlong __functionAddress) {
    VROverlay_GetTransformForOverlayCoordinatesPROC VROverlay_GetTransformForOverlayCoordinates = (VROverlay_GetTransformForOverlayCoordinatesPROC)(uintptr_t)__functionAddress;
    HmdVector2_t *coordinatesInOverlay = (HmdVector2_t *)(uintptr_t)coordinatesInOverlayAddress;
    uintptr_t pmatTransform = (uintptr_t)pmatTransformAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)VROverlay_GetTransformForOverlayCoordinates(ulOverlayHandle, eTrackingOrigin, *coordinatesInOverlay, pmatTransform);
}

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VROverlay_nVROverlay_1SetKeyboardPositionForOverlay(JNIEnv *__env, jclass clazz, jlong ulOverlayHandle, jlong avoidRectAddress, jlong __functionAddress) {
    VROverlay_SetKeyboardPositionForOverlayPROC VROverlay_SetKeyboardPositionForOverlay = (VROverlay_SetKeyboardPositionForOverlayPROC)(uintptr_t)__functionAddress;
    HmdRect2_t *avoidRect = (HmdRect2_t *)(uintptr_t)avoidRectAddress;
    UNUSED_PARAMS(__env, clazz)
    VROverlay_SetKeyboardPositionForOverlay(ulOverlayHandle, *avoidRect);
}

EXTERN_C_EXIT
