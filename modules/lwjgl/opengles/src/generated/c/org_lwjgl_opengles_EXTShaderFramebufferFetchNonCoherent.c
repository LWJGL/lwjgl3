/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferFetchBarrierEXTPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTShaderFramebufferFetchNonCoherent_glFramebufferFetchBarrierEXT(JNIEnv *__env, jclass clazz) {
    glFramebufferFetchBarrierEXTPROC glFramebufferFetchBarrierEXT = (glFramebufferFetchBarrierEXTPROC)tlsGetFunction(533);
    UNUSED_PARAM(clazz)
    glFramebufferFetchBarrierEXT();
}

EXTERN_C_EXIT
