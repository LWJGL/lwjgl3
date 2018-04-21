/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetActiveAtomicCounterBufferivPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderAtomicCounters_nglGetActiveAtomicCounterBufferiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint bufferIndex, jint pname, jlong paramsAddress) {
    glGetActiveAtomicCounterBufferivPROC glGetActiveAtomicCounterBufferiv = (glGetActiveAtomicCounterBufferivPROC)tlsGetFunction(858);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, params);
}

EXTERN_C_EXIT
