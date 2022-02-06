/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectBindlessNVPROC) (jint, uintptr_t, jint, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsIndirectBindlessNVPROC) (jint, jint, uintptr_t, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirect_nglMultiDrawArraysIndirectBindlessNV(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jint drawCount, jint stride, jint vertexBufferCount) {
    glMultiDrawArraysIndirectBindlessNVPROC glMultiDrawArraysIndirectBindlessNV = (glMultiDrawArraysIndirectBindlessNVPROC)tlsGetFunction(1907);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysIndirectBindlessNV(mode, indirect, drawCount, stride, vertexBufferCount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVBindlessMultiDrawIndirect_nglMultiDrawElementsIndirectBindlessNV(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jint drawCount, jint stride, jint vertexBufferCount) {
    glMultiDrawElementsIndirectBindlessNVPROC glMultiDrawElementsIndirectBindlessNV = (glMultiDrawElementsIndirectBindlessNVPROC)tlsGetFunction(1908);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsIndirectBindlessNV(mode, type, indirect, drawCount, stride, vertexBufferCount);
}

EXTERN_C_EXIT
