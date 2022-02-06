/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawArraysInstancedEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glDrawElementsInstancedEXTPROC) (jint, jint, jint, uintptr_t, jint);
typedef void (APIENTRY *glVertexAttribDivisorEXTPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTInstancedArrays_glDrawArraysInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint start, jint count, jint primcount) {
    glDrawArraysInstancedEXTPROC glDrawArraysInstancedEXT = (glDrawArraysInstancedEXTPROC)tlsGetFunction(431);
    UNUSED_PARAM(clazz)
    glDrawArraysInstancedEXT(mode, start, count, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTInstancedArrays_nglDrawElementsInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint primcount) {
    glDrawElementsInstancedEXTPROC glDrawElementsInstancedEXT = (glDrawElementsInstancedEXTPROC)tlsGetFunction(432);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedEXT(mode, count, type, indices, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTInstancedArrays_glVertexAttribDivisorEXT(JNIEnv *__env, jclass clazz, jint index, jint divisor) {
    glVertexAttribDivisorEXTPROC glVertexAttribDivisorEXT = (glVertexAttribDivisorEXTPROC)tlsGetFunction(440);
    UNUSED_PARAM(clazz)
    glVertexAttribDivisorEXT(index, divisor);
}

EXTERN_C_EXIT
