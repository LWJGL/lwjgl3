/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <unistd.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_UNISTD_close(JNIEnv *__env, jclass clazz, jint fd) {
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)close(fd);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UNISTD_sysconf(JNIEnv *__env, jclass clazz, jint name) {
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)sysconf(name);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UNISTD_nread(JNIEnv *__env, jclass clazz, jint fd, jlong bufAddress, jlong count) {
    void *buf = (void *)(uintptr_t)bufAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)read(fd, buf, (size_t)count);
    saveErrno();
    return __result;
}

EXTERN_C_EXIT
