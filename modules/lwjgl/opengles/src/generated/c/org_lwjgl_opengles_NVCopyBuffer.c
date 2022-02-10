/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glCopyBufferSubDataNVPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVCopyBuffer_glCopyBufferSubDataNV(JNIEnv *__env, jclass clazz, jint readTarget, jint writeTarget, jlong readOffset, jlong writeOffset, jlong size) {
    glCopyBufferSubDataNVPROC glCopyBufferSubDataNV = (glCopyBufferSubDataNVPROC)tlsGetFunction(617);
    UNUSED_PARAM(clazz)
    glCopyBufferSubDataNV(readTarget, writeTarget, (uintptr_t)readOffset, (uintptr_t)writeOffset, (uintptr_t)size);
}

EXTERN_C_EXIT
