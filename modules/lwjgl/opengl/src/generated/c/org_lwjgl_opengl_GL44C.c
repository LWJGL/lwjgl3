/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferStoragePROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glClearTexSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glClearTexImagePROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glBindBuffersBasePROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glBindBuffersRangePROC) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glBindTexturesPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glBindSamplersPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glBindImageTexturesPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glBindVertexBuffersPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglBufferStorage__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint flags) {
    glBufferStoragePROC glBufferStorage = (glBufferStoragePROC)tlsGetFunction(913);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferStorage(target, (uintptr_t)size, data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglClearTexSubImage__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong dataAddress) {
    glClearTexSubImagePROC glClearTexSubImage = (glClearTexSubImagePROC)tlsGetFunction(914);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglClearTexImage__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jlong dataAddress) {
    glClearTexImagePROC glClearTexImage = (glClearTexImagePROC)tlsGetFunction(915);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearTexImage(texture, level, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglBindBuffersBase__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress) {
    glBindBuffersBasePROC glBindBuffersBase = (glBindBuffersBasePROC)tlsGetFunction(916);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glBindBuffersBase(target, first, count, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglBindBuffersRange__IIIJJJ(JNIEnv *__env, jclass clazz, jint target, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong sizesAddress) {
    glBindBuffersRangePROC glBindBuffersRange = (glBindBuffersRangePROC)tlsGetFunction(917);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    uintptr_t offsets = (uintptr_t)offsetsAddress;
    uintptr_t sizes = (uintptr_t)sizesAddress;
    UNUSED_PARAM(clazz)
    glBindBuffersRange(target, first, count, buffers, offsets, sizes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglBindTextures__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress) {
    glBindTexturesPROC glBindTextures = (glBindTexturesPROC)tlsGetFunction(918);
    uintptr_t textures = (uintptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glBindTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglBindSamplers__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong samplersAddress) {
    glBindSamplersPROC glBindSamplers = (glBindSamplersPROC)tlsGetFunction(919);
    uintptr_t samplers = (uintptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glBindSamplers(first, count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglBindImageTextures__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong texturesAddress) {
    glBindImageTexturesPROC glBindImageTextures = (glBindImageTexturesPROC)tlsGetFunction(920);
    uintptr_t textures = (uintptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glBindImageTextures(first, count, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL44C_nglBindVertexBuffers__IIJJJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong stridesAddress) {
    glBindVertexBuffersPROC glBindVertexBuffers = (glBindVertexBuffersPROC)tlsGetFunction(921);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    uintptr_t offsets = (uintptr_t)offsetsAddress;
    uintptr_t strides = (uintptr_t)stridesAddress;
    UNUSED_PARAM(clazz)
    glBindVertexBuffers(first, count, buffers, offsets, strides);
}

EXTERN_C_EXIT
