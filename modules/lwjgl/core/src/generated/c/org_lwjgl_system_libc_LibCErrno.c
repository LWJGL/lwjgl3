/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <errno.h>

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCErrno_errno(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)errno;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libc_LibCErrno_getErrno(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    EnvData *envData = (EnvData *)(*__env)->reserved2;
    return envData == (*__env)->reserved0 ? 0 : envData->errnum;
}

EXTERN_C_EXIT
