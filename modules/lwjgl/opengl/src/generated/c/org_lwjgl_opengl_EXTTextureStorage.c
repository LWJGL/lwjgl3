/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexStorage1DEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage2DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage3DEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage1DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage2DEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureStorage_glTexStorage1DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width) {
    glTexStorage1DEXTPROC glTexStorage1DEXT = (glTexStorage1DEXTPROC)tlsGetFunction(1860);
    UNUSED_PARAM(clazz)
    glTexStorage1DEXT(target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureStorage_glTexStorage2DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height) {
    glTexStorage2DEXTPROC glTexStorage2DEXT = (glTexStorage2DEXTPROC)tlsGetFunction(1861);
    UNUSED_PARAM(clazz)
    glTexStorage2DEXT(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureStorage_glTexStorage3DEXT(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth) {
    glTexStorage3DEXTPROC glTexStorage3DEXT = (glTexStorage3DEXTPROC)tlsGetFunction(1862);
    UNUSED_PARAM(clazz)
    glTexStorage3DEXT(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureStorage_glTextureStorage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width) {
    glTextureStorage1DEXTPROC glTextureStorage1DEXT = (glTextureStorage1DEXTPROC)tlsGetFunction(1375);
    UNUSED_PARAM(clazz)
    glTextureStorage1DEXT(texture, target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureStorage_glTextureStorage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width, jint height) {
    glTextureStorage2DEXTPROC glTextureStorage2DEXT = (glTextureStorage2DEXTPROC)tlsGetFunction(1376);
    UNUSED_PARAM(clazz)
    glTextureStorage2DEXT(texture, target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureStorage_glTextureStorage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width, jint height, jint depth) {
    glTextureStorage3DEXTPROC glTextureStorage3DEXT = (glTextureStorage3DEXTPROC)tlsGetFunction(1377);
    UNUSED_PARAM(clazz)
    glTextureStorage3DEXT(texture, target, levels, internalformat, width, height, depth);
}

EXTERN_C_EXIT
