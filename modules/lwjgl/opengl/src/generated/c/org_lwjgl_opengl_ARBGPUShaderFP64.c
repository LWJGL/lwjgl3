/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glProgramUniform1dEXTPROC) (jint, jint, jdouble);
typedef void (APIENTRY *glProgramUniform2dEXTPROC) (jint, jint, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform3dEXTPROC) (jint, jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform4dEXTPROC) (jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform1dvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform2dvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform3dvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform4dvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3dvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform1dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x) {
    glProgramUniform1dEXTPROC glProgramUniform1dEXT = (glProgramUniform1dEXTPROC)tlsGetFunction(1152);
    UNUSED_PARAM(clazz)
    glProgramUniform1dEXT(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform2dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y) {
    glProgramUniform2dEXTPROC glProgramUniform2dEXT = (glProgramUniform2dEXTPROC)tlsGetFunction(1153);
    UNUSED_PARAM(clazz)
    glProgramUniform2dEXT(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform3dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z) {
    glProgramUniform3dEXTPROC glProgramUniform3dEXT = (glProgramUniform3dEXTPROC)tlsGetFunction(1154);
    UNUSED_PARAM(clazz)
    glProgramUniform3dEXT(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform4dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramUniform4dEXTPROC glProgramUniform4dEXT = (glProgramUniform4dEXTPROC)tlsGetFunction(1155);
    UNUSED_PARAM(clazz)
    glProgramUniform4dEXT(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform1dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1dvEXTPROC glProgramUniform1dvEXT = (glProgramUniform1dvEXTPROC)tlsGetFunction(1156);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform2dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2dvEXTPROC glProgramUniform2dvEXT = (glProgramUniform2dvEXTPROC)tlsGetFunction(1157);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform3dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3dvEXTPROC glProgramUniform3dvEXT = (glProgramUniform3dvEXTPROC)tlsGetFunction(1158);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform4dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4dvEXTPROC glProgramUniform4dvEXT = (glProgramUniform4dvEXTPROC)tlsGetFunction(1159);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2dvEXTPROC glProgramUniformMatrix2dvEXT = (glProgramUniformMatrix2dvEXTPROC)tlsGetFunction(1160);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3dvEXTPROC glProgramUniformMatrix3dvEXT = (glProgramUniformMatrix3dvEXTPROC)tlsGetFunction(1161);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4dvEXTPROC glProgramUniformMatrix4dvEXT = (glProgramUniformMatrix4dvEXTPROC)tlsGetFunction(1162);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2x3dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3dvEXTPROC glProgramUniformMatrix2x3dvEXT = (glProgramUniformMatrix2x3dvEXTPROC)tlsGetFunction(1163);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2x4dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4dvEXTPROC glProgramUniformMatrix2x4dvEXT = (glProgramUniformMatrix2x4dvEXTPROC)tlsGetFunction(1164);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3x2dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2dvEXTPROC glProgramUniformMatrix3x2dvEXT = (glProgramUniformMatrix3x2dvEXTPROC)tlsGetFunction(1165);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3x4dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4dvEXTPROC glProgramUniformMatrix3x4dvEXT = (glProgramUniformMatrix3x4dvEXTPROC)tlsGetFunction(1166);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4x2dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2dvEXTPROC glProgramUniformMatrix4x2dvEXT = (glProgramUniformMatrix4x2dvEXTPROC)tlsGetFunction(1167);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4x3dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3dvEXTPROC glProgramUniformMatrix4x3dvEXT = (glProgramUniformMatrix4x3dvEXTPROC)tlsGetFunction(1168);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3dvEXT(program, location, count, transpose, value);
}

EXTERN_C_EXIT
