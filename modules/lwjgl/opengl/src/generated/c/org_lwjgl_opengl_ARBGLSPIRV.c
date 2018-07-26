/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glSpecializeShaderARBPROC) (jint, intptr_t, jint, intptr_t, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGLSPIRV_nglSpecializeShaderARB__IJIJJ(JNIEnv *__env, jclass clazz, jint shader, jlong pEntryPointAddress, jint numSpecializationConstants, jlong pConstantIndexAddress, jlong pConstantValueAddress) {
    glSpecializeShaderARBPROC glSpecializeShaderARB = (glSpecializeShaderARBPROC)tlsGetFunction(1117);
    intptr_t pEntryPoint = (intptr_t)pEntryPointAddress;
    intptr_t pConstantIndex = (intptr_t)pConstantIndexAddress;
    intptr_t pConstantValue = (intptr_t)pConstantValueAddress;
    UNUSED_PARAM(clazz)
    glSpecializeShaderARB(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
}

EXTERN_C_EXIT
