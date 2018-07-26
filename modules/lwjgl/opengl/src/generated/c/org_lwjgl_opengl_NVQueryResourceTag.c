/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGenQueryResourceTagNVPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteQueryResourceTagNVPROC) (jint, intptr_t);
typedef void (APIENTRY *glQueryResourceTagNVPROC) (jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVQueryResourceTag_nglGenQueryResourceTagNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong tagIdsAddress) {
    glGenQueryResourceTagNVPROC glGenQueryResourceTagNV = (glGenQueryResourceTagNVPROC)tlsGetFunction(2098);
    intptr_t tagIds = (intptr_t)tagIdsAddress;
    UNUSED_PARAM(clazz)
    glGenQueryResourceTagNV(n, tagIds);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVQueryResourceTag_nglDeleteQueryResourceTagNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong tagIdsAddress) {
    glDeleteQueryResourceTagNVPROC glDeleteQueryResourceTagNV = (glDeleteQueryResourceTagNVPROC)tlsGetFunction(2099);
    intptr_t tagIds = (intptr_t)tagIdsAddress;
    UNUSED_PARAM(clazz)
    glDeleteQueryResourceTagNV(n, tagIds);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVQueryResourceTag_nglQueryResourceTagNV(JNIEnv *__env, jclass clazz, jint tagId, jlong tagStringAddress) {
    glQueryResourceTagNVPROC glQueryResourceTagNV = (glQueryResourceTagNVPROC)tlsGetFunction(2100);
    intptr_t tagString = (intptr_t)tagStringAddress;
    UNUSED_PARAM(clazz)
    glQueryResourceTagNV(tagId, tagString);
}

EXTERN_C_EXIT
