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

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_stdin(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)stdin;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_stdout(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)stdout;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_stderr(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)stderr;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nfflush(JNIEnv *__env, jclass clazz, jlong streamAddress) {
    FILE *stream = (FILE *)(uintptr_t)streamAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)fflush(stream);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nfeof(JNIEnv *__env, jclass clazz, jlong streamAddress) {
    FILE *stream = (FILE *)(uintptr_t)streamAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)feof(stream);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nferror(JNIEnv *__env, jclass clazz, jlong streamAddress) {
    FILE *stream = (FILE *)(uintptr_t)streamAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ferror(stream);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_fscanf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)fscanf;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_sscanf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)sscanf;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nvsscanf(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong formatAddress, jlong vlistAddress) {
    char const *buffer = (char const *)(uintptr_t)bufferAddress;
    char const *format = (char const *)(uintptr_t)formatAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vsscanf(buffer, format, VA_LIST_CAST(vlist));
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_fprintf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)fprintf;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libc_LibCStdio_snprintf(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)snprintf;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCStdio_nvsnprintf(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong buf_size, jlong formatAddress, jlong vlistAddress) {
    char *buffer = (char *)(uintptr_t)bufferAddress;
    char const *format = (char const *)(uintptr_t)formatAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vsnprintf(buffer, (size_t)buf_size, format, VA_LIST_CAST(vlist));
}

EXTERN_C_EXIT
