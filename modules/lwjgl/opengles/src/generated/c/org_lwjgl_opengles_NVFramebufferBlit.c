/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glBlitFramebufferNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVFramebufferBlit_glBlitFramebufferNV(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glBlitFramebufferNVPROC glBlitFramebufferNV = (glBlitFramebufferNVPROC)tlsGetFunction(636);
    UNUSED_PARAM(clazz)
    glBlitFramebufferNV(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

EXTERN_C_EXIT
