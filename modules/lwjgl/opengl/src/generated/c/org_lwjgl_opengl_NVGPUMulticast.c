/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glRenderGpuMaskNVPROC) (jint);
typedef void (APIENTRY *glMulticastBufferSubDataNVPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glMulticastCopyBufferSubDataNVPROC) (jint, jint, jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glMulticastCopyImageSubDataNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glMulticastBlitFramebufferNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glMulticastFramebufferSampleLocationsfvNVPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMulticastBarrierNVPROC) (void);
typedef void (APIENTRY *glMulticastWaitSyncNVPROC) (jint, jint);
typedef void (APIENTRY *glMulticastGetQueryObjectivNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMulticastGetQueryObjectuivNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMulticastGetQueryObjecti64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glMulticastGetQueryObjectui64vNVPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_glRenderGpuMaskNV(JNIEnv *__env, jclass clazz, jint mask) {
    glRenderGpuMaskNVPROC glRenderGpuMaskNV = (glRenderGpuMaskNVPROC)tlsGetFunction(1935);
    UNUSED_PARAM(clazz)
    glRenderGpuMaskNV(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_nglMulticastBufferSubDataNV__IIJJJ(JNIEnv *__env, jclass clazz, jint gpuMask, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glMulticastBufferSubDataNVPROC glMulticastBufferSubDataNV = (glMulticastBufferSubDataNVPROC)tlsGetFunction(1936);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glMulticastBufferSubDataNV(gpuMask, buffer, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_glMulticastCopyBufferSubDataNV(JNIEnv *__env, jclass clazz, jint readGpu, jint writeGpuMask, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size) {
    glMulticastCopyBufferSubDataNVPROC glMulticastCopyBufferSubDataNV = (glMulticastCopyBufferSubDataNVPROC)tlsGetFunction(1937);
    UNUSED_PARAM(clazz)
    glMulticastCopyBufferSubDataNV(readGpu, writeGpuMask, readBuffer, writeBuffer, (intptr_t)readOffset, (intptr_t)writeOffset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_glMulticastCopyImageSubDataNV(JNIEnv *__env, jclass clazz, jint srcGpu, jint dstGpuMask, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srxY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth) {
    glMulticastCopyImageSubDataNVPROC glMulticastCopyImageSubDataNV = (glMulticastCopyImageSubDataNVPROC)tlsGetFunction(1938);
    UNUSED_PARAM(clazz)
    glMulticastCopyImageSubDataNV(srcGpu, dstGpuMask, srcName, srcTarget, srcLevel, srcX, srxY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_glMulticastBlitFramebufferNV(JNIEnv *__env, jclass clazz, jint srcGpu, jint dstGpu, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glMulticastBlitFramebufferNVPROC glMulticastBlitFramebufferNV = (glMulticastBlitFramebufferNVPROC)tlsGetFunction(1939);
    UNUSED_PARAM(clazz)
    glMulticastBlitFramebufferNV(srcGpu, dstGpu, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_nglMulticastFramebufferSampleLocationsfvNV__IIIIJ(JNIEnv *__env, jclass clazz, jint gpu, jint framebuffer, jint start, jint count, jlong vAddress) {
    glMulticastFramebufferSampleLocationsfvNVPROC glMulticastFramebufferSampleLocationsfvNV = (glMulticastFramebufferSampleLocationsfvNVPROC)tlsGetFunction(1940);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glMulticastFramebufferSampleLocationsfvNV(gpu, framebuffer, start, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_glMulticastBarrierNV(JNIEnv *__env, jclass clazz) {
    glMulticastBarrierNVPROC glMulticastBarrierNV = (glMulticastBarrierNVPROC)tlsGetFunction(1941);
    UNUSED_PARAM(clazz)
    glMulticastBarrierNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_glMulticastWaitSyncNV(JNIEnv *__env, jclass clazz, jint signalGpu, jint waitGpuMask) {
    glMulticastWaitSyncNVPROC glMulticastWaitSyncNV = (glMulticastWaitSyncNVPROC)tlsGetFunction(1942);
    UNUSED_PARAM(clazz)
    glMulticastWaitSyncNV(signalGpu, waitGpuMask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_nglMulticastGetQueryObjectivNV__IIIJ(JNIEnv *__env, jclass clazz, jint gpu, jint id, jint pname, jlong paramsAddress) {
    glMulticastGetQueryObjectivNVPROC glMulticastGetQueryObjectivNV = (glMulticastGetQueryObjectivNVPROC)tlsGetFunction(1943);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMulticastGetQueryObjectivNV(gpu, id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_nglMulticastGetQueryObjectuivNV__IIIJ(JNIEnv *__env, jclass clazz, jint gpu, jint id, jint pname, jlong paramsAddress) {
    glMulticastGetQueryObjectuivNVPROC glMulticastGetQueryObjectuivNV = (glMulticastGetQueryObjectuivNVPROC)tlsGetFunction(1944);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMulticastGetQueryObjectuivNV(gpu, id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_nglMulticastGetQueryObjecti64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint gpu, jint id, jint pname, jlong paramsAddress) {
    glMulticastGetQueryObjecti64vNVPROC glMulticastGetQueryObjecti64vNV = (glMulticastGetQueryObjecti64vNVPROC)tlsGetFunction(1945);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMulticastGetQueryObjecti64vNV(gpu, id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVGPUMulticast_nglMulticastGetQueryObjectui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint gpu, jint id, jint pname, jlong paramsAddress) {
    glMulticastGetQueryObjectui64vNVPROC glMulticastGetQueryObjectui64vNV = (glMulticastGetQueryObjectui64vNVPROC)tlsGetFunction(1946);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMulticastGetQueryObjectui64vNV(gpu, id, pname, params);
}

EXTERN_C_EXIT
