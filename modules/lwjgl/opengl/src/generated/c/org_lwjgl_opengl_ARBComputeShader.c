/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDispatchComputePROC) (jint, jint, jint);
typedef void (APIENTRY *glDispatchComputeIndirectPROC) (intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBComputeShader_glDispatchCompute(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z) {
    glDispatchComputePROC glDispatchCompute = (glDispatchComputePROC)tlsGetFunction(872);
    UNUSED_PARAM(clazz)
    glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBComputeShader_nglDispatchComputeIndirect(JNIEnv *__env, jclass clazz, jlong indirect) {
    glDispatchComputeIndirectPROC glDispatchComputeIndirect = (glDispatchComputeIndirectPROC)tlsGetFunction(873);
    UNUSED_PARAM(clazz)
    glDispatchComputeIndirect((intptr_t)indirect);
}

EXTERN_C_EXIT
