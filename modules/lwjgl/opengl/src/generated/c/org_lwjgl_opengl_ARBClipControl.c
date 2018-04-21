/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClipControlPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBClipControl_glClipControl(JNIEnv *__env, jclass clazz, jint origin, jint depth) {
    glClipControlPROC glClipControl = (glClipControlPROC)tlsGetFunction(922);
    UNUSED_PARAM(clazz)
    glClipControl(origin, depth);
}

EXTERN_C_EXIT
