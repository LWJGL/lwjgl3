/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClearBufferDataPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glClearBufferSubDataPROC) (jint, jint, intptr_t, intptr_t, jint, jint, intptr_t);
typedef void (APIENTRY *glClearNamedBufferDataEXTPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glClearNamedBufferSubDataEXTPROC) (jint, jint, intptr_t, intptr_t, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearBufferData__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint format, jint type, jlong dataAddress) {
    glClearBufferDataPROC glClearBufferData = (glClearBufferDataPROC)tlsGetFunction(870);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearBufferData(target, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearBufferSubData__IIJJIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress) {
    glClearBufferSubDataPROC glClearBufferSubData = (glClearBufferSubDataPROC)tlsGetFunction(871);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearBufferSubData(target, internalformat, (intptr_t)offset, (intptr_t)size, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearNamedBufferDataEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferDataEXTPROC glClearNamedBufferDataEXT = (glClearNamedBufferDataEXTPROC)tlsGetFunction(1093);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferDataEXT(buffer, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClearBufferObject_nglClearNamedBufferSubDataEXT__IIJJIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferSubDataEXTPROC glClearNamedBufferSubDataEXT = (glClearNamedBufferSubDataEXTPROC)tlsGetFunction(1094);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferSubDataEXT(buffer, internalformat, (intptr_t)offset, (intptr_t)size, format, type, data);
}

EXTERN_C_EXIT
