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

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_sscanf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)sscanf;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nvsscanf(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong formatAddress, jlong vlistAddress) {
    char const *buffer = (char const *)(intptr_t)bufferAddress;
    char const *format = (char const *)(intptr_t)formatAddress;
    va_list *vlist = VA_LIST_CAST(intptr_t)vlistAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vsscanf(buffer, format, *vlist);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_sprintf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)sprintf;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_snprintf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)snprintf;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nvsnprintf(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buf_size, jlong formatAddress, jlong vlistAddress) {
    char *buffer = (char *)(intptr_t)bufferAddress;
    char const *format = (char const *)(intptr_t)formatAddress;
    va_list *vlist = VA_LIST_CAST(intptr_t)vlistAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vsnprintf(buffer, (size_t)buf_size, format, *vlist);
}

EXTERN_C_EXIT
