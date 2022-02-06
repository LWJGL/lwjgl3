/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef uintptr_t (APIENTRY *glMapBufferRangeEXTPROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glFlushMappedBufferRangeEXTPROC) (jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_EXTMapBufferRange_nglMapBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access) {
    glMapBufferRangeEXTPROC glMapBufferRangeEXT = (glMapBufferRangeEXTPROC)tlsGetFunction(441);
    UNUSED_PARAM(clazz)
    return (jlong)glMapBufferRangeEXT(target, (uintptr_t)offset, (uintptr_t)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMapBufferRange_glFlushMappedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length) {
    glFlushMappedBufferRangeEXTPROC glFlushMappedBufferRangeEXT = (glFlushMappedBufferRangeEXTPROC)tlsGetFunction(442);
    UNUSED_PARAM(clazz)
    glFlushMappedBufferRangeEXT(target, (uintptr_t)offset, (uintptr_t)length);
}

EXTERN_C_EXIT
