/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <sys/stat.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Stat_nstat(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jlong __fileAddress, jlong __bufAddress) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    char const *__file = (char const *)(uintptr_t)__fileAddress;
    struct stat *__buf = (struct stat *)(uintptr_t)__bufAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stat(__file, __buf);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Stat_nfstat(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __fd, jlong __bufAddress) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct stat *__buf = (struct stat *)(uintptr_t)__bufAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fstat(__fd, __buf);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

EXTERN_C_EXIT
