/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glImportSemaphoreWin32HandleEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glImportSemaphoreWin32NameEXTPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphoreWin32_nglImportSemaphoreWin32HandleEXT(JNIEnv *__env, jclass clazz, jint semaphore, jint handleType, jlong handleAddress) {
    glImportSemaphoreWin32HandleEXTPROC glImportSemaphoreWin32HandleEXT = (glImportSemaphoreWin32HandleEXTPROC)tlsGetFunction(487);
    intptr_t handle = (intptr_t)handleAddress;
    UNUSED_PARAM(clazz)
    glImportSemaphoreWin32HandleEXT(semaphore, handleType, handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSemaphoreWin32_nglImportSemaphoreWin32NameEXT(JNIEnv *__env, jclass clazz, jint semaphore, jint handleType, jlong nameAddress) {
    glImportSemaphoreWin32NameEXTPROC glImportSemaphoreWin32NameEXT = (glImportSemaphoreWin32NameEXTPROC)tlsGetFunction(488);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glImportSemaphoreWin32NameEXT(semaphore, handleType, name);
}

EXTERN_C_EXIT
