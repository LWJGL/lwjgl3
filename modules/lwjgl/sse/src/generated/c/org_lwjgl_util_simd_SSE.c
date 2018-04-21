/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "intrinsics.h"

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1SET_1EXCEPTION_1STATE(JNIEnv *__env, jclass clazz, jint mask) {
    UNUSED_PARAMS(__env, clazz)
    _MM_SET_EXCEPTION_STATE((unsigned int)mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1GET_1EXCEPTION_1STATE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)_MM_GET_EXCEPTION_STATE();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1SET_1EXCEPTION_1MASK(JNIEnv *__env, jclass clazz, jint mask) {
    UNUSED_PARAMS(__env, clazz)
    _MM_SET_EXCEPTION_MASK((unsigned int)mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1GET_1EXCEPTION_1MASK(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)_MM_GET_EXCEPTION_MASK();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1SET_1ROUNDING_1MODE(JNIEnv *__env, jclass clazz, jint mode) {
    UNUSED_PARAMS(__env, clazz)
    _MM_SET_ROUNDING_MODE((unsigned int)mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1GET_1ROUNDING_1MODE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)_MM_GET_ROUNDING_MODE();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1SET_1FLUSH_1ZERO_1MODE(JNIEnv *__env, jclass clazz, jint mode) {
    UNUSED_PARAMS(__env, clazz)
    _MM_SET_FLUSH_ZERO_MODE((unsigned int)mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_simd_SSE__1MM_1GET_1FLUSH_1ZERO_1MODE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)_MM_GET_FLUSH_ZERO_MODE();
}

EXTERN_C_EXIT
