/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glQueryCounterEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetQueryObjectivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjecti64vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectui64vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetInteger64vEXTPROC) (jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_glQueryCounterEXT(JNIEnv *__env, jclass clazz, jint id, jint target) {
    glQueryCounterEXTPROC glQueryCounterEXT = (glQueryCounterEXTPROC)tlsGetFunction(406);
    UNUSED_PARAM(clazz)
    glQueryCounterEXT(id, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectivEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjectivEXTPROC glGetQueryObjectivEXT = (glGetQueryObjectivEXTPROC)tlsGetFunction(407);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjectivEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjecti64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjecti64vEXTPROC glGetQueryObjecti64vEXT = (glGetQueryObjecti64vEXTPROC)tlsGetFunction(408);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjecti64vEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectui64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjectui64vEXTPROC glGetQueryObjectui64vEXT = (glGetQueryObjectui64vEXTPROC)tlsGetFunction(409);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjectui64vEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetInteger64vEXT__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong dataAddress) {
    glGetInteger64vEXTPROC glGetInteger64vEXT = (glGetInteger64vEXTPROC)tlsGetFunction(410);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetInteger64vEXT(pname, data);
}

EXTERN_C_EXIT
