/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMultiDrawArraysIndirectCountPROC) (jint, uintptr_t, uintptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsIndirectCountPROC) (jint, jint, uintptr_t, uintptr_t, jint, jint);
typedef void (APIENTRY *glPolygonOffsetClampPROC) (jfloat, jfloat, jfloat);
typedef void (APIENTRY *glSpecializeShaderPROC) (jint, uintptr_t, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46C_nglMultiDrawArraysIndirectCount__IJJII(JNIEnv *__env, jclass clazz, jint mode, jlong indirectAddress, jlong drawcount, jint maxdrawcount, jint stride) {
    glMultiDrawArraysIndirectCountPROC glMultiDrawArraysIndirectCount = (glMultiDrawArraysIndirectCountPROC)tlsGetFunction(1044);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArraysIndirectCount(mode, indirect, (uintptr_t)drawcount, maxdrawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46C_nglMultiDrawElementsIndirectCount__IIJJII(JNIEnv *__env, jclass clazz, jint mode, jint type, jlong indirectAddress, jlong drawcount, jint maxdrawcount, jint stride) {
    glMultiDrawElementsIndirectCountPROC glMultiDrawElementsIndirectCount = (glMultiDrawElementsIndirectCountPROC)tlsGetFunction(1045);
    uintptr_t indirect = (uintptr_t)indirectAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsIndirectCount(mode, type, indirect, (uintptr_t)drawcount, maxdrawcount, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46C_glPolygonOffsetClamp(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units, jfloat clamp) {
    glPolygonOffsetClampPROC glPolygonOffsetClamp = (glPolygonOffsetClampPROC)tlsGetFunction(1046);
    UNUSED_PARAM(clazz)
    glPolygonOffsetClamp(factor, units, clamp);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL46C_nglSpecializeShader__IJIJJ(JNIEnv *__env, jclass clazz, jint shader, jlong pEntryPointAddress, jint numSpecializationConstants, jlong pConstantIndexAddress, jlong pConstantValueAddress) {
    glSpecializeShaderPROC glSpecializeShader = (glSpecializeShaderPROC)tlsGetFunction(1047);
    uintptr_t pEntryPoint = (uintptr_t)pEntryPointAddress;
    uintptr_t pConstantIndex = (uintptr_t)pConstantIndexAddress;
    uintptr_t pConstantValue = (uintptr_t)pConstantValueAddress;
    UNUSED_PARAM(clazz)
    glSpecializeShader(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
}

EXTERN_C_EXIT
