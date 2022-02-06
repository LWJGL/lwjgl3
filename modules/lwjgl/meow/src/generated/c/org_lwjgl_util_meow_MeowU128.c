/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "meow_intrinsics.h"
#include <stddef.h>
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meow_MeowU128_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(uintptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = alignof(meow_u128);

    return sizeof(meow_u128);
}

EXTERN_C_EXIT
