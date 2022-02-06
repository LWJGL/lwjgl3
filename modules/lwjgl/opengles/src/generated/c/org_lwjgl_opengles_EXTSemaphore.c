/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGenSemaphoresEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDeleteSemaphoresEXTPROC) (jint, uintptr_t);
typedef jboolean (APIENTRY *glIsSemaphoreEXTPROC) (jint);
typedef void (APIENTRY *glSemaphoreParameterui64vEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetSemaphoreParameterui64vEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glWaitSemaphoreEXTPROC) (jint, jint, uintptr_t, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glSignalSemaphoreEXTPROC) (jint, jint, uintptr_t, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglGenSemaphoresEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong semaphoresAddress) {
    glGenSemaphoresEXTPROC glGenSemaphoresEXT = (glGenSemaphoresEXTPROC)tlsGetFunction(479);
    uintptr_t semaphores = (uintptr_t)semaphoresAddress;
    UNUSED_PARAM(clazz)
    glGenSemaphoresEXT(n, semaphores);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglDeleteSemaphoresEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong semaphoresAddress) {
    glDeleteSemaphoresEXTPROC glDeleteSemaphoresEXT = (glDeleteSemaphoresEXTPROC)tlsGetFunction(480);
    uintptr_t semaphores = (uintptr_t)semaphoresAddress;
    UNUSED_PARAM(clazz)
    glDeleteSemaphoresEXT(n, semaphores);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTSemaphore_glIsSemaphoreEXT(JNIEnv *__env, jclass clazz, jint semaphore) {
    glIsSemaphoreEXTPROC glIsSemaphoreEXT = (glIsSemaphoreEXTPROC)tlsGetFunction(481);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSemaphoreEXT(semaphore);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglSemaphoreParameterui64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glSemaphoreParameterui64vEXTPROC glSemaphoreParameterui64vEXT = (glSemaphoreParameterui64vEXTPROC)tlsGetFunction(482);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSemaphoreParameterui64vEXT(semaphore, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglGetSemaphoreParameterui64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint semaphore, jint pname, jlong paramsAddress) {
    glGetSemaphoreParameterui64vEXTPROC glGetSemaphoreParameterui64vEXT = (glGetSemaphoreParameterui64vEXTPROC)tlsGetFunction(483);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSemaphoreParameterui64vEXT(semaphore, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglWaitSemaphoreEXT__IIJIJJ(JNIEnv *__env, jclass clazz, jint semaphore, jint numBufferBarriers, jlong buffersAddress, jint numTextureBarriers, jlong texturesAddress, jlong srcLayoutsAddress) {
    glWaitSemaphoreEXTPROC glWaitSemaphoreEXT = (glWaitSemaphoreEXTPROC)tlsGetFunction(484);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    uintptr_t textures = (uintptr_t)texturesAddress;
    uintptr_t srcLayouts = (uintptr_t)srcLayoutsAddress;
    UNUSED_PARAM(clazz)
    glWaitSemaphoreEXT(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphore_nglSignalSemaphoreEXT__IIJIJJ(JNIEnv *__env, jclass clazz, jint semaphore, jint numBufferBarriers, jlong buffersAddress, jint numTextureBarriers, jlong texturesAddress, jlong dstLayoutsAddress) {
    glSignalSemaphoreEXTPROC glSignalSemaphoreEXT = (glSignalSemaphoreEXTPROC)tlsGetFunction(485);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    uintptr_t textures = (uintptr_t)texturesAddress;
    uintptr_t dstLayouts = (uintptr_t)dstLayoutsAddress;
    UNUSED_PARAM(clazz)
    glSignalSemaphoreEXT(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts);
}

EXTERN_C_EXIT
