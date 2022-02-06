/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"

EXTERN_C_ENTER

// memGlobalRefToObject(J)Ljava/lang/Object;
JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefToObject(JNIEnv *env, jclass clazz,
    jlong globalRef
) {
    UNUSED_PARAMS(env, clazz)
    return (jobject)(uintptr_t)globalRef;
}

EXTERN_C_EXIT
