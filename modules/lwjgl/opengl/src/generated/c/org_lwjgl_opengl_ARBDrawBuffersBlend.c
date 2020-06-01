/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendEquationiARBPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateiARBPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFunciARBPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateiARBPROC) (jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_glBlendEquationiARB(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
    glBlendEquationiARBPROC glBlendEquationiARB = (glBlendEquationiARBPROC)tlsGetFunction(1138);
    UNUSED_PARAM(clazz)
    glBlendEquationiARB(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_glBlendEquationSeparateiARB(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparateiARBPROC glBlendEquationSeparateiARB = (glBlendEquationSeparateiARBPROC)tlsGetFunction(1139);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparateiARB(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_glBlendFunciARB(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
    glBlendFunciARBPROC glBlendFunciARB = (glBlendFunciARBPROC)tlsGetFunction(1140);
    UNUSED_PARAM(clazz)
    glBlendFunciARB(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffersBlend_glBlendFuncSeparateiARB(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    glBlendFuncSeparateiARBPROC glBlendFuncSeparateiARB = (glBlendFuncSeparateiARBPROC)tlsGetFunction(1141);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparateiARB(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

EXTERN_C_EXIT
