/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glCreateSemaphoresNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glSemaphoreParameterivNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetSemaphoreParameterivNVPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTimelineSemaphore_nglCreateSemaphoresNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong semaphoresAddress) {
    glCreateSemaphoresNVPROC glCreateSemaphoresNV = (glCreateSemaphoresNVPROC)tlsGetFunction(2153);
    uintptr_t semaphores = (uintptr_t)semaphoresAddress;
    UNUSED_PARAM(clazz)
    glCreateSemaphoresNV(n, semaphores);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTimelineSemaphore_nglSemaphoreParameterivNV__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glSemaphoreParameterivNVPROC glSemaphoreParameterivNV = (glSemaphoreParameterivNVPROC)tlsGetFunction(2154);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSemaphoreParameterivNV(semaphore, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTimelineSemaphore_nglGetSemaphoreParameterivNV__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glGetSemaphoreParameterivNVPROC glGetSemaphoreParameterivNV = (glGetSemaphoreParameterivNVPROC)tlsGetFunction(2155);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSemaphoreParameterivNV(semaphore, pname, params);
}

EXTERN_C_EXIT
