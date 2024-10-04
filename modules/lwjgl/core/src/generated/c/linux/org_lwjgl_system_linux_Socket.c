/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <sys/socket.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Socket_nsocket(JNIEnv *__env, jclass clazz, jlong _errnoAddress, jint __domain, jint __type, jint __protocol) {
    int *_errno = (int *)(uintptr_t)_errnoAddress;
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)socket(__domain, __type, __protocol);
    if (_errno != NULL) *_errno = errno;
    return __result;
}

EXTERN_C_EXIT
