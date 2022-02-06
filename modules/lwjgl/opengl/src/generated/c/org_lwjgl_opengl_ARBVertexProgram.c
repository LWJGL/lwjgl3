/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glProgramStringARBPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glBindProgramARBPROC) (jint, jint);
typedef void (APIENTRY *glDeleteProgramsARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGenProgramsARBPROC) (jint, uintptr_t);
typedef void (APIENTRY *glProgramEnvParameter4dARBPROC) (jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramEnvParameter4dvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramEnvParameter4fARBPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramEnvParameter4fvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramLocalParameter4dARBPROC) (jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glProgramLocalParameter4dvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramLocalParameter4fARBPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramLocalParameter4fvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetProgramEnvParameterfvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetProgramEnvParameterdvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetProgramLocalParameterfvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetProgramLocalParameterdvARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetProgramivARBPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetProgramStringARBPROC) (jint, jint, uintptr_t);
typedef jboolean (APIENTRY *glIsProgramARBPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramStringARB(JNIEnv *__env, jclass clazz, jint target, jint format, jint len, jlong stringAddress) {
    glProgramStringARBPROC glProgramStringARB = (glProgramStringARBPROC)tlsGetFunction(1451);
    uintptr_t string = (uintptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glProgramStringARB(target, format, len, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glBindProgramARB(JNIEnv *__env, jclass clazz, jint target, jint program) {
    glBindProgramARBPROC glBindProgramARB = (glBindProgramARBPROC)tlsGetFunction(1452);
    UNUSED_PARAM(clazz)
    glBindProgramARB(target, program);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglDeleteProgramsARB__IJ(JNIEnv *__env, jclass clazz, jint n, jlong programsAddress) {
    glDeleteProgramsARBPROC glDeleteProgramsARB = (glDeleteProgramsARBPROC)tlsGetFunction(1453);
    uintptr_t programs = (uintptr_t)programsAddress;
    UNUSED_PARAM(clazz)
    glDeleteProgramsARB(n, programs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGenProgramsARB__IJ(JNIEnv *__env, jclass clazz, jint n, jlong programsAddress) {
    glGenProgramsARBPROC glGenProgramsARB = (glGenProgramsARBPROC)tlsGetFunction(1454);
    uintptr_t programs = (uintptr_t)programsAddress;
    UNUSED_PARAM(clazz)
    glGenProgramsARB(n, programs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramEnvParameter4dARB(JNIEnv *__env, jclass clazz, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramEnvParameter4dARBPROC glProgramEnvParameter4dARB = (glProgramEnvParameter4dARBPROC)tlsGetFunction(1455);
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4dARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4dvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramEnvParameter4dvARBPROC glProgramEnvParameter4dvARB = (glProgramEnvParameter4dvARBPROC)tlsGetFunction(1456);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4dvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramEnvParameter4fARB(JNIEnv *__env, jclass clazz, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glProgramEnvParameter4fARBPROC glProgramEnvParameter4fARB = (glProgramEnvParameter4fARBPROC)tlsGetFunction(1457);
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4fARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramEnvParameter4fvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramEnvParameter4fvARBPROC glProgramEnvParameter4fvARB = (glProgramEnvParameter4fvARBPROC)tlsGetFunction(1458);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramEnvParameter4fvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramLocalParameter4dARB(JNIEnv *__env, jclass clazz, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glProgramLocalParameter4dARBPROC glProgramLocalParameter4dARB = (glProgramLocalParameter4dARBPROC)tlsGetFunction(1459);
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4dARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4dvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramLocalParameter4dvARBPROC glProgramLocalParameter4dvARB = (glProgramLocalParameter4dvARBPROC)tlsGetFunction(1460);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4dvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glProgramLocalParameter4fARB(JNIEnv *__env, jclass clazz, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glProgramLocalParameter4fARBPROC glProgramLocalParameter4fARB = (glProgramLocalParameter4fARBPROC)tlsGetFunction(1461);
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4fARB(target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglProgramLocalParameter4fvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glProgramLocalParameter4fvARBPROC glProgramLocalParameter4fvARB = (glProgramLocalParameter4fvARBPROC)tlsGetFunction(1462);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glProgramLocalParameter4fvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramEnvParameterfvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramEnvParameterfvARBPROC glGetProgramEnvParameterfvARB = (glGetProgramEnvParameterfvARBPROC)tlsGetFunction(1463);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramEnvParameterfvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramEnvParameterdvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramEnvParameterdvARBPROC glGetProgramEnvParameterdvARB = (glGetProgramEnvParameterdvARBPROC)tlsGetFunction(1464);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramEnvParameterdvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramLocalParameterfvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramLocalParameterfvARBPROC glGetProgramLocalParameterfvARB = (glGetProgramLocalParameterfvARBPROC)tlsGetFunction(1465);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramLocalParameterfvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramLocalParameterdvARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetProgramLocalParameterdvARBPROC glGetProgramLocalParameterdvARB = (glGetProgramLocalParameterdvARBPROC)tlsGetFunction(1466);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramLocalParameterdvARB(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramivARB__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetProgramivARBPROC glGetProgramivARB = (glGetProgramivARBPROC)tlsGetFunction(1467);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetProgramivARB(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_nglGetProgramStringARB(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong stringAddress) {
    glGetProgramStringARBPROC glGetProgramStringARB = (glGetProgramStringARBPROC)tlsGetFunction(1468);
    uintptr_t string = (uintptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glGetProgramStringARB(target, pname, string);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBVertexProgram_glIsProgramARB(JNIEnv *__env, jclass clazz, jint program) {
    glIsProgramARBPROC glIsProgramARB = (glIsProgramARBPROC)tlsGetFunction(1473);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsProgramARB(program);
}

EXTERN_C_EXIT
