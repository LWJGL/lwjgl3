/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glEnableiOESPROC) (jint, jint);
typedef void (APIENTRY *glDisableiOESPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationiOESPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateiOESPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFunciOESPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateiOESPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glColorMaskiOESPROC) (jint, jboolean, jboolean, jboolean, jboolean);
typedef jboolean (APIENTRY *glIsEnablediOESPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glEnableiOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEnableiOESPROC glEnableiOES = (glEnableiOESPROC)tlsGetFunction(784);
    UNUSED_PARAM(clazz)
    glEnableiOES(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glDisableiOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableiOESPROC glDisableiOES = (glDisableiOESPROC)tlsGetFunction(785);
    UNUSED_PARAM(clazz)
    glDisableiOES(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glBlendEquationiOES(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
    glBlendEquationiOESPROC glBlendEquationiOES = (glBlendEquationiOESPROC)tlsGetFunction(786);
    UNUSED_PARAM(clazz)
    glBlendEquationiOES(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glBlendEquationSeparateiOES(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparateiOESPROC glBlendEquationSeparateiOES = (glBlendEquationSeparateiOESPROC)tlsGetFunction(787);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparateiOES(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glBlendFunciOES(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
    glBlendFunciOESPROC glBlendFunciOES = (glBlendFunciOESPROC)tlsGetFunction(788);
    UNUSED_PARAM(clazz)
    glBlendFunciOES(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glBlendFuncSeparateiOES(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    glBlendFuncSeparateiOESPROC glBlendFuncSeparateiOES = (glBlendFuncSeparateiOESPROC)tlsGetFunction(789);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparateiOES(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glColorMaskiOES(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {
    glColorMaskiOESPROC glColorMaskiOES = (glColorMaskiOESPROC)tlsGetFunction(790);
    UNUSED_PARAM(clazz)
    glColorMaskiOES(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_OESDrawBuffersIndexed_glIsEnablediOES(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnablediOESPROC glIsEnablediOES = (glIsEnablediOESPROC)tlsGetFunction(791);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnablediOES(target, index);
}

EXTERN_C_EXIT
