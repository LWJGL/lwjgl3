/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jint (APIENTRY *glQueryResourceNVPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_NVQueryResource_nglQueryResourceNV__IIIJ(JNIEnv *__env, jclass clazz, jint queryType, jint pname, jint bufSize, jlong bufferAddress) {
    glQueryResourceNVPROC glQueryResourceNV = (glQueryResourceNVPROC)tlsGetFunction(2107);
    intptr_t buffer = (intptr_t)bufferAddress;
    UNUSED_PARAM(clazz)
    return (jint)glQueryResourceNV(queryType, pname, bufSize, buffer);
}

EXTERN_C_EXIT
