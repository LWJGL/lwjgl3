/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glActiveShaderProgramEXTPROC) (jint, jint);
typedef void (APIENTRY *glBindProgramPipelineEXTPROC) (jint);
typedef jint (APIENTRY *glCreateShaderProgramvEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glDeleteProgramPipelinesEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGenProgramPipelinesEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetProgramPipelineInfoLogEXTPROC) (jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetProgramPipelineivEXTPROC) (jint, jint, uintptr_t);
typedef jboolean (APIENTRY *glIsProgramPipelineEXTPROC) (jint);
typedef void (APIENTRY *glProgramParameteriEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1fEXTPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glProgramUniform1fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform1iEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform2fEXTPROC) (jint, jint, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform2fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform2iEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform3fEXTPROC) (jint, jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform3fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform3iEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform4fEXTPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform4fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform4iEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glUseProgramStagesEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glValidateProgramPipelineEXTPROC) (jint);
typedef void (APIENTRY *glProgramUniform1uiEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2uiEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3uiEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4uiEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform2uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform3uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform4uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glActiveShaderProgramEXT(JNIEnv *__env, jclass clazz, jint pipeline, jint program) {
    glActiveShaderProgramEXTPROC glActiveShaderProgramEXT = (glActiveShaderProgramEXTPROC)tlsGetFunction(489);
    UNUSED_PARAM(clazz)
    glActiveShaderProgramEXT(pipeline, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glBindProgramPipelineEXT(JNIEnv *__env, jclass clazz, jint pipeline) {
    glBindProgramPipelineEXTPROC glBindProgramPipelineEXT = (glBindProgramPipelineEXTPROC)tlsGetFunction(490);
    UNUSED_PARAM(clazz)
    glBindProgramPipelineEXT(pipeline);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglCreateShaderProgramvEXT(JNIEnv *__env, jclass clazz, jint type, jint count, jlong stringsAddress) {
    glCreateShaderProgramvEXTPROC glCreateShaderProgramvEXT = (glCreateShaderProgramvEXTPROC)tlsGetFunction(491);
    uintptr_t strings = (uintptr_t)stringsAddress;
    UNUSED_PARAM(clazz)
    return (jint)glCreateShaderProgramvEXT(type, count, strings);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglDeleteProgramPipelinesEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glDeleteProgramPipelinesEXTPROC glDeleteProgramPipelinesEXT = (glDeleteProgramPipelinesEXTPROC)tlsGetFunction(492);
    uintptr_t pipelines = (uintptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glDeleteProgramPipelinesEXT(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglGenProgramPipelinesEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glGenProgramPipelinesEXTPROC glGenProgramPipelinesEXT = (glGenProgramPipelinesEXTPROC)tlsGetFunction(493);
    uintptr_t pipelines = (uintptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glGenProgramPipelinesEXT(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglGetProgramPipelineInfoLogEXT__IIJJ(JNIEnv *__env, jclass clazz, jint pipeline, jint bufSize, jlong lengthAddress, jlong infoLogAddress) {
    glGetProgramPipelineInfoLogEXTPROC glGetProgramPipelineInfoLogEXT = (glGetProgramPipelineInfoLogEXTPROC)tlsGetFunction(494);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t infoLog = (uintptr_t)infoLogAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineInfoLogEXT(pipeline, bufSize, length, infoLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglGetProgramPipelineivEXT__IIJ(JNIEnv *__env, jclass clazz, jint pipeline, jint pname, jlong paramsAddress) {
    glGetProgramPipelineivEXTPROC glGetProgramPipelineivEXT = (glGetProgramPipelineivEXTPROC)tlsGetFunction(495);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramPipelineivEXT(pipeline, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glIsProgramPipelineEXT(JNIEnv *__env, jclass clazz, jint pipeline) {
    glIsProgramPipelineEXTPROC glIsProgramPipelineEXT = (glIsProgramPipelineEXTPROC)tlsGetFunction(496);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgramPipelineEXT(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramParameteriEXT(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value) {
    glProgramParameteriEXTPROC glProgramParameteriEXT = (glProgramParameteriEXTPROC)tlsGetFunction(497);
    UNUSED_PARAM(clazz)
    glProgramParameteriEXT(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform1fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0) {
    glProgramUniform1fEXTPROC glProgramUniform1fEXT = (glProgramUniform1fEXTPROC)tlsGetFunction(498);
    UNUSED_PARAM(clazz)
    glProgramUniform1fEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1fvEXTPROC glProgramUniform1fvEXT = (glProgramUniform1fvEXTPROC)tlsGetFunction(499);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform1iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1iEXTPROC glProgramUniform1iEXT = (glProgramUniform1iEXTPROC)tlsGetFunction(500);
    UNUSED_PARAM(clazz)
    glProgramUniform1iEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1ivEXTPROC glProgramUniform1ivEXT = (glProgramUniform1ivEXTPROC)tlsGetFunction(501);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform2fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1) {
    glProgramUniform2fEXTPROC glProgramUniform2fEXT = (glProgramUniform2fEXTPROC)tlsGetFunction(502);
    UNUSED_PARAM(clazz)
    glProgramUniform2fEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2fvEXTPROC glProgramUniform2fvEXT = (glProgramUniform2fvEXTPROC)tlsGetFunction(503);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform2iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2iEXTPROC glProgramUniform2iEXT = (glProgramUniform2iEXTPROC)tlsGetFunction(504);
    UNUSED_PARAM(clazz)
    glProgramUniform2iEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2ivEXTPROC glProgramUniform2ivEXT = (glProgramUniform2ivEXTPROC)tlsGetFunction(505);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform3fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2) {
    glProgramUniform3fEXTPROC glProgramUniform3fEXT = (glProgramUniform3fEXTPROC)tlsGetFunction(506);
    UNUSED_PARAM(clazz)
    glProgramUniform3fEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3fvEXTPROC glProgramUniform3fvEXT = (glProgramUniform3fvEXTPROC)tlsGetFunction(507);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform3iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3iEXTPROC glProgramUniform3iEXT = (glProgramUniform3iEXTPROC)tlsGetFunction(508);
    UNUSED_PARAM(clazz)
    glProgramUniform3iEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3ivEXTPROC glProgramUniform3ivEXT = (glProgramUniform3ivEXTPROC)tlsGetFunction(509);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform4fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glProgramUniform4fEXTPROC glProgramUniform4fEXT = (glProgramUniform4fEXTPROC)tlsGetFunction(510);
    UNUSED_PARAM(clazz)
    glProgramUniform4fEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4fvEXTPROC glProgramUniform4fvEXT = (glProgramUniform4fvEXTPROC)tlsGetFunction(511);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform4iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4iEXTPROC glProgramUniform4iEXT = (glProgramUniform4iEXTPROC)tlsGetFunction(512);
    UNUSED_PARAM(clazz)
    glProgramUniform4iEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4ivEXTPROC glProgramUniform4ivEXT = (glProgramUniform4ivEXTPROC)tlsGetFunction(513);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2fvEXTPROC glProgramUniformMatrix2fvEXT = (glProgramUniformMatrix2fvEXTPROC)tlsGetFunction(514);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3fvEXTPROC glProgramUniformMatrix3fvEXT = (glProgramUniformMatrix3fvEXTPROC)tlsGetFunction(515);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4fvEXTPROC glProgramUniformMatrix4fvEXT = (glProgramUniformMatrix4fvEXTPROC)tlsGetFunction(516);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glUseProgramStagesEXT(JNIEnv *__env, jclass clazz, jint pipeline, jint stages, jint program) {
    glUseProgramStagesEXTPROC glUseProgramStagesEXT = (glUseProgramStagesEXTPROC)tlsGetFunction(517);
    UNUSED_PARAM(clazz)
    glUseProgramStagesEXT(pipeline, stages, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glValidateProgramPipelineEXT(JNIEnv *__env, jclass clazz, jint pipeline) {
    glValidateProgramPipelineEXTPROC glValidateProgramPipelineEXT = (glValidateProgramPipelineEXTPROC)tlsGetFunction(518);
    UNUSED_PARAM(clazz)
    glValidateProgramPipelineEXT(pipeline);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform1uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1uiEXTPROC glProgramUniform1uiEXT = (glProgramUniform1uiEXTPROC)tlsGetFunction(519);
    UNUSED_PARAM(clazz)
    glProgramUniform1uiEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform2uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2uiEXTPROC glProgramUniform2uiEXT = (glProgramUniform2uiEXTPROC)tlsGetFunction(520);
    UNUSED_PARAM(clazz)
    glProgramUniform2uiEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform3uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3uiEXTPROC glProgramUniform3uiEXT = (glProgramUniform3uiEXTPROC)tlsGetFunction(521);
    UNUSED_PARAM(clazz)
    glProgramUniform3uiEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_glProgramUniform4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4uiEXTPROC glProgramUniform4uiEXT = (glProgramUniform4uiEXTPROC)tlsGetFunction(522);
    UNUSED_PARAM(clazz)
    glProgramUniform4uiEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform1uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1uivEXTPROC glProgramUniform1uivEXT = (glProgramUniform1uivEXTPROC)tlsGetFunction(523);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform2uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2uivEXTPROC glProgramUniform2uivEXT = (glProgramUniform2uivEXTPROC)tlsGetFunction(524);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform3uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3uivEXTPROC glProgramUniform3uivEXT = (glProgramUniform3uivEXTPROC)tlsGetFunction(525);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniform4uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4uivEXTPROC glProgramUniform4uivEXT = (glProgramUniform4uivEXTPROC)tlsGetFunction(526);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix2x3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3fvEXTPROC glProgramUniformMatrix2x3fvEXT = (glProgramUniformMatrix2x3fvEXTPROC)tlsGetFunction(527);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix3x2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2fvEXTPROC glProgramUniformMatrix3x2fvEXT = (glProgramUniformMatrix3x2fvEXTPROC)tlsGetFunction(528);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix2x4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4fvEXTPROC glProgramUniformMatrix2x4fvEXT = (glProgramUniformMatrix2x4fvEXTPROC)tlsGetFunction(529);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix4x2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2fvEXTPROC glProgramUniformMatrix4x2fvEXT = (glProgramUniformMatrix4x2fvEXTPROC)tlsGetFunction(530);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix3x4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4fvEXTPROC glProgramUniformMatrix3x4fvEXT = (glProgramUniformMatrix3x4fvEXTPROC)tlsGetFunction(531);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTSeparateShaderObjects_nglProgramUniformMatrix4x3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3fvEXTPROC glProgramUniformMatrix4x3fvEXT = (glProgramUniformMatrix4x3fvEXTPROC)tlsGetFunction(532);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3fvEXT(program, location, count, transpose, value);
}

EXTERN_C_EXIT
