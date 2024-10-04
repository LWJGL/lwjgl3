/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <unistd.h>
#include <errno.h>

#include <sys/syscall.h>

#ifndef SYS_gettid
#error "SYS_gettid unavailable on this system"
#endif

#define gettid() ((pid_t)syscall(SYS_gettid))

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_UNISTD_nclose(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)close(fd);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UNISTD_nsysconf(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint name) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)sysconf(name);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UNISTD_nread(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd, jlong bufAddress, jlong count) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)read(fd, buf, (size_t)count);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_UNISTD_getpid(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)getpid();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_UNISTD_getppid(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)getppid();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_UNISTD_gettid(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)gettid();
}

EXTERN_C_EXIT
