/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glAlphaToCoverageDitherControlNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVAlphaToCoverageDitherControl_glAlphaToCoverageDitherControlNV(JNIEnv *__env, jclass clazz, jint mode) {
    glAlphaToCoverageDitherControlNVPROC glAlphaToCoverageDitherControlNV = (glAlphaToCoverageDitherControlNVPROC)tlsGetFunction(1906);
    UNUSED_PARAM(clazz)
    glAlphaToCoverageDitherControlNV(mode);
}

EXTERN_C_EXIT
