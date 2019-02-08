/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
#endif
#include "common_tools.h"
#include <stdio.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdio_sscanf(void) {
    return (jlong)(intptr_t)sscanf;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_sscanf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdio_sscanf();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdio_nvsscanf(jlong bufferAddress, jlong formatAddress, jlong vlistAddress) {
    char const *buffer = (char const *)(intptr_t)bufferAddress;
    char const *format = (char const *)(intptr_t)formatAddress;
    va_list *vlist = VA_LIST_CAST(intptr_t)vlistAddress;
    return (jint)vsscanf(buffer, format, *vlist);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nvsscanf(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong formatAddress, jlong vlistAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdio_nvsscanf(bufferAddress, formatAddress, vlistAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdio_sprintf(void) {
    return (jlong)(intptr_t)sprintf;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_sprintf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdio_sprintf();
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdio_snprintf(void) {
    return (jlong)(intptr_t)snprintf;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_snprintf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdio_snprintf();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_system_libc_LibCStdio_nvsnprintf(jlong bufferAddress, jlong buf_size, jlong formatAddress, jlong vlistAddress) {
    char *buffer = (char *)(intptr_t)bufferAddress;
    char const *format = (char const *)(intptr_t)formatAddress;
    va_list *vlist = VA_LIST_CAST(intptr_t)vlistAddress;
    return (jint)vsnprintf(buffer, (size_t)buf_size, format, *vlist);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nvsnprintf(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buf_size, jlong formatAddress, jlong vlistAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_system_libc_LibCStdio_nvsnprintf(bufferAddress, buf_size, formatAddress, vlistAddress);
}

EXTERN_C_EXIT
