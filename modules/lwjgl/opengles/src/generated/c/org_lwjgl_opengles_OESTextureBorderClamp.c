/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glTexParameterIivOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTexParameterIuivOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterIivOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterIuivOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glSamplerParameterIivOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glSamplerParameterIuivOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetSamplerParameterIivOESPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetSamplerParameterIuivOESPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglTexParameterIivOES__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIivOESPROC glTexParameterIivOES = (glTexParameterIivOESPROC)tlsGetFunction(813);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglTexParameterIuivOES__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIuivOESPROC glTexParameterIuivOES = (glTexParameterIuivOESPROC)tlsGetFunction(814);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIuivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetTexParameterIivOES__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIivOESPROC glGetTexParameterIivOES = (glGetTexParameterIivOESPROC)tlsGetFunction(815);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetTexParameterIuivOES__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIuivOESPROC glGetTexParameterIuivOES = (glGetTexParameterIuivOESPROC)tlsGetFunction(816);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIuivOES(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglSamplerParameterIivOES__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIivOESPROC glSamplerParameterIivOES = (glSamplerParameterIivOESPROC)tlsGetFunction(817);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIivOES(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglSamplerParameterIuivOES__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIuivOESPROC glSamplerParameterIuivOES = (glSamplerParameterIuivOESPROC)tlsGetFunction(818);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIuivOES(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetSamplerParameterIivOES__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIivOESPROC glGetSamplerParameterIivOES = (glGetSamplerParameterIivOESPROC)tlsGetFunction(819);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIivOES(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTextureBorderClamp_nglGetSamplerParameterIuivOES__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIuivOESPROC glGetSamplerParameterIuivOES = (glGetSamplerParameterIuivOESPROC)tlsGetFunction(820);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIuivOES(sampler, pname, params);
}

EXTERN_C_EXIT
