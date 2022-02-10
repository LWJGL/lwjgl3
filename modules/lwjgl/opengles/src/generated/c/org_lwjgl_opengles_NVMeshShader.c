/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawMeshTasksNVPROC) (jint, jint);
typedef void (APIENTRY *glDrawMeshTasksIndirectNVPROC) (uintptr_t);
typedef void (APIENTRY *glMultiDrawMeshTasksIndirectNVPROC) (uintptr_t, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVMeshShader_glDrawMeshTasksNV(JNIEnv *__env, jclass clazz, jint first, jint count) {
    glDrawMeshTasksNVPROC glDrawMeshTasksNV = (glDrawMeshTasksNVPROC)tlsGetFunction(687);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksNV(first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVMeshShader_glDrawMeshTasksIndirectNV(JNIEnv *__env, jclass clazz, jlong indirect) {
    glDrawMeshTasksIndirectNVPROC glDrawMeshTasksIndirectNV = (glDrawMeshTasksIndirectNVPROC)tlsGetFunction(688);
    UNUSED_PARAM(clazz)
    glDrawMeshTasksIndirectNV((uintptr_t)indirect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVMeshShader_glMultiDrawMeshTasksIndirectNV(JNIEnv *__env, jclass clazz, jlong indirect, jint drawcount, jint stride) {
    glMultiDrawMeshTasksIndirectNVPROC glMultiDrawMeshTasksIndirectNV = (glMultiDrawMeshTasksIndirectNVPROC)tlsGetFunction(689);
    UNUSED_PARAM(clazz)
    glMultiDrawMeshTasksIndirectNV((uintptr_t)indirect, drawcount, stride);
}

EXTERN_C_EXIT
