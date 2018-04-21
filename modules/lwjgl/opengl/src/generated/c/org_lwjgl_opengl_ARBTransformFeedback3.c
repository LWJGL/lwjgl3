/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawTransformFeedbackStreamPROC) (jint, jint, jint);
typedef void (APIENTRY *glBeginQueryIndexedPROC) (jint, jint, jint);
typedef void (APIENTRY *glEndQueryIndexedPROC) (jint, jint);
typedef void (APIENTRY *glGetQueryIndexedivPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback3_glDrawTransformFeedbackStream(JNIEnv *__env, jclass clazz, jint mode, jint id, jint stream) {
    glDrawTransformFeedbackStreamPROC glDrawTransformFeedbackStream = (glDrawTransformFeedbackStreamPROC)tlsGetFunction(766);
    UNUSED_PARAM(clazz)
    glDrawTransformFeedbackStream(mode, id, stream);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback3_glBeginQueryIndexed(JNIEnv *__env, jclass clazz, jint target, jint index, jint id) {
    glBeginQueryIndexedPROC glBeginQueryIndexed = (glBeginQueryIndexedPROC)tlsGetFunction(767);
    UNUSED_PARAM(clazz)
    glBeginQueryIndexed(target, index, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback3_glEndQueryIndexed(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEndQueryIndexedPROC glEndQueryIndexed = (glEndQueryIndexedPROC)tlsGetFunction(768);
    UNUSED_PARAM(clazz)
    glEndQueryIndexed(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTransformFeedback3_nglGetQueryIndexediv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jint pname, jlong paramsAddress) {
    glGetQueryIndexedivPROC glGetQueryIndexediv = (glGetQueryIndexedivPROC)tlsGetFunction(769);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryIndexediv(target, index, pname, params);
}

EXTERN_C_EXIT
