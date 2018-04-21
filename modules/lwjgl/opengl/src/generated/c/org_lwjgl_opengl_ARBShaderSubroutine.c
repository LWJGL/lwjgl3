/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glGetSubroutineUniformLocationPROC) (jint, jint, intptr_t);
typedef jint (APIENTRY *glGetSubroutineIndexPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetActiveSubroutineUniformivPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetActiveSubroutineUniformNamePROC) (jint, jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetActiveSubroutineNamePROC) (jint, jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glUniformSubroutinesuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformSubroutineuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetProgramStageivPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglGetSubroutineUniformLocation(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong nameAddress) {
    glGetSubroutineUniformLocationPROC glGetSubroutineUniformLocation = (glGetSubroutineUniformLocationPROC)tlsGetFunction(749);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetSubroutineUniformLocation(program, shadertype, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglGetSubroutineIndex(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong nameAddress) {
    glGetSubroutineIndexPROC glGetSubroutineIndex = (glGetSubroutineIndexPROC)tlsGetFunction(750);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetSubroutineIndex(program, shadertype, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglGetActiveSubroutineUniformiv__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint pname, jlong valuesAddress) {
    glGetActiveSubroutineUniformivPROC glGetActiveSubroutineUniformiv = (glGetActiveSubroutineUniformivPROC)tlsGetFunction(751);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglGetActiveSubroutineUniformName__IIIIJJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint bufsize, jlong lengthAddress, jlong nameAddress) {
    glGetActiveSubroutineUniformNamePROC glGetActiveSubroutineUniformName = (glGetActiveSubroutineUniformNamePROC)tlsGetFunction(752);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglGetActiveSubroutineName__IIIIJJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint index, jint bufsize, jlong lengthAddress, jlong nameAddress) {
    glGetActiveSubroutineNamePROC glGetActiveSubroutineName = (glGetActiveSubroutineNamePROC)tlsGetFunction(753);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglUniformSubroutinesuiv__IIJ(JNIEnv *__env, jclass clazz, jint shadertype, jint count, jlong indicesAddress) {
    glUniformSubroutinesuivPROC glUniformSubroutinesuiv = (glUniformSubroutinesuivPROC)tlsGetFunction(754);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glUniformSubroutinesuiv(shadertype, count, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglGetUniformSubroutineuiv__IIJ(JNIEnv *__env, jclass clazz, jint shadertype, jint location, jlong paramsAddress) {
    glGetUniformSubroutineuivPROC glGetUniformSubroutineuiv = (glGetUniformSubroutineuivPROC)tlsGetFunction(755);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformSubroutineuiv(shadertype, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBShaderSubroutine_nglGetProgramStageiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jint pname, jlong valuesAddress) {
    glGetProgramStageivPROC glGetProgramStageiv = (glGetProgramStageivPROC)tlsGetFunction(756);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glGetProgramStageiv(program, shadertype, pname, values);
}

EXTERN_C_EXIT
