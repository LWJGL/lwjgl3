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

typedef HmdColor_t (APIENTRY *VRCompositor_GetCurrentFadeColorPROC) (jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_openvr_VRCompositor_nVRCompositor_1GetCurrentFadeColor(jboolean bBackground, jlong __functionAddress, jlong __result) {
    VRCompositor_GetCurrentFadeColorPROC VRCompositor_GetCurrentFadeColor = (VRCompositor_GetCurrentFadeColorPROC)(intptr_t)__functionAddress;
    *((HmdColor_t*)(intptr_t)__result) = VRCompositor_GetCurrentFadeColor(bBackground);
}
JNIEXPORT void JNICALL Java_org_lwjgl_openvr_VRCompositor_nVRCompositor_1GetCurrentFadeColor(JNIEnv *__env, jclass clazz, jboolean bBackground, jlong __functionAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_openvr_VRCompositor_nVRCompositor_1GetCurrentFadeColor(bBackground, __functionAddress, __result);
}

EXTERN_C_EXIT
