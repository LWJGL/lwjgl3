/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindTransformFeedbackPROC) (jint, jint);
typedef void (APIENTRY *glDeleteTransformFeedbacksPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenTransformFeedbacksPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsTransformFeedbackPROC) (jint);
typedef void (APIENTRY *glPauseTransformFeedbackPROC) (void);
typedef void (APIENTRY *glResumeTransformFeedbackPROC) (void);
typedef void (APIENTRY *glDrawTransformFeedbackPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback2_glBindTransformFeedback(JNIEnv *__env, jclass clazz, jint target, jint id) {
    glBindTransformFeedbackPROC glBindTransformFeedback = (glBindTransformFeedbackPROC)tlsGetFunction(759);
    UNUSED_PARAM(clazz)
    glBindTransformFeedback(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback2_nglDeleteTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glDeleteTransformFeedbacksPROC glDeleteTransformFeedbacks = (glDeleteTransformFeedbacksPROC)tlsGetFunction(760);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDeleteTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback2_nglGenTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glGenTransformFeedbacksPROC glGenTransformFeedbacks = (glGenTransformFeedbacksPROC)tlsGetFunction(761);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glGenTransformFeedbacks(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback2_glIsTransformFeedback(JNIEnv *__env, jclass clazz, jint id) {
    glIsTransformFeedbackPROC glIsTransformFeedback = (glIsTransformFeedbackPROC)tlsGetFunction(762);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsTransformFeedback(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback2_glPauseTransformFeedback(JNIEnv *__env, jclass clazz) {
    glPauseTransformFeedbackPROC glPauseTransformFeedback = (glPauseTransformFeedbackPROC)tlsGetFunction(763);
    UNUSED_PARAM(clazz)
    glPauseTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback2_glResumeTransformFeedback(JNIEnv *__env, jclass clazz) {
    glResumeTransformFeedbackPROC glResumeTransformFeedback = (glResumeTransformFeedbackPROC)tlsGetFunction(764);
    UNUSED_PARAM(clazz)
    glResumeTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback2_glDrawTransformFeedback(JNIEnv *__env, jclass clazz, jint mode, jint id) {
    glDrawTransformFeedbackPROC glDrawTransformFeedback = (glDrawTransformFeedbackPROC)tlsGetFunction(765);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedback(mode, id);
}

EXTERN_C_EXIT
