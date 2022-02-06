/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindTransformFeedbackNVPROC) (jint, jint);
typedef void (APIENTRY *glDeleteTransformFeedbacksNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGenTransformFeedbacksNVPROC) (jint, uintptr_t);
typedef jboolean (APIENTRY *glIsTransformFeedbackNVPROC) (jint);
typedef void (APIENTRY *glPauseTransformFeedbackNVPROC) (void);
typedef void (APIENTRY *glResumeTransformFeedbackNVPROC) (void);
typedef void (APIENTRY *glDrawTransformFeedbackNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_glBindTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint target, jint id) {
    glBindTransformFeedbackNVPROC glBindTransformFeedbackNV = (glBindTransformFeedbackNVPROC)tlsGetFunction(2168);
    UNUSED_PARAM(clazz)
    glBindTransformFeedbackNV(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglDeleteTransformFeedbacksNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glDeleteTransformFeedbacksNVPROC glDeleteTransformFeedbacksNV = (glDeleteTransformFeedbacksNVPROC)tlsGetFunction(2169);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDeleteTransformFeedbacksNV(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_nglGenTransformFeedbacksNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glGenTransformFeedbacksNVPROC glGenTransformFeedbacksNV = (glGenTransformFeedbacksNVPROC)tlsGetFunction(2170);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glGenTransformFeedbacksNV(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_glIsTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint id) {
    glIsTransformFeedbackNVPROC glIsTransformFeedbackNV = (glIsTransformFeedbackNVPROC)tlsGetFunction(2171);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsTransformFeedbackNV(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_glPauseTransformFeedbackNV(JNIEnv *__env, jclass clazz) {
    glPauseTransformFeedbackNVPROC glPauseTransformFeedbackNV = (glPauseTransformFeedbackNVPROC)tlsGetFunction(2172);
    UNUSED_PARAM(clazz)
    glPauseTransformFeedbackNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_glResumeTransformFeedbackNV(JNIEnv *__env, jclass clazz) {
    glResumeTransformFeedbackNVPROC glResumeTransformFeedbackNV = (glResumeTransformFeedbackNVPROC)tlsGetFunction(2173);
    UNUSED_PARAM(clazz)
    glResumeTransformFeedbackNV();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTransformFeedback2_glDrawTransformFeedbackNV(JNIEnv *__env, jclass clazz, jint mode, jint id) {
    glDrawTransformFeedbackNVPROC glDrawTransformFeedbackNV = (glDrawTransformFeedbackNVPROC)tlsGetFunction(2174);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackNV(mode, id);
}

EXTERN_C_EXIT
