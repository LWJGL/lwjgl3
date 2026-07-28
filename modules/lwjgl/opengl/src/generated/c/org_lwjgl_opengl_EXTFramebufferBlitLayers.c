/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlitFramebufferLayersEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glBlitFramebufferLayerEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferBlitLayers_glBlitFramebufferLayersEXT(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glBlitFramebufferLayersEXTPROC glBlitFramebufferLayersEXT = (glBlitFramebufferLayersEXTPROC)tlsGetFunction(1771);
    UNUSED_PARAM(clazz)
    glBlitFramebufferLayersEXT(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferBlitLayers_glBlitFramebufferLayerEXT(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint srcLayer, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint dstLayer, jint mask, jint filter) {
    glBlitFramebufferLayerEXTPROC glBlitFramebufferLayerEXT = (glBlitFramebufferLayerEXTPROC)tlsGetFunction(1772);
    UNUSED_PARAM(clazz)
    glBlitFramebufferLayerEXT(srcX0, srcY0, srcX1, srcY1, srcLayer, dstX0, dstY0, dstX1, dstY1, dstLayer, mask, filter);
}

EXTERN_C_EXIT
