/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <sys/mman.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_MMAN_mmap(JNIEnv *__env, jclass clazz, jlong addrAddress, jlong length, jint prot, jint flags, jint fd, jlong offset) {
    void *addr = (void *)(uintptr_t)addrAddress;
    jlong __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)mmap(addr, (size_t)length, prot, flags, fd, (off_t)offset);
    saveErrno();
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_MMAN_nmunmap(JNIEnv *__env, jclass clazz, jlong addrAddress, jlong length) {
    void *addr = (void *)(uintptr_t)addrAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)munmap(addr, (size_t)length);
    saveErrno();
    return __result;
}

EXTERN_C_EXIT
