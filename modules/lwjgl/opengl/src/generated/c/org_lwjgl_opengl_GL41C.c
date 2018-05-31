/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glReleaseShaderCompilerPROC) (void);
typedef void (APIENTRY *glShaderBinaryPROC) (jint, intptr_t, jint, intptr_t, jint);
typedef void (APIENTRY *glGetShaderPrecisionFormatPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glDepthRangefPROC) (jfloat, jfloat);
typedef void (APIENTRY *glClearDepthfPROC) (jfloat);
typedef void (APIENTRY *glGetProgramBinaryPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glProgramBinaryPROC) (jint, jint, intptr_t, jint);
typedef void (APIENTRY *glProgramParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glUseProgramStagesPROC) (jint, jint, jint);
typedef void (APIENTRY *glActiveShaderProgramPROC) (jint, jint);
typedef jint (APIENTRY *glCreateShaderProgramvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindProgramPipelinePROC) (jint);
typedef void (APIENTRY *glDeleteProgramPipelinesPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenProgramPipelinesPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsProgramPipelinePROC) (jint);
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
typedef void (APIENTRY *glVertexAttribL1dPROC) (jint, jdouble);
typedef void (APIENTRY *glVertexAttribL2dPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttribL3dPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttribL4dPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glVertexAttribL1dvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribL2dvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribL3dvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribL4dvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribLPointerPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribLdvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glViewportArrayvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glViewportIndexedfPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glViewportIndexedfvPROC) (jint, intptr_t);
typedef void (APIENTRY *glScissorArrayvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glScissorIndexedPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glScissorIndexedvPROC) (jint, intptr_t);
typedef void (APIENTRY *glDepthRangeArrayvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glDepthRangeIndexedPROC) (jint, jdouble, jdouble);
typedef void (APIENTRY *glGetFloati_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetDoublei_vPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glReleaseShaderCompiler(JNIEnv *__env, jclass clazz) {
    glReleaseShaderCompilerPROC glReleaseShaderCompiler = (glReleaseShaderCompilerPROC)tlsGetFunction(770);
    UNUSED_PARAM(clazz)
    glReleaseShaderCompiler();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglShaderBinary__IJIJI(JNIEnv *__env, jclass clazz, jint count, jlong shadersAddress, jint binaryformat, jlong binaryAddress, jint length) {
    glShaderBinaryPROC glShaderBinary = (glShaderBinaryPROC)tlsGetFunction(771);
    intptr_t shaders = (intptr_t)shadersAddress;
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glShaderBinary(count, shaders, binaryformat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGetShaderPrecisionFormat__IIJJ(JNIEnv *__env, jclass clazz, jint shadertype, jint precisiontype, jlong rangeAddress, jlong precisionAddress) {
    glGetShaderPrecisionFormatPROC glGetShaderPrecisionFormat = (glGetShaderPrecisionFormatPROC)tlsGetFunction(772);
    intptr_t range = (intptr_t)rangeAddress;
    intptr_t precision = (intptr_t)precisionAddress;
    UNUSED_PARAM(clazz)
    glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glDepthRangef(JNIEnv *__env, jclass clazz, jfloat zNear, jfloat zFar) {
    glDepthRangefPROC glDepthRangef = (glDepthRangefPROC)tlsGetFunction(773);
    UNUSED_PARAM(clazz)
    glDepthRangef(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glClearDepthf(JNIEnv *__env, jclass clazz, jfloat depth) {
    glClearDepthfPROC glClearDepthf = (glClearDepthfPROC)tlsGetFunction(774);
    UNUSED_PARAM(clazz)
    glClearDepthf(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGetProgramBinary__IIJJJ(JNIEnv *__env, jclass clazz, jint program, jint bufSize, jlong lengthAddress, jlong binaryFormatAddress, jlong binaryAddress) {
    glGetProgramBinaryPROC glGetProgramBinary = (glGetProgramBinaryPROC)tlsGetFunction(775);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t binaryFormat = (intptr_t)binaryFormatAddress;
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glGetProgramBinary(program, bufSize, length, binaryFormat, binary);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramBinary(JNIEnv *__env, jclass clazz, jint program, jint binaryFormat, jlong binaryAddress, jint length) {
    glProgramBinaryPROC glProgramBinary = (glProgramBinaryPROC)tlsGetFunction(776);
    intptr_t binary = (intptr_t)binaryAddress;
    UNUSED_PARAM(clazz)
    glProgramBinary(program, binaryFormat, binary, length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramParameteri(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value) {
    glProgramParameteriPROC glProgramParameteri = (glProgramParameteriPROC)tlsGetFunction(777);
    UNUSED_PARAM(clazz)
    glProgramParameteri(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glUseProgramStages(JNIEnv *__env, jclass clazz, jint pipeline, jint stages, jint program) {
    glUseProgramStagesPROC glUseProgramStages = (glUseProgramStagesPROC)tlsGetFunction(778);
    UNUSED_PARAM(clazz)
    glUseProgramStages(pipeline, stages, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glActiveShaderProgram(JNIEnv *__env, jclass clazz, jint pipeline, jint program) {
    glActiveShaderProgramPROC glActiveShaderProgram = (glActiveShaderProgramPROC)tlsGetFunction(779);
    UNUSED_PARAM(clazz)
    glActiveShaderProgram(pipeline, program);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL41C_nglCreateShaderProgramv(JNIEnv *__env, jclass clazz, jint type, jint count, jlong stringsAddress) {
    glCreateShaderProgramvPROC glCreateShaderProgramv = (glCreateShaderProgramvPROC)tlsGetFunction(780);
    intptr_t strings = (intptr_t)stringsAddress;
    UNUSED_PARAM(clazz)
    return (jint)glCreateShaderProgramv(type, count, strings);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glBindProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glBindProgramPipelinePROC glBindProgramPipeline = (glBindProgramPipelinePROC)tlsGetFunction(781);
    UNUSED_PARAM(clazz)
    glBindProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglDeleteProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glDeleteProgramPipelinesPROC glDeleteProgramPipelines = (glDeleteProgramPipelinesPROC)tlsGetFunction(782);
    intptr_t pipelines = (intptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glDeleteProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGenProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glGenProgramPipelinesPROC glGenProgramPipelines = (glGenProgramPipelinesPROC)tlsGetFunction(783);
    intptr_t pipelines = (intptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glGenProgramPipelines(n, pipelines);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL41C_glIsProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glIsProgramPipelinePROC glIsProgramPipeline = (glIsProgramPipelinePROC)tlsGetFunction(784);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGetProgramPipelineiv__IIJ(JNIEnv *__env, jclass clazz, jint pipeline, jint pname, jlong paramsAddress) {
    glGetProgramPipelineivPROC glGetProgramPipelineiv = (glGetProgramPipelineivPROC)tlsGetFunction(785);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineiv(pipeline, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform1i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x) {
    glProgramUniform1iPROC glProgramUniform1i = (glProgramUniform1iPROC)tlsGetFunction(786);
    UNUSED_PARAM(clazz)
    glProgramUniform1i(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform2i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y) {
    glProgramUniform2iPROC glProgramUniform2i = (glProgramUniform2iPROC)tlsGetFunction(787);
    UNUSED_PARAM(clazz)
    glProgramUniform2i(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform3i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z) {
    glProgramUniform3iPROC glProgramUniform3i = (glProgramUniform3iPROC)tlsGetFunction(788);
    UNUSED_PARAM(clazz)
    glProgramUniform3i(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform4i(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jint w) {
    glProgramUniform4iPROC glProgramUniform4i = (glProgramUniform4iPROC)tlsGetFunction(789);
    UNUSED_PARAM(clazz)
    glProgramUniform4i(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform1ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x) {
    glProgramUniform1uiPROC glProgramUniform1ui = (glProgramUniform1uiPROC)tlsGetFunction(790);
    UNUSED_PARAM(clazz)
    glProgramUniform1ui(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform2ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y) {
    glProgramUniform2uiPROC glProgramUniform2ui = (glProgramUniform2uiPROC)tlsGetFunction(791);
    UNUSED_PARAM(clazz)
    glProgramUniform2ui(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform3ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z) {
    glProgramUniform3uiPROC glProgramUniform3ui = (glProgramUniform3uiPROC)tlsGetFunction(792);
    UNUSED_PARAM(clazz)
    glProgramUniform3ui(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform4ui(JNIEnv *__env, jclass clazz, jint program, jint location, jint x, jint y, jint z, jint w) {
    glProgramUniform4uiPROC glProgramUniform4ui = (glProgramUniform4uiPROC)tlsGetFunction(793);
    UNUSED_PARAM(clazz)
    glProgramUniform4ui(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform1f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x) {
    glProgramUniform1fPROC glProgramUniform1f = (glProgramUniform1fPROC)tlsGetFunction(794);
    UNUSED_PARAM(clazz)
    glProgramUniform1f(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform2f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y) {
    glProgramUniform2fPROC glProgramUniform2f = (glProgramUniform2fPROC)tlsGetFunction(795);
    UNUSED_PARAM(clazz)
    glProgramUniform2f(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform3f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y, jfloat z) {
    glProgramUniform3fPROC glProgramUniform3f = (glProgramUniform3fPROC)tlsGetFunction(796);
    UNUSED_PARAM(clazz)
    glProgramUniform3f(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform4f(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat x, jfloat y, jfloat z, jfloat w) {
    glProgramUniform4fPROC glProgramUniform4f = (glProgramUniform4fPROC)tlsGetFunction(797);
    UNUSED_PARAM(clazz)
    glProgramUniform4f(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform1d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x) {
    glProgramUniform1dPROC glProgramUniform1d = (glProgramUniform1dPROC)tlsGetFunction(798);
    UNUSED_PARAM(clazz)
    glProgramUniform1d(program, location, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform2d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y) {
    glProgramUniform2dPROC glProgramUniform2d = (glProgramUniform2dPROC)tlsGetFunction(799);
    UNUSED_PARAM(clazz)
    glProgramUniform2d(program, location, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform3d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z) {
    glProgramUniform3dPROC glProgramUniform3d = (glProgramUniform3dPROC)tlsGetFunction(800);
    UNUSED_PARAM(clazz)
    glProgramUniform3d(program, location, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glProgramUniform4d(JNIEnv *__env, jclass clazz, jint program, jint location, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramUniform4dPROC glProgramUniform4d = (glProgramUniform4dPROC)tlsGetFunction(801);
    UNUSED_PARAM(clazz)
    glProgramUniform4d(program, location, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform1iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1ivPROC glProgramUniform1iv = (glProgramUniform1ivPROC)tlsGetFunction(802);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform2iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2ivPROC glProgramUniform2iv = (glProgramUniform2ivPROC)tlsGetFunction(803);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform3iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3ivPROC glProgramUniform3iv = (glProgramUniform3ivPROC)tlsGetFunction(804);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform4iv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4ivPROC glProgramUniform4iv = (glProgramUniform4ivPROC)tlsGetFunction(805);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4iv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform1uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1uivPROC glProgramUniform1uiv = (glProgramUniform1uivPROC)tlsGetFunction(806);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform2uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2uivPROC glProgramUniform2uiv = (glProgramUniform2uivPROC)tlsGetFunction(807);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform3uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3uivPROC glProgramUniform3uiv = (glProgramUniform3uivPROC)tlsGetFunction(808);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform4uiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4uivPROC glProgramUniform4uiv = (glProgramUniform4uivPROC)tlsGetFunction(809);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4uiv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform1fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1fvPROC glProgramUniform1fv = (glProgramUniform1fvPROC)tlsGetFunction(810);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform2fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2fvPROC glProgramUniform2fv = (glProgramUniform2fvPROC)tlsGetFunction(811);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform3fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3fvPROC glProgramUniform3fv = (glProgramUniform3fvPROC)tlsGetFunction(812);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform4fv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4fvPROC glProgramUniform4fv = (glProgramUniform4fvPROC)tlsGetFunction(813);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4fv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform1dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1dvPROC glProgramUniform1dv = (glProgramUniform1dvPROC)tlsGetFunction(814);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform2dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2dvPROC glProgramUniform2dv = (glProgramUniform2dvPROC)tlsGetFunction(815);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform3dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3dvPROC glProgramUniform3dv = (glProgramUniform3dvPROC)tlsGetFunction(816);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniform4dv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4dvPROC glProgramUniform4dv = (glProgramUniform4dvPROC)tlsGetFunction(817);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4dv(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2fvPROC glProgramUniformMatrix2fv = (glProgramUniformMatrix2fvPROC)tlsGetFunction(818);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3fvPROC glProgramUniformMatrix3fv = (glProgramUniformMatrix3fvPROC)tlsGetFunction(819);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4fvPROC glProgramUniformMatrix4fv = (glProgramUniformMatrix4fvPROC)tlsGetFunction(820);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix2dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2dvPROC glProgramUniformMatrix2dv = (glProgramUniformMatrix2dvPROC)tlsGetFunction(821);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix3dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3dvPROC glProgramUniformMatrix3dv = (glProgramUniformMatrix3dvPROC)tlsGetFunction(822);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix4dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4dvPROC glProgramUniformMatrix4dv = (glProgramUniformMatrix4dvPROC)tlsGetFunction(823);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix2x3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3fvPROC glProgramUniformMatrix2x3fv = (glProgramUniformMatrix2x3fvPROC)tlsGetFunction(824);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix3x2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2fvPROC glProgramUniformMatrix3x2fv = (glProgramUniformMatrix3x2fvPROC)tlsGetFunction(825);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix2x4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4fvPROC glProgramUniformMatrix2x4fv = (glProgramUniformMatrix2x4fvPROC)tlsGetFunction(826);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix4x2fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2fvPROC glProgramUniformMatrix4x2fv = (glProgramUniformMatrix4x2fvPROC)tlsGetFunction(827);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix3x4fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4fvPROC glProgramUniformMatrix3x4fv = (glProgramUniformMatrix3x4fvPROC)tlsGetFunction(828);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix4x3fv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3fvPROC glProgramUniformMatrix4x3fv = (glProgramUniformMatrix4x3fvPROC)tlsGetFunction(829);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3fv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix2x3dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3dvPROC glProgramUniformMatrix2x3dv = (glProgramUniformMatrix2x3dvPROC)tlsGetFunction(830);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix3x2dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2dvPROC glProgramUniformMatrix3x2dv = (glProgramUniformMatrix3x2dvPROC)tlsGetFunction(831);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix2x4dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4dvPROC glProgramUniformMatrix2x4dv = (glProgramUniformMatrix2x4dvPROC)tlsGetFunction(832);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix4x2dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2dvPROC glProgramUniformMatrix4x2dv = (glProgramUniformMatrix4x2dvPROC)tlsGetFunction(833);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix3x4dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4dvPROC glProgramUniformMatrix3x4dv = (glProgramUniformMatrix3x4dvPROC)tlsGetFunction(834);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglProgramUniformMatrix4x3dv__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3dvPROC glProgramUniformMatrix4x3dv = (glProgramUniformMatrix4x3dvPROC)tlsGetFunction(835);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3dv(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glValidateProgramPipeline(JNIEnv *__env, jclass clazz, jint pipeline) {
    glValidateProgramPipelinePROC glValidateProgramPipeline = (glValidateProgramPipelinePROC)tlsGetFunction(836);
    UNUSED_PARAM(clazz)
    glValidateProgramPipeline(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGetProgramPipelineInfoLog__IIJJ(JNIEnv *__env, jclass clazz, jint pipeline, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
    glGetProgramPipelineInfoLogPROC glGetProgramPipelineInfoLog = (glGetProgramPipelineInfoLogPROC)tlsGetFunction(837);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t infoLog = (intptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glVertexAttribL1d(JNIEnv *__env, jclass clazz, jint index, jdouble x) {
    glVertexAttribL1dPROC glVertexAttribL1d = (glVertexAttribL1dPROC)tlsGetFunction(838);
    UNUSED_PARAM(clazz)
    glVertexAttribL1d(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glVertexAttribL2d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y) {
    glVertexAttribL2dPROC glVertexAttribL2d = (glVertexAttribL2dPROC)tlsGetFunction(839);
    UNUSED_PARAM(clazz)
    glVertexAttribL2d(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glVertexAttribL3d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z) {
    glVertexAttribL3dPROC glVertexAttribL3d = (glVertexAttribL3dPROC)tlsGetFunction(840);
    UNUSED_PARAM(clazz)
    glVertexAttribL3d(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glVertexAttribL4d(JNIEnv *__env, jclass clazz, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glVertexAttribL4dPROC glVertexAttribL4d = (glVertexAttribL4dPROC)tlsGetFunction(841);
    UNUSED_PARAM(clazz)
    glVertexAttribL4d(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglVertexAttribL1dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL1dvPROC glVertexAttribL1dv = (glVertexAttribL1dvPROC)tlsGetFunction(842);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL1dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglVertexAttribL2dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL2dvPROC glVertexAttribL2dv = (glVertexAttribL2dvPROC)tlsGetFunction(843);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL2dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglVertexAttribL3dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL3dvPROC glVertexAttribL3dv = (glVertexAttribL3dvPROC)tlsGetFunction(844);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL3dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglVertexAttribL4dv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL4dvPROC glVertexAttribL4dv = (glVertexAttribL4dvPROC)tlsGetFunction(845);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL4dv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglVertexAttribLPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress) {
    glVertexAttribLPointerPROC glVertexAttribLPointer = (glVertexAttribLPointerPROC)tlsGetFunction(846);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribLPointer(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGetVertexAttribLdv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribLdvPROC glGetVertexAttribLdv = (glGetVertexAttribLdvPROC)tlsGetFunction(847);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribLdv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglViewportArrayv__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glViewportArrayvPROC glViewportArrayv = (glViewportArrayvPROC)tlsGetFunction(848);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glViewportIndexedf(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h) {
    glViewportIndexedfPROC glViewportIndexedf = (glViewportIndexedfPROC)tlsGetFunction(849);
    UNUSED_PARAM(clazz)
    glViewportIndexedf(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglViewportIndexedfv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glViewportIndexedfvPROC glViewportIndexedfv = (glViewportIndexedfvPROC)tlsGetFunction(850);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportIndexedfv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglScissorArrayv__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glScissorArrayvPROC glScissorArrayv = (glScissorArrayvPROC)tlsGetFunction(851);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glScissorIndexed(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height) {
    glScissorIndexedPROC glScissorIndexed = (glScissorIndexedPROC)tlsGetFunction(852);
    UNUSED_PARAM(clazz)
    glScissorIndexed(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglScissorIndexedv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glScissorIndexedvPROC glScissorIndexedv = (glScissorIndexedvPROC)tlsGetFunction(853);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorIndexedv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglDepthRangeArrayv__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glDepthRangeArrayvPROC glDepthRangeArrayv = (glDepthRangeArrayvPROC)tlsGetFunction(854);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glDepthRangeArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_glDepthRangeIndexed(JNIEnv *__env, jclass clazz, jint index, jdouble zNear, jdouble zFar) {
    glDepthRangeIndexedPROC glDepthRangeIndexed = (glDepthRangeIndexedPROC)tlsGetFunction(855);
    UNUSED_PARAM(clazz)
    glDepthRangeIndexed(index, zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGetFloati_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetFloati_vPROC glGetFloati_v = (glGetFloati_vPROC)tlsGetFunction(856);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL41C_nglGetDoublei_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetDoublei_vPROC glGetDoublei_v = (glGetDoublei_vPROC)tlsGetFunction(857);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetDoublei_v(target, index, data);
}

EXTERN_C_EXIT
