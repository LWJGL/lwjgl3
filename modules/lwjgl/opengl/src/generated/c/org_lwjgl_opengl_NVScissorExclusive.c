/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glScissorExclusiveArrayvNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glScissorExclusiveNVPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVScissorExclusive_nglScissorExclusiveArrayvNV__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glScissorExclusiveArrayvNVPROC glScissorExclusiveArrayvNV = (glScissorExclusiveArrayvNVPROC)tlsGetFunction(2124);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorExclusiveArrayvNV(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVScissorExclusive_glScissorExclusiveNV(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height) {
    glScissorExclusiveNVPROC glScissorExclusiveNV = (glScissorExclusiveNVPROC)tlsGetFunction(2125);
    UNUSED_PARAM(clazz)
    glScissorExclusiveNV(x, y, width, height);
}

EXTERN_C_EXIT
