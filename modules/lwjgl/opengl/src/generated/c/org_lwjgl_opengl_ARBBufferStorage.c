/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBufferStoragePROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glNamedBufferStorageEXTPROC) (jint, intptr_t, intptr_t, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBufferStorage_nglBufferStorage__IJJI(JNIEnv *__env, jclass clazz, jint target, jlong size, jlong dataAddress, jint flags) {
    glBufferStoragePROC glBufferStorage = (glBufferStoragePROC)tlsGetFunction(913);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glBufferStorage(target, (intptr_t)size, data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBufferStorage_nglNamedBufferStorageEXT__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint flags) {
    glNamedBufferStorageEXTPROC glNamedBufferStorageEXT = (glNamedBufferStorageEXTPROC)tlsGetFunction(1091);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferStorageEXT(buffer, (intptr_t)size, data, flags);
}

EXTERN_C_EXIT
