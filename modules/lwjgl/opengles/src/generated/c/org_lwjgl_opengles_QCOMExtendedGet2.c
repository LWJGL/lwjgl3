/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glExtGetShadersQCOMPROC) (intptr_t, jint, intptr_t);
typedef void (APIENTRY *glExtGetProgramsQCOMPROC) (intptr_t, jint, intptr_t);
typedef jboolean (APIENTRY *glExtIsProgramBinaryQCOMPROC) (jint);
typedef void (APIENTRY *glExtGetProgramBinarySourceQCOMPROC) (jint, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetShadersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong shadersAddress, jint maxShaders, jlong numShadersAddress) {
    glExtGetShadersQCOMPROC glExtGetShadersQCOM = (glExtGetShadersQCOMPROC)tlsGetFunction(842);
    intptr_t shaders = (intptr_t)shadersAddress;
    intptr_t numShaders = (intptr_t)numShadersAddress;
    UNUSED_PARAM(clazz)
    glExtGetShadersQCOM(shaders, maxShaders, numShaders);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetProgramsQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong programsAddress, jint maxPrograms, jlong numProgramsAddress) {
    glExtGetProgramsQCOMPROC glExtGetProgramsQCOM = (glExtGetProgramsQCOMPROC)tlsGetFunction(843);
    intptr_t programs = (intptr_t)programsAddress;
    intptr_t numPrograms = (intptr_t)numProgramsAddress;
    UNUSED_PARAM(clazz)
    glExtGetProgramsQCOM(programs, maxPrograms, numPrograms);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_glExtIsProgramBinaryQCOM(JNIEnv *__env, jclass clazz, jint program) {
    glExtIsProgramBinaryQCOMPROC glExtIsProgramBinaryQCOM = (glExtIsProgramBinaryQCOMPROC)tlsGetFunction(844);
    UNUSED_PARAM(clazz)
    return (jboolean)glExtIsProgramBinaryQCOM(program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet2_nglExtGetProgramBinarySourceQCOM__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint shadertype, jlong sourceAddress, jlong lengthAddress) {
    glExtGetProgramBinarySourceQCOMPROC glExtGetProgramBinarySourceQCOM = (glExtGetProgramBinarySourceQCOMPROC)tlsGetFunction(845);
    intptr_t source = (intptr_t)sourceAddress;
    intptr_t length = (intptr_t)lengthAddress;
    UNUSED_PARAM(clazz)
    glExtGetProgramBinarySourceQCOM(program, shadertype, source, length);
}

EXTERN_C_EXIT
