/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jlong (APIENTRY *glGetTextureHandleARBPROC) (jint);
typedef jlong (APIENTRY *glGetTextureSamplerHandleARBPROC) (jint, jint);
typedef void (APIENTRY *glMakeTextureHandleResidentARBPROC) (jlong);
typedef void (APIENTRY *glMakeTextureHandleNonResidentARBPROC) (jlong);
typedef jlong (APIENTRY *glGetImageHandleARBPROC) (jint, jint, jboolean, jint, jint);
typedef void (APIENTRY *glMakeImageHandleResidentARBPROC) (jlong, jint);
typedef void (APIENTRY *glMakeImageHandleNonResidentARBPROC) (jlong);
typedef void (APIENTRY *glUniformHandleui64ARBPROC) (jint, jlong);
typedef void (APIENTRY *glUniformHandleui64vARBPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glProgramUniformHandleui64ARBPROC) (jint, jint, jlong);
typedef void (APIENTRY *glProgramUniformHandleui64vARBPROC) (jint, jint, jint, intptr_t);
typedef jboolean (APIENTRY *glIsTextureHandleResidentARBPROC) (jlong);
typedef jboolean (APIENTRY *glIsImageHandleResidentARBPROC) (jlong);
typedef void (APIENTRY *glVertexAttribL1ui64ARBPROC) (jint, jlong);
typedef void (APIENTRY *glVertexAttribL1ui64vARBPROC) (jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribLui64vARBPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glGetTextureHandleARB(JNIEnv *__env, jclass clazz, jint texture) {
    glGetTextureHandleARBPROC glGetTextureHandleARB = (glGetTextureHandleARBPROC)tlsGetFunction(1077);
    UNUSED_PARAM(clazz)
    return (jlong)glGetTextureHandleARB(texture);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glGetTextureSamplerHandleARB(JNIEnv *__env, jclass clazz, jint texture, jint sampler) {
    glGetTextureSamplerHandleARBPROC glGetTextureSamplerHandleARB = (glGetTextureSamplerHandleARBPROC)tlsGetFunction(1078);
    UNUSED_PARAM(clazz)
    return (jlong)glGetTextureSamplerHandleARB(texture, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glMakeTextureHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle) {
    glMakeTextureHandleResidentARBPROC glMakeTextureHandleResidentARB = (glMakeTextureHandleResidentARBPROC)tlsGetFunction(1079);
    UNUSED_PARAM(clazz)
    glMakeTextureHandleResidentARB(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glMakeTextureHandleNonResidentARB(JNIEnv *__env, jclass clazz, jlong handle) {
    glMakeTextureHandleNonResidentARBPROC glMakeTextureHandleNonResidentARB = (glMakeTextureHandleNonResidentARBPROC)tlsGetFunction(1080);
    UNUSED_PARAM(clazz)
    glMakeTextureHandleNonResidentARB(handle);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glGetImageHandleARB(JNIEnv *__env, jclass clazz, jint texture, jint level, jboolean layered, jint layer, jint format) {
    glGetImageHandleARBPROC glGetImageHandleARB = (glGetImageHandleARBPROC)tlsGetFunction(1081);
    UNUSED_PARAM(clazz)
    return (jlong)glGetImageHandleARB(texture, level, layered, layer, format);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glMakeImageHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle, jint access) {
    glMakeImageHandleResidentARBPROC glMakeImageHandleResidentARB = (glMakeImageHandleResidentARBPROC)tlsGetFunction(1082);
    UNUSED_PARAM(clazz)
    glMakeImageHandleResidentARB(handle, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glMakeImageHandleNonResidentARB(JNIEnv *__env, jclass clazz, jlong handle) {
    glMakeImageHandleNonResidentARBPROC glMakeImageHandleNonResidentARB = (glMakeImageHandleNonResidentARBPROC)tlsGetFunction(1083);
    UNUSED_PARAM(clazz)
    glMakeImageHandleNonResidentARB(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glUniformHandleui64ARB(JNIEnv *__env, jclass clazz, jint location, jlong value) {
    glUniformHandleui64ARBPROC glUniformHandleui64ARB = (glUniformHandleui64ARBPROC)tlsGetFunction(1084);
    UNUSED_PARAM(clazz)
    glUniformHandleui64ARB(location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglUniformHandleui64vARB__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valuesAddress) {
    glUniformHandleui64vARBPROC glUniformHandleui64vARB = (glUniformHandleui64vARBPROC)tlsGetFunction(1085);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glUniformHandleui64vARB(location, count, values);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glProgramUniformHandleui64ARB(JNIEnv *__env, jclass clazz, jint program, jint location, jlong value) {
    glProgramUniformHandleui64ARBPROC glProgramUniformHandleui64ARB = (glProgramUniformHandleui64ARBPROC)tlsGetFunction(1086);
    UNUSED_PARAM(clazz)
    glProgramUniformHandleui64ARB(program, location, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglProgramUniformHandleui64vARB__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valuesAddress) {
    glProgramUniformHandleui64vARBPROC glProgramUniformHandleui64vARB = (glProgramUniformHandleui64vARBPROC)tlsGetFunction(1087);
    intptr_t values = (intptr_t)valuesAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformHandleui64vARB(program, location, count, values);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glIsTextureHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle) {
    glIsTextureHandleResidentARBPROC glIsTextureHandleResidentARB = (glIsTextureHandleResidentARBPROC)tlsGetFunction(1088);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsTextureHandleResidentARB(handle);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glIsImageHandleResidentARB(JNIEnv *__env, jclass clazz, jlong handle) {
    glIsImageHandleResidentARBPROC glIsImageHandleResidentARB = (glIsImageHandleResidentARBPROC)tlsGetFunction(1089);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsImageHandleResidentARB(handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_glVertexAttribL1ui64ARB(JNIEnv *__env, jclass clazz, jint index, jlong x) {
    glVertexAttribL1ui64ARBPROC glVertexAttribL1ui64ARB = (glVertexAttribL1ui64ARBPROC)tlsGetFunction(1090);
    UNUSED_PARAM(clazz)
    glVertexAttribL1ui64ARB(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglVertexAttribL1ui64vARB__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribL1ui64vARBPROC glVertexAttribL1ui64vARB = (glVertexAttribL1ui64vARBPROC)tlsGetFunction(1091);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribL1ui64vARB(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBBindlessTexture_nglGetVertexAttribLui64vARB__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribLui64vARBPROC glGetVertexAttribLui64vARB = (glGetVertexAttribLui64vARBPROC)tlsGetFunction(1092);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribLui64vARB(index, pname, params);
}

EXTERN_C_EXIT
