/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTextureBarrierNVPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureBarrier_glTextureBarrierNV(JNIEnv *__env, jclass clazz) {
    glTextureBarrierNVPROC glTextureBarrierNV = (glTextureBarrierNVPROC)tlsGetFunction(2146);
    UNUSED_PARAM(clazz)
    glTextureBarrierNV();
}

EXTERN_C_EXIT
