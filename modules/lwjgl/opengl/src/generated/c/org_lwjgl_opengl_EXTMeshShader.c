/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawMeshTasksEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawMeshTasksIndirectEXTPROC) (uintptr_t);
typedef void (APIENTRY *glMultiDrawMeshTasksIndirectEXTPROC) (uintptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawMeshTasksIndirectCountEXTPROC) (uintptr_t, uintptr_t, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTMeshShader_glDrawMeshTasksEXT(JNIEnv *__env, jclass clazz, jint num_groups_x, jint num_groups_y, jint num_groups_z) {
    glDrawMeshTasksEXTPROC glDrawMeshTasksEXT = (glDrawMeshTasksEXTPROC)tlsGetFunction(1853);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksEXT(num_groups_x, num_groups_y, num_groups_z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTMeshShader_glDrawMeshTasksIndirectEXT(JNIEnv *__env, jclass clazz, jlong indirect) {
    glDrawMeshTasksIndirectEXTPROC glDrawMeshTasksIndirectEXT = (glDrawMeshTasksIndirectEXTPROC)tlsGetFunction(1854);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksIndirectEXT((uintptr_t)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTMeshShader_glMultiDrawMeshTasksIndirectEXT(JNIEnv *__env, jclass clazz, jlong indirect, jint drawcount, jint stride) {
    glMultiDrawMeshTasksIndirectEXTPROC glMultiDrawMeshTasksIndirectEXT = (glMultiDrawMeshTasksIndirectEXTPROC)tlsGetFunction(1855);
    UNUSED_PARAM(clazz)
    glMultiDrawMeshTasksIndirectEXT((uintptr_t)indirect, drawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTMeshShader_glMultiDrawMeshTasksIndirectCountEXT(JNIEnv *__env, jclass clazz, jlong indirect, jlong drawcount, jint maxdrawcount, jint stride) {
    glMultiDrawMeshTasksIndirectCountEXTPROC glMultiDrawMeshTasksIndirectCountEXT = (glMultiDrawMeshTasksIndirectCountEXTPROC)tlsGetFunction(1856);
    UNUSED_PARAM(clazz)
    glMultiDrawMeshTasksIndirectCountEXT((uintptr_t)indirect, (uintptr_t)drawcount, maxdrawcount, stride);
}

EXTERN_C_EXIT
