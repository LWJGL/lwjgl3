/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <string.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset__JIJ(JNIEnv *__env, jclass clazz, jlong destAddress, jint c, jlong count) {
    void *dest = (void *)(intptr_t)destAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)memset(dest, c, (size_t)count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ(JNIEnv *__env, jclass clazz, jlong destAddress, jlong srcAddress, jlong count) {
    void *dest = (void *)(intptr_t)destAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)memcpy(dest, src, (size_t)count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove__JJJ(JNIEnv *__env, jclass clazz, jlong destAddress, jlong srcAddress, jlong count) {
    void *dest = (void *)(intptr_t)destAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)memmove(dest, src, (size_t)count);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3BIJ(JNIEnv *__env, jclass clazz, jbyteArray destAddress, jint c, jlong count) {
    jlong __result;
    jbyte *dest = (*__env)->GetByteArrayElements(__env, destAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memset((void *)dest, c, (size_t)count);
    (*__env)->ReleaseByteArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3SIJ(JNIEnv *__env, jclass clazz, jshortArray destAddress, jint c, jlong count) {
    jlong __result;
    jshort *dest = (*__env)->GetShortArrayElements(__env, destAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memset((void *)dest, c, (size_t)count);
    (*__env)->ReleaseShortArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3IIJ(JNIEnv *__env, jclass clazz, jintArray destAddress, jint c, jlong count) {
    jlong __result;
    jint *dest = (*__env)->GetIntArrayElements(__env, destAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memset((void *)dest, c, (size_t)count);
    (*__env)->ReleaseIntArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3JIJ(JNIEnv *__env, jclass clazz, jlongArray destAddress, jint c, jlong count) {
    jlong __result;
    jlong *dest = (*__env)->GetLongArrayElements(__env, destAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memset((void *)dest, c, (size_t)count);
    (*__env)->ReleaseLongArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3FIJ(JNIEnv *__env, jclass clazz, jfloatArray destAddress, jint c, jlong count) {
    jlong __result;
    jfloat *dest = (*__env)->GetFloatArrayElements(__env, destAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memset((void *)dest, c, (size_t)count);
    (*__env)->ReleaseFloatArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3DIJ(JNIEnv *__env, jclass clazz, jdoubleArray destAddress, jint c, jlong count) {
    jlong __result;
    jdouble *dest = (*__env)->GetDoubleArrayElements(__env, destAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memset((void *)dest, c, (size_t)count);
    (*__env)->ReleaseDoubleArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3B_3BJ(JNIEnv *__env, jclass clazz, jbyteArray destAddress, jbyteArray srcAddress, jlong count) {
    jlong __result;
    jbyte *dest = (*__env)->GetByteArrayElements(__env, destAddress, NULL);
    jbyte *src = (*__env)->GetByteArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memcpy((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseByteArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseByteArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3S_3SJ(JNIEnv *__env, jclass clazz, jshortArray destAddress, jshortArray srcAddress, jlong count) {
    jlong __result;
    jshort *dest = (*__env)->GetShortArrayElements(__env, destAddress, NULL);
    jshort *src = (*__env)->GetShortArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memcpy((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseShortArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseShortArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3I_3IJ(JNIEnv *__env, jclass clazz, jintArray destAddress, jintArray srcAddress, jlong count) {
    jlong __result;
    jint *dest = (*__env)->GetIntArrayElements(__env, destAddress, NULL);
    jint *src = (*__env)->GetIntArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memcpy((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseIntArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseIntArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3J_3JJ(JNIEnv *__env, jclass clazz, jlongArray destAddress, jlongArray srcAddress, jlong count) {
    jlong __result;
    jlong *dest = (*__env)->GetLongArrayElements(__env, destAddress, NULL);
    jlong *src = (*__env)->GetLongArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memcpy((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseLongArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseLongArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray destAddress, jfloatArray srcAddress, jlong count) {
    jlong __result;
    jfloat *dest = (*__env)->GetFloatArrayElements(__env, destAddress, NULL);
    jfloat *src = (*__env)->GetFloatArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memcpy((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseFloatArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseFloatArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray destAddress, jdoubleArray srcAddress, jlong count) {
    jlong __result;
    jdouble *dest = (*__env)->GetDoubleArrayElements(__env, destAddress, NULL);
    jdouble *src = (*__env)->GetDoubleArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memcpy((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseDoubleArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseDoubleArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3B_3BJ(JNIEnv *__env, jclass clazz, jbyteArray destAddress, jbyteArray srcAddress, jlong count) {
    jlong __result;
    jbyte *dest = (*__env)->GetByteArrayElements(__env, destAddress, NULL);
    jbyte *src = (*__env)->GetByteArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memmove((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseByteArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseByteArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3S_3SJ(JNIEnv *__env, jclass clazz, jshortArray destAddress, jshortArray srcAddress, jlong count) {
    jlong __result;
    jshort *dest = (*__env)->GetShortArrayElements(__env, destAddress, NULL);
    jshort *src = (*__env)->GetShortArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memmove((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseShortArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseShortArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3I_3IJ(JNIEnv *__env, jclass clazz, jintArray destAddress, jintArray srcAddress, jlong count) {
    jlong __result;
    jint *dest = (*__env)->GetIntArrayElements(__env, destAddress, NULL);
    jint *src = (*__env)->GetIntArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memmove((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseIntArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseIntArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3J_3JJ(JNIEnv *__env, jclass clazz, jlongArray destAddress, jlongArray srcAddress, jlong count) {
    jlong __result;
    jlong *dest = (*__env)->GetLongArrayElements(__env, destAddress, NULL);
    jlong *src = (*__env)->GetLongArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memmove((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseLongArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseLongArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray destAddress, jfloatArray srcAddress, jlong count) {
    jlong __result;
    jfloat *dest = (*__env)->GetFloatArrayElements(__env, destAddress, NULL);
    jfloat *src = (*__env)->GetFloatArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memmove((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseFloatArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseFloatArrayElements(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray destAddress, jdoubleArray srcAddress, jlong count) {
    jlong __result;
    jdouble *dest = (*__env)->GetDoubleArrayElements(__env, destAddress, NULL);
    jdouble *src = (*__env)->GetDoubleArrayElements(__env, srcAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)memmove((void *)dest, (void const *)src, (size_t)count);
    (*__env)->ReleaseDoubleArrayElements(__env, srcAddress, src, 0);
    (*__env)->ReleaseDoubleArrayElements(__env, destAddress, dest, 0);
    return __result;
}

EXTERN_C_EXIT
