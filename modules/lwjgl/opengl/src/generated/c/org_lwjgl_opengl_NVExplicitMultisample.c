/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetMultisamplefvNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glSampleMaskIndexedNVPROC) (jint, jint);
typedef void (APIENTRY *glTexRenderbufferNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVExplicitMultisample_nglGetMultisamplefvNV__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress) {
    glGetMultisamplefvNVPROC glGetMultisamplefvNV = (glGetMultisamplefvNVPROC)tlsGetFunction(1959);
    uintptr_t val = (uintptr_t)valAddress;
    UNUSED_PARAM(clazz)
    glGetMultisamplefvNV(pname, index, val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVExplicitMultisample_glSampleMaskIndexedNV(JNIEnv *__env, jclass clazz, jint index, jint mask) {
    glSampleMaskIndexedNVPROC glSampleMaskIndexedNV = (glSampleMaskIndexedNVPROC)tlsGetFunction(1960);
    UNUSED_PARAM(clazz)
    glSampleMaskIndexedNV(index, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVExplicitMultisample_glTexRenderbufferNV(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
    glTexRenderbufferNVPROC glTexRenderbufferNV = (glTexRenderbufferNVPROC)tlsGetFunction(1961);
    UNUSED_PARAM(clazz)
    glTexRenderbufferNV(target, renderbuffer);
}

EXTERN_C_EXIT
