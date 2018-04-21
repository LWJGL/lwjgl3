/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTextureBarrierPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureBarrier_glTextureBarrier(JNIEnv *__env, jclass clazz) {
    glTextureBarrierPROC glTextureBarrier = (glTextureBarrierPROC)tlsGetFunction(1023);
    UNUSED_PARAM(clazz)
    glTextureBarrier();
}

EXTERN_C_EXIT
