/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawBuffersNVPROC) (jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVDrawBuffers_nglDrawBuffersNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress) {
    glDrawBuffersNVPROC glDrawBuffersNV = (glDrawBuffersNVPROC)tlsGetFunction(620);
    uintptr_t bufs = (uintptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glDrawBuffersNV(n, bufs);
}

EXTERN_C_EXIT
