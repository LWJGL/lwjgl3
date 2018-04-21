/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glCopyBufferSubDataPROC) (jint, jint, intptr_t, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBCopyBuffer_glCopyBufferSubData(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size) {
    glCopyBufferSubDataPROC glCopyBufferSubData = (glCopyBufferSubDataPROC)tlsGetFunction(637);
    UNUSED_PARAM(clazz)
    glCopyBufferSubData(readTarget, writeTarget, (intptr_t)readOffset, (intptr_t)writeOffset, (intptr_t)size);
}

EXTERN_C_EXIT
