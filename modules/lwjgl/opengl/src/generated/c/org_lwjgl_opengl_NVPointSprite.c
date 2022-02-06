/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glPointParameteriNVPROC) (jint, jint);
typedef void (APIENTRY *glPointParameterivNVPROC) (jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPointSprite_glPointParameteriNV(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPointParameteriNVPROC glPointParameteriNV = (glPointParameteriNVPROC)tlsGetFunction(2113);
    UNUSED_PARAM(clazz)
    glPointParameteriNV(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVPointSprite_nglPointParameterivNV__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glPointParameterivNVPROC glPointParameterivNV = (glPointParameterivNVPROC)tlsGetFunction(2114);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glPointParameterivNV(pname, params);
}

EXTERN_C_EXIT
