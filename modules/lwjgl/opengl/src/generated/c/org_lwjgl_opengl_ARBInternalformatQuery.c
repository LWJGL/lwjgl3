/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetInternalformativPROC) (jint, jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInternalformatQuery_nglGetInternalformativ__IIIIJ(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint pname, jint bufSize, jlong paramsAddress) {
    glGetInternalformativPROC glGetInternalformativ = (glGetInternalformativPROC)tlsGetFunction(869);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetInternalformativ(target, internalformat, pname, bufSize, params);
}

EXTERN_C_EXIT
