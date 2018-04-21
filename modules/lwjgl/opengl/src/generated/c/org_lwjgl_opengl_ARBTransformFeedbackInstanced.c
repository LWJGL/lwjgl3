/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawTransformFeedbackInstancedPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawTransformFeedbackStreamInstancedPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedbackInstanced_glDrawTransformFeedbackInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint primcount) {
    glDrawTransformFeedbackInstancedPROC glDrawTransformFeedbackInstanced = (glDrawTransformFeedbackInstancedPROC)tlsGetFunction(862);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackInstanced(mode, id, primcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedbackInstanced_glDrawTransformFeedbackStreamInstanced(JNIEnv *__env, jclass clazz, jint mode, jint id, jint stream, jint primcount) {
    glDrawTransformFeedbackStreamInstancedPROC glDrawTransformFeedbackStreamInstanced = (glDrawTransformFeedbackStreamInstancedPROC)tlsGetFunction(863);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
}

EXTERN_C_EXIT
