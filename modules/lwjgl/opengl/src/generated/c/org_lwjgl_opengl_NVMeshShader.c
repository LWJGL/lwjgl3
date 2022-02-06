/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawMeshTasksNVPROC) (jint, jint);
typedef void (APIENTRY *glDrawMeshTasksIndirectNVPROC) (uintptr_t);
typedef void (APIENTRY *glMultiDrawMeshTasksIndirectNVPROC) (uintptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawMeshTasksIndirectCountNVPROC) (uintptr_t, uintptr_t, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glDrawMeshTasksNV(JNIEnv *__env, jclass clazz, jint first, jint count) {
    glDrawMeshTasksNVPROC glDrawMeshTasksNV = (glDrawMeshTasksNVPROC)tlsGetFunction(2043);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksNV(first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glDrawMeshTasksIndirectNV(JNIEnv *__env, jclass clazz, jlong indirect) {
    glDrawMeshTasksIndirectNVPROC glDrawMeshTasksIndirectNV = (glDrawMeshTasksIndirectNVPROC)tlsGetFunction(2044);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksIndirectNV((uintptr_t)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glMultiDrawMeshTasksIndirectNV(JNIEnv *__env, jclass clazz, jlong indirect, jint drawcount, jint stride) {
    glMultiDrawMeshTasksIndirectNVPROC glMultiDrawMeshTasksIndirectNV = (glMultiDrawMeshTasksIndirectNVPROC)tlsGetFunction(2045);
    UNUSED_PARAM(clazz)
    glMultiDrawMeshTasksIndirectNV((uintptr_t)indirect, drawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMeshShader_glMultiDrawMeshTasksIndirectCountNV(JNIEnv *__env, jclass clazz, jlong indirect, jlong drawcount, jint maxdrawcount, jint stride) {
    glMultiDrawMeshTasksIndirectCountNVPROC glMultiDrawMeshTasksIndirectCountNV = (glMultiDrawMeshTasksIndirectCountNVPROC)tlsGetFunction(2046);
    UNUSED_PARAM(clazz)
    glMultiDrawMeshTasksIndirectCountNV((uintptr_t)indirect, (uintptr_t)drawcount, maxdrawcount, stride);
}

EXTERN_C_EXIT
