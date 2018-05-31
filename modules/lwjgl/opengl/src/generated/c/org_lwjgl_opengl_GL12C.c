/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glTexSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCopyTexSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDrawRangeElementsPROC) (jint, jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12C_nglTexImage3D__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage3DPROC glTexImage3D = (glTexImage3DPROC)tlsGetFunction(336);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12C_nglTexSubImage3D__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage3DPROC glTexSubImage3D = (glTexSubImage3DPROC)tlsGetFunction(337);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12C_glCopyTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyTexSubImage3DPROC glCopyTexSubImage3D = (glCopyTexSubImage3DPROC)tlsGetFunction(338);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL12C_nglDrawRangeElements(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress) {
    glDrawRangeElementsPROC glDrawRangeElements = (glDrawRangeElementsPROC)tlsGetFunction(339);
    intptr_t indices = (intptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElements(mode, start, end, count, type, indices);
}

EXTERN_C_EXIT
