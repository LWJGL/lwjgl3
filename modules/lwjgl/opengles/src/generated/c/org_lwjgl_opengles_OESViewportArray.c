/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glViewportArrayvOESPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glViewportIndexedfOESPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glViewportIndexedfvOESPROC) (jint, intptr_t);
typedef void (APIENTRY *glScissorArrayvOESPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glScissorIndexedOESPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glScissorIndexedvOESPROC) (jint, intptr_t);
typedef void (APIENTRY *glDepthRangeArrayfvOESPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glDepthRangeIndexedfOESPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glGetFloati_vOESPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglViewportArrayvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glViewportArrayvOESPROC glViewportArrayvOES = (glViewportArrayvOESPROC)tlsGetFunction(818);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportArrayvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glViewportIndexedfOES(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h) {
    glViewportIndexedfOESPROC glViewportIndexedfOES = (glViewportIndexedfOESPROC)tlsGetFunction(819);
    UNUSED_PARAM(clazz)
    glViewportIndexedfOES(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglViewportIndexedfvOES__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glViewportIndexedfvOESPROC glViewportIndexedfvOES = (glViewportIndexedfvOESPROC)tlsGetFunction(820);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportIndexedfvOES(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglScissorArrayvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glScissorArrayvOESPROC glScissorArrayvOES = (glScissorArrayvOESPROC)tlsGetFunction(821);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorArrayvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glScissorIndexedOES(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height) {
    glScissorIndexedOESPROC glScissorIndexedOES = (glScissorIndexedOESPROC)tlsGetFunction(822);
    UNUSED_PARAM(clazz)
    glScissorIndexedOES(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglScissorIndexedvOES__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glScissorIndexedvOESPROC glScissorIndexedvOES = (glScissorIndexedvOESPROC)tlsGetFunction(823);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorIndexedvOES(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglDepthRangeArrayfvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glDepthRangeArrayfvOESPROC glDepthRangeArrayfvOES = (glDepthRangeArrayfvOESPROC)tlsGetFunction(824);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glDepthRangeArrayfvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glDepthRangeIndexedfOES(JNIEnv *__env, jclass clazz, jint index, jfloat n, jfloat f) {
    glDepthRangeIndexedfOESPROC glDepthRangeIndexedfOES = (glDepthRangeIndexedfOESPROC)tlsGetFunction(825);
    UNUSED_PARAM(clazz)
    glDepthRangeIndexedfOES(index, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglGetFloati_1vOES__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetFloati_vOESPROC glGetFloati_vOES = (glGetFloati_vOESPROC)tlsGetFunction(826);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_vOES(target, index, data);
}

EXTERN_C_EXIT
