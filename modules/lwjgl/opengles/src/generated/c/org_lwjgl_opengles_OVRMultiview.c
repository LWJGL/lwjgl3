/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferTextureMultiviewOVRPROC) (jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OVRMultiview_glFramebufferTextureMultiviewOVR(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint baseViewIndex, jint numViews) {
    glFramebufferTextureMultiviewOVRPROC glFramebufferTextureMultiviewOVR = (glFramebufferTextureMultiviewOVRPROC)tlsGetFunction(838);
    UNUSED_PARAM(clazz)
    glFramebufferTextureMultiviewOVR(target, attachment, texture, level, baseViewIndex, numViews);
}

EXTERN_C_EXIT
