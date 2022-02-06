/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClearNamedBufferDataEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glClearNamedBufferSubDataEXTPROC) (jint, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearNamedBufferDataEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferDataEXTPROC glClearNamedBufferDataEXT = (glClearNamedBufferDataEXTPROC)tlsGetFunction(1129);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferDataEXT(buffer, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearNamedBufferSubDataEXT__IIJJIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferSubDataEXTPROC glClearNamedBufferSubDataEXT = (glClearNamedBufferSubDataEXTPROC)tlsGetFunction(1130);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferSubDataEXT(buffer, internalformat, (uintptr_t)offset, (uintptr_t)size, format, type, data);
}

EXTERN_C_EXIT
