/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexBufferEXTPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureBufferObject_glTexBufferEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
    glTexBufferEXTPROC glTexBufferEXT = (glTexBufferEXTPROC)tlsGetFunction(1853);
    UNUSED_PARAM(clazz)
    glTexBufferEXT(target, internalformat, buffer);
}

EXTERN_C_EXIT
