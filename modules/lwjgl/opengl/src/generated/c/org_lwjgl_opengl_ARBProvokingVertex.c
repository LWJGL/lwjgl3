/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glProvokingVertexPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBProvokingVertex_glProvokingVertex(JNIEnv *__env, jclass clazz, jint mode) {
    glProvokingVertexPROC glProvokingVertex = (glProvokingVertexPROC)tlsGetFunction(652);
    UNUSED_PARAM(clazz)
    glProvokingVertex(mode);
}

EXTERN_C_EXIT
