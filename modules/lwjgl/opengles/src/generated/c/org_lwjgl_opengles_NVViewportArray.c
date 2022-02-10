/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glViewportArrayvNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glViewportIndexedfNVPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glViewportIndexedfvNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glScissorArrayvNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glScissorIndexedNVPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glScissorIndexedvNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDepthRangeArrayfvNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glDepthRangeIndexedfNVPROC) (jint, jfloat, jfloat);
typedef void (APIENTRY *glGetFloati_vNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glEnableiNVPROC) (jint, jint);
typedef void (APIENTRY *glDisableiNVPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsEnablediNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglViewportArrayvNV__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glViewportArrayvNVPROC glViewportArrayvNV = (glViewportArrayvNVPROC)tlsGetFunction(770);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportArrayvNV(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_glViewportIndexedfNV(JNIEnv *__env, jclass clazz, jint index, jfloat x, jfloat y, jfloat w, jfloat h) {
    glViewportIndexedfNVPROC glViewportIndexedfNV = (glViewportIndexedfNVPROC)tlsGetFunction(771);
    UNUSED_PARAM(clazz)
    glViewportIndexedfNV(index, x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglViewportIndexedfvNV__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glViewportIndexedfvNVPROC glViewportIndexedfvNV = (glViewportIndexedfvNVPROC)tlsGetFunction(772);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glViewportIndexedfvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglScissorArrayvNV__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glScissorArrayvNVPROC glScissorArrayvNV = (glScissorArrayvNVPROC)tlsGetFunction(773);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorArrayvNV(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_glScissorIndexedNV(JNIEnv *__env, jclass clazz, jint index, jint left, jint bottom, jint width, jint height) {
    glScissorIndexedNVPROC glScissorIndexedNV = (glScissorIndexedNVPROC)tlsGetFunction(774);
    UNUSED_PARAM(clazz)
    glScissorIndexedNV(index, left, bottom, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglScissorIndexedvNV__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glScissorIndexedvNVPROC glScissorIndexedvNV = (glScissorIndexedvNVPROC)tlsGetFunction(775);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glScissorIndexedvNV(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglDepthRangeArrayfvNV__IIJ(JNIEnv *__env, jclass clazz, jint first, jint count, jlong vAddress) {
    glDepthRangeArrayfvNVPROC glDepthRangeArrayfvNV = (glDepthRangeArrayfvNVPROC)tlsGetFunction(776);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glDepthRangeArrayfvNV(first, count, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_glDepthRangeIndexedfNV(JNIEnv *__env, jclass clazz, jint index, jfloat n, jfloat f) {
    glDepthRangeIndexedfNVPROC glDepthRangeIndexedfNV = (glDepthRangeIndexedfNVPROC)tlsGetFunction(777);
    UNUSED_PARAM(clazz)
    glDepthRangeIndexedfNV(index, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_nglGetFloati_1vNV__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetFloati_vNVPROC glGetFloati_vNV = (glGetFloati_vNVPROC)tlsGetFunction(778);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_vNV(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_glEnableiNV(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEnableiNVPROC glEnableiNV = (glEnableiNVPROC)tlsGetFunction(779);
    UNUSED_PARAM(clazz)
    glEnableiNV(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVViewportArray_glDisableiNV(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableiNVPROC glDisableiNV = (glDisableiNVPROC)tlsGetFunction(780);
    UNUSED_PARAM(clazz)
    glDisableiNV(target, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVViewportArray_glIsEnablediNV(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnablediNVPROC glIsEnablediNV = (glIsEnablediNVPROC)tlsGetFunction(781);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnablediNV(target, index);
}

EXTERN_C_EXIT
