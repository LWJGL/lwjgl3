/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glActiveStencilFaceEXTPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTStencilTwoSide_glActiveStencilFaceEXT(JNIEnv *__env, jclass clazz, jint face) {
    glActiveStencilFaceEXTPROC glActiveStencilFaceEXT = (glActiveStencilFaceEXTPROC)tlsGetFunction(1852);
    UNUSED_PARAM(clazz)
    glActiveStencilFaceEXT(face);
}

EXTERN_C_EXIT
