/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <fcntl.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nopen(JNIEnv *__env, jclass clazz, jlong pathnameAddress, jint flags, jint mode) {
    char const *pathname = (char const *)(uintptr_t)pathnameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)open(pathname, flags, (mode_t)mode);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nopenat(JNIEnv *__env, jclass clazz, jint dirfd, jlong pathnameAddress, jint flags, jint mode) {
    char const *pathname = (char const *)(uintptr_t)pathnameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)openat(dirfd, pathname, flags, (mode_t)mode);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_ncreat(JNIEnv *__env, jclass clazz, jlong pathnameAddress, jint mode) {
    char const *pathname = (char const *)(uintptr_t)pathnameAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)creat(pathname, (mode_t)mode);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_fcntl(JNIEnv *__env, jclass clazz, jint fd, jint cmd) {
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fcntl(fd, cmd);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nfcntli(JNIEnv *__env, jclass clazz, jint fd, jint cmd, jint arg) {
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fcntl(fd, cmd, arg);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_FCNTL_nfcntlp(JNIEnv *__env, jclass clazz, jint fd, jint cmd, jlong argAddress) {
    void *arg = (void *)(uintptr_t)argAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fcntl(fd, cmd, arg);
    saveErrno();
    return __result;
}

EXTERN_C_EXIT
