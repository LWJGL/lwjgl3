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

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_FFICIF_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(intptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = (jint)offsetof(ffi_cif, abi);
    buffer[1] = (jint)offsetof(ffi_cif, nargs);
    buffer[2] = (jint)offsetof(ffi_cif, arg_types);
    buffer[3] = (jint)offsetof(ffi_cif, rtype);
    buffer[4] = (jint)offsetof(ffi_cif, bytes);
    buffer[5] = (jint)offsetof(ffi_cif, flags);

    buffer[6] = alignof(ffi_cif);

    return sizeof(ffi_cif);
}

EXTERN_C_EXIT
