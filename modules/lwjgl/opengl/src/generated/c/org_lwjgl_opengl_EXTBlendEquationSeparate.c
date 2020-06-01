/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendEquationSeparateEXTPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTBlendEquationSeparate_glBlendEquationSeparateEXT(JNIEnv *__env, jclass clazz, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparateEXTPROC glBlendEquationSeparateEXT = (glBlendEquationSeparateEXTPROC)tlsGetFunction(1497);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparateEXT(modeRGB, modeAlpha);
}

EXTERN_C_EXIT
