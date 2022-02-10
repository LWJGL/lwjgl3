/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferTexture2DDownsampleIMGPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureLayerDownsampleIMGPROC) (jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_IMGFramebufferDownsample_glFramebufferTexture2DDownsampleIMG(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint xscale, jint yscale) {
    glFramebufferTexture2DDownsampleIMGPROC glFramebufferTexture2DDownsampleIMG = (glFramebufferTexture2DDownsampleIMGPROC)tlsGetFunction(561);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2DDownsampleIMG(target, attachment, textarget, texture, level, xscale, yscale);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_IMGFramebufferDownsample_glFramebufferTextureLayerDownsampleIMG(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer, jint xscale, jint yscale) {
    glFramebufferTextureLayerDownsampleIMGPROC glFramebufferTextureLayerDownsampleIMG = (glFramebufferTextureLayerDownsampleIMGPROC)tlsGetFunction(562);
    UNUSED_PARAM(clazz)
    glFramebufferTextureLayerDownsampleIMG(target, attachment, texture, level, layer, xscale, yscale);
}

EXTERN_C_EXIT
