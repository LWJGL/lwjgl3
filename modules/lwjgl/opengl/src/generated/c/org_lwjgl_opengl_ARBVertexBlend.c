/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glWeightfvARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightbvARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightubvARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightsvARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightusvARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightivARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightuivARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightdvARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glWeightPointerARBPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glVertexBlendARBPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightfvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightfvARBPROC glWeightfvARB = (glWeightfvARBPROC)tlsGetFunction(1355);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightfvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightbvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightbvARBPROC glWeightbvARB = (glWeightbvARBPROC)tlsGetFunction(1356);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightbvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightubvARB(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightubvARBPROC glWeightubvARB = (glWeightubvARBPROC)tlsGetFunction(1357);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightubvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightsvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightsvARBPROC glWeightsvARB = (glWeightsvARBPROC)tlsGetFunction(1358);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightsvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightusvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightusvARBPROC glWeightusvARB = (glWeightusvARBPROC)tlsGetFunction(1359);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightusvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightivARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightivARBPROC glWeightivARB = (glWeightivARBPROC)tlsGetFunction(1360);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightivARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightuivARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightuivARBPROC glWeightuivARB = (glWeightuivARBPROC)tlsGetFunction(1361);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightuivARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightdvARB__IJ(JNIEnv *__env, jclass clazz, jint size, jlong weightsAddress) {
    glWeightdvARBPROC glWeightdvARB = (glWeightdvARBPROC)tlsGetFunction(1362);
    intptr_t weights = (intptr_t)weightsAddress;
    UNUSED_PARAM(clazz)
    glWeightdvARB(size, weights);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_nglWeightPointerARB__IIIJ(JNIEnv *__env, jclass clazz, jint size, jint type, jint stride, jlong pointerAddress) {
    glWeightPointerARBPROC glWeightPointerARB = (glWeightPointerARBPROC)tlsGetFunction(1363);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glWeightPointerARB(size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexBlend_glVertexBlendARB(JNIEnv *__env, jclass clazz, jint count) {
    glVertexBlendARBPROC glVertexBlendARB = (glVertexBlendARBPROC)tlsGetFunction(1364);
    UNUSED_PARAM(clazz)
    glVertexBlendARB(count);
}

EXTERN_C_EXIT
