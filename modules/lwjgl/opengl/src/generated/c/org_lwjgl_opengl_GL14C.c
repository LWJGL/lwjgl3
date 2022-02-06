/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBlendColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glBlendEquationPROC) (jint);
typedef void (APIENTRY *glMultiDrawArraysPROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glMultiDrawElementsPROC) (jint, uintptr_t, jint, uintptr_t, jint);
typedef void (APIENTRY *glPointParameterfPROC) (jint, jfloat);
typedef void (APIENTRY *glPointParameteriPROC) (jint, jint);
typedef void (APIENTRY *glPointParameterfvPROC) (jint, uintptr_t);
typedef void (APIENTRY *glPointParameterivPROC) (jint, uintptr_t);
typedef void (APIENTRY *glBlendFuncSeparatePROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_glBlendColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glBlendColorPROC glBlendColor = (glBlendColorPROC)tlsGetFunction(386);
    UNUSED_PARAM(clazz)
    glBlendColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_glBlendEquation(JNIEnv *__env, jclass clazz, jint mode) {
    glBlendEquationPROC glBlendEquation = (glBlendEquationPROC)tlsGetFunction(387);
    UNUSED_PARAM(clazz)
    glBlendEquation(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_nglMultiDrawArrays__IJJI(JNIEnv *__env, jclass clazz, jint mode, jlong firstAddress, jlong countAddress, jint drawcount) {
    glMultiDrawArraysPROC glMultiDrawArrays = (glMultiDrawArraysPROC)tlsGetFunction(393);
    uintptr_t first = (uintptr_t)firstAddress;
    uintptr_t count = (uintptr_t)countAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawArrays(mode, first, count, drawcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_nglMultiDrawElements__IJIJI(JNIEnv *__env, jclass clazz, jint mode, jlong countAddress, jint type, jlong indicesAddress, jint drawcount) {
    glMultiDrawElementsPROC glMultiDrawElements = (glMultiDrawElementsPROC)tlsGetFunction(394);
    uintptr_t count = (uintptr_t)countAddress;
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glMultiDrawElements(mode, count, type, indices, drawcount);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_glPointParameterf(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glPointParameterfPROC glPointParameterf = (glPointParameterfPROC)tlsGetFunction(395);
    UNUSED_PARAM(clazz)
    glPointParameterf(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_glPointParameteri(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPointParameteriPROC glPointParameteri = (glPointParameteriPROC)tlsGetFunction(396);
    UNUSED_PARAM(clazz)
    glPointParameteri(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_nglPointParameterfv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glPointParameterfvPROC glPointParameterfv = (glPointParameterfvPROC)tlsGetFunction(397);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glPointParameterfv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_nglPointParameteriv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glPointParameterivPROC glPointParameteriv = (glPointParameterivPROC)tlsGetFunction(398);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glPointParameteriv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL14C_glBlendFuncSeparate(JNIEnv *__env, jclass clazz, jint sfactorRGB, jint dfactorRGB, jint sfactorAlpha, jint dfactorAlpha) {
    glBlendFuncSeparatePROC glBlendFuncSeparate = (glBlendFuncSeparatePROC)tlsGetFunction(416);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
}

EXTERN_C_EXIT
