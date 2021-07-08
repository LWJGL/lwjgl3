/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>

DISABLE_WARNINGS()
#include "ffi.h"
ENABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_FFIClosure_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(intptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = (jint)offsetof(ffi_closure, cif);
    buffer[1] = (jint)offsetof(ffi_closure, fun);
    buffer[2] = (jint)offsetof(ffi_closure, user_data);

    buffer[3] = alignof(ffi_closure);

    return sizeof(ffi_closure);
}

EXTERN_C_EXIT
