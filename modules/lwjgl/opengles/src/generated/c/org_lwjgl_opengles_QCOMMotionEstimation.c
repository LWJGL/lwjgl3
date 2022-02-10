/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexEstimateMotionQCOMPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexEstimateMotionRegionsQCOMPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMMotionEstimation_glTexEstimateMotionQCOM(JNIEnv *__env, jclass clazz, jint ref, jint target, jint output) {
    glTexEstimateMotionQCOMPROC glTexEstimateMotionQCOM = (glTexEstimateMotionQCOMPROC)tlsGetFunction(860);
    UNUSED_PARAM(clazz)
    glTexEstimateMotionQCOM(ref, target, output);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMMotionEstimation_glTexEstimateMotionRegionsQCOM(JNIEnv *__env, jclass clazz, jint ref, jint target, jint output, jint mask) {
    glTexEstimateMotionRegionsQCOMPROC glTexEstimateMotionRegionsQCOM = (glTexEstimateMotionRegionsQCOMPROC)tlsGetFunction(861);
    UNUSED_PARAM(clazz)
    glTexEstimateMotionRegionsQCOM(ref, target, output, mask);
}

EXTERN_C_EXIT
