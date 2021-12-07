/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <sys/socket.h>
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Socket_socket(JNIEnv *__env, jclass clazz, jint __domain, jint __type, jint __protocol) {
    jint __result;
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)socket(__domain, __type, __protocol);
    saveErrno();
    return __result;
}

EXTERN_C_EXIT
