/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindBuffersBasePROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glBindBuffersRangePROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glBindTexturesPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindSamplersPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindImageTexturesPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindVertexBuffersPROC) (jint, jint, intptr_t, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindBuffersBase__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress) {
    glBindBuffersBasePROC glBindBuffersBase = (glBindBuffersBasePROC)tlsGetFunction(916);
    intptr_t buffers = (intptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glBindBuffersBase(target, first, count, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindBuffersRange__IIIJJJ(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong sizesAddress) {
    glBindBuffersRangePROC glBindBuffersRange = (glBindBuffersRangePROC)tlsGetFunction(917);
    intptr_t buffers = (intptr_t)buffersAddress;
    intptr_t offsets = (intptr_t)offsetsAddress;
    intptr_t sizes = (intptr_t)sizesAddress;
    UNUSED_PARAM(clazz)
    glBindBuffersRange(target, first, count, buffers, offsets, sizes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindTextures__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress) {
    glBindTexturesPROC glBindTextures = (glBindTexturesPROC)tlsGetFunction(918);
    intptr_t textures = (intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glBindTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindSamplers__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong samplersAddress) {
    glBindSamplersPROC glBindSamplers = (glBindSamplersPROC)tlsGetFunction(919);
    intptr_t samplers = (intptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glBindSamplers(first, count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindImageTextures__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress) {
    glBindImageTexturesPROC glBindImageTextures = (glBindImageTexturesPROC)tlsGetFunction(920);
    intptr_t textures = (intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glBindImageTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultiBind_nglBindVertexBuffers__IIJJJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong stridesAddress) {
    glBindVertexBuffersPROC glBindVertexBuffers = (glBindVertexBuffersPROC)tlsGetFunction(921);
    intptr_t buffers = (intptr_t)buffersAddress;
    intptr_t offsets = (intptr_t)offsetsAddress;
    intptr_t strides = (intptr_t)stridesAddress;
    UNUSED_PARAM(clazz)
    glBindVertexBuffers(first, count, buffers, offsets, strides);
}

EXTERN_C_EXIT
