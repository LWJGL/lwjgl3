/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glProvokingVertexEXTPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTProvokingVertex_glProvokingVertexEXT(JNIEnv *__env, jclass clazz, jint mode) {
    glProvokingVertexEXTPROC glProvokingVertexEXT = (glProvokingVertexEXTPROC)tlsGetFunction(1816);
    UNUSED_PARAM(clazz)
    glProvokingVertexEXT(mode);
}

EXTERN_C_EXIT
