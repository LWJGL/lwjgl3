/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBeginConditionalRenderNVXPROC) (jint);
typedef void (APIENTRY *glEndConditionalRenderNVXPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXConditionalRender_glBeginConditionalRenderNVX(JNIEnv *__env, jclass clazz, jint id) {
    glBeginConditionalRenderNVXPROC glBeginConditionalRenderNVX = (glBeginConditionalRenderNVXPROC)tlsGetFunction(2209);
    UNUSED_PARAM(clazz)
    glBeginConditionalRenderNVX(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVXConditionalRender_glEndConditionalRenderNVX(JNIEnv *__env, jclass clazz) {
    glEndConditionalRenderNVXPROC glEndConditionalRenderNVX = (glEndConditionalRenderNVXPROC)tlsGetFunction(2210);
    UNUSED_PARAM(clazz)
    glEndConditionalRenderNVX();
}

EXTERN_C_EXIT
