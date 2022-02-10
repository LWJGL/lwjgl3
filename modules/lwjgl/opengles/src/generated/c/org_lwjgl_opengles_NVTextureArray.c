/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexImage3DNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTexSubImage3DNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyTexSubImage3DNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCompressedTexImage3DNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTexSubImage3DNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glFramebufferTextureLayerNVPROC) (jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglTexImage3DNV__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage3DNVPROC glTexImage3DNV = (glTexImage3DNVPROC)tlsGetFunction(760);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglTexSubImage3DNV__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage3DNVPROC glTexSubImage3DNV = (glTexSubImage3DNVPROC)tlsGetFunction(761);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_glCopyTexSubImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyTexSubImage3DNVPROC glCopyTexSubImage3DNV = (glCopyTexSubImage3DNVPROC)tlsGetFunction(762);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglCompressedTexImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTexImage3DNVPROC glCompressedTexImage3DNV = (glCompressedTexImage3DNVPROC)tlsGetFunction(763);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_nglCompressedTexSubImage3DNV(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTexSubImage3DNVPROC glCompressedTexSubImage3DNV = (glCompressedTexSubImage3DNVPROC)tlsGetFunction(764);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVTextureArray_glFramebufferTextureLayerNV(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer) {
    glFramebufferTextureLayerNVPROC glFramebufferTextureLayerNV = (glFramebufferTextureLayerNVPROC)tlsGetFunction(765);
    UNUSED_PARAM(clazz)
    glFramebufferTextureLayerNV(target, attachment, texture, level, layer);
}

EXTERN_C_EXIT
