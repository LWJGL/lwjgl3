/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTextureViewEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTextureView_glTextureViewEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint origtexture, jint internalformat, jint minlevel, jint numlevels, jint minlayer, jint numlayers) {
    glTextureViewEXTPROC glTextureViewEXT = (glTextureViewEXTPROC)tlsGetFunction(557);
    UNUSED_PARAM(clazz)
    glTextureViewEXT(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
}

EXTERN_C_EXIT
