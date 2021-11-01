/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTexImage2DMultisampleCoverageNVPROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTexImage3DMultisampleCoverageNVPROC) (jint, jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureImage2DMultisampleNVPROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureImage3DMultisampleNVPROC) (jint, jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureImage2DMultisampleCoverageNVPROC) (jint, jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureImage3DMultisampleCoverageNVPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_glTexImage2DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations) {
    glTexImage2DMultisampleCoverageNVPROC glTexImage2DMultisampleCoverageNV = (glTexImage2DMultisampleCoverageNVPROC)tlsGetFunction(2147);
    UNUSED_PARAM(clazz)
    glTexImage2DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_glTexImage3DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations) {
    glTexImage3DMultisampleCoverageNVPROC glTexImage3DMultisampleCoverageNV = (glTexImage3DMultisampleCoverageNVPROC)tlsGetFunction(2148);
    UNUSED_PARAM(clazz)
    glTexImage3DMultisampleCoverageNV(target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_glTextureImage2DMultisampleNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations) {
    glTextureImage2DMultisampleNVPROC glTextureImage2DMultisampleNV = (glTextureImage2DMultisampleNVPROC)tlsGetFunction(2149);
    UNUSED_PARAM(clazz)
    glTextureImage2DMultisampleNV(texture, target, samples, internalFormat, width, height, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_glTextureImage3DMultisampleNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint samples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations) {
    glTextureImage3DMultisampleNVPROC glTextureImage3DMultisampleNV = (glTextureImage3DMultisampleNVPROC)tlsGetFunction(2150);
    UNUSED_PARAM(clazz)
    glTextureImage3DMultisampleNV(texture, target, samples, internalFormat, width, height, depth, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_glTextureImage2DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jboolean fixedSampleLocations) {
    glTextureImage2DMultisampleCoverageNVPROC glTextureImage2DMultisampleCoverageNV = (glTextureImage2DMultisampleCoverageNVPROC)tlsGetFunction(2151);
    UNUSED_PARAM(clazz)
    glTextureImage2DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, fixedSampleLocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVTextureMultisample_glTextureImage3DMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint texture, jint target, jint coverageSamples, jint colorSamples, jint internalFormat, jint width, jint height, jint depth, jboolean fixedSampleLocations) {
    glTextureImage3DMultisampleCoverageNVPROC glTextureImage3DMultisampleCoverageNV = (glTextureImage3DMultisampleCoverageNVPROC)tlsGetFunction(2152);
    UNUSED_PARAM(clazz)
    glTextureImage3DMultisampleCoverageNV(texture, target, coverageSamples, colorSamples, internalFormat, width, height, depth, fixedSampleLocations);
}

EXTERN_C_EXIT
