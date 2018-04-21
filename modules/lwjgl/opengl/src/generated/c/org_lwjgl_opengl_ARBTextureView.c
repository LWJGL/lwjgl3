/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTextureViewPROC) (jint, jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureView_glTextureView(JNIEnv *__env, jclass clazz, jint texture, jint target, jint origtexture, jint internalformat, jint minlevel, jint numlevels, jint minlayer, jint numlayers) {
    glTextureViewPROC glTextureView = (glTextureViewPROC)tlsGetFunction(906);
    UNUSED_PARAM(clazz)
    glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
}

EXTERN_C_EXIT
