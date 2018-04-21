/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glGenQueriesEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteQueriesEXTPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsQueryEXTPROC) (jint);
typedef void (APIENTRY *glBeginQueryEXTPROC) (jint, jint);
typedef void (APIENTRY *glEndQueryEXTPROC) (jint);
typedef void (APIENTRY *glGetQueryivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectuivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glQueryCounterEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetQueryObjectivEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjecti64vEXTPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectui64vEXTPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGenQueriesEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glGenQueriesEXTPROC glGenQueriesEXT = (glGenQueriesEXTPROC)tlsGetFunction(460);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glGenQueriesEXT(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglDeleteQueriesEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glDeleteQueriesEXTPROC glDeleteQueriesEXT = (glDeleteQueriesEXTPROC)tlsGetFunction(461);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDeleteQueriesEXT(n, ids);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_glIsQueryEXT(JNIEnv *__env, jclass clazz, jint id) {
    glIsQueryEXTPROC glIsQueryEXT = (glIsQueryEXTPROC)tlsGetFunction(462);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsQueryEXT(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_glBeginQueryEXT(JNIEnv *__env, jclass clazz, jint target, jint id) {
    glBeginQueryEXTPROC glBeginQueryEXT = (glBeginQueryEXTPROC)tlsGetFunction(463);
    UNUSED_PARAM(clazz)
    glBeginQueryEXT(target, id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_glEndQueryEXT(JNIEnv *__env, jclass clazz, jint target) {
    glEndQueryEXTPROC glEndQueryEXT = (glEndQueryEXTPROC)tlsGetFunction(464);
    UNUSED_PARAM(clazz)
    glEndQueryEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetQueryivEXTPROC glGetQueryivEXT = (glGetQueryivEXTPROC)tlsGetFunction(465);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryivEXT(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectuivEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjectuivEXTPROC glGetQueryObjectuivEXT = (glGetQueryObjectuivEXTPROC)tlsGetFunction(466);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjectuivEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_glQueryCounterEXT(JNIEnv *__env, jclass clazz, jint id, jint target) {
    glQueryCounterEXTPROC glQueryCounterEXT = (glQueryCounterEXTPROC)tlsGetFunction(404);
    UNUSED_PARAM(clazz)
    glQueryCounterEXT(id, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectivEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjectivEXTPROC glGetQueryObjectivEXT = (glGetQueryObjectivEXTPROC)tlsGetFunction(405);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjectivEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjecti64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjecti64vEXTPROC glGetQueryObjecti64vEXT = (glGetQueryObjecti64vEXTPROC)tlsGetFunction(406);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjecti64vEXT(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDisjointTimerQuery_nglGetQueryObjectui64vEXT__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjectui64vEXTPROC glGetQueryObjectui64vEXT = (glGetQueryObjectui64vEXTPROC)tlsGetFunction(407);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjectui64vEXT(id, pname, params);
}

EXTERN_C_EXIT
