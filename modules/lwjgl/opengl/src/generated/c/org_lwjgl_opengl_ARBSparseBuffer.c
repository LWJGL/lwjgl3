/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferPageCommitmentARBPROC) (jint, uintptr_t, uintptr_t, jboolean);
typedef void (APIENTRY *glNamedBufferPageCommitmentEXTPROC) (jint, uintptr_t, uintptr_t, jboolean);
typedef void (APIENTRY *glNamedBufferPageCommitmentARBPROC) (jint, uintptr_t, uintptr_t, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_glBufferPageCommitmentARB(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jboolean commit) {
    glBufferPageCommitmentARBPROC glBufferPageCommitmentARB = (glBufferPageCommitmentARBPROC)tlsGetFunction(1361);
    UNUSED_PARAM(clazz)
    glBufferPageCommitmentARB(target, (uintptr_t)offset, (uintptr_t)size, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_glNamedBufferPageCommitmentEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jboolean commit) {
    glNamedBufferPageCommitmentEXTPROC glNamedBufferPageCommitmentEXT = (glNamedBufferPageCommitmentEXTPROC)tlsGetFunction(1362);
    UNUSED_PARAM(clazz)
    glNamedBufferPageCommitmentEXT(buffer, (uintptr_t)offset, (uintptr_t)size, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_glNamedBufferPageCommitmentARB(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jboolean commit) {
    glNamedBufferPageCommitmentARBPROC glNamedBufferPageCommitmentARB = (glNamedBufferPageCommitmentARBPROC)tlsGetFunction(1363);
    UNUSED_PARAM(clazz)
    glNamedBufferPageCommitmentARB(buffer, (uintptr_t)offset, (uintptr_t)size, commit);
}

EXTERN_C_EXIT
