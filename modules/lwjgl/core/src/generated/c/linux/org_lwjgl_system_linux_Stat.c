/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <sys/stat.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Stat_nstat(JNIEnv *__env, jclass clazz, jlong __fileAddress, jlong __bufAddress) {
    char const *__file = (char const *)(uintptr_t)__fileAddress;
    struct stat *__buf = (struct stat *)(uintptr_t)__bufAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stat(__file, __buf);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Stat_nfstat(JNIEnv *__env, jclass clazz, jint __fd, jlong __bufAddress) {
    struct stat *__buf = (struct stat *)(uintptr_t)__bufAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)fstat(__fd, __buf);
    saveErrno();
    return __result;
}

EXTERN_C_EXIT
