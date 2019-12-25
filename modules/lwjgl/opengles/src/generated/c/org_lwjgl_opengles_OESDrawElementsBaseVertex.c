/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawElementsBaseVertexOESPROC) (jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexOESPROC) (jint, jint, jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexOESPROC) (jint, jint, jint, intptr_t, jint, jint);
typedef void (APIENTRY *glMultiDrawElementsBaseVertexOESPROC) (jint, intptr_t, jint, intptr_t, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglDrawElementsBaseVertexOES(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexOESPROC glDrawElementsBaseVertexOES = (glDrawElementsBaseVertexOESPROC)tlsGetFunction(781);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertexOES(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglDrawRangeElementsBaseVertexOES(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexOESPROC glDrawRangeElementsBaseVertexOES = (glDrawRangeElementsBaseVertexOESPROC)tlsGetFunction(782);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertexOES(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglDrawElementsInstancedBaseVertexOES(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex) {
    glDrawElementsInstancedBaseVertexOESPROC glDrawElementsInstancedBaseVertexOES = (glDrawElementsInstancedBaseVertexOESPROC)tlsGetFunction(783);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertexOES(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawElementsBaseVertex_nglMultiDrawElementsBaseVertexOES__IJIJIJ(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint drawcount, jlong basevertexAddress) {
    glMultiDrawElementsBaseVertexOESPROC glMultiDrawElementsBaseVertexOES = (glMultiDrawElementsBaseVertexOESPROC)tlsGetFunction(784);
    intptr_t count = (intptr_t)countAddress;
    intptr_t indices = (intptr_t)indicesAddress;
    intptr_t basevertex = (intptr_t)basevertexAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElementsBaseVertexOES(mode, count, type, indices, drawcount, basevertex);
}

EXTERN_C_EXIT
