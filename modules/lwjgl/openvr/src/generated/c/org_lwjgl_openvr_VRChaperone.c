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

typedef struct HmdColor_t
{
	float r;
	float g;
	float b;
	float a;
} HmdColor_t;

typedef void (APIENTRY *VRChaperone_SetSceneColorPROC) (HmdColor_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRChaperone_nVRChaperone_1SetSceneColor(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __functionAddress) {
    VRChaperone_SetSceneColorPROC VRChaperone_SetSceneColor = (VRChaperone_SetSceneColorPROC)(uintptr_t)__functionAddress;
    HmdColor_t *color = (HmdColor_t *)(uintptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    VRChaperone_SetSceneColor(*color);
}

EXTERN_C_EXIT
