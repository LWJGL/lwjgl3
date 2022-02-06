/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDrawBuffersARBPROC) (jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDrawBuffers_nglDrawBuffersARB__IJ(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress) {
    glDrawBuffersARBPROC glDrawBuffersARB = (glDrawBuffersARBPROC)tlsGetFunction(1137);
    uintptr_t bufs = (uintptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glDrawBuffersARB(n, bufs);
}

EXTERN_C_EXIT
