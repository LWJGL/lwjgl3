/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClampColorARBPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBColorBufferFloat_glClampColorARB(JNIEnv *__env, jclass clazz, jint target, jint clamp) {
    glClampColorARBPROC glClampColorARB = (glClampColorARBPROC)tlsGetFunction(1131);
    UNUSED_PARAM(clazz)
    glClampColorARB(target, clamp);
}

EXTERN_C_EXIT
