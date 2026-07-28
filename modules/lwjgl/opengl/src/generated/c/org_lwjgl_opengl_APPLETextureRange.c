/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glTextureRangeAPPLEPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterPointervAPPLEPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLETextureRange_nglTextureRangeAPPLE(JNIEnv *__env, jclass clazz, jint target, jint length, jlong pointerAddress) {
    glTextureRangeAPPLEPROC glTextureRangeAPPLE = (glTextureRangeAPPLEPROC)tlsGetFunction(1129);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glTextureRangeAPPLE(target, length, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_APPLETextureRange_nglGetTexParameterPointervAPPLE(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterPointervAPPLEPROC glGetTexParameterPointervAPPLE = (glGetTexParameterPointervAPPLEPROC)tlsGetFunction(1130);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterPointervAPPLE(target, pname, params);
}

EXTERN_C_EXIT
