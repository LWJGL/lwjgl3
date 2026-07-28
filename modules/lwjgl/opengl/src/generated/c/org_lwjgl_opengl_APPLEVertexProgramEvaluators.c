/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glEnableVertexAttribAPPLEPROC) (jint, jint);
typedef void (APIENTRY *glDisableVertexAttribAPPLEPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsVertexAttribEnabledAPPLEPROC) (jint, jint);
typedef void (APIENTRY *glMapVertexAttrib1dAPPLEPROC) (jint, jint, jdouble, jdouble, jint, jint, uintptr_t);
typedef void (APIENTRY *glMapVertexAttrib1fAPPLEPROC) (jint, jint, jfloat, jfloat, jint, jint, uintptr_t);
typedef void (APIENTRY *glMapVertexAttrib2dAPPLEPROC) (jint, jint, jdouble, jdouble, jint, jint, jdouble, jdouble, jint, jint, uintptr_t);
typedef void (APIENTRY *glMapVertexAttrib2fAPPLEPROC) (jint, jint, jfloat, jfloat, jint, jint, jfloat, jfloat, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexProgramEvaluators_glEnableVertexAttribAPPLE(JNIEnv *__env, jclass clazz, jint index, jint pname) {
    glEnableVertexAttribAPPLEPROC glEnableVertexAttribAPPLE = (glEnableVertexAttribAPPLEPROC)tlsGetFunction(1138);
    UNUSED_PARAM(clazz)
    glEnableVertexAttribAPPLE(index, pname);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexProgramEvaluators_glDisableVertexAttribAPPLE(JNIEnv *__env, jclass clazz, jint index, jint pname) {
    glDisableVertexAttribAPPLEPROC glDisableVertexAttribAPPLE = (glDisableVertexAttribAPPLEPROC)tlsGetFunction(1139);
    UNUSED_PARAM(clazz)
    glDisableVertexAttribAPPLE(index, pname);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_APPLEVertexProgramEvaluators_glIsVertexAttribEnabledAPPLE(JNIEnv *__env, jclass clazz, jint index, jint pname) {
    glIsVertexAttribEnabledAPPLEPROC glIsVertexAttribEnabledAPPLE = (glIsVertexAttribEnabledAPPLEPROC)tlsGetFunction(1140);
    UNUSED_PARAM(clazz)
    return glIsVertexAttribEnabledAPPLE(index, pname);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexProgramEvaluators_nglMapVertexAttrib1dAPPLE__IIDDIIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jdouble u1, jdouble u2, jint stride, jint order, jlong pointsAddress) {
    glMapVertexAttrib1dAPPLEPROC glMapVertexAttrib1dAPPLE = (glMapVertexAttrib1dAPPLEPROC)tlsGetFunction(1141);
    uintptr_t points = (uintptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMapVertexAttrib1dAPPLE(index, size, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexProgramEvaluators_nglMapVertexAttrib1fAPPLE__IIFFIIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jfloat u1, jfloat u2, jint stride, jint order, jlong pointsAddress) {
    glMapVertexAttrib1fAPPLEPROC glMapVertexAttrib1fAPPLE = (glMapVertexAttrib1fAPPLEPROC)tlsGetFunction(1142);
    uintptr_t points = (uintptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMapVertexAttrib1fAPPLE(index, size, u1, u2, stride, order, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexProgramEvaluators_nglMapVertexAttrib2dAPPLE__IIDDIIDDIIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jlong pointsAddress) {
    glMapVertexAttrib2dAPPLEPROC glMapVertexAttrib2dAPPLE = (glMapVertexAttrib2dAPPLEPROC)tlsGetFunction(1143);
    uintptr_t points = (uintptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMapVertexAttrib2dAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLEVertexProgramEvaluators_nglMapVertexAttrib2fAPPLE__IIFFIIFFIIJ(JNIEnv *__env, jclass clazz, jint index, jint size, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jlong pointsAddress) {
    glMapVertexAttrib2fAPPLEPROC glMapVertexAttrib2fAPPLE = (glMapVertexAttrib2fAPPLEPROC)tlsGetFunction(1144);
    uintptr_t points = (uintptr_t)pointsAddress;
    UNUSED_PARAM(clazz)
    glMapVertexAttrib2fAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
}

EXTERN_C_EXIT
