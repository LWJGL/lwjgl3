/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferTextureMultisampleMultiviewOVRPROC) (jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OVRMultiviewMultisampledRenderToTexture_glFramebufferTextureMultisampleMultiviewOVR(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint samples, jint baseViewIndex, jint numViews) {
    glFramebufferTextureMultisampleMultiviewOVRPROC glFramebufferTextureMultisampleMultiviewOVR = (glFramebufferTextureMultisampleMultiviewOVRPROC)tlsGetFunction(839);
    UNUSED_PARAM(clazz)
    glFramebufferTextureMultisampleMultiviewOVR(target, attachment, texture, level, samples, baseViewIndex, numViews);
}

EXTERN_C_EXIT
