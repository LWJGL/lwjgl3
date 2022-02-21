/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "liburing/io_uring.h"
DISABLE_WARNINGS()
_Pragma("GCC diagnostic ignored \"-Wpedantic\"")
#include "syscall.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1setup(JNIEnv *__env, jclass clazz, jint entries, jlong pAddress) {
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_setup((unsigned)entries, p);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1register(JNIEnv *__env, jclass clazz, jint fd, jint opcode, jlong argAddress, jint nr_args) {
    void *arg = (void *)(uintptr_t)argAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_register(fd, (unsigned)opcode, arg, (unsigned)nr_args);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1enter2(JNIEnv *__env, jclass clazz, jint fd, jint to_submit, jint min_complete, jint flags, jlong sigAddress, jint sz) {
    sigset_t *sig = (sigset_t *)(uintptr_t)sigAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_enter2(fd, (unsigned)to_submit, (unsigned)min_complete, (unsigned)flags, sig, sz);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibIOURing_nio_1uring_1enter(JNIEnv *__env, jclass clazz, jint fd, jint to_submit, jint min_complete, jint flags, jlong sigAddress) {
    sigset_t *sig = (sigset_t *)(uintptr_t)sigAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)__sys_io_uring_enter(fd, (unsigned)to_submit, (unsigned)min_complete, (unsigned)flags, sig);
    saveErrno();
    return __result;
}

EXTERN_C_EXIT
