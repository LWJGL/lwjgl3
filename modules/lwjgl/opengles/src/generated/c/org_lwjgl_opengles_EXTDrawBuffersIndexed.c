/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glEnableiEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableiEXTPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationiEXTPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateiEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFunciEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateiEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glColorMaskiEXTPROC) (jint, jboolean, jboolean, jboolean, jboolean);
typedef jboolean (APIENTRY *glIsEnablediEXTPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glEnableiEXT(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEnableiEXTPROC glEnableiEXT = (glEnableiEXTPROC)tlsGetFunction(419);
    UNUSED_PARAM(clazz)
    glEnableiEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glDisableiEXT(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableiEXTPROC glDisableiEXT = (glDisableiEXTPROC)tlsGetFunction(420);
    UNUSED_PARAM(clazz)
    glDisableiEXT(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glBlendEquationiEXT(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
    glBlendEquationiEXTPROC glBlendEquationiEXT = (glBlendEquationiEXTPROC)tlsGetFunction(421);
    UNUSED_PARAM(clazz)
    glBlendEquationiEXT(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glBlendEquationSeparateiEXT(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparateiEXTPROC glBlendEquationSeparateiEXT = (glBlendEquationSeparateiEXTPROC)tlsGetFunction(422);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparateiEXT(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glBlendFunciEXT(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
    glBlendFunciEXTPROC glBlendFunciEXT = (glBlendFunciEXTPROC)tlsGetFunction(423);
    UNUSED_PARAM(clazz)
    glBlendFunciEXT(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glBlendFuncSeparateiEXT(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    glBlendFuncSeparateiEXTPROC glBlendFuncSeparateiEXT = (glBlendFuncSeparateiEXTPROC)tlsGetFunction(424);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparateiEXT(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glColorMaskiEXT(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {
    glColorMaskiEXTPROC glColorMaskiEXT = (glColorMaskiEXTPROC)tlsGetFunction(425);
    UNUSED_PARAM(clazz)
    glColorMaskiEXT(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTDrawBuffersIndexed_glIsEnablediEXT(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnablediEXTPROC glIsEnablediEXT = (glIsEnablediEXTPROC)tlsGetFunction(426);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnablediEXT(target, index);
}

EXTERN_C_EXIT
