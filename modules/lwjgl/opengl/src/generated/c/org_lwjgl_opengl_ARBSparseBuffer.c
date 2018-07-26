/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferPageCommitmentARBPROC) (jint, intptr_t, intptr_t, jboolean);
typedef void (APIENTRY *glNamedBufferPageCommitmentEXTPROC) (jint, intptr_t, intptr_t, jboolean);
typedef void (APIENTRY *glNamedBufferPageCommitmentARBPROC) (jint, intptr_t, intptr_t, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_glBufferPageCommitmentARB(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong size, jboolean commit) {
    glBufferPageCommitmentARBPROC glBufferPageCommitmentARB = (glBufferPageCommitmentARBPROC)tlsGetFunction(1327);
    UNUSED_PARAM(clazz)
    glBufferPageCommitmentARB(target, (intptr_t)offset, (intptr_t)size, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_glNamedBufferPageCommitmentEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jboolean commit) {
    glNamedBufferPageCommitmentEXTPROC glNamedBufferPageCommitmentEXT = (glNamedBufferPageCommitmentEXTPROC)tlsGetFunction(1328);
    UNUSED_PARAM(clazz)
    glNamedBufferPageCommitmentEXT(buffer, (intptr_t)offset, (intptr_t)size, commit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSparseBuffer_glNamedBufferPageCommitmentARB(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jboolean commit) {
    glNamedBufferPageCommitmentARBPROC glNamedBufferPageCommitmentARB = (glNamedBufferPageCommitmentARBPROC)tlsGetFunction(1329);
    UNUSED_PARAM(clazz)
    glNamedBufferPageCommitmentARB(buffer, (intptr_t)offset, (intptr_t)size, commit);
}

EXTERN_C_EXIT
