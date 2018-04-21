/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetInternalformati64vPROC) (jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInternalformatQuery2_nglGetInternalformati64v__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress) {
    glGetInternalformati64vPROC glGetInternalformati64v = (glGetInternalformati64vPROC)tlsGetFunction(887);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInternalformati64v(target, internalformat, pname, bufSize, params);
}

EXTERN_C_EXIT
