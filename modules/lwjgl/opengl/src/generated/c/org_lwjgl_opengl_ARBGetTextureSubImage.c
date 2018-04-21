/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetTextureSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetCompressedTextureSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGetTextureSubImage_nglGetTextureSubImage__IIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glGetTextureSubImagePROC glGetTextureSubImage = (glGetTextureSubImagePROC)tlsGetFunction(1021);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGetTextureSubImage_nglGetCompressedTextureSubImage__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint bufSize, jlong pixelsAddress) {
    glGetCompressedTextureSubImagePROC glGetCompressedTextureSubImage = (glGetCompressedTextureSubImagePROC)tlsGetFunction(1022);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
}

EXTERN_C_EXIT
