/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDispatchComputeGroupSizeARBPROC) (jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBComputeVariableGroupSize_glDispatchComputeGroupSizeARB(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z, jint group_size_x, jint group_size_y, jint group_size_z) {
    glDispatchComputeGroupSizeARBPROC glDispatchComputeGroupSizeARB = (glDispatchComputeGroupSizeARBPROC)tlsGetFunction(1132);
    UNUSED_PARAM(clazz)
    glDispatchComputeGroupSizeARB(num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z);
}

EXTERN_C_EXIT
