/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawMeshTasksNVPROC) (jint, jint);
typedef void (APIENTRY *glDrawMeshTasksIndirectNVPROC) (intptr_t);
typedef void (APIENTRY *glMultiDrawMeshTasksIndirectNVPROC) (intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawMeshTasksIndirectCountNVPROC) (intptr_t, intptr_t, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glDrawMeshTasksNV(JNIEnv *__env, jclass clazz, jint first, jint count) {
    glDrawMeshTasksNVPROC glDrawMeshTasksNV = (glDrawMeshTasksNVPROC)tlsGetFunction(2033);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksNV(first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glDrawMeshTasksIndirectNV(JNIEnv *__env, jclass clazz, jlong indirect) {
    glDrawMeshTasksIndirectNVPROC glDrawMeshTasksIndirectNV = (glDrawMeshTasksIndirectNVPROC)tlsGetFunction(2034);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksIndirectNV((intptr_t)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glMultiDrawMeshTasksIndirectNV(JNIEnv *__env, jclass clazz, jlong indirect, jint drawcount, jint stride) {
    glMultiDrawMeshTasksIndirectNVPROC glMultiDrawMeshTasksIndirectNV = (glMultiDrawMeshTasksIndirectNVPROC)tlsGetFunction(2035);
    UNUSED_PARAM(clazz)
    glMultiDrawMeshTasksIndirectNV((intptr_t)indirect, drawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glMultiDrawMeshTasksIndirectCountNV(JNIEnv *__env, jclass clazz, jlong indirect, jlong drawcount, jint maxdrawcount, jint stride) {
    glMultiDrawMeshTasksIndirectCountNVPROC glMultiDrawMeshTasksIndirectCountNV = (glMultiDrawMeshTasksIndirectCountNVPROC)tlsGetFunction(2036);
    UNUSED_PARAM(clazz)
    glMultiDrawMeshTasksIndirectCountNV((intptr_t)indirect, (intptr_t)drawcount, maxdrawcount, stride);
}

EXTERN_C_EXIT
