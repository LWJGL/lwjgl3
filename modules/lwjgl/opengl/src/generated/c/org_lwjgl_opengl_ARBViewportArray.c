/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

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

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_nglViewportArrayv__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glViewportArrayvPROC glViewportArrayv = (glViewportArrayvPROC)tlsGetFunction(848);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_glViewportIndexedf(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h) {
    glViewportIndexedfPROC glViewportIndexedf = (glViewportIndexedfPROC)tlsGetFunction(849);
    UNUSED_PARAM(clazz)
    glViewportIndexedf(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_nglViewportIndexedfv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glViewportIndexedfvPROC glViewportIndexedfv = (glViewportIndexedfvPROC)tlsGetFunction(850);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportIndexedfv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_nglScissorArrayv__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glScissorArrayvPROC glScissorArrayv = (glScissorArrayvPROC)tlsGetFunction(851);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_glScissorIndexed(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height) {
    glScissorIndexedPROC glScissorIndexed = (glScissorIndexedPROC)tlsGetFunction(852);
    UNUSED_PARAM(clazz)
    glScissorIndexed(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_nglScissorIndexedv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glScissorIndexedvPROC glScissorIndexedv = (glScissorIndexedvPROC)tlsGetFunction(853);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorIndexedv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_nglDepthRangeArrayv__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glDepthRangeArrayvPROC glDepthRangeArrayv = (glDepthRangeArrayvPROC)tlsGetFunction(854);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glDepthRangeArrayv(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_glDepthRangeIndexed(JNIEnv *__env, jclass clazz, jint index, jdouble zNear, jdouble zFar) {
    glDepthRangeIndexedPROC glDepthRangeIndexed = (glDepthRangeIndexedPROC)tlsGetFunction(855);
    UNUSED_PARAM(clazz)
    glDepthRangeIndexed(index, zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_nglGetFloati_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetFloati_vPROC glGetFloati_v = (glGetFloati_vPROC)tlsGetFunction(856);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBViewportArray_nglGetDoublei_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetDoublei_vPROC glGetDoublei_v = (glGetDoublei_vPROC)tlsGetFunction(857);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetDoublei_v(target, index, data);
}

EXTERN_C_EXIT
