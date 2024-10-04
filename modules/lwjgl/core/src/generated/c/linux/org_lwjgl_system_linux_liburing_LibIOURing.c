/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_LINUX
    _Pragma("GCC diagnostic ignored \"-Wsign-compare\"")
#endif
#include "liburing/compat.h"
#include "liburing/io_uring.h"
#include "syscall.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1setup(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint entries, jlong pAddress) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_setup((unsigned)entries, p);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1register(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd, jint opcode, jlong argAddress, jint nr_args) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    void *arg = (void *)(uintptr_t)argAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_register(fd, (unsigned)opcode, arg, (unsigned)nr_args);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1enter2(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd, jint to_submit, jint min_complete, jint flags, jlong sigAddress, jint sz) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    sigset_t *sig = (sigset_t *)(uintptr_t)sigAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_enter2(fd, (unsigned)to_submit, (unsigned)min_complete, (unsigned)flags, sig, sz);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1enter(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint fd, jint to_submit, jint min_complete, jint flags, jlong sigAddress) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    sigset_t *sig = (sigset_t *)(uintptr_t)sigAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_enter(fd, (unsigned)to_submit, (unsigned)min_complete, (unsigned)flags, sig);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

EXTERN_C_EXIT
