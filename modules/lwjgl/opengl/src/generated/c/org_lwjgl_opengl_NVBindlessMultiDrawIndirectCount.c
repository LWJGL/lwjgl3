/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectBindlessCountNVPROC) (jint, uintptr_t, uintptr_t, jint, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsIndirectBindlessCountNVPROC) (jint, jint, uintptr_t, uintptr_t, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirectCount_nglMultiDrawArraysIndirectBindlessCountNV(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong drawCount, jint maxDrawCount, jint stride, jint vertexBufferCount) {
    glMultiDrawArraysIndirectBindlessCountNVPROC glMultiDrawArraysIndirectBindlessCountNV = (glMultiDrawArraysIndirectBindlessCountNVPROC)tlsGetFunction(1909);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysIndirectBindlessCountNV(mode, indirect, (uintptr_t)drawCount, maxDrawCount, stride, vertexBufferCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirectCount_nglMultiDrawElementsIndirectBindlessCountNV(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong drawCount, jint maxDrawCount, jint stride, jint vertexBufferCount) {
    glMultiDrawElementsIndirectBindlessCountNVPROC glMultiDrawElementsIndirectBindlessCountNV = (glMultiDrawElementsIndirectBindlessCountNVPROC)tlsGetFunction(1910);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsIndirectBindlessCountNV(mode, type, indirect, (uintptr_t)drawCount, maxDrawCount, stride, vertexBufferCount);
}

EXTERN_C_EXIT
