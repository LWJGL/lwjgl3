/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glReadBufferIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glDrawBuffersIndexedEXTPROC) (jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetIntegeri_vEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_glReadBufferIndexedEXT(JNIEnv *__env, jclass clazz, jint src, jint index) {
    glReadBufferIndexedEXTPROC glReadBufferIndexedEXT = (glReadBufferIndexedEXTPROC)tlsGetFunction(469);
    UNUSED_PARAM(clazz)
    glReadBufferIndexedEXT(src, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_nglDrawBuffersIndexedEXT__IJJ(JNIEnv *__env, jclass clazz, jint n, jlong locationAddress, jlong indicesAddress) {
    glDrawBuffersIndexedEXTPROC glDrawBuffersIndexedEXT = (glDrawBuffersIndexedEXTPROC)tlsGetFunction(470);
    uintptr_t location = (uintptr_t)locationAddress;
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawBuffersIndexedEXT(n, location, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultiviewDrawBuffers_nglGetIntegeri_1vEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetIntegeri_vEXTPROC glGetIntegeri_vEXT = (glGetIntegeri_vEXTPROC)tlsGetFunction(471);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetIntegeri_vEXT(target, index, data);
}

EXTERN_C_EXIT
