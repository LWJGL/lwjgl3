/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "intrinsics.h"

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_simd_SSE3__1MM_1SET_1DENORMALS_1ZERO_1MODE(JNIEnv *__env, jclass clazz, jint mode) {
    UNUSED_PARAMS(__env, clazz)
    _MM_SET_DENORMALS_ZERO_MODE((unsigned int)mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_simd_SSE3__1MM_1GET_1DENORMALS_1ZERO_1MODE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)_MM_GET_DENORMALS_ZERO_MODE();
}

EXTERN_C_EXIT
