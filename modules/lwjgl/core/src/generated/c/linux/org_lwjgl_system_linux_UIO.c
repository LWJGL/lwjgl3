/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <sys/uio.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nreadv(JNIEnv *__env, jclass clazz, jint __fd, jlong __iovecAddress, jint __count) {
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)readv(__fd, __iovec, __count);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nwritev(JNIEnv *__env, jclass clazz, jint __fd, jlong __iovecAddress, jint __count) {
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)writev(__fd, __iovec, __count);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_npreadv(JNIEnv *__env, jclass clazz, jint __fd, jlong __iovecAddress, jint __count, jlong __offset) {
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)preadv(__fd, __iovec, __count, (off_t)__offset);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_npwritev(JNIEnv *__env, jclass clazz, jint __fd, jlong __iovecAddress, jint __count, jlong __offset) {
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)pwritev(__fd, __iovec, __count, (off_t)__offset);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_npreadv2(JNIEnv *__env, jclass clazz, jint __fd, jlong __iovecAddress, jint __count, jlong __offset, jint __flags) {
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)preadv2(__fd, __iovec, __count, (off_t)__offset, __flags);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_npwritev2(JNIEnv *__env, jclass clazz, jint __fd, jlong __iovecAddress, jint __count, jlong __offset, jint __flags) {
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)pwritev2(__fd, __iovec, __count, (off_t)__offset, __flags);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nprocess_1vm_1readv(JNIEnv *__env, jclass clazz, jint __pid, jlong __lvecAddress, jlong __liovcnt, jlong __rvecAddress, jlong __riovcnt, jlong __flags) {
    struct iovec const *__lvec = (struct iovec const *)(uintptr_t)__lvecAddress;
    struct iovec const *__rvec = (struct iovec const *)(uintptr_t)__rvecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)process_vm_readv((pid_t)__pid, __lvec, (unsigned long int)__liovcnt, __rvec, (unsigned long int)__riovcnt, (unsigned long int)__flags);
    saveErrno();
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nprocess_1vm_1writev(JNIEnv *__env, jclass clazz, jint __pid, jlong __lvecAddress, jlong __liovcnt, jlong __rvecAddress, jlong __riovcnt, jlong __flags) {
    struct iovec const *__lvec = (struct iovec const *)(uintptr_t)__lvecAddress;
    struct iovec const *__rvec = (struct iovec const *)(uintptr_t)__rvecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)process_vm_writev((pid_t)__pid, __lvec, (unsigned long int)__liovcnt, __rvec, (unsigned long int)__riovcnt, (unsigned long int)__flags);
    saveErrno();
    return __result;
}

EXTERN_C_EXIT
