/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture2DMultisampleEXTPROC) (jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultisampledRenderToTexture_glRenderbufferStorageMultisampleEXT(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisampleEXTPROC glRenderbufferStorageMultisampleEXT = (glRenderbufferStorageMultisampleEXTPROC)tlsGetFunction(467);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisampleEXT(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTMultisampledRenderToTexture_glFramebufferTexture2DMultisampleEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint samples) {
    glFramebufferTexture2DMultisampleEXTPROC glFramebufferTexture2DMultisampleEXT = (glFramebufferTexture2DMultisampleEXTPROC)tlsGetFunction(468);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2DMultisampleEXT(target, attachment, textarget, texture, level, samples);
}

EXTERN_C_EXIT
