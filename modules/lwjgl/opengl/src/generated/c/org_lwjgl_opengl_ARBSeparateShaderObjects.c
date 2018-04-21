/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glUseProgramStagesPROC) (jint, jint, jint);
typedef void (APIENTRY *glActiveShaderProgramPROC) (jint, jint);
typedef jint (APIENTRY *glCreateShaderProgramvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindProgramPipelinePROC) (jint);
typedef void (APIENTRY *glDeleteProgramPipelinesPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenProgramPipelinesPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsProgramPipelinePROC) (jint);
typedef void (APIENTRY *glProgramParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetProgramPipelineivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1iPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3iPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4iPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2uiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3uiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4uiPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1fPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glProgramUniform2fPROC) (jint, jint, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform3fPROC) (jint, jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform4fPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform1dPROC) (jint, jint, jdouble);
typedef void (APIENTRY *glProgramUniform2dPROC) (jint, jint, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform3dPROC) (jint, jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform4dPROC) (jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramUniform1ivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform2ivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform3ivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform4ivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1uivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform2uivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform3uivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform4uivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1fvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform2fvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform3fvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform4fvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform1dvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform2dvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform3dvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniform4dvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3dvPROC) (jint, jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glValidateProgramPipelinePROC) (jint);
typedef void (APIENTRY *glGetProgramPipelineInfoLogPROC) (jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glUseProgramStages(JNIEnv *__env, jclass clazz, jint pipeline, jint stages, jint program) {
    glUseProgramStagesPROC glUseProgramStages = (glUseProgramStagesPROC)tlsGetFunction(778);
    UNUSED_PARAM(clazz)
    glUseProgramStages(pipeline, stages, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glActiveShaderProgram(JNIEnv *__env, jclass clazz, jint pipeline, jint program) {
    glActiveShaderProgramPROC glActiveShaderProgram = (glActiveShaderProgramPROC)tlsGetFunction(779);
    UNUSED_PARAM(clazz)
    glActiveShaderProgram(pipeline, program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglCreateShaderProgramv(JNIEnv *__env, jclass clazz, jint type, jint count, jlong stringsAddress) {
    glCreateShaderProgramvPROC glCreateShaderProgramv = (glCreateShaderProgramvPROC)tlsGetFunction(780);
    intptr_t strings = (intptr_t)stringsAddress;
    UNUSED_PARAM(clazz)
    return (jint)glCreateShaderProgramv(type, count, strings);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glBindProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glBindProgramPipelinePROC glBindProgramPipeline = (glBindProgramPipelinePROC)tlsGetFunction(781);
    UNUSED_PARAM(clazz)
    glBindProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglDeleteProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glDeleteProgramPipelinesPROC glDeleteProgramPipelines = (glDeleteProgramPipelinesPROC)tlsGetFunction(782);
    intptr_t pipelines = (intptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glDeleteProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglGenProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glGenProgramPipelinesPROC glGenProgramPipelines = (glGenProgramPipelinesPROC)tlsGetFunction(783);
    intptr_t pipelines = (intptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glGenProgramPipelines(n, pipelines);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glIsProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glIsProgramPipelinePROC glIsProgramPipeline = (glIsProgramPipelinePROC)tlsGetFunction(784);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramParameteri(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value) {
    glProgramParameteriPROC glProgramParameteri = (glProgramParameteriPROC)tlsGetFunction(777);
    UNUSED_PARAM(clazz)
    glProgramParameteri(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglGetProgramPipelineiv__IIJ(JNIEnv *__env, jclass clazz, jint pipeline, jint pname, jlong paramsAddress) {
    glGetProgramPipelineivPROC glGetProgramPipelineiv = (glGetProgramPipelineivPROC)tlsGetFunction(785);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineiv(pipeline, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform1i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x) {
    glProgramUniform1iPROC glProgramUniform1i = (glProgramUniform1iPROC)tlsGetFunction(786);
    UNUSED_PARAM(clazz)
    glProgramUniform1i(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform2i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y) {
    glProgramUniform2iPROC glProgramUniform2i = (glProgramUniform2iPROC)tlsGetFunction(787);
    UNUSED_PARAM(clazz)
    glProgramUniform2i(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform3i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z) {
    glProgramUniform3iPROC glProgramUniform3i = (glProgramUniform3iPROC)tlsGetFunction(788);
    UNUSED_PARAM(clazz)
    glProgramUniform3i(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform4i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jint w) {
    glProgramUniform4iPROC glProgramUniform4i = (glProgramUniform4iPROC)tlsGetFunction(789);
    UNUSED_PARAM(clazz)
    glProgramUniform4i(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform1ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x) {
    glProgramUniform1uiPROC glProgramUniform1ui = (glProgramUniform1uiPROC)tlsGetFunction(790);
    UNUSED_PARAM(clazz)
    glProgramUniform1ui(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform2ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y) {
    glProgramUniform2uiPROC glProgramUniform2ui = (glProgramUniform2uiPROC)tlsGetFunction(791);
    UNUSED_PARAM(clazz)
    glProgramUniform2ui(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform3ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z) {
    glProgramUniform3uiPROC glProgramUniform3ui = (glProgramUniform3uiPROC)tlsGetFunction(792);
    UNUSED_PARAM(clazz)
    glProgramUniform3ui(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform4ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jint w) {
    glProgramUniform4uiPROC glProgramUniform4ui = (glProgramUniform4uiPROC)tlsGetFunction(793);
    UNUSED_PARAM(clazz)
    glProgramUniform4ui(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform1f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x) {
    glProgramUniform1fPROC glProgramUniform1f = (glProgramUniform1fPROC)tlsGetFunction(794);
    UNUSED_PARAM(clazz)
    glProgramUniform1f(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform2f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y) {
    glProgramUniform2fPROC glProgramUniform2f = (glProgramUniform2fPROC)tlsGetFunction(795);
    UNUSED_PARAM(clazz)
    glProgramUniform2f(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform3f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y, jfloat z) {
    glProgramUniform3fPROC glProgramUniform3f = (glProgramUniform3fPROC)tlsGetFunction(796);
    UNUSED_PARAM(clazz)
    glProgramUniform3f(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform4f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y, jfloat z, jfloat w) {
    glProgramUniform4fPROC glProgramUniform4f = (glProgramUniform4fPROC)tlsGetFunction(797);
    UNUSED_PARAM(clazz)
    glProgramUniform4f(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform1d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x) {
    glProgramUniform1dPROC glProgramUniform1d = (glProgramUniform1dPROC)tlsGetFunction(798);
    UNUSED_PARAM(clazz)
    glProgramUniform1d(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform2d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y) {
    glProgramUniform2dPROC glProgramUniform2d = (glProgramUniform2dPROC)tlsGetFunction(799);
    UNUSED_PARAM(clazz)
    glProgramUniform2d(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform3d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z) {
    glProgramUniform3dPROC glProgramUniform3d = (glProgramUniform3dPROC)tlsGetFunction(800);
    UNUSED_PARAM(clazz)
    glProgramUniform3d(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glProgramUniform4d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramUniform4dPROC glProgramUniform4d = (glProgramUniform4dPROC)tlsGetFunction(801);
    UNUSED_PARAM(clazz)
    glProgramUniform4d(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform1iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1ivPROC glProgramUniform1iv = (glProgramUniform1ivPROC)tlsGetFunction(802);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform2iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2ivPROC glProgramUniform2iv = (glProgramUniform2ivPROC)tlsGetFunction(803);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform3iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3ivPROC glProgramUniform3iv = (glProgramUniform3ivPROC)tlsGetFunction(804);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform4iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4ivPROC glProgramUniform4iv = (glProgramUniform4ivPROC)tlsGetFunction(805);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform1uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1uivPROC glProgramUniform1uiv = (glProgramUniform1uivPROC)tlsGetFunction(806);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform2uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2uivPROC glProgramUniform2uiv = (glProgramUniform2uivPROC)tlsGetFunction(807);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform3uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3uivPROC glProgramUniform3uiv = (glProgramUniform3uivPROC)tlsGetFunction(808);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform4uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4uivPROC glProgramUniform4uiv = (glProgramUniform4uivPROC)tlsGetFunction(809);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform1fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1fvPROC glProgramUniform1fv = (glProgramUniform1fvPROC)tlsGetFunction(810);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform2fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2fvPROC glProgramUniform2fv = (glProgramUniform2fvPROC)tlsGetFunction(811);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform3fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3fvPROC glProgramUniform3fv = (glProgramUniform3fvPROC)tlsGetFunction(812);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform4fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4fvPROC glProgramUniform4fv = (glProgramUniform4fvPROC)tlsGetFunction(813);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform1dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1dvPROC glProgramUniform1dv = (glProgramUniform1dvPROC)tlsGetFunction(814);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform2dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2dvPROC glProgramUniform2dv = (glProgramUniform2dvPROC)tlsGetFunction(815);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform3dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3dvPROC glProgramUniform3dv = (glProgramUniform3dvPROC)tlsGetFunction(816);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniform4dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4dvPROC glProgramUniform4dv = (glProgramUniform4dvPROC)tlsGetFunction(817);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2fvPROC glProgramUniformMatrix2fv = (glProgramUniformMatrix2fvPROC)tlsGetFunction(818);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3fvPROC glProgramUniformMatrix3fv = (glProgramUniformMatrix3fvPROC)tlsGetFunction(819);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4fvPROC glProgramUniformMatrix4fv = (glProgramUniformMatrix4fvPROC)tlsGetFunction(820);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix2dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2dvPROC glProgramUniformMatrix2dv = (glProgramUniformMatrix2dvPROC)tlsGetFunction(821);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix3dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3dvPROC glProgramUniformMatrix3dv = (glProgramUniformMatrix3dvPROC)tlsGetFunction(822);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix4dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4dvPROC glProgramUniformMatrix4dv = (glProgramUniformMatrix4dvPROC)tlsGetFunction(823);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix2x3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3fvPROC glProgramUniformMatrix2x3fv = (glProgramUniformMatrix2x3fvPROC)tlsGetFunction(824);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix3x2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2fvPROC glProgramUniformMatrix3x2fv = (glProgramUniformMatrix3x2fvPROC)tlsGetFunction(825);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix2x4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4fvPROC glProgramUniformMatrix2x4fv = (glProgramUniformMatrix2x4fvPROC)tlsGetFunction(826);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix4x2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2fvPROC glProgramUniformMatrix4x2fv = (glProgramUniformMatrix4x2fvPROC)tlsGetFunction(827);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix3x4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4fvPROC glProgramUniformMatrix3x4fv = (glProgramUniformMatrix3x4fvPROC)tlsGetFunction(828);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix4x3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3fvPROC glProgramUniformMatrix4x3fv = (glProgramUniformMatrix4x3fvPROC)tlsGetFunction(829);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix2x3dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3dvPROC glProgramUniformMatrix2x3dv = (glProgramUniformMatrix2x3dvPROC)tlsGetFunction(830);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix3x2dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2dvPROC glProgramUniformMatrix3x2dv = (glProgramUniformMatrix3x2dvPROC)tlsGetFunction(831);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix2x4dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4dvPROC glProgramUniformMatrix2x4dv = (glProgramUniformMatrix2x4dvPROC)tlsGetFunction(832);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix4x2dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2dvPROC glProgramUniformMatrix4x2dv = (glProgramUniformMatrix4x2dvPROC)tlsGetFunction(833);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix3x4dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4dvPROC glProgramUniformMatrix3x4dv = (glProgramUniformMatrix3x4dvPROC)tlsGetFunction(834);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglProgramUniformMatrix4x3dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3dvPROC glProgramUniformMatrix4x3dv = (glProgramUniformMatrix4x3dvPROC)tlsGetFunction(835);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_glValidateProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glValidateProgramPipelinePROC glValidateProgramPipeline = (glValidateProgramPipelinePROC)tlsGetFunction(836);
    UNUSED_PARAM(clazz)
    glValidateProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSeparateShaderObjects_nglGetProgramPipelineInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint pipeline, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
    glGetProgramPipelineInfoLogPROC glGetProgramPipelineInfoLog = (glGetProgramPipelineInfoLogPROC)tlsGetFunction(837);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t infoLog = (intptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
}

EXTERN_C_EXIT
