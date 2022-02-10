/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFragmentCoverageColorNVPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_NVFragmentCoverageToColor_glFragmentCoverageColorNV(JNIEnv *__env, jclass clazz, jint color) {
    glFragmentCoverageColorNVPROC glFragmentCoverageColorNV = (glFragmentCoverageColorNVPROC)tlsGetFunction(635);
    UNUSED_PARAM(clazz)
    glFragmentCoverageColorNV(color);
}

EXTERN_C_EXIT
