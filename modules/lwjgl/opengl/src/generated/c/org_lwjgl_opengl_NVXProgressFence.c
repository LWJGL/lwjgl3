/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glCreateProgressFenceNVXPROC) (void);
typedef void (APIENTRY *glSignalSemaphoreui64NVXPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glWaitSemaphoreui64NVXPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glClientWaitSemaphoreui64NVXPROC) (jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVXProgressFence_glCreateProgressFenceNVX(JNIEnv *__env, jclass clazz) {
    glCreateProgressFenceNVXPROC glCreateProgressFenceNVX = (glCreateProgressFenceNVXPROC)tlsGetFunction(2217);
    UNUSED_PARAM(clazz)
    return (jint)glCreateProgressFenceNVX();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXProgressFence_nglSignalSemaphoreui64NVX__IIJJ(JNIEnv *__env, jclass clazz, jint signalGpu, jint fenceObjectCount, jlong semaphoreArrayAddress, jlong fenceValueArrayAddress) {
    glSignalSemaphoreui64NVXPROC glSignalSemaphoreui64NVX = (glSignalSemaphoreui64NVXPROC)tlsGetFunction(2218);
    uintptr_t semaphoreArray = (uintptr_t)semaphoreArrayAddress;
    uintptr_t fenceValueArray = (uintptr_t)fenceValueArrayAddress;
    UNUSED_PARAM(clazz)
    glSignalSemaphoreui64NVX(signalGpu, fenceObjectCount, semaphoreArray, fenceValueArray);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXProgressFence_nglWaitSemaphoreui64NVX__IIJJ(JNIEnv *__env, jclass clazz, jint waitGpu, jint fenceObjectCount, jlong semaphoreArrayAddress, jlong fenceValueArrayAddress) {
    glWaitSemaphoreui64NVXPROC glWaitSemaphoreui64NVX = (glWaitSemaphoreui64NVXPROC)tlsGetFunction(2219);
    uintptr_t semaphoreArray = (uintptr_t)semaphoreArrayAddress;
    uintptr_t fenceValueArray = (uintptr_t)fenceValueArrayAddress;
    UNUSED_PARAM(clazz)
    glWaitSemaphoreui64NVX(waitGpu, fenceObjectCount, semaphoreArray, fenceValueArray);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXProgressFence_nglClientWaitSemaphoreui64NVX__IJJ(JNIEnv *__env, jclass clazz, jint fenceObjectCount, jlong semaphoreArrayAddress, jlong fenceValueArrayAddress) {
    glClientWaitSemaphoreui64NVXPROC glClientWaitSemaphoreui64NVX = (glClientWaitSemaphoreui64NVXPROC)tlsGetFunction(2220);
    uintptr_t semaphoreArray = (uintptr_t)semaphoreArrayAddress;
    uintptr_t fenceValueArray = (uintptr_t)fenceValueArrayAddress;
    UNUSED_PARAM(clazz)
    glClientWaitSemaphoreui64NVX(fenceObjectCount, semaphoreArray, fenceValueArray);
}

EXTERN_C_EXIT
