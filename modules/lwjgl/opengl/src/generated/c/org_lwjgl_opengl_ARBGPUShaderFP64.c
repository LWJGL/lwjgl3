/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glUniform1dPROC) (jint, jdouble);
typedef void (APIENTRY *glUniform2dPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glUniform3dPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glUniform4dPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glUniform1dvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform2dvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform3dvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform4dvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniformMatrix2dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix3dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix4dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix2x3dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix2x4dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix3x2dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix3x4dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix4x2dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glUniformMatrix4x3dvPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glGetUniformdvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1dEXTPROC) (jint, jint, jdouble);
typedef void (APIENTRY *glProgramUniform2dEXTPROC) (jint, jint, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform3dEXTPROC) (jint, jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform4dEXTPROC) (jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform1dvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform2dvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform3dvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform4dvEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3dvEXTPROC) (jint, jint, jint, jboolean, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glUniform1d(JNIEnv *__env, jclass clazz, jint location, jdouble x) {
    glUniform1dPROC glUniform1d = (glUniform1dPROC)tlsGetFunction(730);
    UNUSED_PARAM(clazz)
    glUniform1d(location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glUniform2d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y) {
    glUniform2dPROC glUniform2d = (glUniform2dPROC)tlsGetFunction(731);
    UNUSED_PARAM(clazz)
    glUniform2d(location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glUniform3d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z) {
    glUniform3dPROC glUniform3d = (glUniform3dPROC)tlsGetFunction(732);
    UNUSED_PARAM(clazz)
    glUniform3d(location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glUniform4d(JNIEnv *__env, jclass clazz, jint location, jdouble x, jdouble y, jdouble z, jdouble w) {
    glUniform4dPROC glUniform4d = (glUniform4dPROC)tlsGetFunction(733);
    UNUSED_PARAM(clazz)
    glUniform4d(location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniform1dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1dvPROC glUniform1dv = (glUniform1dvPROC)tlsGetFunction(734);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniform2dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2dvPROC glUniform2dv = (glUniform2dvPROC)tlsGetFunction(735);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniform3dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3dvPROC glUniform3dv = (glUniform3dvPROC)tlsGetFunction(736);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniform4dv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4dvPROC glUniform4dv = (glUniform4dvPROC)tlsGetFunction(737);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4dv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix2dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2dvPROC glUniformMatrix2dv = (glUniformMatrix2dvPROC)tlsGetFunction(738);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix3dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3dvPROC glUniformMatrix3dv = (glUniformMatrix3dvPROC)tlsGetFunction(739);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix4dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4dvPROC glUniformMatrix4dv = (glUniformMatrix4dvPROC)tlsGetFunction(740);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix2x3dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2x3dvPROC glUniformMatrix2x3dv = (glUniformMatrix2x3dvPROC)tlsGetFunction(741);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix2x4dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix2x4dvPROC glUniformMatrix2x4dv = (glUniformMatrix2x4dvPROC)tlsGetFunction(742);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix2x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix3x2dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3x2dvPROC glUniformMatrix3x2dv = (glUniformMatrix3x2dvPROC)tlsGetFunction(743);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix3x4dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix3x4dvPROC glUniformMatrix3x4dv = (glUniformMatrix3x4dvPROC)tlsGetFunction(744);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix3x4dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix4x2dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4x2dvPROC glUniformMatrix4x2dv = (glUniformMatrix4x2dvPROC)tlsGetFunction(745);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4x2dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglUniformMatrix4x3dv__IIZJ(JNIEnv *__env, jclass clazz, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glUniformMatrix4x3dvPROC glUniformMatrix4x3dv = (glUniformMatrix4x3dvPROC)tlsGetFunction(746);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniformMatrix4x3dv(location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglGetUniformdv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformdvPROC glGetUniformdv = (glGetUniformdvPROC)tlsGetFunction(747);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformdv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform1dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x) {
    glProgramUniform1dEXTPROC glProgramUniform1dEXT = (glProgramUniform1dEXTPROC)tlsGetFunction(1116);
    UNUSED_PARAM(clazz)
    glProgramUniform1dEXT(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform2dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y) {
    glProgramUniform2dEXTPROC glProgramUniform2dEXT = (glProgramUniform2dEXTPROC)tlsGetFunction(1117);
    UNUSED_PARAM(clazz)
    glProgramUniform2dEXT(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform3dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z) {
    glProgramUniform3dEXTPROC glProgramUniform3dEXT = (glProgramUniform3dEXTPROC)tlsGetFunction(1118);
    UNUSED_PARAM(clazz)
    glProgramUniform3dEXT(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_glProgramUniform4dEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramUniform4dEXTPROC glProgramUniform4dEXT = (glProgramUniform4dEXTPROC)tlsGetFunction(1119);
    UNUSED_PARAM(clazz)
    glProgramUniform4dEXT(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform1dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1dvEXTPROC glProgramUniform1dvEXT = (glProgramUniform1dvEXTPROC)tlsGetFunction(1120);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform2dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2dvEXTPROC glProgramUniform2dvEXT = (glProgramUniform2dvEXTPROC)tlsGetFunction(1121);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform3dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3dvEXTPROC glProgramUniform3dvEXT = (glProgramUniform3dvEXTPROC)tlsGetFunction(1122);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniform4dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4dvEXTPROC glProgramUniform4dvEXT = (glProgramUniform4dvEXTPROC)tlsGetFunction(1123);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4dvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2dvEXTPROC glProgramUniformMatrix2dvEXT = (glProgramUniformMatrix2dvEXTPROC)tlsGetFunction(1124);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3dvEXTPROC glProgramUniformMatrix3dvEXT = (glProgramUniformMatrix3dvEXTPROC)tlsGetFunction(1125);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4dvEXTPROC glProgramUniformMatrix4dvEXT = (glProgramUniformMatrix4dvEXTPROC)tlsGetFunction(1126);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2x3dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3dvEXTPROC glProgramUniformMatrix2x3dvEXT = (glProgramUniformMatrix2x3dvEXTPROC)tlsGetFunction(1127);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix2x4dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4dvEXTPROC glProgramUniformMatrix2x4dvEXT = (glProgramUniformMatrix2x4dvEXTPROC)tlsGetFunction(1128);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3x2dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2dvEXTPROC glProgramUniformMatrix3x2dvEXT = (glProgramUniformMatrix3x2dvEXTPROC)tlsGetFunction(1129);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix3x4dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4dvEXTPROC glProgramUniformMatrix3x4dvEXT = (glProgramUniformMatrix3x4dvEXTPROC)tlsGetFunction(1130);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4x2dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2dvEXTPROC glProgramUniformMatrix4x2dvEXT = (glProgramUniformMatrix4x2dvEXTPROC)tlsGetFunction(1131);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2dvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGPUShaderFP64_nglProgramUniformMatrix4x3dvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3dvEXTPROC glProgramUniformMatrix4x3dvEXT = (glProgramUniformMatrix4x3dvEXTPROC)tlsGetFunction(1132);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3dvEXT(program, location, count, transpose, value);
}

EXTERN_C_EXIT
