/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendColorEXTPROC) (jfloat, jfloat, jfloat, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTBlendColor_glBlendColorEXT(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glBlendColorEXTPROC glBlendColorEXT = (glBlendColorEXTPROC)tlsGetFunction(1496);
    UNUSED_PARAM(clazz)
    glBlendColorEXT(red, green, blue, alpha);
}

EXTERN_C_EXIT
