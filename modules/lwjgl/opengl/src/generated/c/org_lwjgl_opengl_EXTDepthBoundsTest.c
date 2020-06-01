/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDepthBoundsEXTPROC) (jdouble, jdouble);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDepthBoundsTest_glDepthBoundsEXT(JNIEnv *__env, jclass clazz, jdouble zmin, jdouble zmax) {
    glDepthBoundsEXTPROC glDepthBoundsEXT = (glDepthBoundsEXTPROC)tlsGetFunction(1507);
    UNUSED_PARAM(clazz)
    glDepthBoundsEXT(zmin, zmax);
}

EXTERN_C_EXIT
