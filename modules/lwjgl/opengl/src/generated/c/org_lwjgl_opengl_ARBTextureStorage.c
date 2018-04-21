/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexStorage1DPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTexStorage3DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage1DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage2DEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorage_glTexStorage1D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width) {
    glTexStorage1DPROC glTexStorage1D = (glTexStorage1DPROC)tlsGetFunction(859);
    UNUSED_PARAM(clazz)
    glTexStorage1D(target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorage_glTexStorage2D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height) {
    glTexStorage2DPROC glTexStorage2D = (glTexStorage2DPROC)tlsGetFunction(860);
    UNUSED_PARAM(clazz)
    glTexStorage2D(target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorage_glTexStorage3D(JNIEnv *__env, jclass clazz, jint target, jint levels, jint internalformat, jint width, jint height, jint depth) {
    glTexStorage3DPROC glTexStorage3D = (glTexStorage3DPROC)tlsGetFunction(861);
    UNUSED_PARAM(clazz)
    glTexStorage3D(target, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorage_glTextureStorage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width) {
    glTextureStorage1DEXTPROC glTextureStorage1DEXT = (glTextureStorage1DEXTPROC)tlsGetFunction(1339);
    UNUSED_PARAM(clazz)
    glTextureStorage1DEXT(texture, target, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorage_glTextureStorage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width, jint height) {
    glTextureStorage2DEXTPROC glTextureStorage2DEXT = (glTextureStorage2DEXTPROC)tlsGetFunction(1340);
    UNUSED_PARAM(clazz)
    glTextureStorage2DEXT(texture, target, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTextureStorage_glTextureStorage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint levels, jint internalformat, jint width, jint height, jint depth) {
    glTextureStorage3DEXTPROC glTextureStorage3DEXT = (glTextureStorage3DEXTPROC)tlsGetFunction(1341);
    UNUSED_PARAM(clazz)
    glTextureStorage3DEXT(texture, target, levels, internalformat, width, height, depth);
}

EXTERN_C_EXIT
