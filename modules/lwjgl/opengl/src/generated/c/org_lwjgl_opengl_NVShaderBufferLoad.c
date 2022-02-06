/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMakeBufferResidentNVPROC) (jint, jint);
typedef void (APIENTRY *glMakeBufferNonResidentNVPROC) (jint);
typedef jboolean (APIENTRY *glIsBufferResidentNVPROC) (jint);
typedef void (APIENTRY *glMakeNamedBufferResidentNVPROC) (jint, jint);
typedef void (APIENTRY *glMakeNamedBufferNonResidentNVPROC) (jint);
typedef jboolean (APIENTRY *glIsNamedBufferResidentNVPROC) (jint);
typedef void (APIENTRY *glGetBufferParameterui64vNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedBufferParameterui64vNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetIntegerui64vNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glUniformui64NVPROC) (jint, jlong);
typedef void (APIENTRY *glUniformui64vNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetUniformui64vNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniformui64NVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniformui64vNVPROC) (jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glMakeBufferResidentNV(JNIEnv *__env, jclass clazz, jint target, jint access) {
    glMakeBufferResidentNVPROC glMakeBufferResidentNV = (glMakeBufferResidentNVPROC)tlsGetFunction(2126);
    UNUSED_PARAM(clazz)
    glMakeBufferResidentNV(target, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glMakeBufferNonResidentNV(JNIEnv *__env, jclass clazz, jint target) {
    glMakeBufferNonResidentNVPROC glMakeBufferNonResidentNV = (glMakeBufferNonResidentNVPROC)tlsGetFunction(2127);
    UNUSED_PARAM(clazz)
    glMakeBufferNonResidentNV(target);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glIsBufferResidentNV(JNIEnv *__env, jclass clazz, jint target) {
    glIsBufferResidentNVPROC glIsBufferResidentNV = (glIsBufferResidentNVPROC)tlsGetFunction(2128);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsBufferResidentNV(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glMakeNamedBufferResidentNV(JNIEnv *__env, jclass clazz, jint buffer, jint access) {
    glMakeNamedBufferResidentNVPROC glMakeNamedBufferResidentNV = (glMakeNamedBufferResidentNVPROC)tlsGetFunction(2129);
    UNUSED_PARAM(clazz)
    glMakeNamedBufferResidentNV(buffer, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glMakeNamedBufferNonResidentNV(JNIEnv *__env, jclass clazz, jint buffer) {
    glMakeNamedBufferNonResidentNVPROC glMakeNamedBufferNonResidentNV = (glMakeNamedBufferNonResidentNVPROC)tlsGetFunction(2130);
    UNUSED_PARAM(clazz)
    glMakeNamedBufferNonResidentNV(buffer);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glIsNamedBufferResidentNV(JNIEnv *__env, jclass clazz, jint buffer) {
    glIsNamedBufferResidentNVPROC glIsNamedBufferResidentNV = (glIsNamedBufferResidentNVPROC)tlsGetFunction(2131);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsNamedBufferResidentNV(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetBufferParameterui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetBufferParameterui64vNVPROC glGetBufferParameterui64vNV = (glGetBufferParameterui64vNVPROC)tlsGetFunction(2132);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBufferParameterui64vNV(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetNamedBufferParameterui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferParameterui64vNVPROC glGetNamedBufferParameterui64vNV = (glGetNamedBufferParameterui64vNVPROC)tlsGetFunction(2133);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferParameterui64vNV(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetIntegerui64vNV__IJ(JNIEnv *__env, jclass clazz, jint value, jlong resultAddress) {
    glGetIntegerui64vNVPROC glGetIntegerui64vNV = (glGetIntegerui64vNVPROC)tlsGetFunction(2134);
    uintptr_t result = (uintptr_t)resultAddress;
    UNUSED_PARAM(clazz)
    glGetIntegerui64vNV(value, result);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glUniformui64NV(JNIEnv *__env, jclass clazz, jint location, jlong value) {
    glUniformui64NVPROC glUniformui64NV = (glUniformui64NVPROC)tlsGetFunction(2135);
    UNUSED_PARAM(clazz)
    glUniformui64NV(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglUniformui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniformui64vNVPROC glUniformui64vNV = (glUniformui64vNVPROC)tlsGetFunction(2136);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglGetUniformui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformui64vNVPROC glGetUniformui64vNV = (glGetUniformui64vNVPROC)tlsGetFunction(1075);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformui64vNV(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_glProgramUniformui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value) {
    glProgramUniformui64NVPROC glProgramUniformui64NV = (glProgramUniformui64NVPROC)tlsGetFunction(2137);
    UNUSED_PARAM(clazz)
    glProgramUniformui64NV(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVShaderBufferLoad_nglProgramUniformui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniformui64vNVPROC glProgramUniformui64vNV = (glProgramUniformui64vNVPROC)tlsGetFunction(2138);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformui64vNV(program, location, count, value);
}

EXTERN_C_EXIT
