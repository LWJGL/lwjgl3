/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <locale.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1ALL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LC_ALL;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1COLLATE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LC_COLLATE;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1CTYPE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LC_CTYPE;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1MONETARY(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LC_MONETARY;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1NUMERIC(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LC_NUMERIC;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1TIME(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)LC_TIME;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCLocale_nsetlocale(JNIEnv *__env, jclass clazz, jint category, jlong localeAddress) {
    char const *locale = (char const *)(uintptr_t)localeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)setlocale(category, locale);
}

EXTERN_C_EXIT
