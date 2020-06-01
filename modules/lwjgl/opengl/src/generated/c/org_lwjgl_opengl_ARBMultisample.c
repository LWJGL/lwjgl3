/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glSampleCoverageARBPROC) (jfloat, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBMultisample_glSampleCoverageARB(JNIEnv *__env, jclass clazz, jfloat value, jboolean invert) {
    glSampleCoverageARBPROC glSampleCoverageARB = (glSampleCoverageARBPROC)tlsGetFunction(1246);
    UNUSED_PARAM(clazz)
    glSampleCoverageARB(value, invert);
}

EXTERN_C_EXIT
