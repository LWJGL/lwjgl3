/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glUniform1i64NVPROC) (jint, jlong);
typedef void (APIENTRY *glUniform2i64NVPROC) (jint, jlong, jlong);
typedef void (APIENTRY *glUniform3i64NVPROC) (jint, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform4i64NVPROC) (jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform1i64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform2i64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform3i64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform4i64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform1ui64NVPROC) (jint, jlong);
typedef void (APIENTRY *glUniform2ui64NVPROC) (jint, jlong, jlong);
typedef void (APIENTRY *glUniform3ui64NVPROC) (jint, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform4ui64NVPROC) (jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glUniform1ui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform2ui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform3ui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform4ui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformi64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformui64vNVPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1i64NVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniform2i64NVPROC) (jint, jint, jlong, jlong);
typedef void (APIENTRY *glProgramUniform3i64NVPROC) (jint, jint, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform4i64NVPROC) (jint, jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform1i64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform2i64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform3i64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform4i64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1ui64NVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniform2ui64NVPROC) (jint, jint, jlong, jlong);
typedef void (APIENTRY *glProgramUniform3ui64NVPROC) (jint, jint, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform4ui64NVPROC) (jint, jint, jlong, jlong, jlong, jlong);
typedef void (APIENTRY *glProgramUniform1ui64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform2ui64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform3ui64vNVPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform4ui64vNVPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform1i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x) {
    glUniform1i64NVPROC glUniform1i64NV = (glUniform1i64NVPROC)tlsGetFunction(637);
    UNUSED_PARAM(clazz)
    glUniform1i64NV(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform2i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y) {
    glUniform2i64NVPROC glUniform2i64NV = (glUniform2i64NVPROC)tlsGetFunction(638);
    UNUSED_PARAM(clazz)
    glUniform2i64NV(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform3i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z) {
    glUniform3i64NVPROC glUniform3i64NV = (glUniform3i64NVPROC)tlsGetFunction(639);
    UNUSED_PARAM(clazz)
    glUniform3i64NV(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform4i64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w) {
    glUniform4i64NVPROC glUniform4i64NV = (glUniform4i64NVPROC)tlsGetFunction(640);
    UNUSED_PARAM(clazz)
    glUniform4i64NV(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform1i64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1i64vNVPROC glUniform1i64vNV = (glUniform1i64vNVPROC)tlsGetFunction(641);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform2i64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2i64vNVPROC glUniform2i64vNV = (glUniform2i64vNVPROC)tlsGetFunction(642);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform3i64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3i64vNVPROC glUniform3i64vNV = (glUniform3i64vNVPROC)tlsGetFunction(643);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform4i64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4i64vNVPROC glUniform4i64vNV = (glUniform4i64vNVPROC)tlsGetFunction(644);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4i64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform1ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x) {
    glUniform1ui64NVPROC glUniform1ui64NV = (glUniform1ui64NVPROC)tlsGetFunction(645);
    UNUSED_PARAM(clazz)
    glUniform1ui64NV(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform2ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y) {
    glUniform2ui64NVPROC glUniform2ui64NV = (glUniform2ui64NVPROC)tlsGetFunction(646);
    UNUSED_PARAM(clazz)
    glUniform2ui64NV(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform3ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z) {
    glUniform3ui64NVPROC glUniform3ui64NV = (glUniform3ui64NVPROC)tlsGetFunction(647);
    UNUSED_PARAM(clazz)
    glUniform3ui64NV(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glUniform4ui64NV(JNIEnv *__env, jclass clazz, jint location, jlong x, jlong y, jlong z, jlong w) {
    glUniform4ui64NVPROC glUniform4ui64NV = (glUniform4ui64NVPROC)tlsGetFunction(648);
    UNUSED_PARAM(clazz)
    glUniform4ui64NV(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform1ui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1ui64vNVPROC glUniform1ui64vNV = (glUniform1ui64vNVPROC)tlsGetFunction(649);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform2ui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2ui64vNVPROC glUniform2ui64vNV = (glUniform2ui64vNVPROC)tlsGetFunction(650);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform3ui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3ui64vNVPROC glUniform3ui64vNV = (glUniform3ui64vNVPROC)tlsGetFunction(651);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglUniform4ui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4ui64vNVPROC glUniform4ui64vNV = (glUniform4ui64vNVPROC)tlsGetFunction(652);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4ui64vNV(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglGetUniformi64vNV__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformi64vNVPROC glGetUniformi64vNV = (glGetUniformi64vNVPROC)tlsGetFunction(653);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformi64vNV(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglGetUniformui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformui64vNVPROC glGetUniformui64vNV = (glGetUniformui64vNVPROC)tlsGetFunction(654);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformui64vNV(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform1i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x) {
    glProgramUniform1i64NVPROC glProgramUniform1i64NV = (glProgramUniform1i64NVPROC)tlsGetFunction(655);
    UNUSED_PARAM(clazz)
    glProgramUniform1i64NV(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform2i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y) {
    glProgramUniform2i64NVPROC glProgramUniform2i64NV = (glProgramUniform2i64NVPROC)tlsGetFunction(656);
    UNUSED_PARAM(clazz)
    glProgramUniform2i64NV(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform3i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z) {
    glProgramUniform3i64NVPROC glProgramUniform3i64NV = (glProgramUniform3i64NVPROC)tlsGetFunction(657);
    UNUSED_PARAM(clazz)
    glProgramUniform3i64NV(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform4i64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w) {
    glProgramUniform4i64NVPROC glProgramUniform4i64NV = (glProgramUniform4i64NVPROC)tlsGetFunction(658);
    UNUSED_PARAM(clazz)
    glProgramUniform4i64NV(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform1i64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1i64vNVPROC glProgramUniform1i64vNV = (glProgramUniform1i64vNVPROC)tlsGetFunction(659);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform2i64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2i64vNVPROC glProgramUniform2i64vNV = (glProgramUniform2i64vNVPROC)tlsGetFunction(660);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform3i64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3i64vNVPROC glProgramUniform3i64vNV = (glProgramUniform3i64vNVPROC)tlsGetFunction(661);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform4i64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4i64vNVPROC glProgramUniform4i64vNV = (glProgramUniform4i64vNVPROC)tlsGetFunction(662);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4i64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform1ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x) {
    glProgramUniform1ui64NVPROC glProgramUniform1ui64NV = (glProgramUniform1ui64NVPROC)tlsGetFunction(663);
    UNUSED_PARAM(clazz)
    glProgramUniform1ui64NV(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform2ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y) {
    glProgramUniform2ui64NVPROC glProgramUniform2ui64NV = (glProgramUniform2ui64NVPROC)tlsGetFunction(664);
    UNUSED_PARAM(clazz)
    glProgramUniform2ui64NV(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform3ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z) {
    glProgramUniform3ui64NVPROC glProgramUniform3ui64NV = (glProgramUniform3ui64NVPROC)tlsGetFunction(665);
    UNUSED_PARAM(clazz)
    glProgramUniform3ui64NV(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_glProgramUniform4ui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong x, jlong y, jlong z, jlong w) {
    glProgramUniform4ui64NVPROC glProgramUniform4ui64NV = (glProgramUniform4ui64NVPROC)tlsGetFunction(666);
    UNUSED_PARAM(clazz)
    glProgramUniform4ui64NV(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform1ui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1ui64vNVPROC glProgramUniform1ui64vNV = (glProgramUniform1ui64vNVPROC)tlsGetFunction(667);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1ui64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform2ui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2ui64vNVPROC glProgramUniform2ui64vNV = (glProgramUniform2ui64vNVPROC)tlsGetFunction(668);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2ui64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform3ui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3ui64vNVPROC glProgramUniform3ui64vNV = (glProgramUniform3ui64vNVPROC)tlsGetFunction(669);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3ui64vNV(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVGPUShader5_nglProgramUniform4ui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4ui64vNVPROC glProgramUniform4ui64vNV = (glProgramUniform4ui64vNVPROC)tlsGetFunction(670);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4ui64vNV(program, location, count, value);
}

EXTERN_C_EXIT
