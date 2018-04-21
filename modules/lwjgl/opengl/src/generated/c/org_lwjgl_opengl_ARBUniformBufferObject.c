/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetUniformIndicesPROC) (jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetActiveUniformsivPROC) (jint, jint, intptr_t, jint, intptr_t);
typedef void (APIENTRY *glGetActiveUniformNamePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef jint (APIENTRY *glGetUniformBlockIndexPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetActiveUniformBlockivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetActiveUniformBlockNamePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glBindBufferRangePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glBindBufferBasePROC) (jint, jint, jint);
typedef void (APIENTRY *glGetIntegeri_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniformBlockBindingPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_nglGetUniformIndices__IIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformNamesAddress, jlong uniformIndicesAddress) {
    glGetUniformIndicesPROC glGetUniformIndices = (glGetUniformIndicesPROC)tlsGetFunction(640);
    intptr_t uniformNames = (intptr_t)uniformNamesAddress;
    intptr_t uniformIndices = (intptr_t)uniformIndicesAddress;
    UNUSED_PARAM(clazz)
    glGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_nglGetActiveUniformsiv__IIJIJ(JNIEnv *__env, jclass clazz, jint program, jint uniformCount, jlong uniformIndicesAddress, jint pname, jlong paramsAddress) {
    glGetActiveUniformsivPROC glGetActiveUniformsiv = (glGetActiveUniformsivPROC)tlsGetFunction(641);
    intptr_t uniformIndices = (intptr_t)uniformIndicesAddress;
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_nglGetActiveUniformName__IIIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformIndex, jint bufSize, jlong lengthAddress, jlong uniformNameAddress) {
    glGetActiveUniformNamePROC glGetActiveUniformName = (glGetActiveUniformNamePROC)tlsGetFunction(642);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t uniformName = (intptr_t)uniformNameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_nglGetUniformBlockIndex(JNIEnv *__env, jclass clazz, jint program, jlong uniformBlockNameAddress) {
    glGetUniformBlockIndexPROC glGetUniformBlockIndex = (glGetUniformBlockIndexPROC)tlsGetFunction(643);
    intptr_t uniformBlockName = (intptr_t)uniformBlockNameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetUniformBlockIndex(program, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_nglGetActiveUniformBlockiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint pname, jlong paramsAddress) {
    glGetActiveUniformBlockivPROC glGetActiveUniformBlockiv = (glGetActiveUniformBlockivPROC)tlsGetFunction(644);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_nglGetActiveUniformBlockName__IIIJJ(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint bufSize, jlong lengthAddress, jlong uniformBlockNameAddress) {
    glGetActiveUniformBlockNamePROC glGetActiveUniformBlockName = (glGetActiveUniformBlockNamePROC)tlsGetFunction(645);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t uniformBlockName = (intptr_t)uniformBlockNameAddress;
    UNUSED_PARAM(clazz)
    glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_glBindBufferRange(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size) {
    glBindBufferRangePROC glBindBufferRange = (glBindBufferRangePROC)tlsGetFunction(625);
    UNUSED_PARAM(clazz)
    glBindBufferRange(target, index, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_glBindBufferBase(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer) {
    glBindBufferBasePROC glBindBufferBase = (glBindBufferBasePROC)tlsGetFunction(626);
    UNUSED_PARAM(clazz)
    glBindBufferBase(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_nglGetIntegeri_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetIntegeri_vPROC glGetIntegeri_v = (glGetIntegeri_vPROC)tlsGetFunction(621);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetIntegeri_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBUniformBufferObject_glUniformBlockBinding(JNIEnv *__env, jclass clazz, jint program, jint uniformBlockIndex, jint uniformBlockBinding) {
    glUniformBlockBindingPROC glUniformBlockBinding = (glUniformBlockBindingPROC)tlsGetFunction(646);
    UNUSED_PARAM(clazz)
    glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
}

EXTERN_C_EXIT
