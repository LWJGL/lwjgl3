/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glQueryCounterPROC) (jint, jint);
typedef void (APIENTRY *glGetQueryObjecti64vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectui64vPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTimerQuery_glQueryCounter(JNIEnv *__env, jclass clazz, jint id, jint target) {
    glQueryCounterPROC glQueryCounter = (glQueryCounterPROC)tlsGetFunction(682);
    UNUSED_PARAM(clazz)
    glQueryCounter(id, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTimerQuery_nglGetQueryObjecti64v__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjecti64vPROC glGetQueryObjecti64v = (glGetQueryObjecti64vPROC)tlsGetFunction(683);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjecti64v(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBTimerQuery_nglGetQueryObjectui64v__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjectui64vPROC glGetQueryObjectui64v = (glGetQueryObjectui64vPROC)tlsGetFunction(684);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjectui64v(id, pname, params);
}

EXTERN_C_EXIT
