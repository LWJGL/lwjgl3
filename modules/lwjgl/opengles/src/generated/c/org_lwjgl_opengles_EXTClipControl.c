/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glClipControlEXTPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTClipControl_glClipControlEXT(JNIEnv *__env, jclass clazz, jint origin, jint depth) {
    glClipControlEXTPROC glClipControlEXT = (glClipControlEXTPROC)tlsGetFunction(398);
    UNUSED_PARAM(clazz)
    glClipControlEXT(origin, depth);
}

EXTERN_C_EXIT
