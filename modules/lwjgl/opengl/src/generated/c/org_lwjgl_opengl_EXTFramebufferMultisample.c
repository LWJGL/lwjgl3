/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleEXTPROC) (jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferMultisample_glRenderbufferStorageMultisampleEXT(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisampleEXTPROC glRenderbufferStorageMultisampleEXT = (glRenderbufferStorageMultisampleEXTPROC)tlsGetFunction(1733);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisampleEXT(target, samples, internalformat, width, height);
}

EXTERN_C_EXIT
