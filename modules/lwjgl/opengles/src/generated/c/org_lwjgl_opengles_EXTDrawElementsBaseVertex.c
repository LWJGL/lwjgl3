/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawElementsBaseVertexEXTPROC) (jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexEXTPROC) (jint, jint, jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexEXTPROC) (jint, jint, jint, intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsBaseVertexEXTPROC) (jint, intptr_t, jint, intptr_t, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglDrawElementsBaseVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexEXTPROC glDrawElementsBaseVertexEXT = (glDrawElementsBaseVertexEXTPROC)tlsGetFunction(420);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertexEXT(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglDrawRangeElementsBaseVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexEXTPROC glDrawRangeElementsBaseVertexEXT = (glDrawRangeElementsBaseVertexEXTPROC)tlsGetFunction(421);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertexEXT(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglDrawElementsInstancedBaseVertexEXT(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex) {
    glDrawElementsInstancedBaseVertexEXTPROC glDrawElementsInstancedBaseVertexEXT = (glDrawElementsInstancedBaseVertexEXTPROC)tlsGetFunction(422);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertexEXT(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawElementsBaseVertex_nglMultiDrawElementsBaseVertexEXT__IJIJIJ(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint drawcount, jlong basevertexAddress) {
    glMultiDrawElementsBaseVertexEXTPROC glMultiDrawElementsBaseVertexEXT = (glMultiDrawElementsBaseVertexEXTPROC)tlsGetFunction(423);
    intptr_t count = (intptr_t)countAddress;
    intptr_t indices = (intptr_t)indicesAddress;
    intptr_t basevertex = (intptr_t)basevertexAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsBaseVertexEXT(mode, count, type, indices, drawcount, basevertex);
}

EXTERN_C_EXIT
