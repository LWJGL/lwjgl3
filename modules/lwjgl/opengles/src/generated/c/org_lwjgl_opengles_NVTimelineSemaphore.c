/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glCreateSemaphoresNVPROC) (jint, intptr_t);
typedef void (APIENTRY *glSemaphoreParameterivNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSemaphoreParameterivNVPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTimelineSemaphore_nglCreateSemaphoresNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong semaphoresAddress) {
    glCreateSemaphoresNVPROC glCreateSemaphoresNV = (glCreateSemaphoresNVPROC)tlsGetFunction(763);
    intptr_t semaphores = (intptr_t)semaphoresAddress;
    UNUSED_PARAM(clazz)
    glCreateSemaphoresNV(n, semaphores);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTimelineSemaphore_nglSemaphoreParameterivNV__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glSemaphoreParameterivNVPROC glSemaphoreParameterivNV = (glSemaphoreParameterivNVPROC)tlsGetFunction(764);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSemaphoreParameterivNV(semaphore, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTimelineSemaphore_nglGetSemaphoreParameterivNV__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glGetSemaphoreParameterivNVPROC glGetSemaphoreParameterivNV = (glGetSemaphoreParameterivNVPROC)tlsGetFunction(765);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSemaphoreParameterivNV(semaphore, pname, params);
}

EXTERN_C_EXIT
