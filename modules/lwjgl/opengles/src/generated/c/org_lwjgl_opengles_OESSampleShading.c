/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glMinSampleShadingOESPROC) (jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESSampleShading_glMinSampleShadingOES(JNIEnv *__env, jclass clazz, jfloat value) {
    glMinSampleShadingOESPROC glMinSampleShadingOES = (glMinSampleShadingOESPROC)tlsGetFunction(805);
    UNUSED_PARAM(clazz)
    glMinSampleShadingOES(value);
}

EXTERN_C_EXIT
