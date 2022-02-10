/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleIMGPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture2DMultisampleIMGPROC) (jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_IMGMultisampledRenderToTexture_glRenderbufferStorageMultisampleIMG(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisampleIMGPROC glRenderbufferStorageMultisampleIMG = (glRenderbufferStorageMultisampleIMGPROC)tlsGetFunction(563);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisampleIMG(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_IMGMultisampledRenderToTexture_glFramebufferTexture2DMultisampleIMG(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint samples) {
    glFramebufferTexture2DMultisampleIMGPROC glFramebufferTexture2DMultisampleIMG = (glFramebufferTexture2DMultisampleIMGPROC)tlsGetFunction(564);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2DMultisampleIMG(target, attachment, textarget, texture, level, samples);
}

EXTERN_C_EXIT
