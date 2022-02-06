/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glNamedBufferStorageEXTPROC) (jint, uintptr_t, uintptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBufferStorage_nglNamedBufferStorageEXT__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint flags) {
    glNamedBufferStorageEXTPROC glNamedBufferStorageEXT = (glNamedBufferStorageEXTPROC)tlsGetFunction(1127);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferStorageEXT(buffer, (uintptr_t)size, data, flags);
}

EXTERN_C_EXIT
