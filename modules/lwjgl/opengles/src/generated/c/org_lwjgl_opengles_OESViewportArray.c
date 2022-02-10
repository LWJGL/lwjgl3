/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glViewportArrayvOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glViewportIndexedfOESPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glViewportIndexedfvOESPROC) (jint, uintptr_t);
typedef void (APIENTRY *glScissorArrayvOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glScissorIndexedOESPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glScissorIndexedvOESPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDepthRangeArrayfvOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glDepthRangeIndexedfOESPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glGetFloati_vOESPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglViewportArrayvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glViewportArrayvOESPROC glViewportArrayvOES = (glViewportArrayvOESPROC)tlsGetFunction(829);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportArrayvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glViewportIndexedfOES(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h) {
    glViewportIndexedfOESPROC glViewportIndexedfOES = (glViewportIndexedfOESPROC)tlsGetFunction(830);
    UNUSED_PARAM(clazz)
    glViewportIndexedfOES(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglViewportIndexedfvOES__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glViewportIndexedfvOESPROC glViewportIndexedfvOES = (glViewportIndexedfvOESPROC)tlsGetFunction(831);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportIndexedfvOES(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglScissorArrayvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glScissorArrayvOESPROC glScissorArrayvOES = (glScissorArrayvOESPROC)tlsGetFunction(832);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorArrayvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glScissorIndexedOES(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height) {
    glScissorIndexedOESPROC glScissorIndexedOES = (glScissorIndexedOESPROC)tlsGetFunction(833);
    UNUSED_PARAM(clazz)
    glScissorIndexedOES(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglScissorIndexedvOES__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glScissorIndexedvOESPROC glScissorIndexedvOES = (glScissorIndexedvOESPROC)tlsGetFunction(834);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorIndexedvOES(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglDepthRangeArrayfvOES__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glDepthRangeArrayfvOESPROC glDepthRangeArrayfvOES = (glDepthRangeArrayfvOESPROC)tlsGetFunction(835);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glDepthRangeArrayfvOES(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_glDepthRangeIndexedfOES(JNIEnv *__env, jclass clazz, jint index, jfloat n, jfloat f) {
    glDepthRangeIndexedfOESPROC glDepthRangeIndexedfOES = (glDepthRangeIndexedfOESPROC)tlsGetFunction(836);
    UNUSED_PARAM(clazz)
    glDepthRangeIndexedfOES(index, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESViewportArray_nglGetFloati_1vOES__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetFloati_vOESPROC glGetFloati_vOES = (glGetFloati_vOESPROC)tlsGetFunction(837);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_vOES(target, index, data);
}

EXTERN_C_EXIT
