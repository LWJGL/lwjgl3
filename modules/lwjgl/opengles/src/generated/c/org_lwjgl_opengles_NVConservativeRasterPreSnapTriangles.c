/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glConservativeRasterParameteriNVPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVConservativeRasterPreSnapTriangles_glConservativeRasterParameteriNV(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glConservativeRasterParameteriNVPROC glConservativeRasterParameteriNV = (glConservativeRasterParameteriNVPROC)tlsGetFunction(616);
    UNUSED_PARAM(clazz)
    glConservativeRasterParameteriNV(pname, param);
}

EXTERN_C_EXIT
