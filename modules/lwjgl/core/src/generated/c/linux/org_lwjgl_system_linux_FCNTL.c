/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <fcntl.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nopen(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jlong pathnameAddress, jint flags, jint mode) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    char const *pathname = (char const *)(uintptr_t)pathnameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)open(pathname, flags, (mode_t)mode);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nopenat(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint dirfd, jlong pathnameAddress, jint flags, jint mode) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    char const *pathname = (char const *)(uintptr_t)pathnameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)openat(dirfd, pathname, flags, (mode_t)mode);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_ncreat(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jlong pathnameAddress, jint mode) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    char const *pathname = (char const *)(uintptr_t)pathnameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)creat(pathname, (mode_t)mode);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nfcntl(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd, jint cmd) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fcntl(fd, cmd);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nfcntli(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd, jint cmd, jint arg) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fcntl(fd, cmd, arg);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nfcntlp(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd, jint cmd, jlong argAddress) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    void *arg = (void *)(uintptr_t)argAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fcntl(fd, cmd, arg);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

EXTERN_C_EXIT
