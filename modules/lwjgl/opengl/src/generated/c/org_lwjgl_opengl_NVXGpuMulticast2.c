/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glAsyncCopyImageSubDataNVXPROC) (jint, uintptr_t, uintptr_t, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t, uintptr_t);
typedef uintptr_t (APIENTRY *glAsyncCopyBufferSubDataNVXPROC) (jint, uintptr_t, uintptr_t, jint, jint, jint, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glUploadGpuMaskNVXPROC) (jint);
typedef void (APIENTRY *glMulticastViewportArrayvNVXPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMulticastScissorArrayvNVXPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMulticastViewportPositionWScaleNVXPROC) (jint, jint, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVXGpuMulticast2_nglAsyncCopyImageSubDataNVX__IJJIIIIIIIIIIIIIIIIIIJJ(JNIEnv *__env, jclass clazz, jint waitSemaphoreCount, jlong waitSemaphoreArrayAddress, jlong waitValueArrayAddress, jint srcGpu, jint dstGpuMask, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth, jint signalSemaphoreCount, jlong signalSemaphoreArrayAddress, jlong signalValueArrayAddress) {
    glAsyncCopyImageSubDataNVXPROC glAsyncCopyImageSubDataNVX = (glAsyncCopyImageSubDataNVXPROC)tlsGetFunction(2211);
    uintptr_t waitSemaphoreArray = (uintptr_t)waitSemaphoreArrayAddress;
    uintptr_t waitValueArray = (uintptr_t)waitValueArrayAddress;
    uintptr_t signalSemaphoreArray = (uintptr_t)signalSemaphoreArrayAddress;
    uintptr_t signalValueArray = (uintptr_t)signalValueArrayAddress;
    UNUSED_PARAM(clazz)
    return (jint)glAsyncCopyImageSubDataNVX(waitSemaphoreCount, waitSemaphoreArray, waitValueArray, srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth, signalSemaphoreCount, signalSemaphoreArray, signalValueArray);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_NVXGpuMulticast2_nglAsyncCopyBufferSubDataNVX__IJJIIIIJJJIJJ(JNIEnv *__env, jclass clazz, jint waitSemaphoreCount, jlong waitSemaphoreArrayAddress, jlong fenceValueArrayAddress, jint readGpu, jint writeGpuMask, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size, jint signalSemaphoreCount, jlong signalSemaphoreArrayAddress, jlong signalValueArrayAddress) {
    glAsyncCopyBufferSubDataNVXPROC glAsyncCopyBufferSubDataNVX = (glAsyncCopyBufferSubDataNVXPROC)tlsGetFunction(2212);
    uintptr_t waitSemaphoreArray = (uintptr_t)waitSemaphoreArrayAddress;
    uintptr_t fenceValueArray = (uintptr_t)fenceValueArrayAddress;
    uintptr_t signalSemaphoreArray = (uintptr_t)signalSemaphoreArrayAddress;
    uintptr_t signalValueArray = (uintptr_t)signalValueArrayAddress;
    UNUSED_PARAM(clazz)
    return (jlong)glAsyncCopyBufferSubDataNVX(waitSemaphoreCount, waitSemaphoreArray, fenceValueArray, readGpu, writeGpuMask, readBuffer, writeBuffer, (uintptr_t)readOffset, (uintptr_t)writeOffset, (uintptr_t)size, signalSemaphoreCount, signalSemaphoreArray, signalValueArray);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXGpuMulticast2_glUploadGpuMaskNVX(JNIEnv *__env, jclass clazz, jint mask) {
    glUploadGpuMaskNVXPROC glUploadGpuMaskNVX = (glUploadGpuMaskNVXPROC)tlsGetFunction(2213);
    UNUSED_PARAM(clazz)
    glUploadGpuMaskNVX(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXGpuMulticast2_nglMulticastViewportArrayvNVX__IIIJ(JNIEnv *__env, jclass clazz, jint gpu, jint first, jint count, jlong vAddress) {
    glMulticastViewportArrayvNVXPROC glMulticastViewportArrayvNVX = (glMulticastViewportArrayvNVXPROC)tlsGetFunction(2214);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMulticastViewportArrayvNVX(gpu, first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXGpuMulticast2_nglMulticastScissorArrayvNVX__IIIJ(JNIEnv *__env, jclass clazz, jint gpu, jint first, jint count, jlong vAddress) {
    glMulticastScissorArrayvNVXPROC glMulticastScissorArrayvNVX = (glMulticastScissorArrayvNVXPROC)tlsGetFunction(2215);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMulticastScissorArrayvNVX(gpu, first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXGpuMulticast2_glMulticastViewportPositionWScaleNVX(JNIEnv *__env, jclass clazz, jint gpu, jint index, jfloat xcoeff, jfloat ycoeff) {
    glMulticastViewportPositionWScaleNVXPROC glMulticastViewportPositionWScaleNVX = (glMulticastViewportPositionWScaleNVXPROC)tlsGetFunction(2216);
    UNUSED_PARAM(clazz)
    glMulticastViewportPositionWScaleNVX(gpu, index, xcoeff, ycoeff);
}

EXTERN_C_EXIT
