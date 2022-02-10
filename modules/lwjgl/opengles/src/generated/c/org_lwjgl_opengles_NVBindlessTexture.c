/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef jlong (APIENTRY *glGetTextureHandleNVPROC) (jint);
typedef jlong (APIENTRY *glGetTextureSamplerHandleNVPROC) (jint, jint);
typedef void (APIENTRY *glMakeTextureHandleResidentNVPROC) (jlong);
typedef void (APIENTRY *glMakeTextureHandleNonResidentNVPROC) (jlong);
typedef jlong (APIENTRY *glGetImageHandleNVPROC) (jint, jint, jboolean, jint, jint);
typedef void (APIENTRY *glMakeImageHandleResidentNVPROC) (jlong, jint);
typedef void (APIENTRY *glMakeImageHandleNonResidentNVPROC) (jlong);
typedef void (APIENTRY *glUniformHandleui64NVPROC) (jint, jlong);
typedef void (APIENTRY *glUniformHandleui64vNVPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniformHandleui64NVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniformHandleui64vNVPROC) (jint, jint, jint, uintptr_t);
typedef jboolean (APIENTRY *glIsTextureHandleResidentNVPROC) (jlong);
typedef jboolean (APIENTRY *glIsImageHandleResidentNVPROC) (jlong);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glGetTextureHandleNV(JNIEnv *__env, jclass clazz, jint texture) {
    glGetTextureHandleNVPROC glGetTextureHandleNV = (glGetTextureHandleNVPROC)tlsGetFunction(597);
    UNUSED_PARAM(clazz)
    return (jlong)glGetTextureHandleNV(texture);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glGetTextureSamplerHandleNV(JNIEnv *__env, jclass clazz, jint texture, jint sampler) {
    glGetTextureSamplerHandleNVPROC glGetTextureSamplerHandleNV = (glGetTextureSamplerHandleNVPROC)tlsGetFunction(598);
    UNUSED_PARAM(clazz)
    return (jlong)glGetTextureSamplerHandleNV(texture, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glMakeTextureHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
    glMakeTextureHandleResidentNVPROC glMakeTextureHandleResidentNV = (glMakeTextureHandleResidentNVPROC)tlsGetFunction(599);
    UNUSED_PARAM(clazz)
    glMakeTextureHandleResidentNV(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glMakeTextureHandleNonResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
    glMakeTextureHandleNonResidentNVPROC glMakeTextureHandleNonResidentNV = (glMakeTextureHandleNonResidentNVPROC)tlsGetFunction(600);
    UNUSED_PARAM(clazz)
    glMakeTextureHandleNonResidentNV(handle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glGetImageHandleNV(JNIEnv *__env, jclass clazz, jint texture, jint level, jboolean layered, jint layer, jint format) {
    glGetImageHandleNVPROC glGetImageHandleNV = (glGetImageHandleNVPROC)tlsGetFunction(601);
    UNUSED_PARAM(clazz)
    return (jlong)glGetImageHandleNV(texture, level, layered, layer, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glMakeImageHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle, jint access) {
    glMakeImageHandleResidentNVPROC glMakeImageHandleResidentNV = (glMakeImageHandleResidentNVPROC)tlsGetFunction(602);
    UNUSED_PARAM(clazz)
    glMakeImageHandleResidentNV(handle, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glMakeImageHandleNonResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
    glMakeImageHandleNonResidentNVPROC glMakeImageHandleNonResidentNV = (glMakeImageHandleNonResidentNVPROC)tlsGetFunction(603);
    UNUSED_PARAM(clazz)
    glMakeImageHandleNonResidentNV(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glUniformHandleui64NV(JNIEnv *__env, jclass clazz, jint location, jlong value) {
    glUniformHandleui64NVPROC glUniformHandleui64NV = (glUniformHandleui64NVPROC)tlsGetFunction(604);
    UNUSED_PARAM(clazz)
    glUniformHandleui64NV(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_nglUniformHandleui64vNV__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valuesAddress) {
    glUniformHandleui64vNVPROC glUniformHandleui64vNV = (glUniformHandleui64vNVPROC)tlsGetFunction(605);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glUniformHandleui64vNV(location, count, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glProgramUniformHandleui64NV(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value) {
    glProgramUniformHandleui64NVPROC glProgramUniformHandleui64NV = (glProgramUniformHandleui64NVPROC)tlsGetFunction(606);
    UNUSED_PARAM(clazz)
    glProgramUniformHandleui64NV(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_nglProgramUniformHandleui64vNV__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valuesAddress) {
    glProgramUniformHandleui64vNVPROC glProgramUniformHandleui64vNV = (glProgramUniformHandleui64vNVPROC)tlsGetFunction(607);
    uintptr_t values = (uintptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformHandleui64vNV(program, location, count, values);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glIsTextureHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
    glIsTextureHandleResidentNVPROC glIsTextureHandleResidentNV = (glIsTextureHandleResidentNVPROC)tlsGetFunction(608);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsTextureHandleResidentNV(handle);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_NVBindlessTexture_glIsImageHandleResidentNV(JNIEnv *__env, jclass clazz, jlong handle) {
    glIsImageHandleResidentNVPROC glIsImageHandleResidentNV = (glIsImageHandleResidentNVPROC)tlsGetFunction(609);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsImageHandleResidentNV(handle);
}

EXTERN_C_EXIT
