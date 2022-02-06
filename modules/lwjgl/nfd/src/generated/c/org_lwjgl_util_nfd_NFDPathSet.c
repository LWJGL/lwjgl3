/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "nfd.h"
#include <stddef.h>
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_nfd_NFDPathSet_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(uintptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = alignof(nfdpathset_t);

    return sizeof(nfdpathset_t);
}

EXTERN_C_EXIT
