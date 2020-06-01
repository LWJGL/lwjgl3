/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glImportSemaphoreFdEXTPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTSemaphoreFD_glImportSemaphoreFdEXT(JNIEnv *__env, jclass clazz, jint semaphore, jint handleType, jint fd) {
    glImportSemaphoreFdEXTPROC glImportSemaphoreFdEXT = (glImportSemaphoreFdEXTPROC)tlsGetFunction(1842);
    UNUSED_PARAM(clazz)
    glImportSemaphoreFdEXT(semaphore, handleType, fd);
}

EXTERN_C_EXIT
