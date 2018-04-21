/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGenSamplersPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteSamplersPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsSamplerPROC) (jint);
typedef void (APIENTRY *glBindSamplerPROC) (jint, jint);
typedef void (APIENTRY *glSamplerParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glSamplerParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glSamplerParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIuivPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglGenSamplers__IJ(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress) {
    glGenSamplersPROC glGenSamplers = (glGenSamplersPROC)tlsGetFunction(668);
    intptr_t samplers = (intptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glGenSamplers(count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglDeleteSamplers__IJ(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress) {
    glDeleteSamplersPROC glDeleteSamplers = (glDeleteSamplersPROC)tlsGetFunction(669);
    intptr_t samplers = (intptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glDeleteSamplers(count, samplers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_glIsSampler(JNIEnv *__env, jclass clazz, jint sampler) {
    glIsSamplerPROC glIsSampler = (glIsSamplerPROC)tlsGetFunction(670);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSampler(sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_glBindSampler(JNIEnv *__env, jclass clazz, jint unit, jint sampler) {
    glBindSamplerPROC glBindSampler = (glBindSamplerPROC)tlsGetFunction(671);
    UNUSED_PARAM(clazz)
    glBindSampler(unit, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_glSamplerParameteri(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jint param) {
    glSamplerParameteriPROC glSamplerParameteri = (glSamplerParameteriPROC)tlsGetFunction(672);
    UNUSED_PARAM(clazz)
    glSamplerParameteri(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_glSamplerParameterf(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jfloat param) {
    glSamplerParameterfPROC glSamplerParameterf = (glSamplerParameterfPROC)tlsGetFunction(673);
    UNUSED_PARAM(clazz)
    glSamplerParameterf(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglSamplerParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterivPROC glSamplerParameteriv = (glSamplerParameterivPROC)tlsGetFunction(674);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglSamplerParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterfvPROC glSamplerParameterfv = (glSamplerParameterfvPROC)tlsGetFunction(675);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIivPROC glSamplerParameterIiv = (glSamplerParameterIivPROC)tlsGetFunction(676);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIuivPROC glSamplerParameterIuiv = (glSamplerParameterIuivPROC)tlsGetFunction(677);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglGetSamplerParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterivPROC glGetSamplerParameteriv = (glGetSamplerParameterivPROC)tlsGetFunction(678);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglGetSamplerParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterfvPROC glGetSamplerParameterfv = (glGetSamplerParameterfvPROC)tlsGetFunction(679);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglGetSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIivPROC glGetSamplerParameterIiv = (glGetSamplerParameterIivPROC)tlsGetFunction(680);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSamplerObjects_nglGetSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIuivPROC glGetSamplerParameterIuiv = (glGetSamplerParameterIuivPROC)tlsGetFunction(681);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIuiv(sampler, pname, params);
}

EXTERN_C_EXIT
