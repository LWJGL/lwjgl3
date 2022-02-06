/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glWeightfvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightbvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightubvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightsvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightusvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightivARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightuivARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightdvARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glWeightPointerARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexBlendARBPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightfvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightfvARBPROC glWeightfvARB = (glWeightfvARBPROC)tlsGetFunction(1391);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightfvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightbvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightbvARBPROC glWeightbvARB = (glWeightbvARBPROC)tlsGetFunction(1392);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightbvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightubvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightubvARBPROC glWeightubvARB = (glWeightubvARBPROC)tlsGetFunction(1393);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightubvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightsvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightsvARBPROC glWeightsvARB = (glWeightsvARBPROC)tlsGetFunction(1394);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightsvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightusvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightusvARBPROC glWeightusvARB = (glWeightusvARBPROC)tlsGetFunction(1395);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightusvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightivARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightivARBPROC glWeightivARB = (glWeightivARBPROC)tlsGetFunction(1396);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightivARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightuivARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightuivARBPROC glWeightuivARB = (glWeightuivARBPROC)tlsGetFunction(1397);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightuivARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightdvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightdvARBPROC glWeightdvARB = (glWeightdvARBPROC)tlsGetFunction(1398);
    uintptr_t weights = (uintptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightdvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightPointerARB__IIIJ(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glWeightPointerARBPROC glWeightPointerARB = (glWeightPointerARBPROC)tlsGetFunction(1399);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glWeightPointerARB(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_glVertexBlendARB(JNIEnv *__env, jclass clazz, jint count) {
    glVertexBlendARBPROC glVertexBlendARB = (glVertexBlendARBPROC)tlsGetFunction(1400);
    UNUSED_PARAM(clazz)
    glVertexBlendARB(count);
}

EXTERN_C_EXIT
