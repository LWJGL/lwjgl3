/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glSpecializeShaderARBPROC) (jint, uintptr_t, jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBGLSPIRV_nglSpecializeShaderARB__IJIJJ(JNIEnv *__env, jclass clazz, jint shader, jlong pEntryPointAddress, jint numSpecializationConstants, jlong pConstantIndexAddress, jlong pConstantValueAddress) {
    glSpecializeShaderARBPROC glSpecializeShaderARB = (glSpecializeShaderARBPROC)tlsGetFunction(1151);
    uintptr_t pEntryPoint = (uintptr_t)pEntryPointAddress;
    uintptr_t pConstantIndex = (uintptr_t)pConstantIndexAddress;
    uintptr_t pConstantValue = (uintptr_t)pConstantValueAddress;
    UNUSED_PARAM(clazz)
    glSpecializeShaderARB(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
}

EXTERN_C_EXIT
