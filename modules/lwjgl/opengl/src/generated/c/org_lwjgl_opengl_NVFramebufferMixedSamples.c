/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glCoverageModulationTableNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetCoverageModulationTableNVPROC) (jint, uintptr_t);
typedef void (APIENTRY *glCoverageModulationNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMixedSamples_nglCoverageModulationTableNV__IJ(JNIEnv *__env, jclass clazz, jint n, jlong vAddress) {
    glCoverageModulationTableNVPROC glCoverageModulationTableNV = (glCoverageModulationTableNVPROC)tlsGetFunction(1970);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glCoverageModulationTableNV(n, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMixedSamples_nglGetCoverageModulationTableNV__IJ(JNIEnv *__env, jclass clazz, jint bufsize, jlong vAddress) {
    glGetCoverageModulationTableNVPROC glGetCoverageModulationTableNV = (glGetCoverageModulationTableNVPROC)tlsGetFunction(1971);
    uintptr_t v = (uintptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glGetCoverageModulationTableNV(bufsize, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMixedSamples_glCoverageModulationNV(JNIEnv *__env, jclass clazz, jint components) {
    glCoverageModulationNVPROC glCoverageModulationNV = (glCoverageModulationNVPROC)tlsGetFunction(1972);
    UNUSED_PARAM(clazz)
    glCoverageModulationNV(components);
}

EXTERN_C_EXIT
