/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glConservativeRasterParameterfNVPROC) (jint, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVConservativeRasterDilate_glConservativeRasterParameterfNV(JNIEnv *__env, jclass clazz, jint pname, jfloat value) {
    glConservativeRasterParameterfNVPROC glConservativeRasterParameterfNV = (glConservativeRasterParameterfNVPROC)tlsGetFunction(1947);
    UNUSED_PARAM(clazz)
    glConservativeRasterParameterfNV(pname, value);
}

EXTERN_C_EXIT
