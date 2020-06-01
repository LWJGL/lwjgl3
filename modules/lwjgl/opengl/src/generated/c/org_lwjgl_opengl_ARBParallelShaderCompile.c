/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMaxShaderCompilerThreadsARBPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBParallelShaderCompile_glMaxShaderCompilerThreadsARB(JNIEnv *__env, jclass clazz, jint count) {
    glMaxShaderCompilerThreadsARBPROC glMaxShaderCompilerThreadsARB = (glMaxShaderCompilerThreadsARBPROC)tlsGetFunction(1289);
    UNUSED_PARAM(clazz)
    glMaxShaderCompilerThreadsARB(count);
}

EXTERN_C_EXIT
