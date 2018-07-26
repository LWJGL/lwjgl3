/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glStencilOpValueAMDPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDStencilOperationExtended_glStencilOpValueAMD(JNIEnv *__env, jclass clazz, jint face, jint value) {
    glStencilOpValueAMDPROC glStencilOpValueAMD = (glStencilOpValueAMDPROC)tlsGetFunction(1074);
    UNUSED_PARAM(clazz)
    glStencilOpValueAMD(face, value);
}

EXTERN_C_EXIT
