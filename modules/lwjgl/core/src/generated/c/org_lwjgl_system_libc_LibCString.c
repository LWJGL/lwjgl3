/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <string.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ(jlong destAddress, jint c, jlong count) {
    void *dest = (void *)(intptr_t)destAddress;
    return (jlong)(intptr_t)memset(dest, c, (size_t)count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset__JIJ(JNIEnv *__env, jclass clazz, jlong destAddress, jint c, jlong count) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ(destAddress, c, count);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ(jlong destAddress, jlong srcAddress, jlong count) {
    void *dest = (void *)(intptr_t)destAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    return (jlong)(intptr_t)memcpy(dest, src, (size_t)count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ(JNIEnv *__env, jclass clazz, jlong destAddress, jlong srcAddress, jlong count) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ(destAddress, srcAddress, count);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ(jlong destAddress, jlong srcAddress, jlong count) {
    void *dest = (void *)(intptr_t)destAddress;
    void const *src = (void const *)(intptr_t)srcAddress;
    return (jlong)(intptr_t)memmove(dest, src, (size_t)count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove__JJJ(JNIEnv *__env, jclass clazz, jlong destAddress, jlong srcAddress, jlong count) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ(destAddress, srcAddress, count);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemset___3BIJ(jint dest__length, jbyte* dest, jint c, jlong count) {
    UNUSED_PARAM(dest__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3BIJ(JNIEnv *__env, jclass clazz, jbyteArray destAddress, jint c, jlong count) {
    jlong __result;
    jbyte *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemset___3SIJ(jint dest__length, jshort* dest, jint c, jlong count) {
    UNUSED_PARAM(dest__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3SIJ(JNIEnv *__env, jclass clazz, jshortArray destAddress, jint c, jlong count) {
    jlong __result;
    jshort *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemset___3IIJ(jint dest__length, jint* dest, jint c, jlong count) {
    UNUSED_PARAM(dest__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3IIJ(JNIEnv *__env, jclass clazz, jintArray destAddress, jint c, jlong count) {
    jlong __result;
    jint *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemset___3JIJ(jint dest__length, jlong* dest, jint c, jlong count) {
    UNUSED_PARAM(dest__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3JIJ(JNIEnv *__env, jclass clazz, jlongArray destAddress, jint c, jlong count) {
    jlong __result;
    jlong *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemset___3FIJ(jint dest__length, jfloat* dest, jint c, jlong count) {
    UNUSED_PARAM(dest__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3FIJ(JNIEnv *__env, jclass clazz, jfloatArray destAddress, jint c, jlong count) {
    jlong __result;
    jfloat *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemset___3DIJ(jint dest__length, jdouble* dest, jint c, jlong count) {
    UNUSED_PARAM(dest__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemset___3DIJ(JNIEnv *__env, jclass clazz, jdoubleArray destAddress, jint c, jlong count) {
    jlong __result;
    jdouble *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemset__JIJ((intptr_t)dest, c, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy___3B_3BJ(jint dest__length, jbyte* dest, jint src__length, jbyte* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3B_3BJ(JNIEnv *__env, jclass clazz, jbyteArray destAddress, jbyteArray srcAddress, jlong count) {
    jlong __result;
    jbyte *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jbyte *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy___3S_3SJ(jint dest__length, jshort* dest, jint src__length, jshort* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3S_3SJ(JNIEnv *__env, jclass clazz, jshortArray destAddress, jshortArray srcAddress, jlong count) {
    jlong __result;
    jshort *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jshort *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy___3I_3IJ(jint dest__length, jint* dest, jint src__length, jint* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3I_3IJ(JNIEnv *__env, jclass clazz, jintArray destAddress, jintArray srcAddress, jlong count) {
    jlong __result;
    jint *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jint *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy___3J_3JJ(jint dest__length, jlong* dest, jint src__length, jlong* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3J_3JJ(JNIEnv *__env, jclass clazz, jlongArray destAddress, jlongArray srcAddress, jlong count) {
    jlong __result;
    jlong *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jlong *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy___3F_3FJ(jint dest__length, jfloat* dest, jint src__length, jfloat* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray destAddress, jfloatArray srcAddress, jlong count) {
    jlong __result;
    jfloat *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy___3D_3DJ(jint dest__length, jdouble* dest, jint src__length, jdouble* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemcpy___3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray destAddress, jdoubleArray srcAddress, jlong count) {
    jlong __result;
    jdouble *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jdouble *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemcpy__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove___3B_3BJ(jint dest__length, jbyte* dest, jint src__length, jbyte* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3B_3BJ(JNIEnv *__env, jclass clazz, jbyteArray destAddress, jbyteArray srcAddress, jlong count) {
    jlong __result;
    jbyte *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jbyte *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove___3S_3SJ(jint dest__length, jshort* dest, jint src__length, jshort* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3S_3SJ(JNIEnv *__env, jclass clazz, jshortArray destAddress, jshortArray srcAddress, jlong count) {
    jlong __result;
    jshort *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jshort *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove___3I_3IJ(jint dest__length, jint* dest, jint src__length, jint* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3I_3IJ(JNIEnv *__env, jclass clazz, jintArray destAddress, jintArray srcAddress, jlong count) {
    jlong __result;
    jint *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jint *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove___3J_3JJ(jint dest__length, jlong* dest, jint src__length, jlong* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3J_3JJ(JNIEnv *__env, jclass clazz, jlongArray destAddress, jlongArray srcAddress, jlong count) {
    jlong __result;
    jlong *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jlong *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove___3F_3FJ(jint dest__length, jfloat* dest, jint src__length, jfloat* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray destAddress, jfloatArray srcAddress, jlong count) {
    jlong __result;
    jfloat *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jfloat *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove___3D_3DJ(jint dest__length, jdouble* dest, jint src__length, jdouble* src, jlong count) {
    UNUSED_PARAM(dest__length)
    UNUSED_PARAM(src__length)
    return JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCString_nmemmove___3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray destAddress, jdoubleArray srcAddress, jlong count) {
    jlong __result;
    jdouble *dest = (*__env)->GetPrimitiveArrayCritical(__env, destAddress, 0);
    jdouble *src = (*__env)->GetPrimitiveArrayCritical(__env, srcAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_system_libc_LibCString_nmemmove__JJJ((intptr_t)dest, (intptr_t)src, count);
    (*__env)->ReleasePrimitiveArrayCritical(__env, srcAddress, src, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, destAddress, dest, 0);
    return __result;
}

EXTERN_C_EXIT
