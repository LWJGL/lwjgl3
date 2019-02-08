/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <locale.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1ALL(void) {
    return (jint)LC_ALL;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1ALL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1ALL();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1COLLATE(void) {
    return (jint)LC_COLLATE;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1COLLATE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1COLLATE();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1CTYPE(void) {
    return (jint)LC_CTYPE;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1CTYPE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1CTYPE();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1MONETARY(void) {
    return (jint)LC_MONETARY;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1MONETARY(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1MONETARY();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1NUMERIC(void) {
    return (jint)LC_NUMERIC;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1NUMERIC(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1NUMERIC();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1TIME(void) {
    return (jint)LC_TIME;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCLocale_LC_1TIME(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCLocale_LC_1TIME();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCLocale_nsetlocale(jint category, jlong localeAddress) {
    char const *locale = (char const *)(intptr_t)localeAddress;
    return (jlong)(intptr_t)setlocale(category, locale);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCLocale_nsetlocale(JNIEnv *__env, jclass clazz, jint category, jlong localeAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCLocale_nsetlocale(category, localeAddress);
}

EXTERN_C_EXIT
