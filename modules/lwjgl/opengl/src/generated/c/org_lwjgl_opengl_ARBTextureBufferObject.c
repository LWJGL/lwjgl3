/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexBufferARBPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureBufferObject_glTexBufferARB(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
    glTexBufferARBPROC glTexBufferARB = (glTexBufferARBPROC)tlsGetFunction(1366);
    UNUSED_PARAM(clazz)
    glTexBufferARB(target, internalformat, buffer);
}

EXTERN_C_EXIT
