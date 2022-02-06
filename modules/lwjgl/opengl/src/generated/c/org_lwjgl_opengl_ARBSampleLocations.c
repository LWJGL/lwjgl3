/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glFramebufferSampleLocationsfvARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedFramebufferSampleLocationsfvARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glEvaluateDepthValuesARBPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleLocations_nglFramebufferSampleLocationsfvARB__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint start, jint count, jlong vAddress) {
    glFramebufferSampleLocationsfvARBPROC glFramebufferSampleLocationsfvARB = (glFramebufferSampleLocationsfvARBPROC)tlsGetFunction(1312);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glFramebufferSampleLocationsfvARB(target, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleLocations_nglNamedFramebufferSampleLocationsfvARB__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint start, jint count, jlong vAddress) {
    glNamedFramebufferSampleLocationsfvARBPROC glNamedFramebufferSampleLocationsfvARB = (glNamedFramebufferSampleLocationsfvARBPROC)tlsGetFunction(1313);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glNamedFramebufferSampleLocationsfvARB(framebuffer, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleLocations_glEvaluateDepthValuesARB(JNIEnv *__env, jclass clazz) {
    glEvaluateDepthValuesARBPROC glEvaluateDepthValuesARB = (glEvaluateDepthValuesARBPROC)tlsGetFunction(1314);
    UNUSED_PARAM(clazz)
    glEvaluateDepthValuesARB();
}

EXTERN_C_EXIT
