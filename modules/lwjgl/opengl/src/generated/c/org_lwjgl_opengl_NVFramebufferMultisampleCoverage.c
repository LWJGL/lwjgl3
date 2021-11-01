/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glRenderbufferStorageMultisampleCoverageNVPROC) (jint, jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVFramebufferMultisampleCoverage_glRenderbufferStorageMultisampleCoverageNV(JNIEnv *__env, jclass clazz, jint target, jint coverageSamples, jint colorSamples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisampleCoverageNVPROC glRenderbufferStorageMultisampleCoverageNV = (glRenderbufferStorageMultisampleCoverageNVPROC)tlsGetFunction(1973);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisampleCoverageNV(target, coverageSamples, colorSamples, internalformat, width, height);
}

EXTERN_C_EXIT
