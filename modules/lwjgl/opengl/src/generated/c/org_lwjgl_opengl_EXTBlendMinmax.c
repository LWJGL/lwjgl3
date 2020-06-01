/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendEquationEXTPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTBlendMinmax_glBlendEquationEXT(JNIEnv *__env, jclass clazz, jint mode) {
    glBlendEquationEXTPROC glBlendEquationEXT = (glBlendEquationEXTPROC)tlsGetFunction(1499);
    UNUSED_PARAM(clazz)
    glBlendEquationEXT(mode);
}

EXTERN_C_EXIT
