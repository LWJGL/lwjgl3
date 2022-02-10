/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTextureViewOESPROC) (jint, jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureView_glTextureViewOES(JNIEnv *__env, jclass clazz, jint texture, jint target, jint origtexture, jint internalformat, jint minlevel, jint numlevels, jint minlayer, jint numlayers) {
    glTextureViewOESPROC glTextureViewOES = (glTextureViewOESPROC)tlsGetFunction(824);
    UNUSED_PARAM(clazz)
    glTextureViewOES(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
}

EXTERN_C_EXIT
