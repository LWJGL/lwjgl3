/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClearColorIiEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glClearColorIuiEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTexParameterIivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTexParameterIuivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterIivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterIuivEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_glClearColorIiEXT(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jint a) {
    glClearColorIiEXTPROC glClearColorIiEXT = (glClearColorIiEXTPROC)tlsGetFunction(1854);
    UNUSED_PARAM(clazz)
    glClearColorIiEXT(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_glClearColorIuiEXT(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jint a) {
    glClearColorIuiEXTPROC glClearColorIuiEXT = (glClearColorIuiEXTPROC)tlsGetFunction(1855);
    UNUSED_PARAM(clazz)
    glClearColorIuiEXT(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglTexParameterIivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIivEXTPROC glTexParameterIivEXT = (glTexParameterIivEXTPROC)tlsGetFunction(1856);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglTexParameterIuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIuivEXTPROC glTexParameterIuivEXT = (glTexParameterIuivEXTPROC)tlsGetFunction(1857);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIuivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglGetTexParameterIivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIivEXTPROC glGetTexParameterIivEXT = (glGetTexParameterIivEXTPROC)tlsGetFunction(1858);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTTextureInteger_nglGetTexParameterIuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIuivEXTPROC glGetTexParameterIuivEXT = (glGetTexParameterIuivEXTPROC)tlsGetFunction(1859);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIuivEXT(target, pname, params);
}

EXTERN_C_EXIT
