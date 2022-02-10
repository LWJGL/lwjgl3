/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glExtGetShadersQCOMPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glExtGetProgramsQCOMPROC) (uintptr_t, jint, uintptr_t);
typedef jboolean (APIENTRY *glExtIsProgramBinaryQCOMPROC) (jint);
typedef void (APIENTRY *glExtGetProgramBinarySourceQCOMPROC) (jint, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetShadersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong shadersAddress, jint maxShaders, jlong numShadersAddress) {
    glExtGetShadersQCOMPROC glExtGetShadersQCOM = (glExtGetShadersQCOMPROC)tlsGetFunction(853);
    uintptr_t shaders = (uintptr_t)shadersAddress;
    uintptr_t numShaders = (uintptr_t)numShadersAddress;
    UNUSED_PARAM(clazz)
    glExtGetShadersQCOM(shaders, maxShaders, numShaders);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetProgramsQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong programsAddress, jint maxPrograms, jlong numProgramsAddress) {
    glExtGetProgramsQCOMPROC glExtGetProgramsQCOM = (glExtGetProgramsQCOMPROC)tlsGetFunction(854);
    uintptr_t programs = (uintptr_t)programsAddress;
    uintptr_t numPrograms = (uintptr_t)numProgramsAddress;
    UNUSED_PARAM(clazz)
    glExtGetProgramsQCOM(programs, maxPrograms, numPrograms);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_glExtIsProgramBinaryQCOM(JNIEnv *__env, jclass clazz, jint program) {
    glExtIsProgramBinaryQCOMPROC glExtIsProgramBinaryQCOM = (glExtIsProgramBinaryQCOMPROC)tlsGetFunction(855);
    UNUSED_PARAM(clazz)
    return (jboolean)glExtIsProgramBinaryQCOM(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetProgramBinarySourceQCOM__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong sourceAddress, jlong lengthAddress) {
    glExtGetProgramBinarySourceQCOMPROC glExtGetProgramBinarySourceQCOM = (glExtGetProgramBinarySourceQCOMPROC)tlsGetFunction(856);
    uintptr_t source = (uintptr_t)sourceAddress;
    uintptr_t length = (uintptr_t)lengthAddress;
    UNUSED_PARAM(clazz)
    glExtGetProgramBinarySourceQCOM(program, shadertype, source, length);
}

EXTERN_C_EXIT
