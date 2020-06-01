/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glMinSampleShadingARBPROC) (jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBSampleShading_glMinSampleShadingARB(JNIEnv *__env, jclass clazz, jfloat value) {
    glMinSampleShadingARBPROC glMinSampleShadingARB = (glMinSampleShadingARBPROC)tlsGetFunction(1315);
    UNUSED_PARAM(clazz)
    glMinSampleShadingARB(value);
}

EXTERN_C_EXIT
