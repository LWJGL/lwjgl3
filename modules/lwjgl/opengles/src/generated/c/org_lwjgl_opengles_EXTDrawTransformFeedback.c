/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawTransformFeedbackEXTPROC) (jint, jint);
typedef void (APIENTRY *glDrawTransformFeedbackInstancedEXTPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawTransformFeedback_glDrawTransformFeedbackEXT(JNIEnv *__env, jclass clazz, jint mode, jint id) {
    glDrawTransformFeedbackEXTPROC glDrawTransformFeedbackEXT = (glDrawTransformFeedbackEXTPROC)tlsGetFunction(433);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackEXT(mode, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawTransformFeedback_glDrawTransformFeedbackInstancedEXT(JNIEnv *__env, jclass clazz, jint mode, jint id, jint instancecount) {
    glDrawTransformFeedbackInstancedEXTPROC glDrawTransformFeedbackInstancedEXT = (glDrawTransformFeedbackInstancedEXTPROC)tlsGetFunction(434);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackInstancedEXT(mode, id, instancecount);
}

EXTERN_C_EXIT
