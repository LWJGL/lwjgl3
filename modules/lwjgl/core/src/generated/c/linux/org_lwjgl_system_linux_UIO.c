/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <sys/uio.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nreadv(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __fd, jlong __iovecAddress, jint __count) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)readv(__fd, __iovec, __count);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nwritev(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __fd, jlong __iovecAddress, jint __count) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)writev(__fd, __iovec, __count);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_npreadv(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __fd, jlong __iovecAddress, jint __count, jlong __offset) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)preadv(__fd, __iovec, __count, (off_t)__offset);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_npwritev(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __fd, jlong __iovecAddress, jint __count, jlong __offset) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct iovec const *__iovec = (struct iovec const *)(uintptr_t)__iovecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)pwritev(__fd, __iovec, __count, (off_t)__offset);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nprocess_1vm_1readv(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __pid, jlong __lvecAddress, jlong __liovcnt, jlong __rvecAddress, jlong __riovcnt, jlong __flags) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct iovec const *__lvec = (struct iovec const *)(uintptr_t)__lvecAddress;
    struct iovec const *__rvec = (struct iovec const *)(uintptr_t)__rvecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)process_vm_readv((pid_t)__pid, __lvec, (unsigned long int)__liovcnt, __rvec, (unsigned long int)__riovcnt, (unsigned long int)__flags);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_UIO_nprocess_1vm_1writev(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __pid, jlong __lvecAddress, jlong __liovcnt, jlong __rvecAddress, jlong __riovcnt, jlong __flags) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct iovec const *__lvec = (struct iovec const *)(uintptr_t)__lvecAddress;
    struct iovec const *__rvec = (struct iovec const *)(uintptr_t)__rvecAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)process_vm_writev((pid_t)__pid, __lvec, (unsigned long int)__liovcnt, __rvec, (unsigned long int)__riovcnt, (unsigned long int)__flags);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

EXTERN_C_EXIT
