/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferParameteriMESAPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferParameterivMESAPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_MESAFramebufferFlipY_glFramebufferParameteriMESA(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glFramebufferParameteriMESAPROC glFramebufferParameteriMESA = (glFramebufferParameteriMESAPROC)tlsGetFunction(594);
    UNUSED_PARAM(clazz)
    glFramebufferParameteriMESA(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_MESAFramebufferFlipY_nglGetFramebufferParameterivMESA__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetFramebufferParameterivMESAPROC glGetFramebufferParameterivMESA = (glGetFramebufferParameterivMESAPROC)tlsGetFunction(595);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferParameterivMESA(target, pname, params);
}

EXTERN_C_EXIT
