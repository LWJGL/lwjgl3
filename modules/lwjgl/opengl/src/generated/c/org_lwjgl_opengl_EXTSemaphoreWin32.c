/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glImportSemaphoreWin32HandleEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glImportSemaphoreWin32NameEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSemaphoreWin32_nglImportSemaphoreWin32HandleEXT(JNIEnv *__env, jclass clazz, jint semaphore, jint handleType, jlong handleAddress) {
    glImportSemaphoreWin32HandleEXTPROC glImportSemaphoreWin32HandleEXT = (glImportSemaphoreWin32HandleEXTPROC)tlsGetFunction(1843);
    uintptr_t handle = (uintptr_t)handleAddress;
    UNUSED_PARAM(clazz)
    glImportSemaphoreWin32HandleEXT(semaphore, handleType, handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSemaphoreWin32_nglImportSemaphoreWin32NameEXT(JNIEnv *__env, jclass clazz, jint semaphore, jint handleType, jlong nameAddress) {
    glImportSemaphoreWin32NameEXTPROC glImportSemaphoreWin32NameEXT = (glImportSemaphoreWin32NameEXTPROC)tlsGetFunction(1844);
    uintptr_t name = (uintptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glImportSemaphoreWin32NameEXT(semaphore, handleType, name);
}

EXTERN_C_EXIT
