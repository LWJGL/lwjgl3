/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendFuncIndexedAMDPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateIndexedAMDPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glBlendEquationIndexedAMDPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateIndexedAMDPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_glBlendFuncIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
    glBlendFuncIndexedAMDPROC glBlendFuncIndexedAMD = (glBlendFuncIndexedAMDPROC)tlsGetFunction(1052);
    UNUSED_PARAM(clazz)
    glBlendFuncIndexedAMD(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_glBlendFuncSeparateIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    glBlendFuncSeparateIndexedAMDPROC glBlendFuncSeparateIndexedAMD = (glBlendFuncSeparateIndexedAMDPROC)tlsGetFunction(1053);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparateIndexedAMD(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_glBlendEquationIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
    glBlendEquationIndexedAMDPROC glBlendEquationIndexedAMD = (glBlendEquationIndexedAMDPROC)tlsGetFunction(1054);
    UNUSED_PARAM(clazz)
    glBlendEquationIndexedAMD(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDDrawBuffersBlend_glBlendEquationSeparateIndexedAMD(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparateIndexedAMDPROC glBlendEquationSeparateIndexedAMD = (glBlendEquationSeparateIndexedAMDPROC)tlsGetFunction(1055);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparateIndexedAMD(buf, modeRGB, modeAlpha);
}

EXTERN_C_EXIT
