/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glMaxShaderCompilerThreadsKHRPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_KHRParallelShaderCompile_glMaxShaderCompilerThreadsKHR(JNIEnv *__env, jclass clazz, jint count) {
    glMaxShaderCompilerThreadsKHRPROC glMaxShaderCompilerThreadsKHR = (glMaxShaderCompilerThreadsKHRPROC)tlsGetFunction(588);
    UNUSED_PARAM(clazz)
    glMaxShaderCompilerThreadsKHR(count);
}

EXTERN_C_EXIT
