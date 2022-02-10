/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glBeginConditionalRenderNVPROC) (jint, jint);
typedef void (APIENTRY *glEndConditionalRenderNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVConditionalRender_glBeginConditionalRenderNV(JNIEnv *__env, jclass clazz, jint id, jint mode) {
    glBeginConditionalRenderNVPROC glBeginConditionalRenderNV = (glBeginConditionalRenderNVPROC)tlsGetFunction(613);
    UNUSED_PARAM(clazz)
    glBeginConditionalRenderNV(id, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVConditionalRender_glEndConditionalRenderNV(JNIEnv *__env, jclass clazz) {
    glEndConditionalRenderNVPROC glEndConditionalRenderNV = (glEndConditionalRenderNVPROC)tlsGetFunction(614);
    UNUSED_PARAM(clazz)
    glEndConditionalRenderNV();
}

EXTERN_C_EXIT
