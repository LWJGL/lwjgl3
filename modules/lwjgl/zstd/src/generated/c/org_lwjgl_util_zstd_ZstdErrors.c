/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "zstd_errors.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_ZstdErrors_nZSTD_1getErrorString(JNIEnv *__env, jclass clazz, jint code) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)ZSTD_getErrorString((ZSTD_ErrorCode)code);
}

EXTERN_C_EXIT
