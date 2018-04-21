/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef intptr_t (APIENTRY *glMapBufferRangePROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glFlushMappedBufferRangePROC) (jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBMapBufferRange_nglMapBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access) {
    glMapBufferRangePROC glMapBufferRange = (glMapBufferRangePROC)tlsGetFunction(592);
    UNUSED_PARAM(clazz)
    return (jlong)glMapBufferRange(target, (intptr_t)offset, (intptr_t)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMapBufferRange_glFlushMappedBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length) {
    glFlushMappedBufferRangePROC glFlushMappedBufferRange = (glFlushMappedBufferRangePROC)tlsGetFunction(593);
    UNUSED_PARAM(clazz)
    glFlushMappedBufferRange(target, (intptr_t)offset, (intptr_t)length);
}

EXTERN_C_EXIT
