/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferPageCommitmentMemNVPROC) (jint, uintptr_t, uintptr_t, jint, jlong, jboolean);
typedef void (APIENTRY *glNamedBufferPageCommitmentMemNVPROC) (jint, uintptr_t, uintptr_t, jint, jlong, jboolean);
typedef void (APIENTRY *glTexPageCommitmentMemNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jlong, jboolean);
typedef void (APIENTRY *glTexturePageCommitmentMemNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jlong, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryObjectSparse_glBufferPageCommitmentMemNV(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jint memory, jlong memOffset, jboolean commit) {
    glBufferPageCommitmentMemNVPROC glBufferPageCommitmentMemNV = (glBufferPageCommitmentMemNVPROC)tlsGetFunction(2039);
    UNUSED_PARAM(clazz)
    glBufferPageCommitmentMemNV(target, (uintptr_t)offset, (uintptr_t)size, memory, memOffset, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryObjectSparse_glNamedBufferPageCommitmentMemNV(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jint memory, jlong memOffset, jboolean commit) {
    glNamedBufferPageCommitmentMemNVPROC glNamedBufferPageCommitmentMemNV = (glNamedBufferPageCommitmentMemNVPROC)tlsGetFunction(2040);
    UNUSED_PARAM(clazz)
    glNamedBufferPageCommitmentMemNV(buffer, (uintptr_t)offset, (uintptr_t)size, memory, memOffset, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryObjectSparse_glTexPageCommitmentMemNV(JNIEnv *__env, jclass clazz, jint target, jint layer, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint memory, jlong offset, jboolean commit) {
    glTexPageCommitmentMemNVPROC glTexPageCommitmentMemNV = (glTexPageCommitmentMemNVPROC)tlsGetFunction(2041);
    UNUSED_PARAM(clazz)
    glTexPageCommitmentMemNV(target, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryObjectSparse_glTexturePageCommitmentMemNV(JNIEnv *__env, jclass clazz, jint texture, jint layer, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint memory, jlong offset, jboolean commit) {
    glTexturePageCommitmentMemNVPROC glTexturePageCommitmentMemNV = (glTexturePageCommitmentMemNVPROC)tlsGetFunction(2042);
    UNUSED_PARAM(clazz)
    glTexturePageCommitmentMemNV(texture, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit);
}

EXTERN_C_EXIT
