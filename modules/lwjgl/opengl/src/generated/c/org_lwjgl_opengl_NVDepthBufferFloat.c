/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glDepthRangedNVPROC) (jdouble, jdouble);
typedef void (APIENTRY *glClearDepthdNVPROC) (jdouble);
typedef void (APIENTRY *glDepthBoundsdNVPROC) (jdouble, jdouble);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_glDepthRangedNV(JNIEnv *__env, jclass clazz, jdouble zNear, jdouble zFar) {
    glDepthRangedNVPROC glDepthRangedNV = (glDepthRangedNVPROC)tlsGetFunction(1950);
    UNUSED_PARAM(clazz)
    glDepthRangedNV(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_glClearDepthdNV(JNIEnv *__env, jclass clazz, jdouble depth) {
    glClearDepthdNVPROC glClearDepthdNV = (glClearDepthdNVPROC)tlsGetFunction(1951);
    UNUSED_PARAM(clazz)
    glClearDepthdNV(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVDepthBufferFloat_glDepthBoundsdNV(JNIEnv *__env, jclass clazz, jdouble zmin, jdouble zmax) {
    glDepthBoundsdNVPROC glDepthBoundsdNV = (glDepthBoundsdNVPROC)tlsGetFunction(1952);
    UNUSED_PARAM(clazz)
    glDepthBoundsdNV(zmin, zmax);
}

EXTERN_C_EXIT
