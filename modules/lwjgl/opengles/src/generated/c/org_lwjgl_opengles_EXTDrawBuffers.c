/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDrawBuffersEXTPROC) (jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDrawBuffers_nglDrawBuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong bufsAddress) {
    glDrawBuffersEXTPROC glDrawBuffersEXT = (glDrawBuffersEXTPROC)tlsGetFunction(411);
    intptr_t bufs = (intptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glDrawBuffersEXT(n, bufs);
}

EXTERN_C_EXIT
