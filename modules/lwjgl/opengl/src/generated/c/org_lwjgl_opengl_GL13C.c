/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glCompressedTexImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTexImage1DPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTexSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTexSubImage1DPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetCompressedTexImagePROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSampleCoveragePROC) (jfloat, jboolean);
typedef void (APIENTRY *glActiveTexturePROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_nglCompressedTexImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTexImage3DPROC glCompressedTexImage3D = (glCompressedTexImage3DPROC)tlsGetFunction(377);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_nglCompressedTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTexImage2DPROC glCompressedTexImage2D = (glCompressedTexImage2DPROC)tlsGetFunction(378);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_nglCompressedTexImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTexImage1DPROC glCompressedTexImage1D = (glCompressedTexImage1DPROC)tlsGetFunction(379);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_nglCompressedTexSubImage3D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTexSubImage3DPROC glCompressedTexSubImage3D = (glCompressedTexSubImage3DPROC)tlsGetFunction(380);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_nglCompressedTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTexSubImage2DPROC glCompressedTexSubImage2D = (glCompressedTexSubImage2DPROC)tlsGetFunction(381);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_nglCompressedTexSubImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTexSubImage1DPROC glCompressedTexSubImage1D = (glCompressedTexSubImage1DPROC)tlsGetFunction(382);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_nglGetCompressedTexImage(JNIEnv *__env, jclass clazz, jint target, jint level, jlong pixelsAddress) {
    glGetCompressedTexImagePROC glGetCompressedTexImage = (glGetCompressedTexImagePROC)tlsGetFunction(383);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedTexImage(target, level, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_glSampleCoverage(JNIEnv *__env, jclass clazz, jfloat value, jboolean invert) {
    glSampleCoveragePROC glSampleCoverage = (glSampleCoveragePROC)tlsGetFunction(384);
    UNUSED_PARAM(clazz)
    glSampleCoverage(value, invert);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL13C_glActiveTexture(JNIEnv *__env, jclass clazz, jint texture) {
    glActiveTexturePROC glActiveTexture = (glActiveTexturePROC)tlsGetFunction(385);
    UNUSED_PARAM(clazz)
    glActiveTexture(texture);
}

EXTERN_C_EXIT
