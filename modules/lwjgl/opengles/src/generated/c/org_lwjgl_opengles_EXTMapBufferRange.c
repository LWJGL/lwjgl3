/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef intptr_t (APIENTRY *glMapBufferRangeEXTPROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glFlushMappedBufferRangeEXTPROC) (jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_EXTMapBufferRange_nglMapBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access) {
    glMapBufferRangeEXTPROC glMapBufferRangeEXT = (glMapBufferRangeEXTPROC)tlsGetFunction(434);
    UNUSED_PARAM(clazz)
    return (jlong)glMapBufferRangeEXT(target, (intptr_t)offset, (intptr_t)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMapBufferRange_glFlushMappedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length) {
    glFlushMappedBufferRangeEXTPROC glFlushMappedBufferRangeEXT = (glFlushMappedBufferRangeEXTPROC)tlsGetFunction(435);
    UNUSED_PARAM(clazz)
    glFlushMappedBufferRangeEXT(target, (intptr_t)offset, (intptr_t)length);
}

EXTERN_C_EXIT
