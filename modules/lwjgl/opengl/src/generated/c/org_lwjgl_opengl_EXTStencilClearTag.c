/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glStencilClearTagEXTPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTStencilClearTag_glStencilClearTagEXT(JNIEnv *__env, jclass clazz, jint stencilTagBits, jint stencilClearTag) {
    glStencilClearTagEXTPROC glStencilClearTagEXT = (glStencilClearTagEXTPROC)tlsGetFunction(1851);
    UNUSED_PARAM(clazz)
    glStencilClearTagEXT(stencilTagBits, stencilClearTag);
}

EXTERN_C_EXIT
