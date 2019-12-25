/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glRasterSamplesEXTPROC) (jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTRasterMultisample_glRasterSamplesEXT(JNIEnv *__env, jclass clazz, jint samples, jboolean fixedsamplelocations) {
    glRasterSamplesEXTPROC glRasterSamplesEXT = (glRasterSamplesEXTPROC)tlsGetFunction(474);
    UNUSED_PARAM(clazz)
    glRasterSamplesEXT(samples, fixedsamplelocations);
}

EXTERN_C_EXIT
